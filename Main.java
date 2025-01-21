//1.Write a Java Program  to pass  this keyword as argument in the constructor call.

//logic:

// this class represents an object that holds a number.
class MyClass {

    // variable to store the value.
    int value;

    // Constructor to set the value when a new MyClass object is created.
    MyClass(int value) {
        this.value = value; // Store the passed value in the object
    }

    // Method to print the value of the object.
    void display() {
        System.out.println("The value in MyClass is: " + value);
    }
}

// This class takes a MyClass object as input and uses it.
class AnotherClass {

    // Constructor that accepts a MyClass object.
    AnotherClass(MyClass obj) {
        // Print a message to show that we passed the MyClass object.
        System.out.println("Passing MyClass object to AnotherClass...");

        // Call the display method of MyClass to print the value.
        obj.display();
    }
}

// The main class where the program starts.
public class Main {

    public static void main(String[] args) {
        // Create a MyClass object and set its value to 100.
        MyClass myObject = new MyClass(100);

        // Pass the MyClass object to the AnotherClass constructor.
        AnotherClass anotherObject = new AnotherClass(myObject);
    }
}



/*
Output:
Passing MyClass object to AnotherClass...
The value in MyClass is: 100
*/
