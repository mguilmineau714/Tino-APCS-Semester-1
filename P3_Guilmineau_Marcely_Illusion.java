import gpdraw.*;
import java.awt.Color;
/*
    Name:       Marcely Guilmineau
    Date:       09/15/2023
    Period:     3

    Is this lab fully working?  (Yes)
    If not, explain:
    If resubmitting, explain:
*/

public class P3_Guilmineau_Marcely_Illusion {
       static int worldWidth = 1000;
       static int worldHeight = 1500;
       static SketchPad paper = new SketchPad(worldWidth, worldHeight);                 
       static DrawingTool pencil= new DrawingTool(paper);
       
    public void draw() {
        drawRowOfRects(worldHeight/9, -worldHeight/2, Color.RED);
        drawSphere(-100, -100, 130, 110, 110, new Color(227, 181, 107), Color.WHITE);
        drawRowOfRects(worldHeight/9, -worldHeight/2 + worldHeight/(worldHeight/9)/3, Color.BLUE);
        drawSphere(100, 100, 130, 110, 110, new Color(227, 181, 107), Color.WHITE);
        drawRowOfRects(worldHeight/9, -worldHeight/2 + 2*worldHeight/(worldHeight/9)/3, Color.GREEN);
    }
    
    /**
     * Draws a row of rectangles with a set color
     * @param rectNum    The number of rectangles to draw in the row.
     * @param startY     The starting Y-coordinate of the row.
     * @param color      The color to fill the rectangles with.
     */
    public static void drawRowOfRects(int rectNum, int startY, Color color) {
        for(int i = 0; i < rectNum; i++) {
                drawRectangle(0, startY + i*worldHeight/rectNum, worldWidth, worldHeight/rectNum/3, color);
        }
    }
    
    /*
    public static void drawRowOfRectOld(int rectNum, Color firstRectColor, Color secondRectColor, Color thirdRectColor) {
        for(int i = 0; i < rectNum; i++) {
            if(i % 3 == 0) {
                drawRectangle(0, -worldHeight/2 + i*worldHeight/rectNum, worldWidth, worldHeight/rectNum, firstRectColor);
            }
            if(i % 3 ==1 ) {
                drawRectangle(0, -worldHeight/2 + i*worldHeight/rectNum, worldWidth, worldHeight/rectNum, secondRectColor);
            }
            if(i % 3 == 2) {
                drawRectangle(0, -worldHeight/2 + i*worldHeight/rectNum, worldWidth, worldHeight/rectNum, thirdRectColor);
            }
        }
    }
    */
    /**
     * Draws a sphere on the canvas with a central and focal point
     *
     * @param centerX          The X-coordinate of the center of the sphere.
     * @param centerY          The Y-coordinate of the center of the sphere.
     * @param radius           The initial radius of the sphere.
     * @param focalPointX      The X-coordinate of the focal point.
     * @param focalPointY      The Y-coordinate of the focal point.
     * @param color            The color of the outer part of the sphere.
     * @param focalPointColor  The color of the focal point.
     */
    public static void drawSphere(double centerX, double centerY, double radius, double focalPointX, double focalPointY, Color color, Color focalPointColor) {
       double concentricCircleX = centerX;
       double concentricCircleY = centerY;
       double concentricCircleRadius = radius;
       double focalPointDistance = Math.sqrt(Math.pow(focalPointX - centerX, 2) + Math.pow(focalPointY - centerY, 2));
       double changeInX = focalPointX - centerX;
       double changeInY = focalPointY - centerY;
       double slope = changeInY/changeInX;
       double concentricCircleRed = color.getRed();
       double concentricCircleGreen = color.getGreen();
       double concentricCircleBlue = color.getBlue();
       double focalRed = focalPointColor.getRed();
       double focalGreen = focalPointColor.getGreen();
       double focalBlue = focalPointColor.getBlue();
       for(double i = 0; i <= 10000; i++) {
            concentricCircleX += 1;
            concentricCircleY += slope;
            concentricCircleRadius -= 4;//radius/focalPointDistance;
            if(concentricCircleRed <= 254) {
                concentricCircleRed+=1;
            }
            if(concentricCircleGreen <= 255) {
                concentricCircleGreen+=2;
            }
            if(concentricCircleBlue <= 255) {
                concentricCircleBlue+=5;
            }              
            if(concentricCircleBlue <= 255) {
                drawCircle(concentricCircleX, concentricCircleY, concentricCircleRadius, new Color((int)concentricCircleRed, (int)concentricCircleGreen, (int)concentricCircleBlue));
            }
       }
    }
    
    
    /**
     * Draws a filled circle
     *
     * @param centerX  The X-coordinate of the center of the circle.
     * @param centerY  The Y-coordinate of the center of the circle.
     * @param radius   The radius of the circle.
     * @param color    The color to fill the circle with.
     */
    public static void drawCircle(double centerX, double centerY, double radius, Color color) {
        pencil.up();
        pencil.move(centerX, centerY);
        pencil.down();
        pencil.drawCircle(radius);
        pencil.setColor(color);
        pencil.fillCircle(radius);
        pencil.up();
   }
   /**
     * Draws a filled rectangle
     *
     * @param rectX      The X-coordinate of the top-left corner of the rectangle.
     * @param rectY      The Y-coordinate of the top-left corner of the rectangle.
     * @param rectLength The length (width) of the rectangle.
     * @param rectHeight The height of the rectangle.
     * @param color      The color to fill the rectangle with.
     */
    public static void drawRectangle(double rectX, double rectY, double rectLength, double rectHeight, Color color) {
       pencil.up();
       pencil.move(rectX, rectY);
       pencil.down();
       pencil.drawRect(rectLength, rectHeight);
       pencil.setColor(color);
       pencil.fillRect(rectLength, rectHeight);
       pencil.up();
   }
}
