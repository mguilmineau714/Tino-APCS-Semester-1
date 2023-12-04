import gpdraw.*;
import java.awt.*;
import java.util.*;

/*
    Name:       Marcely Guilmineau
    Date:       11/29/2023
    Period:     3
    
    Is this lab fully working? (Yes)
    If not, explain:
    If resubmitting, explain:
 */
public class P3_Guilmineau_Marcely_MyDrawingTool extends DrawingTool implements MouseListener, MouseMotionListener, KeyListener{
    
    public void drawCompletedRectangle(double x, double y, double w, double h, Color color) {
        double saveX = xPos;
        double saveY = yPos;
        setDirection(0);
        setColor(color);
        up();
        move(x-h/2, y-h/2);
        down();
        move(h);
        turnLeft(90);
        move(w);
        turnLeft(90);
        move(h);
        turnLeft(90);
        move(w);
        up();
        move(saveX, saveY);
    }
    
    public void drawPolygon(int sideCount, double sideLength) {
        for(int i = 0; i < sideCount; i++) {
            move(sideLength);
            turnLeft(360/sideCount);
        }
    }
    
    public P3_Guilmineau_Marcely_MyDrawingTool() {
        super(new SketchPad(500, 500, 0));
    }
    
    public P3_Guilmineau_Marcely_MyDrawingTool(SketchPad pad) {
         super(pad);
    }
    
    public void setPosition(double x, double y) {
        boolean wasDown = this.isDown();
        double dir = this.getDirection();
        up();
        move(x, y);
        if(wasDown) down();
        setDirection(dir);
    }
    
    
    
    
}