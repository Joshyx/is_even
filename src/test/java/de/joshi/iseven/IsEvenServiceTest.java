package de.joshi.iseven;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple Service.
 */
public class IsEvenServiceTest {
    /**
     * Fails if the number is not even.
     */
    @Test
    public void is2Even() {
        IsEvenService isEvenService = new IsEvenServiceImpl();
        IsEvenCandidate candidate = new IsEvenCandidate(2, 0.0f);
        IsEvenResult result = isEvenService.isEven(candidate);
        assertTrue(result.isEven());
    }

    /**
     * Fails if the number is not even.
     */
    @Test
    public void is4Even() {
        IsEvenService isEvenService = new IsEvenServiceImpl();
        IsEvenCandidate candidate = new IsEvenCandidate(4, 0.0f);
        IsEvenResult result = isEvenService.isEven(candidate);
        assertTrue(result.isEven());
    }

    /**
     * Fails if the number is not even.
     */
    @Test
    public void is0Even() {
        IsEvenService isEvenService = new IsEvenServiceImpl();
        IsEvenCandidate candidate = new IsEvenCandidate(0, 0.0f);
        IsEvenResult result = isEvenService.isEven(candidate);
        assertTrue(result.isEven());
    }

    /**
     * Fails if the number is even.
     */
    @Test
    public void is1NotEven() {
        IsEvenService isEvenService = new IsEvenServiceImpl();
        IsEvenCandidate candidate = new IsEvenCandidate(1, 0.0f);
        IsEvenResult result = isEvenService.isEven(candidate);
        assertTrue(!result.isEven());
    }
}
