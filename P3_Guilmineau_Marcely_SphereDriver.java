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

public class P3_Guilmineau_Marcely_SphereDriver {
    static SketchPad paper;
    static DrawingTool pencil;
    public static void main(String[] args) {
        paper = new SketchPad(2000, 2000);  // create the SketchPad
        pencil = new DrawingTool(paper);
        P3_Guilmineau_Marcely_Sphere sphere1 = new P3_Guilmineau_Marcely_Sphere();
        System.out.println(sphere1.getVolume(10));
        P3_Guilmineau_Marcely_Sphere sphere2 = new P3_Guilmineau_Marcely_Sphere(paper, 0.0, 0.0, 900, 25.0, 25.0, new Color(111, 111, 111), new Color(255, 255, 255));
        sphere2.draw();
    }
}
