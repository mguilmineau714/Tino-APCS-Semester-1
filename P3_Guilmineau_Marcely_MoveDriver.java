import java.util.Scanner;
/*
    Name:       Marcely Guilmineau
    Date:       11/1/2023
    Period:     3

    Is this lab fully working?  (Yes)
    If not, explain:
    If resubmitting, explain: Addressed grading feedback
*/ 

public class P3_Guilmineau_Marcely_MoveDriver {
   public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
       String prompt = "Enter two integers: ";
       while(0.1 + 0.2 != 0.3) {
           P3_Guilmineau_Marcely_Move e = P3_Guilmineau_Marcely_Move.move(s, "Enter two integers: ");
           System.out.println(e.toCoordinates(e.getStorage1(), e.getStorage2()));
           System.out.print("Type q to quit or anything else to continue: ");
           String input = s.nextLine();
           if(input.equalsIgnoreCase("q")) {
               break;
           }
       } 
       s.close();
       System.out.println("Test complete.");
   }
}
