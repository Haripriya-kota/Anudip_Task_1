/*Create a parent class called "Person" with attributes such as name, age, and a method called "speak". Create a child class called "Student" that inherits from Person and has an additional attribute called "grade" and a method called "study". Create an object of the Student class and call both the "speak" and "study" methods. */

// parent class "Person"
class Person {
    // attributes of the Person class
    String name;
    int age;

    // constructor to initialize name and age
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // speak method
    public void speak() {
        System.out.println("My name is " + name + " and I am " + age + " years old.");
    }
}

// child class "Student" that inherits from Person(Parent class)
class Student extends Person {
    // additional attribute called "grade"
    String grade;

    // Constructor to initialize name, age, and grade
    public Student(String name, int age, String grade) {

        // Calling the parent class constructor to initialize name and age
        super(name, age);
        this.grade = grade;
    }

    // study method 
    public void study() {
        System.out.println(name + " is studying for their grade " + grade + ".");
    }
}

// Main class 
public class inheritance {
    public static void main(String[] args) {
        // Creating an object of the Student class
        Student student1 = new Student("Haripriya", 21, "A");

        // Calling the "speak" method
        student1.speak();

        // Calling the "study" method 
        student1.study();
    }
}


/*
object:
My name is Haripriya and I am 21 years old.
Haripriya is studying for their grade A.
*/

