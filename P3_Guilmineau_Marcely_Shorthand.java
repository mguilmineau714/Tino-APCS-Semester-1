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
         System.out.println(translateToShortHand("I LOvE APCS! i WilL get a FiVe on the ap teSt :)"));
         System.out.println(translateToShortHand("A truck"));
         System.out.println(translateToShortHand("Me AND YOU forever!"));
         System.out.println(translateToShortHand("To Bill and Ted: Are you going to be EXCELLENT to towtrucks too???"));
         System.out.println(translateToShortHand("Look, here's a 3.14159 I made for you! And? How's it taste?"));
         System.out.println(translateToShortHand("MY mAmA aLWaYs said, \"LIFe iS like a box of chocolates...you never know what you're gonna get!\""));
         System.out.println(translateToShortHand("!!aNd!! !tO? ****yOu***foR** fork toward young fo"));
     }
     
     public static String translateToShortHand(String str) {
        String s = "";
        for(int i = 0; i < str.length(); i++) {
            if(getWord(str, i).equalsIgnoreCase("and")) {
                s += "&";
                i += getWord(str, i).length();
            }
            if(getWord(str, i).equalsIgnoreCase("to")) {
                s += "2";
                i += getWord(str, i).length();
            }
            if(getWord(str, i).equalsIgnoreCase("you")) {
                s += "u";
                i += getWord(str, i).length();
            }
            if(getWord(str, i).equalsIgnoreCase("for")) {
                s += "4";
                i += getWord(str, i).length();
            }
            char ch = Character.toLowerCase(str.charAt(i));
            if((ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u') || !(i != 0 && Character.isLetter(str.charAt(i-1)) || (i != str.length()-1 && Character.isLetter(str.charAt(i+1))))) {
                s += str.charAt(i);
            }
        }
        return s;
     }
     
     public static String getWord(String str, int startIndex) {
      String a = str.substring(startIndex);
      String b = "";
      for(int i = 0; i < a.length(); i++) {
        if(Character.isLetter(a.charAt(i))) {
          b += a.charAt(i);
        } else {
          break;
        }
      }
      return b;
    }

}



