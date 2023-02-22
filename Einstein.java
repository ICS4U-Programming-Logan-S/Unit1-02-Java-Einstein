import java.util.Scanner;

/**
* This program gets an input of mass and
* calculates how much energy the input
* would produce.
*
* @author Logan S
* @version 1.0
*
* @since   2023-02-22
*/

public final class Einstein {

    /**
     * This is a private constructor.
     *
     * @exception IllegalStateException Utility class.
     * @see IllegalStateException
     */
    private Einstein() {
        throw new IllegalStateException("Utility class");
    }

    /**
     * This is the main method.
     *
     * @param args Unused.
     */
    public static void main(String[] args) {

        // Constant
        final double lightSpeed = 2.998 * (Math.pow(10, 8));

        // Create scanner
        final Scanner scanner = new Scanner(System.in);

        // Gets input
        System.out.println("Enter the mass of the object (kg): ");
        final String massStr = scanner.nextLine();

        // Detects invalid input
        try {
            // Convert to double
            final double massDbl = Double.parseDouble(massStr);

            if (massDbl >= 0) {
                // Calculate the energy with given mass
                final double energy = massDbl * (Math.pow(lightSpeed, 2));

                // Display results
                System.out.print("The mass: " + massDbl + "kg");
                System.out.format(" would produce %.3e", energy);
                System.out.println(" J of energy.");

            } else {
                // Detects negative input
                System.out.println("Please enter a positive input.");
            }
        } catch (NumberFormatException error) {
            // Displays error.
            System.out.print("Invalid input - "
                + error.getMessage());
        }
        // Closes scanner
        scanner.close();
    }
}
