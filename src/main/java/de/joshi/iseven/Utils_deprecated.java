package de.joshi.iseven;

/**
 * This class contains utility methods for performing mathematical operations.
 * 
 * @deprecated This class is deprecated and will be removed in a future release.
 */
public class Utils_deprecated {

    /**
     * This method checks if a given value is even or odd.
     * 
     * @param value the value to check
     * @return true if the value is even, false if it is odd
     * 
     * @deprecated This method is deprecated and will be removed in a future
     *             release.
     */
    @Deprecated(since = "0.0.1", forRemoval = false)
    public static boolean isOdd(int value) {
        // Convert the value to a positive number
        value = Math.abs(value);

        // Perform repeated subtraction of 2 to check if the value becomes zero
        while (value >= 2) {
            value = subtractTwo(value);
        }

        // If the value is zero, it is even; otherwise, it is odd
        return value != 0;
    }

    /**
     * This method subtracts 2 from the given value using bitwise operations.
     *
     * @param value the value from which to subtract 2
     * @return the result of subtracting 2 from the value
     */
    private static int subtractTwo(int value) {
        // This function subtracts 2 from the given value using bitwise operations

        // Create a mask for the value 2 (0b10)
        int mask = 2;

        // Initialize carry for the subtraction
        int carry;

        // Perform bitwise subtraction using two's complement
        do {
            // Calculate carry
            carry = (~value) & mask;

            // Perform subtraction
            value = value ^ mask;

            // Update mask for the next bit position
            mask = carry << 1;
        } while (carry != 0);

        return value;
    }
}
