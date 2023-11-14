import java.util.*;
public class P3_Guilmineau_Marcely_UserInputDriver {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        while(true) { 
           String a = P3_Guilmineau_Marcely_UserInput.readLine("I'll do this until you enter q. ");
           System.out.println(a);
             if(a.equalsIgnoreCase("q")) {
               break;
           }   
        }
        while(true) {
            int a = P3_Guilmineau_Marcely_UserInput.readInt("And now I'll do this until you enter 0. ");
            System.out.println(a);
            if(a == 0) {
                break;
            }
        }
        while(true) {
            double a = P3_Guilmineau_Marcely_UserInput.readDouble("And now I'll do this until you enter 0 (again).");
            System.out.println(a);
            if((int)(a) == 0) {
                break;
            }
        }
        while(true) {
            Boolean a = P3_Guilmineau_Marcely_UserInput.readBoolean("And now I'll do this until you a false value. ");
            System.out.println(a);
            if(!a) {
                break;
            }
        }
        System.out.println("Congrats!");
    }
}
