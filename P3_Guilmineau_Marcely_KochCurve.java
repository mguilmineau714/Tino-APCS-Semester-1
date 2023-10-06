import gpdraw.*;
/*
    Name:       Marcely Guilmineau
    Date:       10/3/2023
    Period:     3

    Is this lab fully working?  (Yes)
    If not, explain:
    If resubmitting, explain:
*/
public class P3_Guilmineau_Marcely_KochCurve {
    static SketchPad paper;
    static DrawingTool pen;
    
    public P3_Guilmineau_Marcely_KochCurve(int worldWidth, int worldHeight)  {
        paper = new SketchPad(worldWidth, worldHeight);
        pen = new DrawingTool(paper);
    }
    
    public void drawKochSnowflake2(int level, int length) {
        drawKochCurve2(level, length);
        pen.turnRight(90);
        drawKochCurve(level, length+200);
        pen.turnRight(90);
        drawKochCurve2(level, length);
        pen.turnRight(90);
        drawKochCurve(level, length+200);
    }
    
    public void drawKochSnowflake(int level, int length) {
        pen.turnRight(30);
        drawKochCurve(level, length);
        pen.turnRight(120);
        drawKochCurve(level, length);
        pen.turnRight(120);
        drawKochCurve(level, length);
    }
    
    public void drawKochCurve(int level, double length) {
        if(level == 1) {    
            pen.down();
            pen.move(length);
        } else {
            drawKochCurve(level-1, length/3);
            pen.turnLeft(60);
            drawKochCurve(level-1, length/3);
            pen.turnRight(120);
            drawKochCurve(level-1, length/3);
            pen.turnLeft(60);
            drawKochCurve(level-1, length/3);
        }
    }
    
    public void drawKochCurve2(int level, double length) {
        if(level == 1) {    
            pen.down();
            pen.move(length);
        } else {
            drawKochCurve2(level-1, length/3);
            pen.turnLeft(-60);
            drawKochCurve2(level-1, length/3);
            pen.turnRight(-120);
            drawKochCurve2(level-1, length/3);
            pen.turnLeft(-60);
            drawKochCurve2(level-1, length/3);
        }
    }
    
}
