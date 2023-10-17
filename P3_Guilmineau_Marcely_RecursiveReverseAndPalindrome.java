/*
    Name:       Marcely Guilmineau
    Date:       10/16/2023
    Period:     3

    Is this lab fully working?  (Yes)
    If not, explain:
    If resubmitting, explain:
*/
public class P3_Guilmineau_Marcely_RecursiveReverseAndPalindrome {
    
    public static void main(String[] args) {
        /*
        System.out.println(recursiveStringReverse("123456789"));
        System.out.println(recursiveStringReverse("12345678"));
        System.out.println(recursiveStringReverse("a"));
        System.out.println(recursiveStringReverse("fake empty string"));
        System.out.println(recursiveStringReverse(""));*/
        
        System.out.println(recursiveIsPalindrome("gaga"));
    }
    
    public static String recursiveStringReverse(String str) {
        return str.length() < 2 ? str : str.substring(str.length()-1) + recursiveStringReverse(str.substring(0, str.length()-1));
    }
    
    public static Boolean recursiveIsPalindrome(String str) {
        String newString = str.replaceAll("\\p{P}", "").toUpperCase();
        return newString.substring(0, str.length()/2).equals(newString.substring(str.length()/2));
    }
}
