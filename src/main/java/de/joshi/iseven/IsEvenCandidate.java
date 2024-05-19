package de.joshi.iseven;

/**
 * Class to store the number and accuracy of the IsEvenCandidate object
 */
public class IsEvenCandidate {
    /**
     * Field to store the number of the IsEvenCandidate object
     */
    private int number;
    /**
     * Field to store the accuracy of the IsEvenCandidate object
     */
    private float accuracy;

    /**
     * Constructor for the IsEvenCandidate class
     * 
     * @param number   the number to check for evenness
     * @param accuracy the accuracy of the check
     * @return an IsEvenCandidate Object
     *
     * @see Integer
     * @see Float
     *
     * @throws IllegalArgumentException if the accuracy is less than 0.0 or greater
     */
    IsEvenCandidate(int number, float accuracy) {
        if (accuracy < 0.0 || accuracy > 1.0) {
            throw new IllegalArgumentException("Accuracy must be between 0.0 and 1.0.");
        }
        this.number = number;
        this.accuracy = accuracy;
    }

    /**
     * Getter method for the number field
     * 
     * @return the number to check for evenness
     */
    public int getNumber() {
        return number;
    }

    /**
     * Getter method for the accuracy field
     * 
     * @return the accuracy of the check
     */
    public float getAccuracy() {
        return accuracy;
    }
}
