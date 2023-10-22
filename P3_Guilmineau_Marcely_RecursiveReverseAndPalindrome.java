/*
    Name:       Marcely Guilmineau
    Date:       10/21/2023
    Period:     3

    Is this lab fully working?  (Yes)
    If not, explain:
    If resubmitting, explain: had to fix palindrome not counting numbers
*/
public class P3_Guilmineau_Marcely_RecursiveReverseAndPalindrome {
    public static void main(String[] args) {
        // Test recursiveStringReverse
        System.out.println(recursiveStringReverse("123456789"));
        System.out.println(recursiveStringReverse("12345678"));
        System.out.println(recursiveStringReverse("a"));
        System.out.println(recursiveStringReverse(""));
        
        // Test recursiveIsPalindrome
        System.out.println(recursiveIsPalindrome("radar"));
        System.out.println(recursiveIsPalindrome("J"));
        System.out.println(recursiveIsPalindrome(" Lew2323d did I live, & evil I did dwel."));
        System.out.println(recursiveIsPalindrome("I like Java"));
        System.out.println(recursiveIsPalindrome(" Straw? No, too stupid a fad, I put soot on warts."));
        System.out.println(recursiveIsPalindrome("***Nurse!*** I spy gypsies....run!!!!!  "));
        System.out.println(recursiveIsPalindrome(""));
    }
    
    public static String recursiveStringReverse(String str) {
        return str.length() < 2 ? str : str.substring(str.length()-1) + recursiveStringReverse(str.substring(0, str.length()-1));
    }
    
    public static boolean recursiveIsPalindrome(String s) {
        String str = s.replaceAll("[^a-zA-Z0-9]", "").toUpperCase();
        return str.length() < 2 || str.charAt(0) == str.charAt(str.length()-1) && recursiveIsPalindrome(str.substring(1, str.length()-1));
    }
}
