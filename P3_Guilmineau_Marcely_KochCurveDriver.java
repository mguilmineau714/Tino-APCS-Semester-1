import gpdraw.*;
/*
    Name:       Marcely Guilmineau
    Date:       10/15/2023
    Period:     3

    Is this lab fully working?  (Yes)
    If not, explain:
    If resubmitting, explain: fixed "your constructor should only take a DrawingTool or Sketchpad"
*/
public class P3_Guilmineau_Marcely_KochCurveDriver {
   static SketchPad pad;
   static DrawingTool pen;
   public static void main(String[] args) {
       pad = new SketchPad(1000, 1000);
       pen = new DrawingTool(pad);
       P3_Guilmineau_Marcely_KochCurve koch = new P3_Guilmineau_Marcely_KochCurve(pen);
       koch.drawKochSnowflake(4, 300);
   }
}
