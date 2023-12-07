import gpdraw.*;
import java.util.*;
import java.awt.*;

public class Checker {
    static SketchPad world = new SketchPad(300, 300);
    static DrawingTool pen = new DrawingTool(world);
    public static void main(String[] args) {
        Commands cs = new Commands(new Executable[]{new Prisoner()});
        String name = ((Prisoner)cs.CMDS[0]).name;
        System.out.println(name);
    }

    public static interface Executable {
        void execute(String cmd);
    }

    public static class Command implements Executable {

        public void execute(String cmd) {
            System.out.println("Executing command: " + getOp(cmd));
        }

        public String getOp(String cmd) {
            return new Scanner(cmd).nextLine();
        }

    }

    public static class CommandWord extends Command {
        public String getOp(String cmd) {
            return new Scanner(cmd).next();
        }
    }

    public static class Prisoner implements Executable {
        public String name = "Prisoner";

        public void execute(String reason) {
            System.out.println(name + " was executed because " + reason);
        }
    }

    public static class Commands {
        public final Executable[] CMDS;

        public Commands() {
            CMDS = new Executable[3];
        }

        public Commands(Executable[] cmds) {
            CMDS = cmds;
        }

    }

    public static void shuffle(ArrayList<Integer> deck) {
        for(int i = 0; i < deck.size(); i++) {
            int random = (int)(Math.random()*deck.size());
            int temp = deck.get(i);
            deck.set(i, deck.get(random));
            deck.set(random, temp);
        }
    }

    public static int substringCounter(String s) {
        ArrayList<String> a = new ArrayList();
        for(int i = 0; i < s.length(); i++) {
            for(int j = i+1; j <= s.length(); j++) {
                if(!a.contains(s.substring(i, j))) {
                    a.add(s.substring(i, j));
                }
            }
        }
        return a.size();
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
