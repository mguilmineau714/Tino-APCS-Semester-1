import java.util.Scanner;
/*
    Name:       Marcely Guilmineau
    Date:       09/25/2023
    Period:     3

    Is this lab fully working?  (Yes)
    If not, explain:
    If resubmitting, explain:
*/
public class P3_Guilmineau_Marcely_CheckMail {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter one of the dimensions: ");
        int dim1 = in.nextInt();
        System.out.println("Enter one of the dimensions: ");
        int dim2 = in.nextInt();
        System.out.println("Enter one of the dimensions: ");
        int dim3 = in.nextInt(); 
        System.out.println("Enter the weight: ");
        int weight = in.nextInt();
        int length = Math.max(Math.max(dim1, dim2), dim3);
        int girth = 2 * (dim1 + dim2 + dim3 - length);
        if(weight > 70) {
            if(length + girth > 100) {
                System.out.println("Package is too large and heavy.");
            } else {
                System.out.println("Package is too heavy.");
            }
        } else {
           if(length + girth > 100) {
                System.out.println("Package is too large.");
           } else {
               System.out.println("Package is acceptable.");
           }
        }
    }
}
