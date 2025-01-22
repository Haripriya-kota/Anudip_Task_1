/*Create a parent class called "Vehicle" with attributes such as brand, model, year, and a method called "drive". Create a child class called "Car" that inherits from Vehicle and has an additional attribute called "color" and a method called "honk". Create an object of the Car class and call both the "drive" and "honk" methods.*/

// Parent class "Vehicle"
class Vehicle {
    // Attributes of the Vehicle class
    String brand;
    String model;
    int year;

    // Constructor to initialize brand, model, and year
    public Vehicle(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    // Method to simulate driving the vehicle
    public void drive() {
        System.out.println("The " + year + " " + brand + " " + model + " is now driving.");
    }
}

// Child class "Car" that inherits from Vehicle
class Car extends Vehicle {
    // Additional attribute specific to the Car class
    String color;

    // Constructor to initialize brand, model, year, and color
    public Car(String brand, String model, int year, String color) {
        // Calling the parent class constructor to initialize brand, model, and year
        super(brand, model, year);
        this.color = color;
    }

    // Method to simulate honking the car
    public void honk() {
        System.out.println("The " + color + " " + brand + " " + model + " is honking!");
    }
}

// Main class
public class Cars {
    public static void main(String[] args) {

        // Creating an object of the Car class
        Car car1 = new Car("TATA", "Gen-X", 2025, "Blue");

        // Calling the drive method
        car1.drive();

        // Calling the honk method
         car1.honk();
    }
}

/*
Output:
The 2025 TATA Gen-X is now driving.
The Blue TATA Gen-X is honking!
*/