import java.util.*;
/*
    Name:       Marcely Guilmineau
    Date:       12/1/2023
    Period:     3
    
    Is this lab fully working? (Yes)
    If not, explain:
    If resubmitting, explain:
 */
public class P3_Guilmineau_Marcely_BackToSchool {
    
    public static void main(String[] args) {
        Person bob = new Person("Coach Bob", 27, "M");  
        System.out.println(bob);

        Student lynne = new Student("Lynne Brooke", 16, "NB", "HS95129", 3.5);  
        System.out.println(lynne);

        Teacher mrJava = new Teacher("Duke Java", 34, "M", "Computer Science", 50000);  
        System.out.println(mrJava);

        CollegeStudent ima = new CollegeStudent("Ima Frosh", 18, "F", "UCB123",   4.0, 1, "English");  
        System.out.println(ima);
    }
}

 class CollegeStudent extends Student {
        private String myMajor;
        private int myYear;

        public CollegeStudent(String name, int age, String gender, String idNum, double gpa, int year, String major) {
            super(name, age, gender, idNum, gpa);
            myYear = year;
            myMajor = major;
        }

        public String getMajor() {
            return myMajor;
        }

        public void setMajor(String major) {
            major = myMajor;
        }

        public int getYear() {
            return myYear;
        }

        public void setYear(int year) {
            year = myYear;
        }

        public String toString() {
            return super.toString() + ", year: " + myYear + ", major: " + myMajor;
        }
    }
 class Teacher extends Person {
        private String mySubject;
        private double mySalary;

        public Teacher(String name, int age, String gender, String subject, double salary) {
            super(name, age, gender);
            mySubject = subject;
            mySalary = salary;
        }

        public String getSubject() {
            return mySubject;
        }

        public void setSubject(String subject) {
            subject = mySubject;
        }

        public double getSalary() {
            return mySalary;
        }

        public void setSalary(double salary) {
            salary = mySalary;
        }
        
        public String toString() {
            return super.toString() + ", subject: " + mySubject + ", salary: " + mySalary;
        }
    }
 class Student extends Person {
        private String myIdNum; // Student Id Number
        private double myGPA; // grade point average
        // constructor
        public Student(String name, int age, String gender, String idNum, double gpa){
            // use the super class' constructor
            super(name, age, gender);
            // initialize what's new to Student
            myIdNum = idNum;
            myGPA = gpa;
        }

        public String getIdNum(){
            return myIdNum;
        }

        public double getGPA(){
            return myGPA;
        }

        public void setIdNum(String idNum){
            myIdNum = idNum;
        }

        public void setGPA(double gpa){
            myGPA = gpa;
        }
        // overrides the toString method in the parent class
        public String toString(){
            return super.toString() + ", student id: " + myIdNum + ", gpa: " + myGPA;
        }
    }
 class Person {
        private String myName ; // name of the person
        private int myAge; // person's age
        private String myGender; // "M" for male, "F" for female, "NB" for non-binary
        // constructor
        public Person(String name, int age, String gender){
            myName = name;
            myAge = age;
            myGender = gender;
        }

        public String getName(){
            return myName;
        }

        public int getAge(){
            return myAge;
        }

        public String getGender(){
            return myGender;
        }

        public void setName(String name){
            myName = name;
        }

        public void setAge(int age){
            myAge = age;
        }

        public void setGender(String gender){
            myGender = gender;
        }

        public String toString(){
            return myName + ", age: " + myAge + ", gender: " +
            myGender;
        }
    }
