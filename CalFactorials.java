import java.util.Scanner; // <-- Add this line

public class CalFactorials {
    public static void main(String[] args) { // fixed typo from 'agrs' to 'args'
        Scanner sc = new Scanner(System.in);

        // Ask user for input
        System.out.println("Enter a non-negative number: ");
        int number = sc.nextInt();

        // Check for valid input  
        if (number < 0) {
            System.out.println("Invalid input. Please enter a non-negative number.");
        } else {
            long factorial = 1;

            // Factorial calculation
            for (int i = 1; i <= number; i++) {
                factorial *= i;
            }

            // Output result
            System.out.println("Factorial of " + number + " is " + factorial);
        }

        sc.close();
    }
}
