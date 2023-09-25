import gpdraw.*;
import java.awt.Color;

public class P3_Guilmineau_Marcely_FirstHouse {

    
    /* TO FIX:
    - Fix hardcoded values
    - Find method to fill in the 3d walls
    - Add background maybe(?)
    Final concept: https://cdn.discordapp.com/attachments/736701763729489941/1145602157043793960/image.png
    */
    public static void main(String[] args) {

        // This is a single-line comment
        
        SketchPad paper;                 // declare a SketchPad variable
        DrawingTool pencil;              // declare a DrawingTool variable
        paper = new SketchPad(400,400);  // create the SketchPad
        pencil = new DrawingTool(paper); // create the DrawingTool
        // values
        int houseBase = 100;
        int houseHeight = 80;
        int doorBase = 50;
        int doorKnobRadius = 2;
        int sunRadius = 30;
        
        Color houseCol = Color.RED;
        Color doorCol = Color.ORANGE;
        //draw bg
        pencil.setColor(Color.BLUE);
        pencil.drawRect(400, 400);
        pencil.fillRect(400, 400);
        pencil.up();
        pencil.move(-200 + sunRadius, 200 - sunRadius);
        pencil.down();
        pencil.setColor(Color.YELLOW);
        pencil.drawCircle(sunRadius);
        pencil.fillCircle(sunRadius);
        
        pencil.setColor(Color.GRAY);
        pencil.up();
        pencil.move(0, 100);
        pencil.drawCircle(20);
        pencil.fillCircle(20);
        pencil.up();
        pencil.up();
        pencil.move(50, -100);
        pencil.setColor(houseCol);
        pencil.down();
        //draw both house bases
        
        pencil.drawRect(houseBase, houseHeight);
        pencil.fillRect(houseBase, houseHeight);
        pencil.up();
        
        pencil.move(-100, -100);
        
        pencil.down();
        
        pencil.drawRect(houseBase, houseHeight);
        pencil.fillRect(houseBase, houseHeight);
        pencil.up();
        pencil.move(-25, -100);
        pencil.setColor(doorCol);
        pencil.down();
        
        pencil.drawRect(doorBase, houseHeight);
        pencil.fillRect(doorBase, houseHeight);
        
        pencil.setColor(Color.BLACK);
        pencil.up();
        pencil.move(-20, -105);
        pencil.down();
        pencil.drawCircle(2);
        pencil.fillCircle(2);
        pencil.up();
        pencil.move(-30, -105);
        pencil.down();
        pencil.drawCircle(doorKnobRadius);
        pencil.fillCircle(doorKnobRadius);
        pencil.up();
        pencil.move(-25, -60);
        pencil.down();
        pencil.move(-25, -140);
        pencil.up();
        pencil.move(-150, -60);
        pencil.down();
        pencil.move(houseBase, houseHeight/2);
    }   
    
    
    
    public void drawDoorknob(int x, int y, int radius) {
        
        
    }
    
}
