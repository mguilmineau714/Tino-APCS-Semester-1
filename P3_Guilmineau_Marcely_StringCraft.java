import java.util.Scanner;
/*
    Name:       Marcely Guilmineau
    Date:       11/2/2023
    Period:     3

    Is this lab fully working?  (no)
    If not, explain:
    If resubmitting, explain:
*/
public class P3_Guilmineau_Marcely_StringCraft {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int reduction = 0, score = 0;
        System.out.println("Welcome to StringCraft!");
        System.out.print("Enter a string length: ");
        int strLen = s.nextInt();
        String randString = generateRandomString(strLen);
        while(true) {
            reduction++;
            int temp = score;
            Boolean noLegalMoves = true;
            for(int i = 0; i < randString.length()-1; i++) {
                for(int j = i+1; j < randString.length(); j++) {
                    if(wordValue(swapIndexes(randString, i, j)) - reduction >= score) {
                        noLegalMoves = false;
                    }
                }
            }
            System.out.println(score);
            if(noLegalMoves) {
                System.out.println("GAME OVER, Final Score: " + score); 
                break;
            }
            int currentStringValue = wordValue(randString);
            System.out.println(randString + " is worth " + wordValue(randString) + " points");
            P3_Guilmineau_Marcely_Move e = P3_Guilmineau_Marcely_Move.move(s, "Enter the indexes of the characters you would like to switch: ");
            randString = swapIndexes(randString, e.getStorage1(), e.getStorage2());
            score = wordValue(randString) - reduction;
            if(score < temp) {
                System.out.println("Illegal Move.");
            }
        }
    }
    
    public static String swapIndexes(String str, int a, int b) {
        int MAX = Math.max(a, b);
        int MIN = Math.min(a, b);
        return str.substring(0, MIN) + str.charAt(MAX) + str.substring(MIN+1, MAX) + str.charAt(MIN) + str.substring(MAX+1);
    }
    
    
    public static int wordValue(String str) {
        if(str.length() > 0) {
            int wordScore = 1, baseValue = 1;
            for(int i = 1; i < str.length(); i++) {
                Boolean qualifiesForDouble = str.charAt(i) == str.charAt(i-1);
                Boolean qualifiesForRun = str.charAt(i)-1 == str.charAt(i-1) || str.charAt(i) == 'A' && str.charAt(i-1) == 'Z';
                if(qualifiesForDouble) {
                    baseValue += 2;
                } else if(qualifiesForRun) {
                    baseValue += 1;
                } else {
                    baseValue = 1;
                }
                wordScore += baseValue;
            }
            return wordScore;
        } return 0;
    }
    
    public static String generateRandomString(int length) {
        String s = "";
        for(int i = 0; i < length; i++) {
            int randomNumber = (int)(Math.random()*26+65);
            s += (char)randomNumber;
        }
        return s;
    }
}
