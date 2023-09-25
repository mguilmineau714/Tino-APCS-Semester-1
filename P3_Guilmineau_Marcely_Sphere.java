import gpdraw.*;
import java.awt.Color;

/*
    Name:       Marcely Guilmineau
    Date:       09/10/2023
    Period:     3

    Is this lab fully working?  (Yes)
    If not, explain:
    If resubmitting, explain:
*/


public class P3_Guilmineau_Marcely_Sphere {
    static SketchPad paper;
    static DrawingTool pencil;
    private double centerX;
    private double centerY;
    private double radius;
    private double focalPointX;
    private double focalPointY;
    private Color color;
    private Color focalPointColor;

    private int worldWidth = 1000;
    private int worldHeight = 1000;
    
    public P3_Guilmineau_Marcely_Sphere() {
       this.paper = new SketchPad(worldWidth, worldHeight);
       this.pencil = new DrawingTool(paper);
       this.centerX = 0;
       this.centerY = 0;
       this.radius = 250;
       this.focalPointX = 50;
       this.focalPointY = 50;
       this.color = new Color(0, 0, 0);
       this.focalPointColor = new Color(255, 255, 255);
   } 
    
    public P3_Guilmineau_Marcely_Sphere(SketchPad paper, double centerX, double centerY, double radius, double focalPointX, double focalPointY, Color color, Color focalPointColor) {
       this.pencil = new DrawingTool(paper);
       this.centerX = centerX;
       this.centerY = centerY;
       this.radius = radius;
       this.focalPointX = focalPointX;
       this.focalPointY = focalPointY;
       this.color = color;
       this.focalPointColor = focalPointColor;
   } 
   
   public double getVolume(double radius) {
       return (4.0/3)*Math.PI*Math.pow(radius, 3);
   }
   
    public double getCenterX() {
        return centerX;
    }

    public void setCenterX(double centerX) {
        this.centerX = centerX;
    }

    public double getCenterY() {
        return centerY;
    }

    public void setCenterY(double centerY) {
        this.centerY = centerY;
    }

    public double getFocalPointX() {
        return focalPointX;
    }

    public void setFocalPointX(double focalPointX) {
        this.focalPointX = focalPointX;
    }

    public double getFocalPointY() {
        return focalPointY;
    }

    public void setFocalPointY(double focalPointY) {
        this.focalPointY = focalPointY;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Color getFocalPointColor() {
        return focalPointColor;
    }

    public void setFocalPointColor(Color focalPointColor) {
        this.focalPointColor = focalPointColor;
    }
    
   public void draw() {
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
       for(double i = 0; i <= 1000; i++) {
            concentricCircleX += 1;
            concentricCircleY += slope;
            concentricCircleRadius -= 2;//radius/focalPointDistance;
            concentricCircleRed+=2;
            concentricCircleGreen+=2;
            concentricCircleBlue+=2;
            if(concentricCircleRed <= 255) {
                drawCircle(concentricCircleX, concentricCircleY, concentricCircleRadius, new Color((int)concentricCircleRed, (int)concentricCircleGreen, (int)concentricCircleBlue));
            }
       }

   }
   
    public void drawPixel(double pixelX, double pixelY, Color pixelColor) {
        pencil.up();
        pencil.move(pixelX, pixelY);
        pencil.setColor(pixelColor);
        pencil.down();
        pencil.move(1, 1);
        pencil.up();
    }
    
     public void drawCircle(double centerX, double centerY, double radius, Color color) {
        pencil.up();
        pencil.move(centerX, centerY);
        pencil.down();
        pencil.drawCircle(radius);
        pencil.setColor(color);
        pencil.fillCircle(radius);
        pencil.up();
   }
}
