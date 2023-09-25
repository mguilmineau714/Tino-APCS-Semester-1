import gpdraw.*;
import java.awt.Color;
/*
    Name:       Marcely Guilmineau
    Date:       09/04/2023
    Period:     3

    Is this lab fully working?  Yes
    If not, explain:
    If resubmitting, explain: 
*/
public class P3_Guilmineau_Marcely_FinalHouse {
    
    /* TO FIX:
    - Fix hardcoded values
    - Find method to fill in the 3d walls if possible
    */
   
   static SketchPad paper;                 // declare a SketchPad variable
   static DrawingTool pencil;              // declare a DrawingTool variable
   
   public static void main(String[] args) {
        // values
        int houseBase = 250;
        int houseHeight = 80;
        int doorBase = 50;
        int doorKnobRadius = 2;
        int sunRadius = 30;
        int worldWidth = 400;
        int worldHeight = 400;
        
        // colors
        Color bgCol = new Color(155, 181, 222);
        Color houseCol = new Color(214, 73, 73);
        Color doorCol = Color.ORANGE;
        Color sunCol = new Color(250, 221, 35);
        Color knobCol = new Color(105, 62, 3);
        Color grassCol = new Color(80, 184, 64);
        Color hillCol = new Color(140, 136, 132);//163, 235, 152);
        Color cloudCol = new Color(219, 215, 211);
        Color smokeCol = new Color(54, 51, 48);
        
        // set up
        paper = new SketchPad(worldWidth, worldHeight);  // create the SketchPad
        pencil = new DrawingTool(paper); // create the DrawingTool
        
        // draw background
        drawRectangle(0, 0, worldWidth, worldHeight, bgCol);
        
        // draw hills
        drawCircle(-150, -90, 100, hillCol);
        drawOval(0, -30, 300, 100, hillCol);
        drawCircle(150, -100, 100, hillCol);
        
        // draw sun
        drawCircle(-160, 160, sunRadius, sunCol);
        
        // draw grass
        drawRectangle(0, -150, 400, 100, grassCol);
        
        // draw tree
        drawRectangle(150, -80, 20, 80, Color.ORANGE);
        drawRectOutline(150, -80, 20, 80, Color.BLACK);
        drawCircle(150, -50, 30, Color.GREEN);
        
        //draw house base
        drawRectangle(-25, -100, houseBase, houseHeight, houseCol);

        // draw door
        drawRectangle(-25, -100, doorBase, houseHeight, doorCol);
        drawCircle(-20, -105, 2, knobCol);
        drawCircle(-30, -105, 2, knobCol);
        drawLine(-25, -60, -25, -140, knobCol);
        
        // draw clouds
        //drawCircle(0, 145, 25, cloudCol);
        //drawCircle(20, 140, 20, cloudCol);
        //drawCircle(-30, 140, 20,cloudCol);
        P3_Guilmineau_Marcely_Cloud cloud1 = new P3_Guilmineau_Marcely_Cloud(paper, 0, 145, 25, cloudCol);
        cloud1.draw();
        P3_Guilmineau_Marcely_Cloud cloud2 = new P3_Guilmineau_Marcely_Cloud(paper, -100, 100, 25, cloudCol);
        cloud2.draw();

        //drawCircle(-100, 100, 25, cloudCol);
        //drawCircle(-80, 95, 20, cloudCol);
        //drawCircle(-130, 95, 20, cloudCol);
        
        // draw chimney
        drawRectangle(-80, -20, 30, 70, Color.ORANGE);
        
        // draw chimney outline
        drawRectOutline(-80, -20, 30, 70, Color.BLACK);

        // draw roof 
        // drawRoof(23, -25, -59, 250, 2, Color.PINK);
        P3_Guilmineau_Marcely_Roof houseRoof = new P3_Guilmineau_Marcely_Roof(paper, 23, -25, -59, 250, 2, Color.PINK);
        houseRoof.draw();
        
        // draw chimney smoke
        drawCircle(-75, 50, 3, smokeCol);
        drawCircle(-85, 40, 3, smokeCol);
        drawCircle(-75, 30, 3, smokeCol);
        drawCircle(-85, 20, 3, smokeCol);
        
        // draw house base outline
        // drawRectOutline(-25, -100, houseBase, houseHeight, Color.BLACK);
        P3_Guilmineau_Marcely_Outline houseBaseOutline = new P3_Guilmineau_Marcely_Outline(paper, -25, -100, houseBase, houseHeight, Color.BLACK);
        houseBaseOutline.draw();
        
        // draw world outline
        drawRectOutline(0, 0, worldWidth, worldHeight, Color.BLACK);
   }  
    
    
   public static void drawOval(int centerX, int centerY, int boxWidth, int boxHeight, Color ovalColor) {
       pencil.up();
       pencil.setColor(ovalColor);
       pencil.move(centerX, centerY);
       pencil.down();
       pencil.drawOval(boxWidth, boxHeight);
       pencil.fillOval(boxWidth, boxHeight);
   }
    
   public static void drawRectOutline(int rectCenterX, int rectCenterY, int rectWidth, int rectHeight, Color outlineColor) {
       pencil.up();
       pencil.setColor(outlineColor);
       pencil.move(rectCenterX - rectWidth/2, rectCenterY - rectHeight/2);
       pencil.down();
       pencil.move(rectCenterX + rectWidth/2, rectCenterY - rectHeight/2);
       pencil.move(rectCenterX + rectWidth/2, rectCenterY + rectHeight/2);
       pencil.move(rectCenterX - rectWidth/2, rectCenterY + rectHeight/2);
       pencil.move(rectCenterX - rectWidth/2, rectCenterY - rectHeight/2);
   }
   
   public static void drawRoof(int numTiles, int X, int startY, int startWidth, int startHeight, Color roofColor) {
       for(int i = 0; i < numTiles; i++) {
           drawRectangle(X, startY + i*startHeight, startWidth-i*(startWidth/numTiles), startHeight, roofColor);
       }
   }
   
   public static void drawLine(int startX, int startY, int endX, int endY, Color lineColor) {
       pencil.up();
       pencil.setColor(lineColor);
       pencil.move(startX, startY);
       pencil.down();
       pencil.move(endX, endY);
       pencil.up();
   }
   
   public static void drawCircle(int centerX, int centerY, int radius, Color color) {
        pencil.up();
        pencil.move(centerX, centerY);
        pencil.down();
        pencil.drawCircle(radius);
        pencil.setColor(color);
        pencil.fillCircle(radius);
        pencil.up();
   }
    
   public static void drawRectangle(int rectX, int rectY, int rectLength, int rectHeight, Color color) {
       pencil.up();
       pencil.move(rectX, rectY);
       pencil.down();
       pencil.drawRect(rectLength, rectHeight);
       pencil.setColor(color);
       pencil.fillRect(rectLength, rectHeight);
       pencil.up();
   }
   
}