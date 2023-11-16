import java.util.*;
/*
    Name:       Marcely Guilmineau
    Date:       11/14/2023
    Period:     3

    Is this lab fully working? (Yes)
    If not, explain:
    If resubmitting, explain:
*/

public class P3_Guilmineau_Marcely_Permutations {
    public static void main(String[] args) {
        for(int i = 0; i < 10; i++) {
            ArrayList<Integer> sample = permutations();
            System.out.println("List " + (i+1) + ": " + sample); 
        }
    }
    
    public static ArrayList<Integer> permutations() {
        ArrayList<Integer> input = new ArrayList();
        for(int i = 0; i < 10; i++) {
            int randomInt = (int)(Math.random()*10)+1;
            if(!input.contains(randomInt)) {
                input.add(randomInt);
            } else {
                i--;
            }
        }
        return input;
    }
}
