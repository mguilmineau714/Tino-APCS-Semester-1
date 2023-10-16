public class Student {
    private String name;
    private int age;
    private static int totalStudents = 0; // This should be static, but it's not

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        totalStudents++; // Incorrectly incrementing a non-static totalStudents
    }

    public int getTotalStudents() {
        return totalStudents; // This will not work as expected because totalStudents is not static
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        t t = new t(4);
        int sum = t.c + t.d;
        System.out.println(sum);
        int sum2 = t.getC() + t.d;
        System.out.println(sum2);
        int sum3 = t.c + t.d;
                System.out.println(sum3);



    }
}
