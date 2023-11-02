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
        /*
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a string length: ");
        int strLen = s.nextInt();
        String randString = generateRandomString(strLen);
        System.out.println(randString + " is worth " + wordValue(randString) + " points");
        */
       
        // No runs or straights
        System.out.println("stringValue(R) = " + wordValue("R") + " ...should be 1");
        System.out.println("stringValue(RPA) = " + wordValue("RPA") + " ...should be 3");
        
        // Runs only
        System.out.println("stringValue(BB) = " + wordValue("BB") + " ...should be 4");
        System.out.println("stringValue(CCC) = " + wordValue("CCC") + " ...should be 9");
        System.out.println("stringValue(DDDD) = " + wordValue("DDDD") + " ...should be 16");
        
        // Straights only
        System.out.println("stringValue(AB) = " + wordValue("AB") + " ...should be 3");
        System.out.println("stringValue(GHI) = " + wordValue("GHI") + " ...should be 6");
        System.out.println("stringValue(MNOP) = " + wordValue("MNOP") + " ...should be 10");
        
        // More complex test
        System.out.println("stringValue(EEAMPLX) = " + wordValue("EEAMPLX") + " ...should be 9");
        System.out.println("stringValue(AAAB) = " + wordValue("AAAB") + " ...should be 15");
         System.out.println("stringValue(XAAANABXYZ) = " + wordValue("AAAB") + " ...should be 15");
    }
    
    public static int wordValue(String str) {
        int wordScore = 0, baseValue = 1;
        for(int i = 1; i < str.length(); i++) {
            Boolean qualifiesForDouble = str.charAt(i) == str.charAt(i-1);
            Boolean qualifiesForRun = (int)str.charAt(i)-1 == (int)str.charAt(i-1) || str.charAt(i) == 'A' && str.charAt(i-1) == 'Z';
            if(qualifiesForDouble) {
                baseValue += 2;
            }
            if(qualifiesForRun) {
                baseValue += 1;
            }
            if(!qualifiesForDouble && !qualifiesForRun) {
                baseValue = 1;
            }
            wordScore += baseValue;
        }
        return wordScore+1;
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
