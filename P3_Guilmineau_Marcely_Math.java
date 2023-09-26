import java.lang.Math.*;

public class P3_Guilmineau_Marcely_Math {
    static double cToF(double c) {
        return c*1.8+32;
    }
    static double fToC(double f) {
        return (5/9)*(f-32);
    }
    static double sphereVolume(double r) {
        return (4/3)*Math.PI*Math.pow(r, 3);
    }
    static double hypoteneuse(double side1, double side2) {
        return Math.pow(Math.pow(side1, 2) + Math.pow(side2, 2), 0.5);
    }
    static double gramsToAtoms(double grams, double atomicMass) {
        return grams/atomicMass;
    }
    static int randomN(int min, int max) {
        return min + (int)(Math.random() * ((max - min) + 1));
    }
    static double perimeter(double a, double b, double c) {
        double abdist = Math.pow(Math.pow(a, 2) + Math.pow(b, 2), 0.5);
        double acdist = Math.pow(Math.pow(a, 2) + Math.pow(c, 2), 0.5);
        double bcdist = Math.pow(Math.pow(b, 2) + Math.pow(c, 2), 0.5);
        return abdist + acdist + bcdist;
    }
}
