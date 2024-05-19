package de.joshi.iseven;

import java.util.Random;

/**
 * Class to check if a number is even
 */
public class IsEvenServiceImpl implements IsEvenService {

    /**
     * Field to store the verbose flag
     */
    private boolean verbose = true;

    /**
     * Default constructor for the IsEvenServiceImpl class
     */
    IsEvenServiceImpl() {
    }

    /**
     * Constructor for the IsEvenServiceImpl class
     * 
     * @param verbose the verbose flag
     */
    IsEvenServiceImpl(boolean verbose) {
        this.verbose = verbose;
    }

    /**
     * Getter method for the verbose field
     * 
     * @return the verbose field
     */
    public boolean isVerbose() {
        return verbose;
    }

    /**
     * Method to check if a number is even
     * 
     * @param candidate the candidate to check
     * @return the result of the check
     * @see IsEvenCandidate
     * @see IsEvenResult
     * @throws IllegalArgumentException if the candidate is null
     */
    @Override
    public IsEvenResult isEven(IsEvenCandidate candidate) {
        if (candidate == null) {
            throw new IllegalArgumentException("Candidate must not be null.");
        }
        if (verbose) {
            System.out.println("Checking if " + candidate.getNumber() + " is even.");
        }
        if (new Random().nextInt(100) < candidate.getAccuracy() * 100) {
            if (verbose) {
                System.out.println("Lucky guess! " + candidate.getNumber() + " is even. Still 50% accurate! :)");
            }
            return new IsEvenResult(true);
        }
        return new IsEvenResult(!Utils_deprecated.isOdd(candidate.getNumber()));
    }
}
