// write a java program to take Employee id, name , address  and salary from the user and display on the screen .

// logic :

import java.util.Scanner;

class ScannerExample{

     public static void main(String[] args) {
                // Scanner object created 
                Scanner sc = new Scanner(System.in);
        
                // Input Employee details
                System.out.print("Enter Employee ID: ");
                int employeeId = sc.nextInt(); // Read integer input
                sc.nextLine(); // Consume newline character
        
                System.out.print("Enter Employee Name: ");
                String employeeName = sc.nextLine(); // Read string input
        
                System.out.print("Enter Employee Address: ");
                String employeeAddress = sc.nextLine(); // Read string input
        
                System.out.print("Enter Employee Salary: ");
                double employeeSalary = sc.nextDouble(); // Read double input
        
                // Display Employee details
                System.out.println("\nEmployee Details:");
                System.out.println("ID: " + employeeId);
                System.out.println("Name: " + employeeName);
                System.out.println("Address: " + employeeAddress);
                System.out.println("Salary: " + employeeSalary);
        
                
            }
        }



// Output:

Enter Employee ID: 1
Enter Employee Name: Xyz 1
Enter Employee Address: Raviwar peth 
Enter Employee Salary: 1000000

Employee Details:
ID: 1
Name: Xyz
Address: Raviwar peth
Salary: 1000000.0