// Name: Chidera Anamege
// Class:	CS 3305 W01
// Term:	Spring 2024
//	Instructor:  Carla McManus
//	Assignment:  2 – Part 2 Recursion
import java.util.Scanner;

public class dsassignment2part2 {

    // this function prints the output using recursion
    public static void toPrintOutput(int n, int originalValue) {
        // check if n is greater than the originalValue, if it is, just return
        if (n > originalValue) {
            return;
        }

        // this prints the line for the current
        toPrintTheLevels(n);
        // print the statement showing which call number it is
        System.out.println("This was written by call number " + n + ".");

        // Call itself with n+1
        toPrintOutput(n + 1, originalValue);

        // Print the line for the current call number again
        toPrintTheLevels(n);
        // print the statement showing it's the same call number but with an additional line
        System.out.println("This was ALSO written by call number " + n + ".");
    }

    // Helper function to print the required number of levels
    public static void toPrintTheLevels(int n) {
        // if n is less than or equal to 0, just return
        if (n <= 0) {
            return;
        }
        // Print tabs recursively
        System.out.print("\t");
        toPrintTheLevels(n - 1);
    }

    // the main function, where everything starts
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the depth of recursion: ");
        int userInput = scanner.nextInt();

        // Call the recursive function
        toPrintOutput(1, userInput);

        // close the scanner
        scanner.close();
    }
}
