package de.joshi.iseven;

/**
 * Builder class for the IsEvenCandidate class
 */
public class IsEvenCandidateBuilder {
    /**
     * Field to store the number of the IsEvenCandidate object
     */
    private int number;
    /**
     * Field to store the accuracy of the IsEvenCandidate object
     */
    private float accuracy = 0.0f;

    /**
     * Sets the number of the IsEvenCandidate object
     * 
     * @param number the number of the IsEvenCandidate object
     * @return the IsEvenCandidateBuilder object
     */
    public IsEvenCandidateBuilder withNumber(int number) {
        this.number = number;
        return this;
    }

    /**
     * Sets the accuracy of the IsEvenCandidate object
     * 
     * @param accuracy the accuracy of the IsEvenCandidate object
     * @return the IsEvenCandidateBuilder object
     * @throws IllegalArgumentException if the accuracy is less than 0.0 or greater
     *                                  than 1.0
     */
    public IsEvenCandidateBuilder withAccuracy(float accuracy) {
        if (accuracy < 0.0 || accuracy > 1.0) {
            throw new IllegalArgumentException("Accuracy must be between 0.0 and 1.0.");
        }
        this.accuracy = accuracy;
        return this;
    }

    /**
     * Builds an IsEvenCandidate object with the given number and accuracy
     * 
     * @return an IsEvenCandidate object
     */
    public IsEvenCandidate build() {
        return new IsEvenCandidate(number, accuracy);
    }
}
