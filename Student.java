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
        Student student1 = new Student("Alice", 18);
        Student student2 = new Student("Bob", 19);

        // Attempt to retrieve the total number of students
        // This method will not work as expected because totalStudents is not static
        System.out.println("Total number of students (incorrect): " + student1.getTotalStudents());
    }
}
