/*
    Name:       Marcely Guilmineau
    Date:       10/31/2023
    Period:     3

    Is this lab fully working?  (Yes)
    If not, explain:
    If resubmitting, explain: fixed ALL test cases
*/ 

public class P3_Guilmineau_Marcely_Shorthand {
    
     public static void main(String[] args) {
         // cases that didn't work:
         System.out.println(translateToShorthand("You cannot you help yourself you"));
         System.out.println(translateToShorthand("And Brandy and Andy and"));
         System.out.println(translateToShorthand("To too tooth to ton to-to"));
         System.out.println(translateToShorthand("For forthwith for four fo for"));
         
         System.out.println(translateToShorthand("I LOvE APCS! i WilL get a FiVe on the ap teSt :)"));
         System.out.println(translateToShorthand("A truck"));
         System.out.println(translateToShorthand("Me AND YOU forever!"));
         System.out.println(translateToShorthand("To Bill and Ted: Are you going to be EXCELLENT to towtrucks too???"));
         System.out.println(translateToShorthand("Look, here's a 3.14159 I made for you! And? How's it taste?"));
         System.out.println(translateToShorthand("MY mAmA aLWaYs said, \"LIFe iS like a box of chocolates...you never know what you're gonna get!\""));
         System.out.println(translateToShorthand("!!aNd!! !tO? ****yOu***foR** fork toward young fo"));
     }
     
     public static String translateToShorthand(String str) {
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
            if(i >= str.length()) {
                break;
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



