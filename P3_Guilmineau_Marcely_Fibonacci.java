
/*
    Name:       Marcely Guilmineau
    Date:       10/1/2023
    Period:     3

    Is this lab fully working?  (Yes)
    If not, explain:
    If resubmitting, explain:
*/

public class P3_Guilmineau_Marcely_Fibonacci {     
     public int fibonacci(int n) {
         if(n <= 1) return n;
         return fibonacci(n-1) + fibonacci(n-2);
     }
     
     public int multiplication(int a, int b) {
         if(a == 1) return b;
         if(b == 1) return a;
         return a + b + multiplication(a-1, b-1) - 1;
     }
     
    public int trueMultiplication(int a, int b) {
        if(a < 0 && b < 0) {
           a = Math.abs(a);
           b = Math.abs(b);
        }
        if(a == 0) return 0;
        if(b == 0) return 0;
        return a + b + trueMultiplication(a-1, b-1) - 1;
    }
    
    public int oneLineTrueMultiplication(int a, int b) {
        return a == 0 ? 0 : b == 0 ? 0 : a < 0 && b < 0 ? Math.abs(a) + Math.abs(b) + trueMultiplication(Math.abs(a)-1, Math.abs(b)-1) - 1 : a + b + trueMultiplication(a-1, b-1) - 1;
    }
}
