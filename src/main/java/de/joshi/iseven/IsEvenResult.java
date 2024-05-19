package de.joshi.iseven;

/**
 * Class to store the result of the isEven method
 */
public class IsEvenResult {
    /**
     * Field to store the result of the isEven method
     */
    private boolean isEven;

    /**
     * Constructor for the IsEvenResult class
     * 
     * @param isEven true if the number is even, false otherwise
     */
    public IsEvenResult(boolean isEven) {
        this.isEven = isEven;
    }

    /**
     * Getter method for the isEven field
     * 
     * @return true if the number is even, false otherwise
     */
    public boolean isEven() {
        return isEven;
    }
}
