    import java.util.*;

public class P3_Guilmineau_Marcely_ExceptionsClasswork {

    public static void main(String[] args) {
        // 1. Surround this statement with a try-catch block to handle the exception.
        //    In the catch block, say "You can't divide by zero!"
        try { 
            System.out.println("100 / 0 = " + 100/0);
        } catch(ArithmeticException a) {
            System.out.println("You can't divide by 0!");
        }
        // 2. Surround this statement with a try-catch block to handle the exception.
        //    In the catch block, print out the custom error message stored
        //    in the exception object by calling getMessage() on it.
        try {
            System.out.println("The 7th letter of \"cat\" is " + "cat".charAt(6));
        } catch(StringIndexOutOfBoundsException e) {
                System.out.println(e.getMessage());
        }

        // 3.  a. Go to the end of this document and follow the instructions there.
        //     b. Surround the statement here with a try-catch block to handle the exception.
        //     c. Add a loop to repeatedly ask the user for a password length until
        //        they enter an integer that is 8 or more.
        //        Basic version: Assume user always enters integers (could be below 8)
        //        Intermediate version:  Assume nothing.  The user could enter a non-integer
        //            or an integer that is less than 8.
        Scanner in = new Scanner(System.in);
        while(true) {
            System.out.print("How long would you like your password? ");
            int len = in.nextInt(); 
            try {
                String pwd = P3_Guilmineau_Marcely_PasswordCreator.generatePassword(len);
                System.out.println("Your new password is: " + pwd);
                break;
            } catch (IllegalArgumentException a) {
                System.out.println(a.getMessage());
            }
        }
    }
}

class P3_Guilmineau_Marcely_PasswordCreator {
    /**
     * Generates a random password consisting of ASCII characters 32 (space)
     * to 122 (lowercase z)
     * @param length The length of the password
     * @return A String of the given length consisting of random ASCII
     *  characters from 32 to 122
     */
    public static String generatePassword(int length) {
        // Insert code below to create and throw an IllegalArgumentException
        // if the length parameter is less than 8.
        if(length < 8) throw new IllegalArgumentException ("Length should be at least 8.");
        String password = "";
        for (int i = 0; i < length; i++) {
            password += (char)(Math.random()*('z' - ' ' + 1) + ' ');
        }
        return password;
    }
}

