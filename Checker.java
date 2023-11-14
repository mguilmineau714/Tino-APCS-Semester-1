import gpdraw.*;
import java.util.*;
import java.awt.Color;

public class Checker {
    static SketchPad world = new SketchPad(300, 300);
    static DrawingTool pen = new DrawingTool(world);
     public static void main(String[] args) {
            int counter = 0;
            for(int j = 0; j < 100; j++) {
                counter += testIterations("AIVB", 30);
            }
            System.out.println(counter/100);
    }
    
    public static int testIterations(String singleString, int stringLength) {
         int iterationCounter = 0;
         Boolean matchNotFound = true;
         while(matchNotFound) {
             String a = generateRandomString(stringLength);
             if(a.contains(singleString)) {
                 matchNotFound = false;
             }
             iterationCounter++;
            // System.out.println("String: " + a + " Iteration #: " + iterationCounter);
         }
         return iterationCounter;
    }
     
    public static String generateRandomString(int length) {
        String s = "";
        for(int i = 0; i < length; i++) {
            int randomNumber = (int)(Math.random()*26+65);
            s += (char)randomNumber;
        }
        return s;
    }
    
    public static void drawCheckerboard(int w, int l) {
        Color newCol;
        for(int i = 0; i < w; i++) {
            for(int j = 0; j < l; j++) {
                newCol = i%2==0
                ?
                (j%2 == 0 ? Color.BLACK : Color.RED)
                :
                (j%2 == 0 ? Color.RED : Color.BLACK);
                drawSquare(20*i, 20*j, 20, newCol);
            }
        }
    }
    
    public static void drawSquare(int sX, int sY, int sL, Color color) {
       pen.up();
       pen.move(sX, sY);
       pen.down();
       pen.drawRect(sL, sL);
       pen.setColor(color);
       pen.fillRect(sL, sL);
       pen.up();
   }
    
    public static void printDiamond(int n) {
        if(n >= 1 && n <= 40) { 
            // Upper Part
            for(int i = 0; i < n; i++) {
                for(int j = 1; j < n-i; j++) {
                    System.out.print(" ");
                }
                for(int h = 1; h <= 2*i+1; h++) {
                    System.out.print("*");
                }
                for(int g = 1; g < n-i; g++) {
                    System.out.print(" ");
                }   
                System.out.println();
            }
            // Lower Part
            for(int i = n-2; i >= 0; i--) {
                for(int j = 1; j < n-i; j++) {
                    System.out.print(" ");
                }
                for(int h = 1; h <= 2*i+1; h++) {
                    System.out.print("*");
                }
                for(int g = 1; g < n-i; g++) {
                    System.out.print(" ");
                }   
                System.out.println();
            }
        } else System.out.println("n is too small or large - n must be in within [1, 40]");
    }
    
    public static int randomNum(int max) {
        return (int)(Math.random()*max) +1;
    }
    
    public static int randomNum(int max, int excluded) {
        return (int)(Math.random()*(excluded-1)) + randomNum(max-excluded)+1;
    }

    public static int count(String str) {
        if(str.length() <3) {
            return 0;
        }
        return (str.substring(0, 3).charAt(0) == str.substring(0, 3).charAt(2) && str.substring(0, 3).charAt(0) != str.substring(0, 3).charAt(1) ? 1 : 0) + count(str.substring(1));
    }
    
    public static void drawT(int level, double length) {
        if(level == 1) {
            pen.move(length);
            pen.turnLeft(90);
            pen.move(length);
            pen.turn(180);
            pen.move(length);
            pen.turnLeft();
        } else {
            drawT(level-1, length/2.0);
            drawT(level-1, length/2.0);
            pen.turnRight(90);
            drawT(level-1, length/2.0);
        }
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
   
   public static void draw(double length, int level) {
        if (level == 0) {
            pen.forward(length);
            pen.turnLeft(90);
        }
        else {
            pen.forward(length);
            pen.turnRight(90);
            draw(length / 2, level - 1);
            pen.forward(length);
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
