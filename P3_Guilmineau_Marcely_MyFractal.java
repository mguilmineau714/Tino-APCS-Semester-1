import gpdraw.*;
/*
    Name:       Marcely Guilmineau
    Date:       10/16/2023
    Period:     3
    Fractal Name: Customizable Pentigree Star
    This class draws a fractal of a star made out of numCorners pentigrees.
    Note: 
    If 2 methods are not allowed, then please only consider my pentigree method.
    I assumed they're allowed since koch snowflake also required 2 methods.

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
        drawPentigreeStar(5, 200, 5);
    }
    
    public static void drawPentigreeStar(int level, double length, int numCorners) {
        double angle = 360.0/numCorners;
        for(int i = 0; i < numCorners; i++) {
            drawPentigree(level, length);
            pen.turnLeft(angle);
        }
    }
    
     public static void drawPentigree(int level, double length) {
        if(level == 0) {
            pen.move(length);
        } else {
            pen.turnLeft(36);
            drawPentigree(level-1, length*SCALE);
            pen.turnLeft(72);
            drawPentigree(level-1, length*SCALE);
            pen.turnRight(144);
            drawPentigree(level-1, length*SCALE);
            pen.turnRight(72);
            drawPentigree(level-1, length*SCALE);
            pen.turnLeft(72);
            drawPentigree(level-1, length*SCALE);
            pen.turnLeft(72);
            drawPentigree(level-1, length*SCALE);
            pen.turnRight(36);
        }
    }
}