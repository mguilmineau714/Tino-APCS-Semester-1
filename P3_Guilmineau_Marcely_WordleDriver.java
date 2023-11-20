    import java.util.*;
/*
Name:       Marcely Guilmineau
Date:       11/20/2023
Period:     3

Is this lab fully working? (Yes)
If not, explain:
If resubmitting, explain:
 */
public class P3_Guilmineau_Marcely_WordleDriver {
    public static void main(String[] args) {
        String guess = "";
        String colors = "";
        Scanner s = new Scanner(System.in);
        ArrayList<String> a = new ArrayList();
        P3_Guilmineau_Marcely_Wordle w = new P3_Guilmineau_Marcely_Wordle();
        System.out.println("----- Welcome to Wordle Solver -----");
        System.out.println();
        while(w.words.size() > 1) {
            while(true) {
                System.out.print("Enter your guess: ");
                guess = s.next();
                if(w.isValidGuess(guess)) {
                    break;
                } else {
                    System.out.println("Try again with a 5 letter word.");
                    s.nextLine();
                }
            }
            System.out.println("Enter your guess into the wordle website.");
            while(true) {
                System.out.print("Enter the colors that correspond to your guess: ");
                colors = s.next();
                if(w.isValidReport(colors) || s.next().equals("q")) {
                    break;
                } else {
                    System.out.println("Try again with the the correct format. (Only G, Y, and N)");
                    s.nextLine();
                }
            }
            w.eliminateWords(guess, colors);
            w.printSolutionWords();
        }
        System.out.println(w.returnWinningWord() != null ? "Congratulations! Your word is: " + w.returnWinningWord() : "Sorry :( No answer could be found.");
    }
}
