//Write a program to check leap year using if else. How to check whether a given year is a leap year or not.

// logic :

import java.util.Scanner;

public class LeapYearCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char choice;

        do {
            // Input year from the user
            System.out.print("Enter a year: ");
            int year = scanner.nextInt();

            // Check if the year is a leap year
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                System.out.println(year + " is a leap year.");
            } else {
                System.out.println(year + " is not a leap year.");
            }

            // Ask the user if they want to check another year
            System.out.print("Do you want to check another year? (y/n): ");
            choice = scanner.next().charAt(0);

        } while (choice == 'y' || choice == 'Y'); // Continue if user enters 'y' or 'Y'

        System.out.println("Thank you for using the program!");
    }
}


//Output

/*

Enter a year: 2004
2004 is a leap year.
Do you want to check another year? (y/n): y
Enter a year: 2007
2007 is not a leap year.
Do you want to check another year? (y/n): y
Enter a year: 2003
2003 is not a leap year.
Do you want to check another year? (y/n): n
Thank you for using the program!

 */