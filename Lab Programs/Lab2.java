// 2. Write a Java program to demonstrate the concepts of inheritance and polymorphism. 
// Create a parent class named Animal and a child class named Dog. 
// Use method overriding to achieve runtime polymorphism and display the behavior of both classes.

class Animal {
    public void displayBehavior() {
        System.out.println("Animal makes a generic sound.");    
    }
}

class Dog extends Animal {
    @Override
    public void displayBehavior() {
        System.out.println("Dog barks: Woof! Woof!");
    }
}

public class Lab2 {
    public static void main(String[] args) {
        // Parent class object
        Animal genericAnimal = new Animal();
        System.out.println("Animal behavior:");
        genericAnimal.displayBehavior();
        
        System.out.println();
        
        // Child class object assigned to parent class reference (Runtime Polymorphism)
        Animal dog = new Dog();
        System.out.println("Dog behavior (achieved via runtime polymorphism):");
        dog.displayBehavior();
    }
}
