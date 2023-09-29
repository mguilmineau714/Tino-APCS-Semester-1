import gpdraw.*;

public class P3_Guilmineau_Marcely_RectangleDriver {

    public static void main(String[] args) {
        SketchPad paper = new SketchPad(1000, 1000);
        DrawingTool pen = new DrawingTool(paper);
        int rectInitial = 500;
        P3_Guilmineau_Marcely_RectangleTemplate rect1 = new P3_Guilmineau_Marcely_RectangleTemplate(-rectInitial/2, -rectInitial/2, rectInitial, rectInitial, paper);
        P3_Guilmineau_Marcely_RectangleTemplate rect2 = new P3_Guilmineau_Marcely_RectangleTemplate(-rectInitial/2, -rectInitial/6, rectInitial, rectInitial/3, paper);
        P3_Guilmineau_Marcely_RectangleTemplate rect3 = new P3_Guilmineau_Marcely_RectangleTemplate(-rectInitial/6, -rectInitial/2, rectInitial/3, rectInitial, paper);
        rect1.draw();
        rect2.draw();
        rect3.draw();
        System.out.println("The perimeter of the outer rectangle is " + rect1.calcPerimeter() + " and the area is " + rect1.calcArea());
        System.out.println("The perimeter of the inner horizontal rectangle is " + rect2.calcPerimeter() + " and the area is " + rect2.calcArea());
        System.out.println("The perimeter of the inner vertical rectangle is " + rect3.calcPerimeter() + " and the area is " + rect3.calcArea());

    }
}
