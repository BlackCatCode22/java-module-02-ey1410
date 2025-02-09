import java.util.Scanner;

public class MadnessWithMethods {
    public static void main(String[] args) {
        // Call the getAnIntFromTheUser method to get an integer from the user
        int firstNumber = getAnIntFromTheUser("Enter the first integer: ");
        int secondNumber = getAnIntFromTheUser("Enter the second integer: ");

        // Call the compareTwoInts method to compare the two integers
        compareTwoInts(firstNumber, secondNumber);

        // Call the sumTwoInts method to calculate and display the sum of the integers
        int sum = sumTwoInts(firstNumber, secondNumber);
        System.out.println("The sum of the two integers is: " + sum);
    }

    // Function to get an integer from the user
    public static int getAnIntFromTheUser(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);
        return scanner.nextInt(); // Return the integer entered by the user
    }

    // Function to compare two integers and print the result
    public static void compareTwoInts(int a, int b) {
        if (a > b) {
            System.out.println(a + " is greater than " + b);
        } else if (a < b) {
            System.out.println(a + " is less than " + b);
        } else {
            System.out.println(a + " is equal to " + b);
        }
    }

    // Function to calculate and return the sum of two integers
    public static int sumTwoInts(int a, int b) {
        return a + b; // Return the sum of the two integers
    }
}

