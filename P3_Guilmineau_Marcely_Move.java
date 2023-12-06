import java.util.Scanner;
import java.util.*;

/*
    Name:       Marcely Guilmineau
    Date:       12/4/2023
    Period:     3
    
    Is this lab fully working?  (Yes)
    If not, explain:
    If resubmitting, explain: Addressed grading feedback
 */ 
public class P3_Guilmineau_Marcely_Move {

    int storage1, storage2;

    public static P3_Guilmineau_Marcely_Move move(Scanner s, String prompt) {
        int int1 = 0, int2 = 0;
        Boolean invalidInput = true;
        while(true) {
            System.out.print(prompt);
            String in = s.nextLine();
            Scanner s2 = new Scanner(in);
            if(s2.hasNextInt()) {
                int1 = s2.nextInt();
                if(s2.hasNextInt()) {
                    int2 = s2.nextInt();
                    if(!s2.hasNext()) {
                        break;
                    }
                    invalidInput = s2.hasNext() ? true : false;
                    if(!invalidInput) {
                        break;
                    }
                }
            }
            System.out.println("Invalid format. Please enter exactly two integers separated by a space.");            
        }
        return new P3_Guilmineau_Marcely_Move(int1, int2);
    }

    public P3_Guilmineau_Marcely_Move(int initialize1, int initialize2) {
        storage1 = initialize1;
        storage2 = initialize2;
    }

    public int getStorage1(){
        return storage1;
    }

    public int getStorage2() {
        return storage2;
    }

    public void setStorage1(int set1) {
        storage1 = set1;
    }

    public void setStorage2(int set2) {
        storage2 = set2;
    }

    public static String toCoordinates(int a, int b) {
        return "You chose (" + Integer.toString(a) + ", " + Integer.toString(b) + ")";
    }
}