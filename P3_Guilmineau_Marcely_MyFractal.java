import gpdraw.*;
import java.awt.Color;
/*
    Name:       Marcely Guilmineau
    Date:       10/16/2023
    Period:     3
    Fractal Name: Customizable Pentigree Star
    This class draws a fractal of a star made out of numCorners pentigrees.
    Is this lab fully working?  (Yes)
    If not, explain:
    If resubmitting, explain:
*/
public class P3_Guilmineau_Marcely_MyFractal {
    static SketchPad paper;
    static DrawingTool pen;
    static final double SCALE = (3-Math.pow(5, 0.5))/2;
    
    public static void main(String[] args) {
        paper = new SketchPad(2000, 2000);
        pen = new DrawingTool(paper);
        int level = 0;
        double length = 200;
        int numCorners = 6;
        Color starColor = new Color(0, 0, 255);
        Boolean makeGradient = true;
        pen.up();
        pen.move(-200, 300);
        pen.down();
        drawPentigreeStar(0, length, numCorners, starColor, makeGradient);
        pen.up();
        pen.move(200, 300);
        pen.down();
        drawPentigreeStar(1, length, numCorners, starColor, makeGradient);
       // drawPentigreeStar(2, length, numCorners, starColor, makeGradient);
       // drawPentigreeStar(3, length, numCorners, starColor, makeGradient);
    }
    
    public static void drawPentigreeStar(int level, double length, int numCorners, Color starColor, Boolean makeGradient) {
        double angle = 360.0/numCorners;
        int R = starColor.getRed();
        int G = starColor.getGreen();
        int B = starColor.getBlue();
        Color startColor;
        for(int i = 0; i < numCorners; i++) {
            startColor = new Color(R, G, B);
            if(makeGradient) {
                R += R >= 255-255/numCorners ? 255-R : 255/numCorners;
                G += G >= 255-255/numCorners ? 255-G : 255/numCorners;
                B += B >= 255-255/numCorners ? 255-B : 255/numCorners;
            }
            drawPentigree(level, length, startColor);
            pen.turnLeft(angle);
        }
    }
    
     public static void drawPentigree(int level, double length, Color color) {
        pen.setColor(color);
         if(level == 0) {
            pen.move(length);
        } else {
            pen.turnLeft(36);
            drawPentigree(level-1, length*SCALE, color);
            pen.turnLeft(72);
            drawPentigree(level-1, length*SCALE, color);
            pen.turnRight(144);
            drawPentigree(level-1, length*SCALE, color);
            pen.turnRight(72);
            drawPentigree(level-1, length*SCALE, color);
            pen.turnLeft(72);
            drawPentigree(level-1, length*SCALE, color);
            pen.turnLeft(72);
            drawPentigree(level-1, length*SCALE, color);
            pen.turnRight(36);
        }
    }
}