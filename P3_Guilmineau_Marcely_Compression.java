import java.io.*;
import java.util.*;
/*
    Name:       Marcely Guilmineau
    Date:       11/10/2023
    Period:     3

    Is this lab fully working? (Yes)
    If not, explain:
    If resubmitting, explain:
*/

public class P3_Guilmineau_Marcely_Compression {
    public static void main(String[] args) {
        // compress("P3_Guilmineau_Marcely_LeetSpeak.java");
        // decompress("P3_Guilmineau_Marcely_LeetSpeak.txt");
    }
    
    public static void compress(String filename) {
        try {
            File in = new File(filename);
            Scanner s = new Scanner(in);
            PrintWriter printWriter = new PrintWriter(filename.replace(".java", ".txt"));
            while(s.hasNextLine()) {
                String line = s.nextLine();
                int tabCount = 0;
                while(line.startsWith("\t")) {
                    tabCount++;
                    line = line.substring(1);
                }
                printWriter.println(tabCount + " " + line);
            }
            s.close();
            printWriter.close();
        } catch(IOException a) {
            System.out.println(a.getMessage());
        }
    }
    
    public static void decompress(String filename) {
      try {
            File in = new File(filename);
            Scanner s = new Scanner(in);
            PrintWriter printWriter = new PrintWriter(filename.replace(".txt", ".java"));
            while(s.hasNextLine()) {
                String line = s.nextLine();
                int number = 0;
                String stringWithTabs = "";
                while(line.length() > 0 && Character.isDigit(line.charAt(0))) {
                    number = Integer.parseInt(line.substring(0, 1));
                    line = line.substring(2);
                    for(int i = 0; i < number; i++) {
                        stringWithTabs += "\t";
                    }
                }
                printWriter.println(stringWithTabs + line);
            }
            s.close();
            printWriter.close();
        } catch(IOException a) {
            System.out.println(a.getMessage());
        }
    }
}

