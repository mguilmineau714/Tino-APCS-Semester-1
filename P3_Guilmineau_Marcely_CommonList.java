import java.util.*;

public class P3_Guilmineau_Marcely_CommonList {

    public static void main(String[] args) {
        ArrayList<Integer> a = randomList(25, -5, 10);
        ArrayList<Integer> b = randomList(25, -5, 10);
        System.out.println("BEFORE");
        System.out.println("a = " + printList(a));
        System.out.println("b = " + printList(b));
        removeNegatives(a);
        removeNegatives(b);
        System.out.println("AFTER REMOVING NEGATIVES");
        System.out.println("a = " + printList(a));
        System.out.println("b = " + printList(b));
        ArrayList<Integer> commonList = commonList(a, b);
        System.out.println("COMMON LIST");
        System.out.println(printList(commonList));
    }

    public static String printList(ArrayList<Integer> a) {
        String output = "[";
        int count = 0;
        for(int i : a) {
            output += i;
            count++;
            output += count != a.size() ? " " : "";
        }
        output += "]";
        return output;
    }

    public static ArrayList<Integer> randomList(int n, int a, int b) {
        ArrayList<Integer> output = new ArrayList();
        for(int i = 0; i < n; i++) {
            int randomInt = (int)(Math.random()*(b-a+1)+a);
            output.add(randomInt);
        }
        return output;
    }

    public static void removeNegatives(ArrayList<Integer> input) {
        Iterator<Integer> it = input.iterator();
        while(it.hasNext()) {
            if(it.next() < 0) {
                it.remove();
            }
        }
    }

    public static ArrayList<Integer> commonList(ArrayList<Integer> a, ArrayList<Integer> b) {
        ArrayList<Integer> commonList = new ArrayList<Integer>();
        for(int i : a) {
            if(b.contains(i) && !commonList.contains(i)) {
                commonList.add(i);
            }
        }
        return commonList;
    }
}

