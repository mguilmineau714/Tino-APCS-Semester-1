import java.util.*;
import java.io.*;
import wordletester.*;

/*
    Name:       Marcely Guilmineau
    Date:       11/20/2023
    Period:     3
    
    Is this lab fully working? (Yes)
    If not, explain:
    If resubmitting, explain:
 */
public class P3_Guilmineau_Marcely_Wordle {
    // To keep track of the possible Wordle words, declare an ArrayList of Strings
    ArrayList<String> words = new ArrayList();
    // Default constructor initializes the ArrayList and fills it with the starting words.
    public P3_Guilmineau_Marcely_Wordle() { 
        File f = new File("all_wordle_words.txt");
        try {
            Scanner reader = new Scanner(f);
            while(reader.hasNextLine()) {
                words.add(reader.nextLine());
            }
        } catch(FileNotFoundException err) {
            System.out.println(err.getMessage());
        }
    }   
    
     /**
     * Given a guess and color result, this method returns the next word to guess.
     * <br><br>
     * The first time you call this method, you should pass in (null, null)
     * to indicate a first guess.  In this case, your getNextGuess method
     * can return any first guess you would like.  This can be the first word in the
     * Wordle list of possible words, it can be a random word from the Wordle list,
     * or it can be a special starting word you selected for whatever reason.
     * <br><br>
     * Subsequent calls to getNextGuess should use the result of obj.getResponse(guess)
     * as your color where obj is a WordleTester object.
     * @param guess
     * @param guessResult
     * @return The next word to guess
     */
    public String getNextGuess(String guess, String guessResult) {
        String nextGuess = "";
        if(guess == null && guessResult == null) {
            return "CRATE";
        }
        WordleTester a = new WordleTester();
       // ArrayList<String> b = a.getResponse(guess);
        
        return nextGuess;
    }
    
    /**
     * Given a word guess and the colors reported by the Wordle website, write a
     * method that eliminates words from the list that cannot possibly be answers.
     * For example, if a letter is marked as YELLOW then you can remove all words
     * with that letter in that spot.  And what should you eliminate if you
     * see a GREEN or GRAY letter?
     * @param guess A String guess chosen by the user
     * @param colorResult The String color for this guess reported by Wordle
     */
    public void eliminateWords(String guess, String colorResult) {
        if(words.size() > 1) {
            int greenCounter = 0;
            for(int i = 0; i < 5; i++) {
                Iterator<String> iterator = words.iterator();
                if(colorResult.substring(i, i+1).equalsIgnoreCase("G")) {
                    while(iterator.hasNext()) {
                        String j = iterator.next();
                        if(j.charAt(i) != guess.charAt(i)) {
                            iterator.remove();
                        } else if(j.indexOf(guess.charAt(i)) == -1) {
                            iterator.remove();
                        }
                    }
                    greenCounter++;
                }
                if(colorResult.substring(i, i+1).equalsIgnoreCase("Y")) {
                    while(iterator.hasNext()) {
                        String j = iterator.next();
                        if(j.charAt(i) == guess.charAt(i)) {
                            iterator.remove();
                        } else if(j.indexOf(guess.charAt(i)) == -1) {
                            iterator.remove();
                        }
                    }
                }
                if(colorResult.substring(i, i + 1).equalsIgnoreCase("N")) {
                    while(iterator.hasNext()) {
                        String j = iterator.next();                          
                        if(j.charAt(i) == guess.charAt(i) || greenCounter == 0 && j.indexOf(guess.charAt(i)) == -1) {
                            iterator.remove();
                        } else if(j.indexOf(guess.charAt(i)) != -1 && greenCounter != 0) {
                            Boolean b = false;
                            char a = guess.charAt(i);
                            for(int k = 0; k < 5; k++) {
                                if(colorResult.charAt(k) == 'G' && guess.charAt(k) == j.charAt(k)) {
                                    b = true;
                                }
                            }
                            if(!b) {
                                iterator.remove();
                            }
                            b = false;
                        }
                    }
                }
            }
        }
    }
        /**
         * Write a method that returns whether or not a given String is a valid Wordle guess.
         * A guess is valid if it is exactly 5 alphabetic characters long.
         * @param str A String guess chosen by the user
         * @return Whether the given string is a valid guess
         */
        public static boolean isValidGuess(String str) {
        for(int i = 0; i < str.length(); i++) {
            if(!Character.isLetter(str.charAt(i))) {
                return false;
            }
        }
        return str.length() == 5;
    }

    /**
     * Write a method that returns whether or not a given String is a valid color String.
     * A color String is valid if it is exactly 5 characters long and contains only the
     * characters 'G', 'Y', or 'N' (case insensitive)
     * @param str A String color reported by the Wordle website
     * @return Whether the given color String is valid
     */
    public static boolean isValidReport(String str) {
        for(int i = 0; i < str.length(); i++) {
            if(!str.substring(i, i+1).equalsIgnoreCase("G") && !str.substring(i, i+1).equalsIgnoreCase("Y") && !str.substring(i, i+1).equalsIgnoreCase("N")) {
                return false;
            }
        }
        return str.length() == 5;
    }

    /**
     * Write a method such that if the list of possible words gets down to 1 possibility,
     * return that solution word, otherwise return null.
     * @return The solution word or null if no solution has been found yet
     */
    public String returnWinningWord() {
        return words.size() == 1 ? words.get(0) : null;
    }

    /**
     * Write a method that returns the list size of the possible solution words remaining
     * @return list size of the possible solution words remaining
     */
    public int size() {
        return words.size();
    }

    /**
     * Write a method that prints the list of possible solution words.  This list will get
     * smaller over time until only one item remains, or no items if you are doing
     * the Basic Version with words that don't have repeat letters.
     */
    public void printSolutionWords() {
        System.out.println(words);
    }
}
