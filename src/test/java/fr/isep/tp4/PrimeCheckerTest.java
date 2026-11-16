package fr.isep.tp4;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

/**
 * Parameterized test suite running 100 test cases (numbers 1 to 100)
 * to verify PrimeChecker against Slide 24: "Prime Numbers - Checking up to 100".
 */
@RunWith(Parameterized.class)
public class PrimeCheckerTest {

    // All 25 prime numbers between 1 and 100
    private static final Set<Integer> PRIMES_UP_TO_100 = new HashSet<>(Arrays.asList(
        2, 3, 5, 7, 11, 13, 17, 19, 23, 29,
        31, 37, 41, 43, 47, 53, 59, 61, 67, 71,
        73, 79, 83, 89, 97
    ));

    private final int number;
    private final PrimeChecker checker = new PrimeChecker();

    public PrimeCheckerTest(int number) {
        this.number = number;
    }

    @Parameters(name = "test_{index}: isPrime({0})")
    public static Collection<Object[]> data() {
        List<Object[]> params = new ArrayList<>();
        for (int i = 1; i <= 100; i++) {
            params.add(new Object[]{i});
        }
        return params;
    }

    @Test
    public void testPrimalityUpTo100() {
        if (number <= 1) {
            try {
                checker.isPrime(number);
                fail("Expected IllegalArgumentException for number <= 1");
            } catch (IllegalArgumentException expected) {
                // Expected validation failure for numbers <= 1
            }
        } else {
            boolean expected = PRIMES_UP_TO_100.contains(number);
            assertEquals("Checking primality for " + number, expected, checker.isPrime(number));
        }
    }
}
