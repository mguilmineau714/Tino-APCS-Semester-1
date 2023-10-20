/*
    Name:       Marcely Guilmineau
    Date:       10/18/2023
    Period:     3

    Is this lab fully working?  (Yes)
    If not, explain:
    If resubmitting, explain:
*/
public class P3_Guilmineau_Marcely_IterativeReverseAndPalindrome {
    public static void main(String[] args) {
        // Test iterativeStringReverse
        System.out.println(iterativeStringReverse("123456789"));
        System.out.println(iterativeStringReverse("12345678"));
        System.out.println(iterativeStringReverse("a"));
        System.out.println(iterativeStringReverse(""));
        
        //Test iterativeIsPalindrome
        System.out.println(iterativeIsPalindrome("radar"));
        System.out.println(iterativeIsPalindrome("J"));
        System.out.println(iterativeIsPalindrome(" Lewd did I live, & evil I did dwel."));
        System.out.println(iterativeIsPalindrome("I like Java"));
        System.out.println(iterativeIsPalindrome(" Straw? No, too stupid a fad, I put soot on warts."));
        System.out.println(iterativeIsPalindrome("***Nurse!*** I spy gypsies....run!!!!!  "));
        System.out.println(iterativeIsPalindrome(""));
    }
    
    public static String iterativeStringReverse(String str) {
        String str1 = "";
        for(int i = str.length(); i > 0; i--) {
            str1 += str.substring(i-1, i);
        }
        return str1;
    }
    
    public static boolean iterativeIsPalindrome(String s) {
        String str = s.replaceAll("[^a-zA-Z]", "").toUpperCase();
        Boolean b = true;
        if(str.length() > 1) {
            for(int i = 0; i < str.length(); i++) {
                if(str.charAt(i) != str.charAt(str.length()-1-i)) {
                    b = false;
                }
            }
        }
        return b;
    }
}

