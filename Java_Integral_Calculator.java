import gpdraw.*;
import java.awt.Color;

public class Java_Integral_Calculator  {
    /**
     * Approximate integrals using riemann sums, and maybe graph them!
     *
     * @author Marcely
     * @version 1.4
     */
    @FunctionalInterface
    interface MathFunction {
        double apply(double x);
    }
    
    static SketchPad graph;
    static DrawingTool pen;
    
    public static void main(String[] args) {
        String sumType;
        double subIntervals;
        double lowerBound;
        double upperBound;
        MathFunction function;
        Boolean makeGraph;

        sumType = "TRAP";
        subIntervals = 50000;
        lowerBound = -1;
        upperBound = 3;
        function = x -> Math.pow(x, 2)*Math.pow(Math.E, -x);
        makeGraph = true;
        
        Java_Integral_Calculator integralCalculator = new Java_Integral_Calculator();

        if(makeGraph) { 
            graph = new SketchPad(2000, 2000);
            pen = new DrawingTool(graph);
            pen.up();
            pen.move(-2000, 0);
            pen.down();
            pen.move(2000, 0);
            pen.up();
            pen.move(0, 2000);
            pen.down();
            pen.move(0, -2000);
            pen.up();
        }
        
        System.out.println("The definite integral of the function given" + " from " + lowerBound + " to " + upperBound + " using the approximation method " + sumType + " approximated with " + subIntervals + " rectangles is ");
        System.out.println("[" + integralCalculator.RAMSum(sumType, subIntervals, lowerBound, upperBound, function, makeGraph) + "]");
    }

    public double RAMSum(String sumType, double subIntervals, double lowerBound, double upperBound, MathFunction function, Boolean makeGraph) {
        double answer = 0.0;
        double increment = (upperBound-lowerBound)/subIntervals;
        Color rectColor = new Color(184, 210, 252);
        Color outlineColor = new Color(54, 92, 153);
        double scale = 40;
        if(sumType.equals("LRAM")) {
            for(double i = lowerBound; i <= upperBound - increment; i+= increment) {
                if(makeGraph) {
                    drawRectangle(scale*(i+increment/2), scale*function.apply(i)/2, scale*increment, scale*function.apply(i), rectColor);
                    drawRectOutline(scale*(i+increment/2), scale*function.apply(i)/2, scale*increment, scale*function.apply(i), outlineColor);
                }
                answer += function.apply(i);
            }
        } else if(sumType.equals("MRAM")) {
            for(double i = lowerBound + increment/2; i <= upperBound - increment/2; i+= increment) {
                if(makeGraph) {
                    //drawRectangle(scale*(i+increment/2), scale*function.apply(i)/2, scale*increment, scale*function.apply(i), rectColor);
                    //drawRectOutline(scale*(i+increment/2), scale*function.apply(i)/2, scale*increment, scale*function.apply(i), outlineColor);
                }
                answer += function.apply(i);
            }
        } else if(sumType.equals("RRAM")) {
            for(double i = lowerBound + increment; i <= upperBound; i+= increment) {
                if(makeGraph) {
                    //drawRectangle(scale*(i+increment/2), scale*function.apply(i)/2, scale*increment, scale*function.apply(i), rectColor);
                    //drawRectOutline(scale*(i+increment/2), scale*function.apply(i)/2, scale*increment, scale*function.apply(i), outlineColor);
                }
                answer += function.apply(i);
            }
        } else if(sumType.equals("TRAP")){
            return (RAMSum("LRAM", subIntervals, lowerBound, upperBound, function, false) + RAMSum("RRAM", subIntervals, lowerBound, upperBound, function, false))/2;
        } else {
            throw new IllegalArgumentException("Invalid sumType: " + sumType);
        }
        return increment*answer;
    }
    
    public static void drawRectangle(double rectX, double rectY, double rectLength, double rectHeight, Color color) {
       pen.up();
       pen.move(rectX, rectY);
       pen.down();
       pen.drawRect(rectLength, rectHeight);
       pen.setColor(color);
       pen.fillRect(rectLength, rectHeight);
       pen.up();
    }
    
     public static void drawRectOutline(double rectCenterX, double rectCenterY, double rectWidth, double rectHeight, Color outlineColor) {
       pen.up();
       pen.setColor(outlineColor);
       pen.move(rectCenterX - rectWidth/2, rectCenterY - rectHeight/2);
       pen.down();
       pen.move(rectCenterX + rectWidth/2, rectCenterY - rectHeight/2);
       pen.move(rectCenterX + rectWidth/2, rectCenterY + rectHeight/2);
       pen.move(rectCenterX - rectWidth/2, rectCenterY + rectHeight/2);
       pen.move(rectCenterX - rectWidth/2, rectCenterY - rectHeight/2);
   }
}