
/*
    Name:       Marcely Guilmineau
    Date:       10/1/2023
    Period:     3

    Is this lab fully working?  (Yes)
    If not, explain:
    If resubmitting, explain:
*/

public class P3_Guilmineau_Marcely_FibonacciDriver {
    public static void main(String[] args) {
        P3_Guilmineau_Marcely_Fibonacci tests = new P3_Guilmineau_Marcely_Fibonacci();
         
        for(int i = 0; i < 48; i++) {
            System.out.println("fib(" + i + ") = " + tests.fibonacci(i));
         }
         
         /* The highest fibonacci number java can compute is fib(46)
          * This value is precisely 1836311903
          * fib(47) would exceed 2.147b, which is the java integer limit
          * Thus, java evaluates it as -1323752223
          * the reason for this number specifically is beyond the scope of my understanding
         */ 
          
         System.out.println("73 x 4 = " + tests.multiplication(73, 4));
         System.out.println("9 x 1 = " + tests.multiplication(9, 1));
         System.out.println("3239 x 3232 = " + tests.trueMultiplication(3239, 3232));
         System.out.println("-73 x -4 = " + tests.trueMultiplication(-73, -4));
         System.out.println("-9 x 1 = " + tests.trueMultiplication(-9, 1));
         System.out.println("3239 x -3232 = " + tests.trueMultiplication(3239, -3232));
     }

}
