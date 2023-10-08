public class Checker {
   public static void main(String[] args) {
System.out.printf("%.30f", 75.1223211111111111111131231233);}
   

    public double power_2(int base, int n){
      return n == 0 ? 1 : power_1(base, n-1)*base;
    }
    
    public double power_1(int base, int n) {
        if(n==0) return 1;
        return power_1(base, n-1)*base;
    }
    
   public int sequence(int n) {
        if(n == 0 || n == 1) return 2;
        return 2*(sequence(n-1)+sequence(n-2));
    }
    
    
    public int f(int n) {
     if (n == 0 || n == 1) {
        return 2;
     } else {
           return 6 * f(n - 1) - 8 * f(n - 2);
       }
}
}
