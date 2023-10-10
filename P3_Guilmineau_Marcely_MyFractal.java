import gpdraw.*;
/*
    Name:       Marcely Guilmineau
    Date:       10/7/2023
    Period:     3

    Is this lab fully working?  (Yes)
    If not, explain:
    If resubmitting, explain:
*/
public class P3_Guilmineau_Marcely_MyFractal {
    static SketchPad paper;
    static DrawingTool p;
    public static void main(String[] args) {
        paper = new SketchPad(2000, 2000);
        p = new DrawingTool(paper);
        P3_Guilmineau_Marcely_MyFractal fractal = new P3_Guilmineau_Marcely_MyFractal();
        fractal.drawPentagon(50, 0, 0);
        fractal.drawSierpinskiPentagon(0, 100);
    }
    
    public void drawSierpinskiPentagon(int level, double sideLength) {
        
    }
    
    public void drawPentagon(int sideLength, int centerX, int centerY) {
        p.up();
    }
    
}