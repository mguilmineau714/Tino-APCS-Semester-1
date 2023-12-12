import gpdraw.*;
import java.awt.event.*;
import java.awt.Color;
import java.util.*;
import java.awt.event.MouseListener;

/*
Name:       Marcely Guilmineau
Date:       11/29/2023
Period:     3

Is this lab fully working? (Yes)
If not, explain:
If resubmitting, explain:
 */
public class P3_Guilmineau_Marcely_MyDrawingTool extends DrawingTool implements MouseListener, MouseMotionListener {
    public void printInfo() {
        System.out.println("This custom drawingTool has a few cool methods you can use such as:/n- an upgraded drawCircle and drawRect method/n- 3 new constructors/n- a custom fractal and polgyon method- and 2 random mouseEvent methods.");    
    }

    private static final double SCALE = (3-Math.pow(5, 0.5))/2;
    private static final double TOTAL = 360;
    
    public void mouseClicked(MouseEvent e) {

    }
    public void mouseEntered(MouseEvent e) {

    }  
     public void mouseExited(MouseEvent e) {
        
    }
     public void mouseReleased(MouseEvent e) {
        
    }
    public void mouseMoved(MouseEvent e) {
        
    } 
    public void mousePressed(MouseEvent e) {
        
    }
    public void mouseDragged(MouseEvent e) {
    }
    
    // 2 fun mouse methods
    public void drawRandomCircleOnClick(MouseEvent e) {
        up();
        move(e.getX(), e.getY());
        int randomNum = (int)(Math.random()*100)+1;
        setColor(new Color((int)(Math.random()*255)+1,(int)(Math.random()*255)+1, (int)(Math.random()*255)+1));
        down();
        drawCircle(randomNum);
    }
    
     public void drawRandomPolygon(MouseEvent e) {
        up();
        move(e.getX(), e.getY());
        down();
        int randomNum = (int)(Math.random()*100)+10;
        int randomLength = (int)(Math.random()*100)+1-0;
        drawPolygon(randomNum, randomLength);
    }
    
     // 2 new methods
    public void drawPolygon(int sideCount, double sideLength) {
        for(int i = 0; i < sideCount; i++) {
            move(sideLength);
            turnLeft(TOTAL/sideCount);
        }
    }
    
    public void drawCompletedRectangle(double x, double y, double w, double h, Color color) {
        double saveX = xPos;
        double saveY = yPos;
        setDirection(0);
        setColor(color);
        up();
        move(x-h/2, y-h/2);
        down();
        move(h);
        turnLeft();
        move(w);
        turnLeft();
        move(h);
        turnLeft();
        move(w);
        up();
        move(saveX, saveY);
    }

    public void drawCustomFractal(int level, double length, int numCorners, Color starColor, Boolean makeGradient) {
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
            drawFractalBase(level, length, startColor);
            turnLeft(angle);
        }
    }
    
     public void drawFractalBase(int level, double length, Color color) {
        setColor(color);
         if(level == 0) {
            move(length);
        } else {
            turnLeft(36);
            drawFractalBase(level-1, length*SCALE, color);
            turnLeft(72);
            drawFractalBase(level-1, length*SCALE, color);
            turnRight(144);
            drawFractalBase(level-1, length*SCALE, color);
            turnRight(72);
            drawFractalBase(level-1, length*SCALE, color);
            turnLeft(72);
            drawFractalBase(level-1, length*SCALE, color);
            turnLeft(72);
            drawFractalBase(level-1, length*SCALE, color);
            turnRight(36);
        }
    }
    
    // 2 overriden methods
    @Override
    public void drawCircle(double radius) {
        super.drawCircle(radius);
        fillCircle(radius);
    }

    @Override
    public void drawRect(double recWidth, double recHeight) {
        super.drawRect(recWidth, recHeight);
        fillRect(recWidth, recHeight);
    }

    // 3 new constructors
    public P3_Guilmineau_Marcely_MyDrawingTool() {
        super(new SketchPad(500, 500, 0));
        getPadPanel().addMouseListener(this);
        getPadPanel().requestFocusInWindow();
    }

    public P3_Guilmineau_Marcely_MyDrawingTool(SketchPad pad) {
        super(pad);
        getPadPanel().addMouseListener(this);
        getPadPanel().requestFocusInWindow();

    }
    
    public P3_Guilmineau_Marcely_MyDrawingTool(SketchPad pad, int w, int l) {
        super(new SketchPad(w, l, 0));
        getPadPanel().addMouseListener(this);
        getPadPanel().requestFocusInWindow();
    }
}