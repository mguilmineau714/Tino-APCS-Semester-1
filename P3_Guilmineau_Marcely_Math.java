import java.awt.Point;

public class P3_Guilmineau_Marcely_Math {    
     static double cToF(double c) {
        return c*1.8+32;
    }
    static double fToC(double f) {
        return (5.0/9.0)*(f-32.0);
    }
    static double sphereVolume(double r) {
        return (4.0/3.0)*Math.PI*Math.pow(r, 3);
    }
    static double hypoteneuse(double side1, double side2) {
        return Math.pow(Math.pow(side1, 2) + Math.pow(side2, 2), 0.5);
    }
    static double gramsToAtoms(double grams, double atomicMass) {
        final double AVOGADROS_CONSTANT = 6.022140857 * Math.pow(10, 23);
        return grams/atomicMass * AVOGADROS_CONSTANT;
    }
    static int randomN(int min, int max) {
        return min + (int)(Math.random() * ((max - min) + 1));
    }
    static double perimeter(Point a, Point b, Point c) {
        double abdist = Point.distance(a.getX(), a.getY(), b.getX(), b.getY());
        double acdist = Point.distance(b.getX(), b.getY(), c.getX(), c.getY());
        double bcdist = Point.distance(a.getX(), a.getY(), c.getX(), c.getY());
        return abdist + acdist + bcdist;
    }
}
