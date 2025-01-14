// write a program to find the perimeter of the square 

// logic :

import java.util.Scanner;

public class SquarePerimeter {
    public static void main(String[] args) {
        //  Scanner object is created 
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the side length of the square: ");
        double side = sc.nextDouble();

        // Calculate the perimeter of the square
        double perimeter = 4 * side;

        // Display the perimeter
        System.out.println("The perimeter of the square is: " + perimeter);

      
    }
}



// Output 

Enter the side length of the square: 5
The perimeter of the square is: 20.0
