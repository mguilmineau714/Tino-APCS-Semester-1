import period_3_house_parts.*;
import gpdraw.*;
/*
    Name:       Marcely Guilmineau
    Date:       09/14/2023
    Period:     3

    Is this lab fully working?  Yes
    If not, explain:
    If resubmitting, explain:
*/
public class P3_Guilmineau_Marcely_CoolHouse {
    static SketchPad paper;
    static DrawingTool pencil;
    public static void main(String[] arguments) {
        paper = new SketchPad(2000, 2000);
        pencil = new DrawingTool(paper);
        P3_Flores_Elisabeth_Car car = new P3_Flores_Elisabeth_Car(paper, 100, -200);
        P3_Flores_Elisabeth_Squirrel squirrel = new P3_Flores_Elisabeth_Squirrel(paper, 600, 270);
        P3_Thaker_Varchas_DrawHouse house = new  P3_Thaker_Varchas_DrawHouse(pencil, -100, 200);
        P3_Liu_Alison_Trees tree = new P3_Liu_Alison_Trees(paper, 600, -150, 110);
        P3_Bojanapati_Tejas_Background background = new P3_Bojanapati_Tejas_Background(paper, 0, 0);
        
        background.draw();
        house.draw();
        car.drawCar();
        squirrel.drawSquirrel();
        tree.draw();

    }
}
