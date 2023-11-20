import java.util.*;
import java.io.*;

/*
    Name:       Marcely Guilmineau
    Date:       11/20/2023
    Period:     3
    
    Is this lab fully working? (Yes)
    If not, explain:
    If resubmitting, explain:
 */

public class P3_Guilmineau_Marcely_Compact {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList();
        File f = new File("compact.txt");
        int length = 0;
        try {
            Scanner reader = new Scanner(f);
            while(reader.hasNextInt()) {
                list.add(reader.nextInt());
                length++;
            }
        } catch(FileNotFoundException err) {
            System.out.println(err.getMessage());
        }
        int[] arr = new int[length];
        int add = 0;
        try {
            Scanner reader = new Scanner(f);
            while(reader.hasNextInt()) {
                arr[add] = reader.nextInt();
                add++;
            }
        } catch(FileNotFoundException err) {
            System.out.println(err.getMessage());
        }
        compactArray(arr);
        compactArrayList(list);
        System.out.println(Arrays.toString(arr));        
        System.out.println(list);        
        int[] test = new int[]{0, 9, 7, 0, 0, 23, 4, 0};
        compactArray(test);
        System.out.println(Arrays.toString(test));
    }

    public static void compactArray(int[] arr) {
        int zeroCount = 0;
        for(int i : arr) {
            zeroCount += i == 0 ? 1 : 0; 
        }
        int nonZeroCount = arr.length - zeroCount;
        int[] temp = new int[nonZeroCount];
        int a = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] != 0) {
                temp[a] = arr[i];
                a++;
            }
        }
        for(int i = 0; i < nonZeroCount; i++) {
            arr[i] = temp[i];
        }
        for(int i = zeroCount; i < arr.length; i++) {
            arr[i] = 0;
        }
    }

    public static void compactArrayList(ArrayList<Integer> arr) {
        Iterator<Integer> it = arr.iterator();
        while(it.hasNext()) {
            if(it.next() == 0) {
                it.remove();
            }
        }
    }

}
