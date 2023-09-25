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

/**
 * This class represents a rectangle outline. 
 * It allows you to draw a rectangle outline centered at a selected point that has a width, height, and outline color.
 * You can customize the rectangle's attributes and draw it using the draw() method.
 * @author P3_Guilmineau_Marcely
 * @version 1.0
 */
public class P3_Guilmineau_Marcely_Outline {
    private int rectCenterX;
    private int rectCenterY;
    private int rectWidth;
    private int rectHeight;
    private Color outlineColor;
    private DrawingTool pencil;
    
    /**
     * Constructs a P3_Guilmineau_Marcely_Outline object with a default outline size and color.
     *
     * @param paper         The SketchPad where the outline is being drawn
     * @param rectCenterX   The X-coordinate of the center of the outline
     * @param rectCenterY   The Y-coordinate of the center of the outline
     */
   public P3_Guilmineau_Marcely_Outline(SketchPad paper, int rectCenterX, int rectCenterY) {
        this.pencil = new DrawingTool(paper);
        this.rectCenterX = rectCenterX;
        this.rectCenterY = rectCenterY;
        this.rectWidth = 250;
        this.rectHeight = 80;
        this.outlineColor = Color.BLACK;
   }
   
     /**
     * Constructs a P3_Guilmineau_Marcely_Outline object with custom attributes.
     *
     * @param paper         The SketchPad where the outline is being drawn
     * @param rectCenterX   The X-coordinate of the center of the outline
     * @param rectCenterY   The Y-coordinate of the center of the outline
     * @param rectWidth     The width of the outline
     * @param rectHeight    The height of the outline
     * @param outlineColor  The color of the outline
     */
   public P3_Guilmineau_Marcely_Outline(SketchPad paper, int rectCenterX, int rectCenterY, int rectWidth, int rectHeight, Color outlineColor) {
        this.pencil = new DrawingTool(paper);
        this.rectCenterX = rectCenterX;
        this.rectCenterY = rectCenterY;
        this.rectWidth = rectWidth;
        this.rectHeight = rectHeight;
        this.outlineColor = outlineColor;
   }

    /**
     * Draws the outline on the SketchPad
     */   
   public void draw() {
       pencil.up();
       pencil.setColor(outlineColor);
       pencil.move(rectCenterX - rectWidth/2, rectCenterY - rectHeight/2);
       pencil.down();
       pencil.move(rectCenterX + rectWidth/2, rectCenterY - rectHeight/2);
       pencil.move(rectCenterX + rectWidth/2, rectCenterY + rectHeight/2);
       pencil.move(rectCenterX - rectWidth/2, rectCenterY + rectHeight/2);
       pencil.move(rectCenterX - rectWidth/2, rectCenterY - rectHeight/2);
   }
   
}
