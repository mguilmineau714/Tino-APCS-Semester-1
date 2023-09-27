import com.controlStructures.HappinessDetector;
/*
    Name:       Marcely Guilmineau
    Date:       09/25/2023
    Period:     3

    Is this lab fully working?  (Yes)
    If not, explain:
    If resubmitting, explain:
*/

public class P3_Guilmineau_Marcely_HappinessDetector implements HappinessDetector {
    public boolean isHappy(int num, int a, int b) {
        return ((num >= 16 && (num % a == 0 && num % b != 0)) || (num > 30 && num < 54) || (!(num % a == 0 && num % b != 0) && num < 16) || (num >= 81 && num <=99 && num % 2 == 1)) && (num >= 0);
    }
}
