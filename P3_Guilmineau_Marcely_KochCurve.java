import gpdraw.*;

public class P3_Guilmineau_Marcely_KochCurve{
    public static void main(String[] args) {
        SketchPad paper = new SketchPad(1000, 1000);
        DrawingTool pen = new DrawingTool(paper);
        P3_Guilmineau_Marcely_KochCurve curvy = new P3_Guilmineau_Marcely_KochCurve();
        curvy.drawKochCurve(6, 3000, pen);
    }
    
    public void drawKochCurve(int level, int length, DrawingTool pen) {
        if(level == 1) {    
            pen.down();
            pen.move(length);
        } else {
            drawKochCurve(level-1, length/3, pen);
            pen.turnLeft(60);
            drawKochCurve(level-1, length/3, pen);
            pen.turnRight(120);
            drawKochCurve(level-1, length/3, pen);
            pen.turnLeft(60);
            drawKochCurve(level-1, length/3, pen);
        }
    }
}
