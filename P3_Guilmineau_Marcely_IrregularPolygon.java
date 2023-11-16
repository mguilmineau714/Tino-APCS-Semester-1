import  java.awt.geom.*;
import  java.util.*;
import  gpdraw.*;

/*
    Name:       Marcely Guilmineau
    Date:       11/14/2023
    Period:     3

    Is this lab fully working? (Yes)
    If not, explain:
    If resubmitting, explain:
*/

public class P3_Guilmineau_Marcely_IrregularPolygon {  
    private  ArrayList <Point2D.Double> myPolygon;  
    static SketchPad paper;
    static DrawingTool pen;
    
    public static void main(String[] args) {
        paper = new SketchPad(1000, 1000);
        pen = new DrawingTool(paper);
        ArrayList<Point2D.Double> a = new ArrayList<Point2D.Double>();
        // Generate polygon with n vertices
        int n = 100;
        for(int i = 0; i < n; i++) {
            double randomX = (int)(Math.random()*200)+1;
            double randomY = (int)(Math.random()*200)+1;
            a.add(new Point2D.Double(randomX, randomY));
        }
        System.out.println(sortToCounterClockwise(a));
        draw(sortToCounterClockwise(a));
    }
    
    public static ArrayList<Point2D.Double> sortToCounterClockwise(ArrayList<Point2D.Double> input) {
        double min = Double.MAX_VALUE;
        Point2D.Double startingPoint = new Point2D.Double(0, 0);
        // find lowest point
        for(Point2D.Double i : input) {
            if(i.getY() < min) {
                startingPoint = i;
                min = i.getY();
            }
        }
        // bubble sort with respect to angle between min and each indice
        for(int i = 0; i < input.size(); i++) {
            for(int j = 0; j < input.size() - i - 1; j++) {
                double angleOfCurrent = input.get(j).equals(startingPoint) ? 0 : Math.atan((input.get(j).getY()-startingPoint.getY()) / ((input.get(j).getX()-startingPoint.getX())));
                double angleOfNext = input.get(j+1).equals(startingPoint) ? 0 : Math.atan((input.get(j+1).getY()-startingPoint.getY()) / ((input.get(j+1).getX()-startingPoint.getX())));
                if(angleOfCurrent > angleOfNext) {
                   Point2D.Double temp = input.get(j);
                   input.set(j, input.get(j + 1));
                   input.set(j + 1, temp);
                }
            }
        }
        return input;
    }
    
    public P3_Guilmineau_Marcely_IrregularPolygon(ArrayList <Point2D.Double> a) {
        myPolygon = sortToCounterClockwise(a);
    }     

    public void add(Point2D.Double aPoint) {
        myPolygon.add(aPoint);
        myPolygon = sortToCounterClockwise(myPolygon);
    }

    public static void draw(ArrayList<Point2D.Double> input) {
        pen.up();
        pen.move(input.get(0).getX(), input.get(0).getY());
        pen.down();
        for(int i = 1; i < input.size(); i++) {
            pen.move(input.get(i).getX(), input.get(i).getY());
        }
        pen.move(input.get(0).getX(), input.get(0).getY());
    }


    public static double perimeter(ArrayList<Point2D.Double> input) {
        double totalPerimeter = 0;
        for(int i = 0; i < input.size()-1; i++) {
            totalPerimeter += Point2D.Double.distance(input.get(i).getX(), input.get(i).getY(), input.get(i+1).getX(), input.get(i+1).getY());
        }
        totalPerimeter += Point2D.Double.distance(input.get(0).getX(), input.get(0).getY(), input.get(input.size()-1).getX(), input.get(input.size()-1).getY());
        return totalPerimeter;
    }

    public static double area(ArrayList<Point2D.Double> input) {
        double constant = 0;
        for(int i = 0; i < input.size()-1; i++) {
            constant += input.get(i).getX()*input.get(i+1).getY();
            constant -= input.get(i).getY()*input.get(i+1).getX();
        }
        constant += input.get(input.size()-1).getX()*input.get(0).getY();
        constant -= input.get(input.size()-1).getY()*input.get(0).getX();
        return Math.abs(constant)/2;
    }  
}
