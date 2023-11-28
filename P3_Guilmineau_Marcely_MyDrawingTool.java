import gpdraw.*;
/*
    Name:       Marcely Guilmineau
    Date:       11/29/2023
    Period:     3
    
    Is this lab fully working? (Yes)
    If not, explain:
    If resubmitting, explain:
 */
public class P3_Guilmineau_Marcely_MyDrawingTool extends DrawingTool {
    
    public P3_Guilmineau_Marcely_MyDrawingTool() {
        super(new SketchPad(500, 500, 0));
    }
    
    public P3_Guilmineau_Marcely_MyDrawingTool(SketchPad pad) {
         super(pad);
    }
    
    public void setPosition(double x, double y) {
        boolean wasDown = this.isDown();
        double dir = this.getDirection();
        up();
        move(x, y);
        if(wasDown) down();
        setDirection(dir);
    }
    
    @Override
    public void move(double x, double y) {
        double dir = getDirection();
        super.move(x, y);
        setDirection(dir);
    }
    
}