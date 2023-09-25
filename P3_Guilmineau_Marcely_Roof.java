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
 * This class represents a roof made up of tiles stacked on top of each other
 * It allows you to draw a roof with a specified number of tiles, a tile width for the first tile, a tile height to represent distance between tiles, and select an x and y where the first tile is centered.
 * You can customize the roof's attributes and draw it using the draw() method.
 *
 * @author P3_Guilmineau_Marcely
 * @version 1.0
 */
public class P3_Guilmineau_Marcely_Roof {
    private int numTiles;
    private int X;
    private int startY;
    private int startWidth;
    private int startHeight;
    private Color roofColor;
    private DrawingTool pencil;

    /**
     * Constructs a P3_Guilmineau_Marcely_Roof object with default values.
     *
     * @param paper   The SketchPad where the roof is being drawn
     * @param X       The X-coordinate of the center of the roof (all tiles are centered here)
     * @param startY  The Y-coordinate of the center of the roof's first tile
     */
    public P3_Guilmineau_Marcely_Roof(SketchPad paper, int X, int startY) {
        this.pencil = new DrawingTool(paper);
        this.numTiles = 23; // Default number of tiles
        this.X = X;
        this.startY = startY;
        this.startWidth = 250; // Default starting width
        this.startHeight = 2; // Default starting height
        this.roofColor = Color.PINK; // Default roof color
    }

    /**
     * Constructs a P3_Guilmineau_Marcely_Roof object with custom attributes.
     *
     * @param paper        The SketchPad where the roof is being drawn
     * @param numTiles     The number of tiles in the roof
     * @param X            The X-coordinate of the center of the roof
     * @param startY       The Y-coordinate of the center of the roof tile
     * @param startWidth   The width of the first roof tile, each subsequent tile width is based on an negative increment of this width
     * @param startHeight  The height of each roof tile
     * @param roofColor    The color of the roof
     */
    public P3_Guilmineau_Marcely_Roof(SketchPad paper, int numTiles, int X, int startY, int startWidth, int startHeight, Color roofColor) {
        this.pencil = new DrawingTool(paper);
        this.numTiles = numTiles;
        this.X = X;
        this.startY = startY;
        this.startWidth = startWidth;
        this.startHeight = startHeight;
        this.roofColor = roofColor;
    }

    /**
     * Draws the roof with the specified number of tiles and attributes.
     */
    public void draw() {
        for (int i = 0; i < numTiles; i++) {
            drawRectangle(X, startY + i * startHeight, startWidth - i * (startWidth / numTiles), startHeight, roofColor);
        }
    }

    /**
     * Draws a colored rectangle on the SketchPad that serves as a roof tile
     *
     * @param rectX       The X-coordinate of the rectangle's starting point    
     * @param rectY       The Y-coordinate of the rectangle's starting point
     * @param rectLength  The length of the rectangle
     * @param rectHeight  The height of the rectangle
     * @param color       The color of the rectangle
     */
    public void drawRectangle(int rectX, int rectY, int rectLength, int rectHeight, Color color) {
        pencil.up();
        pencil.move(rectX, rectY);
        pencil.down();
        pencil.drawRect(rectLength, rectHeight);
        pencil.setColor(color);
        pencil.fillRect(rectLength, rectHeight);
        pencil.up();
    }
}
