
/*
    Name:       Marcely Guilmineau
    Date:       10/31/2023
    Period:     3

    Is this lab fully working?  (Yes)
    If not, explain:
    If resubmitting, explain:
*/ 

public class P3_Guilmineau_Marcely_Shorthand {
     public static void main(String[] args) {
         System.out.print(translateToShortHand("Me AND YOU forever!"));
     }
     
     public static String translateToShortHand(String str) {
        String s = "";
        for(int i = 0; i < str.length(); i++) {
            checkStringAndAdd(str, s, "and", "&", i);
            s += str.charAt(i);
        }
        return s;
     }
     
     public static void checkStringAndAdd(String checkString, String addString, String lookString, String replaceString, int i) {
          if(checkString.substring(i, i+addString.length()-1).equals(lookString)) {
                if(i == 0 || i+addString.length() == checkString.length() || (!Character.isLetter(checkString.charAt(i-1)) && !Character.isLetter(checkString.charAt(i+4)))) {
                    addString += replaceString;
                    i += addString.length();
                }
         }
     }
}

