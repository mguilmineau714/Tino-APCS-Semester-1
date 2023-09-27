import java.awt.Point;

public class P3_Guilmineau_Marcely_MathDriver {
    public static void main(String[] args) {
        // Temperatures
        double temp1 = 212;
        double temp2 = 98.6;
        double temp3 = 37;
        double temp4 = -15;
        System.out.println(temp1 + "\u00b0" + "C" + " --> " + P3_Guilmineau_Marcely_Math.fToC(temp1) + "\u00b0" + "C");
        System.out.println(temp2 + "\u00b0" + "C" + " --> " + P3_Guilmineau_Marcely_Math.fToC(temp2) + "\u00b0" + "C");
        System.out.println(temp3 + "\u00b0" + "F" + " --> " + P3_Guilmineau_Marcely_Math.cToF(temp3) + "\u00b0" + "C");
        System.out.println(temp4 + "\u00b0" + "F" + " --> " + P3_Guilmineau_Marcely_Math.cToF(temp4) + "\u00b0" + "C");

        // Spheres
        double rad1 = 1.0;
        double rad2 = 6.8;
        System.out.println("Volume of a sphere with radius "  + rad1 + " is " + P3_Guilmineau_Marcely_Math.sphereVolume(rad1));
        System.out.println("Volume of a sphere with radius "  + rad2 + " is " + P3_Guilmineau_Marcely_Math.sphereVolume(rad2));
        
        // Triangles
        double side1 = 3;
        double side2 = 4;
        double side3 = 2.5;
        double side4 = 9.25;
        System.out.println("A right triangle with sides " + side1 + " and " + side2 + " has hypotenuse " + P3_Guilmineau_Marcely_Math.hypoteneuse(side1, side2));
        System.out.println("A right triangle with sides " + side3 + " and " + side4 + " has hypotenuse " + P3_Guilmineau_Marcely_Math.hypoteneuse(side3, side4));
        
        // Atoms
        double feGrams = 0.75;
        double auGrams = 5.24;
        double neGrams = 2.0;
        double feMass = 55.845;
        double auMass = 196.96657;
        double neMass = 20.1797;
        System.out.println(feGrams + "g of Fe contains " + P3_Guilmineau_Marcely_Math.gramsToAtoms(feGrams, feMass) + " atoms");
        System.out.println(auGrams + "g of Au contains " + P3_Guilmineau_Marcely_Math.gramsToAtoms(auGrams, auMass) + " atoms");
        System.out.println(neGrams + "g of Ne contains " + P3_Guilmineau_Marcely_Math.gramsToAtoms(neGrams, neMass) + " atoms");
    
        // Randoms
        int randA = 7;
        int randB = 9;
        for(int i = 0; i < 6; i++) {
            System.out.println("A random number between " + randA + " and " + randB + " is: " + P3_Guilmineau_Marcely_Math.randomN(randA, randB));
        }
        
        // Perimeters
        Point corner1 = new Point(1, 2);
        Point corner2 = new Point(3, 4);
        Point corner3 = new Point(5, 1);
        System.out.println("A triangle with vertices:");
        System.out.println("\t" + corner1.toString());
        System.out.println("\t" + corner2.toString());
        System.out.println("\t" + corner3.toString());
        System.out.println("has perimeter " + P3_Guilmineau_Marcely_Math.perimeter(corner1, corner2, corner3));
    }
}
