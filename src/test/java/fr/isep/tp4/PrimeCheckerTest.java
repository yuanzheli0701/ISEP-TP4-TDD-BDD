package fr.isep.tp4;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PrimeCheckerTest {

    @Test(expected = IllegalArgumentException.class)
    public void zeroIsNotPrime() {
        PrimeChecker checker = new PrimeChecker();
        checker.isPrime(0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void oneIsNotPrime() {
        PrimeChecker checker = new PrimeChecker();
        checker.isPrime(1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void negativeNumberIsNotPrime() {
        PrimeChecker checker = new PrimeChecker();
        checker.isPrime(-7);
    }

    @Test
    public void twoIsPrime() {
        PrimeChecker checker = new PrimeChecker();
        assertTrue("2 should be prime", checker.isPrime(2));
    }

    @Test
    public void fourIsNotPrime() {
        PrimeChecker checker = new PrimeChecker();
        assertFalse("4 is not prime", checker.isPrime(4));
    }

    @Test
    public void sevenIsPrime() {
        PrimeChecker checker = new PrimeChecker();
        assertTrue("7 should be prime", checker.isPrime(7));
    }

    @Test
    public void elevenIsPrime() {
        PrimeChecker checker = new PrimeChecker();
        assertTrue("11 should be prime", checker.isPrime(11));
    }
}
