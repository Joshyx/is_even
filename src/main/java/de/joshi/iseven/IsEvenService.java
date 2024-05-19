package de.joshi.iseven;

/**
 * Interface for the IsEvenService
 */
public interface IsEvenService {
    /**
     * Method to check if a number is even
     * 
     * @param candidate the candidate to check
     * @return the result of the check
     * @see IsEvenCandidate
     * @see IsEvenResult
     * @throws IllegalArgumentException if the candidate is null
     */
    IsEvenResult isEven(IsEvenCandidate candidate);
}
