package fr.isep.tp4;

import org.junit.Test;
import static org.junit.Assert.assertFalse;

public class PrimeCheckerTest {
    @Test
    public void zeroIsNotPrime() {
        PrimeChecker checker = new PrimeChecker();

        assertFalse("Zero is not a prime number", checker.isPrime(0));
    }
}
