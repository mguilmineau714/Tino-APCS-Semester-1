import gpdraw.*;
import java.awt.Color;
/*
    Name:       Marcely Guilmineau
    Date:       09/24/2023
    Period:     3

    Is this lab fully working?  (Yes)
    If not, explain:
    If resubmitting, explain:
*/
public class P3_Guilmineau_Marcely_IllusionDriver {
        static SketchPad paper;                 
        static DrawingTool pencil;
        static int worldWidth = 1000;
        static int worldHeight = 1500;
    public static void main(String[] args) {
        paper = new SketchPad(worldWidth, worldHeight);
        pencil = new DrawingTool(paper);
        P3_Guilmineau_Marcely_Illusion illusion = new P3_Guilmineau_Marcely_Illusion();
        illusion.draw();
    }
}
