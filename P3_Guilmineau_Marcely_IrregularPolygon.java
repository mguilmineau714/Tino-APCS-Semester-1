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
        int n = 5;
        for(int i = 0; i < n; i++) {
            double randomX = (int)(Math.random()*200)+1;
            double randomY = (int)(Math.random()*200)+1;
            a.add(new Point2D.Double(randomX, randomY));
        }
        P3_Guilmineau_Marcely_IrregularPolygon b = new P3_Guilmineau_Marcely_IrregularPolygon(a);
        b.sortToCounterClockwise();
        b.draw();
    }

    public ArrayList<Point2D.Double> sortToCounterClockwise() {
        double min = Double.MAX_VALUE;
        Point2D.Double startingPoint = new Point2D.Double(0, 0);
        // find lowest point
        for(Point2D.Double i : myPolygon) {
            if(i.getY() < min) {
                startingPoint = i;
                min = i.getY();
            }
        }
        // bubble sort with respect to angle between min and each indice
        for(int i = 0; i < myPolygon.size(); i++) {
            for(int j = 0; j < myPolygon.size() - i - 1; j++) {
                double angleOfCurrent = myPolygon.get(j).equals(startingPoint) ? 0 : Math.atan((myPolygon.get(j).getY()-startingPoint.getY()) / ((myPolygon.get(j).getX()-startingPoint.getX())));
                double angleOfNext = myPolygon.get(j+1).equals(startingPoint) ? 0 : Math.atan((myPolygon.get(j+1).getY()-startingPoint.getY()) / ((myPolygon.get(j+1).getX()-startingPoint.getX())));
                if(angleOfCurrent > angleOfNext) {
                    Point2D.Double temp = myPolygon.get(j);
                    myPolygon.set(j, myPolygon.get(j + 1));
                    myPolygon.set(j + 1, temp);
                }
            }
        }
        return myPolygon;
    }

    public P3_Guilmineau_Marcely_IrregularPolygon(ArrayList <Point2D.Double> a) {
        myPolygon = a;
    }     

    public void add(Point2D.Double aPoint) {
        myPolygon.add(aPoint);
    }

    public void draw() {
        pen.up();
        pen.move(myPolygon.get(0).getX(), myPolygon.get(0).getY());
        pen.down();
        for(int i = 1; i < myPolygon.size(); i++) {
            pen.move(myPolygon.get(i).getX(), myPolygon.get(i).getY());
        }
        pen.move(myPolygon.get(0).getX(), myPolygon.get(0).getY());
    }

    public double perimeter() {
        double totalPerimeter = 0;
        for(int i = 0; i < myPolygon.size()-1; i++) {
            totalPerimeter += Point2D.Double.distance(myPolygon.get(i).getX(), myPolygon.get(i).getY(), myPolygon.get(i+1).getX(), myPolygon.get(i+1).getY());
        }
        totalPerimeter += Point2D.Double.distance(myPolygon.get(0).getX(), myPolygon.get(0).getY(), myPolygon.get(myPolygon.size()-1).getX(), myPolygon.get(myPolygon.size()-1).getY());
        return totalPerimeter;
    }

    public double area() {
        double constant = 0;
        for(int i = 0; i < myPolygon.size()-1; i++) {
            constant += myPolygon.get(i).getX()*myPolygon.get(i+1).getY();
            constant -= myPolygon.get(i).getY()*myPolygon.get(i+1).getX();
        }
        constant += myPolygon.get(myPolygon.size()-1).getX()*myPolygon.get(0).getY();
        constant -= myPolygon.get(myPolygon.size()-1).getY()*myPolygon.get(0).getX();
        return Math.abs(constant)/2;
    }  
}
