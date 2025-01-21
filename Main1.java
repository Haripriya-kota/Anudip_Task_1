//2.Write java program to invoke current class method using this keyword

//logic:

//It shows how to use 'this' keyword
class MyClass {

    // variable to store the value
    int value;

    // Constructor to set the value when an object is created
    MyClass(int value) {
        this.value = value; // Set the value passed to this object
    }

    // Method to show the value
    void displayValue() {
        System.out.println("Value: " + value); // Print the value
    }

    // Method to call the displayValue method using 'this' keyword
    void invokeMethod() {
        this.displayValue(); // Use 'this' to call the displayValue method of this object
    }
}

public class Main1 {

    public static void main(String[] args) {
        // Creating a new object of MyClass with value 100
        MyClass myObject = new MyClass(100);

        // Calling invokeMethod to show the value using 'this' inside the class
        myObject.invokeMethod();
    }
}

/*
Output:
Value: 100
*/