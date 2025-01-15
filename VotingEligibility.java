//Write java program to check  candidate eligible for voting or not.

// logic :

import java.util.Scanner;

public class VotingEligibility {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char choice;

        do {
            // Input age from the user
            System.out.print("Enter your age: ");
            int age = scanner.nextInt();

            // Check if the candidate is eligible for voting
            if (age >= 18) {
                System.out.println("You are eligible to vote.");
            } else {
                System.out.println("You are not eligible to vote. Wait " + (18 - age) + " more year(s).");
            }

            // Ask the user if they want to check another age
            System.out.print("Do you want to check another age? (y/n): ");
            choice = scanner.next().charAt(0);

        } while (choice == 'y' || choice == 'Y'); // Continue if user enters 'y' or 'Y'

        System.out.println("Thank you for using the program!");
    }
}


//Output

/*

Enter your age: 20
You are eligible to vote.
Do you want to check another age? (y/n): y
Enter your age: 16
You are not eligible to vote. Wait 2 more year(s).
Do you want to check another age? (y/n): n
Thank you for using the program!

*/