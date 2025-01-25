/*1.Create abstract class vaccine.Create two variables age(int),nationality(String).create 2 concrete methods firstDose() and secondDose(). Scenario 1:user can take the first dose if the user is Indian and age is 18.After vaccination the user has to pay 250rs(which will be displayed on the console). Scenario 2: Users are eligible to take the second dose only after completing the first dose. Scenario 3: create abstract method boosterDose() in abstract class Vaccine.Create one implementation class vaccinationSuccessful, where implement boosterDose() method. Create main class vaccination and invoke all methods accordingly. [Hint:Create constructor to initialize variables age and  nationality,Use flow control(Ifelse) to check condition]*/

// Abstract class Vaccine
abstract class Vaccine {
    // Variables age and nationality
    int age;
    String nationality;

    // Constructor to initialize age and nationality
    public Vaccine(int age, String nationality) {
        this.age = age;
        this.nationality = nationality;
    }

    // Concrete method for first dose
    public void firstDose() {
        // Check if the user is eligible for the first dose
        if (this.nationality.equals("Indian") && this.age >= 18) {
            System.out.println("First dose given. Please pay 250 Rs.");
        } else {
            System.out.println("You are not eligible for the first dose.");
        }
    }

    // Concrete method for second dose
    public void secondDose(boolean firstDoseCompleted) {
        // Check if first dose is completed
        if (firstDoseCompleted) {
            System.out.println("Second dose given.");
        } else {
            System.out.println("You must complete the first dose before the second dose.");
        }
    }

    // Abstract method for booster dose (no need to override in this example)
    public void boosterDose() {
        System.out.println("Booster dose given. Stay safe!");
    }
}

// Concrete class VaccinationSuccessful
class VaccinationSuccessful extends Vaccine {
    // Constructor to initialize age and nationality
    public VaccinationSuccessful(int age, String nationality) {
        super(age, nationality);
    }

}

// Main class 
public class Vaccination {
    public static void main(String[] args) {
        // Create an object for the VaccinationSuccessful class (which implements the abstract class Vaccine)
        VaccinationSuccessful user = new VaccinationSuccessful(25, "Indian");

        // invoking the first dose method
        user.firstDose();

        // assuming first dose is completed (for demo purpose, we pass true)
        boolean firstDoseCompleted = true;

        // Invoking the second dose method
        user.secondDose(firstDoseCompleted);

        // Invoking the booster dose method
        user.boosterDose();
    }
}

/*
Output:
First dose given. Please pay 250 Rs.
Second dose given.
Booster dose given. Stay safe!
*/
