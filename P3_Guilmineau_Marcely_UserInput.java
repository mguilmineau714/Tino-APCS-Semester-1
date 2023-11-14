import java.util.*;
import java.io.*;

public class P3_Guilmineau_Marcely_UserInput {
    static final Scanner S = new Scanner(System.in);
    public static String readLine(String prompt) {
        System.out.print(prompt);
        return S.nextLine();
    }

    public static int readInt(String prompt) {
        while(true) {
            try {
                System.out.print(prompt);
                int temp = S.nextInt();
                S.nextLine();
                return temp;
            } catch (InputMismatchException e) {
                S.nextLine();
                System.out.println("Invalid format. Please enter an integer.");
            }
        }
    }

    public static double readDouble(String prompt) {
        while(true) {
            try {
                System.out.print(prompt);
                double temp = S.nextDouble();
                S.nextLine();
                return temp;
            } catch (InputMismatchException e) {
                S.nextLine();
                System.out.println("Invalid format. Please enter an double.");
            }
        }
    }

    public static Boolean parseBoolean(String s) {
        String[] acceptableStrings = {"true", "yes", "affirmative", "false", "no", "negative"};
        if(!Arrays.asList(acceptableStrings).contains(s)) {
            throw new IllegalArgumentException("Invalid string cannot be parsed into a Boolean");
        } else {
            return s.equals("true") || s.equals("yes") || s.equals("affirmative");
        }
    }

    public static Boolean readBoolean(String prompt) {
        while(true) {
            try {
                System.out.print(prompt);
                return parseBoolean(S.nextLine());
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }

}
