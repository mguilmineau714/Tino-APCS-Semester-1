import gpdraw.*;
public class Student {
    static SketchPad world = new SketchPad(1000, 1000);
    static DrawingTool pen = new DrawingTool(world);

   public static void drawF(int length, int level ) {
       if(level == 0) {
           pen.turnRight(90);
           pen.move(length);
       } else {
           pen.turnLeft(90);
           pen.move(length/2);
           double thisX = pen.getXPos();
           double thisY = pen.getYPos();
           double thisZ = pen.getDirection();
           drawF(length/4, level-1);
           pen.up();
           pen.move(thisX, thisY);
           pen.setDirection(thisZ);
           pen.down();
           pen.move(length/2);
       }
   }

    public static void main(String[] args) {
      drawF(200, 2);
    }
}
