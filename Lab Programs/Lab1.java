/*1. Write a Java program to demonstrate the concept of classes and objects. 
// Create a class named Student with data members such as student name and student age. 
// Create an object of the class and display the student details using a method.*/

class Student {
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Student Age: " + age);
    }
}

public class Lab1 {
    public static void main(String[] args) {
        Student student1 = new Student("Alice", 20);
        System.out.println("Displaying Student Details:");
        student1.displayDetails();
    }
}
