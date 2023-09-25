import java.util.Scanner;

/*
    Name:       Marcely Guilmineau
    Date:       09/24/2023
    Period:     3

    Is this lab fully working?  (Yes)
    If not, explain:
    If resubmitting, explain:
*/

public class P3_Guilmineau_Marcely_MadLibs {
/* Story:
  [Enter a name here:] had a dilemma. He had his integral test tomorrow, worth [double]% of his grade.
  However, he also wanted to spend the night playing [noun], which had just came out yesterday.
  Naturally, he decided to spend the entire night playing and wake up at [int] to study [int] weeks worth of content in the span of a few hours.
  Everything went as planned, and [noun] flipped to page [int] in his integral textbook.
  Uh oh! It was as if the textbook was in [noun], [noun] understood nothing. 
  He tried solving the first problem. The definite integral from -infinity to positive infinity of e^-x^2. 
  After trying to solve the problem for [int] minutes, he wound up with the answer [double].
  Square root of pi! His answer was nowhere close.
  [noun] decided he was ready for the test. He went to the table and quickly ate breakfast, a measly plate of [noun].
  His school, [noun] high school was only [double] miles away. No time to review.
  As he walked into Mrs. [Noun]'s classroom... he saw an announcement. The test was rescheduled for tomorrow! [Noun] was saved.
 */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter a name");
        String name = in.next();
        System.out.println("Please enter a grade percent from 0-100");
        double percent = in.nextDouble();
        System.out.println("Please enter a video game");
        String game = in.next();
        System.out.println("Please enter a wake up time");
        int time = in.nextInt();
        System.out.println("Please enter a week amount");
        int week = in.nextInt();
        System.out.println("Please enter a page number");
        in.nextLine();
        int page = in.nextInt();
        System.out.println("Please enter a foreign language");
        String language = in.next();
        System.out.println("Please enter a minute count");
        int minute = in.nextInt();
        System.out.println("Please enter an answer to the definite integral from -infinity to positive infinity of e^-x^2.");
        String answer = in.next();
        System.out.println("Please enter your favorite food");
        String food = in.next();
        System.out.println("Please enter your high school");
        String school = in.next();
        System.out.println("Please enter the distance from your high school in miles");
        in.nextLine();
        double distance = in.nextDouble();
        System.out.println("Please enter your math teacher's name");
        String teacher = in.next();
        System.out.println();
        System.out.println("Here is the story you generated!");
System.out.printf("%s had a dilemma. He had his integral test tomorrow, worth %.2f%% of his grade. \nHowever, he also wanted to spend the night playing %s, which had just come out yesterday. \nNaturally, he decided to spend the entire night playing and wake up at %d to study %d weeks worth of content in the span of a few hours. \nEverything went as planned, and %s flipped to page %d in his integral textbook. \nUh oh! It was as if the textbook was in %s, %s understood nothing. \nHe tried solving the first problem. The definite integral from -infinity to positive infinity of e^-x^2. \nAfter trying to solve the problem for %d minutes, he wound up with the answer %s. \nSquare root of pi! His answer was nowhere close. \n%s decided he was ready for the test. He went to the table and quickly ate breakfast, a measly plate of %s. \nHis school, %s high school was only %.2f miles away. No time to review. \nAs he walked into Mrs. %s's classroom... he saw an announcement. \nThe test was rescheduled for tomorrow! %s was saved.\n", name, percent, game, time, week, name, page, language, name, minute, answer, name, food, school, distance, teacher, name);
    }
    
}
