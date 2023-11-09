import java.io.*;
import java.util.*;
/*
    Name:       Marcely Guilmineau
    Date:       11/8/2023
    Period:     3

    Is this lab fully working?  (Yes)
    If not, explain:
    If resubmitting, explain:
*/
public class P3_Guilmineau_Marcely_Average {
    public static void main(String[] args) {
        double sum = 0, count = 0;
        File f = new File("numbers.txt"); // nums.txt must be in the same directory as this java file
        File data = new File("out.txt");
        try {
            Scanner reader = new Scanner(f); // create a Scanner 
            while(reader.hasNextInt()) { // while there is another token
                try {
                    sum += reader.nextInt();
                    count++;
                } catch(InputMismatchException err) { // catch exception if the token is not an int
                    reader.next(); // skip over the token that was not an int
                }
            }
            double average = sum/count;
            System.out.printf("%.2f", average);
            try (PrintWriter writer = new PrintWriter(data)) {
                    writer.print(average);
            }
        } catch(FileNotFoundException err) { // if the file does not exist
            System.out.println(err.getMessage()); // print the error
        }
    }
}
