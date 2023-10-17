    import gpdraw.*;
    import java.util.Scanner;
public class Checker {
    static SketchPad world = new SketchPad(1000, 1000);
    static DrawingTool pen = new DrawingTool(world);
 public static void main(String[] args) {
      
 }
   public static void cross(int length, int level ) {
       if(level == 0) {
           pen.turnRight(90);
           pen.move(length);
       } else {
           cross(length/2, level-1);
           pen.turnRight(180);
           cross(length/4, level-1);
           pen.turnRight(90);
           cross(length/4, level-1);
           pen.turnLeft(180);
           cross(length/2, level-1);
       }
   }
   
   public static void squares(double length, int level) {
        if (level == 0) {
            pen.forward(length);
            pen.turnLeft();
        } else {
            squares(length / 2, level - 1);
            pen.turnRight();
            squares(length / 2, level - 1);
            squares(length / 2, level - 1);
    }
   }
   
   public static void arrow(double length, int level) {
       pen.move(length);
       pen.turnRight(135);
       pen.move(length/3);
       double thisX = pen.getXPos();
       double thisY = pen.getYPos();
       double thisZ = pen.getDirection();
       if(level > 1) {
           pen.turnLeft(90);
           arrow(length/3, level-1);
       }
       pen.up();
       pen.move(thisX, thisY);
       pen.setDirection(thisZ);
       pen.turnRight(180);
       pen.move(length/3);
       pen.turnLeft(90);
       pen.down();
       pen.move(length/3);
       if(level > 1) {
           pen.turnRight(90);
           arrow(length/3, level-1);
       }
   }

   
}
