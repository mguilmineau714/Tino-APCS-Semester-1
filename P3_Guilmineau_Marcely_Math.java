import java.awt.Point;

/**
 * This class contains various mathematical utility methods like converting temp, volume of a sphere, hypotenuse of a triangle, finding atom count, random number generator, and perimeter of a triangle.
 * @author P3_Guilmineau_Marcely
 */
public class P3_Guilmineau_Marcely_Math {
    static final double AVOGADROS_CONSTANT = 6.022140857e23;
    /**
     * Converts a temperature value from Celsius to Fahrenheit.
     *
     * @param c The temperature in Celsius.
     * @return The temperature in Fahrenheit.
     */
    public static double cToF(double c) {
        return c * 9.0 / 5.0 + 32.0;
    }

    /**
     * Converts a temperature value from Fahrenheit to Celsius.
     *
     * @param f The temperature in Fahrenheit.
     * @return The temperature in Celsius.
     */
    public static double fToC(double f) {
        return 5.0*(f - 32.0)/9.0;
    }

    /**
     * Calculates the volume of a sphere given its radius.
     *
     * @param r The radius of the sphere.
     * @return The volume of the sphere.
     */
    public static double sphereVolume(double r) {
        return 4.0 * Math.PI * Math.pow(r, 3) / 3.0;
    }

    /**
     * Calculates the hypotenuse of a right triangle given the lengths of its two sides.
     *
     * @param side1 The length of the first side.
     * @param side2 The length of the second side.
     * @return The length of the hypotenuse.
     */
    public static double hypotenuse(double side1, double side2) {
        return Math.pow(Math.pow(side1, 2) + Math.pow(side2, 2), 0.5);
    }

    /**
     * Converts a mass in grams to the number of atoms, given the atomic mass of the substance.
     *
     * @param grams       The mass in grams.
     * @param atomicMass  The atomic mass of the substance in atomic mass units (AMU).
     * @return The number of atoms in the given mass.
     */
    public static double gramsToAtoms(double grams, double atomicMass) {
        return grams * AVOGADROS_CONSTANT / atomicMass;
    }

    /**
     * Generates a random integer between a specified minimum and maximum value.
     *
     * @param min The minimum value of the random integer.
     * @param max The maximum value of the random integer.
     * @return A random integer within the specified range.
     */
    public static int randomN(int min, int max) {
        return min + (int) (Math.random() * ((max - min) + 1));
    }

    /**
     * Calculates the perimeter of a triangle given 3 corner points.
     *
     * @param a The first point of the triangle.
     * @param b The second point of the triangle.
     * @param c The third point of the triangle.
     * @return The perimeter of the triangle.
     */
    public static double perimeter(Point a, Point b, Point c) {
        double abdist = Point.distance(a.getX(), a.getY(), b.getX(), b.getY());
        double acdist = Point.distance(b.getX(), b.getY(), c.getX(), c.getY());
        double bcdist = Point.distance(a.getX(), a.getY(), c.getX(), c.getY());
        return abdist + acdist + bcdist;
    }
}

