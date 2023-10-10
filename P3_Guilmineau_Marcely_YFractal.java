
import gpdraw.*;

public class P3_Guilmineau_Marcely_YFractal {

    // Attributes
    static SketchPad pad;
    static DrawingTool pen;

    // Constructor
    public P3_Guilmineau_Marcely_YFractal() {

        pad = new SketchPad(500, 500, 50);
        pen = new DrawingTool(pad);

        // Back the pen up so the L is drawn in the middle of the screen
        
        pen.up();
        pen.setDirection(270);
        pen.backward(-250);
        pen.down();
  
    }
    
     public void drawYFractal(int level, double length) {
        if(level == 0) {
            pen.turnRight(180);
            pen.move(length);
            pen.turnRight(60);
            pen.move(length);
            pen.turnRight(180);
            pen.up();
            pen.move(length);
            pen.down();
            pen.turnRight(60);
            pen.move(length);
        } else {
            pen.turnRight(180);
            pen.move(length/2);
            double x1 = pen.getXPos();
            double y1 = pen.getYPos();
            double dir1 = pen.getDirection();
            pen.turn(90);
            drawYFractal(level-1, length/2);
            pen.up();
            pen.move(x1,y1);
            pen.setDirection(dir1);
            pen.down();
            pen.move(length/2);
            pen.turnRight(60);
            pen.move(length/2);
            double x2 = pen.getXPos();
            double y2 = pen.getYPos();
            double dir2 = pen.getDirection();
            pen.turn(-90);
            drawYFractal(level-1, length/2);
            pen.up();
            pen.move(x2,y2);
            pen.setDirection(dir2);
            pen.down();
            pen.move(length/2);
            pen.turnRight(180);
            pen.up();
            pen.move(length);
            pen.down();
            pen.turnRight(60);
            pen.move(length/2);
            double x3 = pen.getXPos();
            double y3 = pen.getYPos();
            double dir3 = pen.getDirection();
            pen.turn(-90);
            drawYFractal(level-1, length/2);
            pen.up();
            pen.move(x3,y3);
            pen.setDirection(dir3);
            pen.down();
            pen.move(length/2);
        }
    }
    
    public void drawLFractal(int level, double length) {

        // Base case:  Draw an L
        if (level == 0) {
            pen.forward(length);
            pen.turnLeft(90);
            pen.forward(length);
        }


        // Recursive case:  Draw an L at each midpoint
        // of the current L's segments
        else {

            // Move to first midpoint
            pen.forward(length / 2.0);
            pen.turnRight(90);

            // Save current drawing position
            double x = pen.getXPos();
            double y = pen.getYPos();
            double dir = pen.getDirection();

            // Recursively draw another L at the midpoint
            drawLFractal(level - 1, length / 2.0);

            // Restore drawing position
            pen.up();
            pen.move(x,y);
            pen.setDirection(dir);
            pen.down();

            // Move to second midpoint
            pen.turnLeft(90);
            pen.forward(length / 2.0);
            pen.turnLeft(90);
            pen.forward(length / 2.0);
            pen.turnRight(90);

            // Save current drawing position
            x = pen.getXPos();
            y = pen.getYPos();
            dir = pen.getDirection();

            // Recursively draw another L at the midpoint
            drawLFractal(level - 1, length / 2.0);

            // Restore drawing position
            pen.up();
            pen.move(x,y);
            pen.setDirection(dir);
            pen.down();
            
            // Finish end of the L
            pen.turnLeft(90);
            pen.forward(length / 2.0);
        }
    }

    public static void main(String[] args) {
        
        P3_Guilmineau_Marcely_YFractal fractal = new P3_Guilmineau_Marcely_YFractal();

        // Draw LFractal with given level and side length
        // fractal.drawLFractal(2, 200);

        fractal.drawYFractal(4, 200);

    }    


}