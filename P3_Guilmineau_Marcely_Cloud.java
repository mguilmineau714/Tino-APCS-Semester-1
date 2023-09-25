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
 * This class represents a Cloud made up of 3 circles.
 * It allows you to draw a Cloud with a specificied base radius and select an x and y where the first tile is centered.
 * You can customize the Cloud's attributes and draw it using the draw() method.
 *
 * @author P3_Guilmineau_Marcely
 * @version 1.0
 */
public class P3_Guilmineau_Marcely_Cloud {
    private int centerX;
    private int centerY;
    private int radius;
    private Color CloudColor;
    private DrawingTool pencil;

    /**
     * Constructs a P3_Guilmineau_Marcely_Cloud object with default values.
     *
     * @param paper   The SketchPad where the Cloud is being drawn.
     * @param X       The X-coordinate of the center of the Cloud (all tiles are centered here).
     * @param startY  The Y-coordinate of the center of the Cloud's first tile.
     */
    public P3_Guilmineau_Marcely_Cloud(SketchPad paper, int centerX, int centerY) {
        this.pencil = new DrawingTool(paper);
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = 25; // Default starting width
        this.CloudColor = Color.GRAY; // Default Cloud color
    }

    /**
     * Constructs a P3_Guilmineau_Marcely_Cloud object with custom attributes.
     *
     * @param paper        The SketchPad where the Cloud is being drawn.
     * @param centerX            The X-coordinate of the center of the Cloud.
     * @param centerY       The Y-coordinate of the center of the Cloud tile.
     * @param radius       The height of the center cloud.
     * @param CloudColor   The color of the cloud.
     */
    public P3_Guilmineau_Marcely_Cloud(SketchPad paper, int centerX, int centerY, int radius, Color CloudColor) {
        this.pencil = new DrawingTool(paper);
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
        this.CloudColor = CloudColor;
    }

    /**
     * Draws the Cloud with the specified number of tiles and attributes.
     */
    public void draw() {
        drawCircle(centerX, centerY, radius, CloudColor);
        drawCircle(centerX+20, centerY-5, radius-5, CloudColor);
        drawCircle(centerX-30, centerY-5, radius-5, CloudColor);
    }

    /**
     * Draws a colored circle on the SketchPad that's part of a cloud.
     *
     * @param centerX       The X-coordinate of the center of the circle.
     * @param centerY       The Y-coordinate of the center of the circle.
     * @param radius        The radius of the cloud's center circle.
     * @param color         The color of the circle.
     */
    public void drawCircle(int centerX, int centerY, int radius, Color color) {
        pencil.up();
        pencil.move(centerX, centerY);
        pencil.down();
        pencil.drawCircle(radius);
        pencil.setColor(color);
        pencil.fillCircle(radius);
        pencil.up();
   }
}
