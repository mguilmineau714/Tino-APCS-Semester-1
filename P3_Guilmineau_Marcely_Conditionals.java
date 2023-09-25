/*
    Name:       Marcely Guilmineau
    Date:       08/29/2023
    Period:     3

    Is this lab fully working?  (Yes)
    If not, explain:
    If resubmitting, explain: Forgot to put this header in my first submission and got 4.5/5
*/

public class P3_Guilmineau_Marcely_Conditionals {
    public static void main(String[] args) {
        int students;
        students = 34;
        int computers;
        computers = 36;
        int teachers;
        teachers = 1;
        int tables;
        tables = 2;
        if(teachers == 1 && (computers >= students) && (tables * 6 >= students) && students % 2 == 0) {
            System.out.println("The classroom is valid.");
        } else {
            System.out.println("The classroom is invalid.");
        }
    }
        
}
