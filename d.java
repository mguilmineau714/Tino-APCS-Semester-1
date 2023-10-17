import java.util.Scanner;
public class d {
    public static void main(String[] args) {
          String correctPassword = "sarahgay";
          Scanner s = new Scanner(System.in);
          System.out.println("Enter a pass: ");
          String p = s.nextLine();
          while(!p.equals(correctPassword)) {
              System.out.println("try again");
              if(p.equals(correctPassword)) {
                System.out.println("gg sarboob");
              }
         }
     }
}