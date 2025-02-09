import java.util.Scanner;

public class LargestOfThree {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Ask the user for three integers
        System.out.print("Enter the first integer: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second integer: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter the third integer: ");
        int num3 = scanner.nextInt();

        // Determine the largest integer using nested if statements
        int largest;

        if (num1 >= num2) {
            if (num1 >= num3) {
                largest = num1;  // num1 is the largest
            } else {
                largest = num3;  // num3 is the largest
            }
        } else {
            if (num2 >= num3) {
                largest = num2;  // num2 is the largest
            } else {
                largest = num3;  // num3 is the largest
            }
        }

        // Output the largest integer
        System.out.println("The largest number is: " + largest);

        // Close the scanner
        scanner.close();
    }
}
