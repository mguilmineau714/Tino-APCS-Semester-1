import java.util.Scanner;
/*
    Name:       Marcely Guilmineau
    Date:       11/2/2023
    Period:     3

    Is this lab fully working?  (Yes)
    If not, explain:
    If resubmitting, explain:
*/
public class P3_Guilmineau_Marcely_StringCraft {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int nextInt = 0, moveNumber = 0, score = 0, storage1 = 0, storage2 = 0;
        System.out.println("--------------Welcome to StringCraft--------------");
        System.out.println();
        while(true) {
            System.out.print("Enter a string length: ");
            if(s.hasNextInt()) {
                nextInt = s.nextInt();
                if(nextInt > 1) {
                    break;
                } else {
                    System.out.println("Not a valid string length. Enter a string with length 2 or more.");
                }
            } else {
                System.out.println("Not a valid string length. Enter an integer.");
                s.nextLine();
            }
        }
        String randString = generateRandomString(nextInt);
        System.out.println(from0ToInput(randString.length()));
        score = wordValue(randString);
        System.out.println(randString + " is worth " + score + " points");
        System.out.println();
        while(true) {
            if(!hasValidMove(randString)) { 
                break;
            }
            while(true) {
                while(true) {
                    P3_Guilmineau_Marcely_Move e = P3_Guilmineau_Marcely_Move.move(s, "Enter the indexes of the characters you would like to switch: ");
                    if(e.getStorage1() < 0 || e.getStorage1() > randString.length()-1 || e.getStorage2() < 0 || e.getStorage2() > randString.length()-1) {
                        System.out.println("Your index must be within [0, " + (randString.length()-1) + "] inclusive.");
                        System.out.println();
                    } else {
                        storage1 = e.getStorage1();
                        storage2 = e.getStorage2();
                        break;
                    }
                }
                String temp = randString;
                randString = swapIndexes(randString, storage1, storage2);
                moveNumber++;
                int a = wordValue(randString) - moveNumber;
                if(score <= a) {
                    score = a;
                    break;
                } else {
                    System.out.println("Illegal move, this lowers your score from " + score + " to " + a);
                    System.out.println();
                    moveNumber--;
                    randString = temp;
                }
            }
            System.out.println(from0ToInput(randString.length()));
            System.out.println(randString + " is worth " + score + " points");
            System.out.println();
        }
        System.out.println("GAME OVER. Your final score: " + (score)); 
    }
    
    public static String from0ToInput(int input) {
        String output = "";
        for(int i = 0; i < input; i++) {
            output += i;
        }
        return output;
    }
    
    public static Boolean hasValidMove(String str) {
        for(int i = 0; i < str.length(); i++) {
            for(int j = i+1; j < str.length(); j++) {
                    if(wordValue(swapIndexes(str, i, j)) > wordValue(str)) {
                         return true;
                    }
            }
        }
        return false;
    }
    
    public static String swapIndexes(String str, int a, int b) {
        int MAX = Math.max(a, b);
        int MIN = Math.min(a, b);
        return str.substring(0, MIN) + str.charAt(MAX) + str.substring(MIN+1, MAX) + str.charAt(MIN) + str.substring(MAX+1);
    }
    
    
    public static int wordValue(String str) {
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
