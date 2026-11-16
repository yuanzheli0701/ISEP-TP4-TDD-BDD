package fr.isep.tp4;

public final class PrimeChecker {
    public boolean isPrime(int number) {
        validatePositiveNumber(number);

        if (number == 2) {
            return true;
        }

        if (isEven(number)) {
            return false;
        }

        int limit = (int) Math.sqrt(number);
        for (int divisor = 3; divisor <= limit; divisor += 2) {
            if (number % divisor == 0) {
                return false;
            }
        }

        return true;
    }

    private void validatePositiveNumber(int number) {
        if (number <= 1) {
            throw new IllegalArgumentException("Number must be greater than 1");
        }
    }

    private boolean isEven(int number) {
        return number % 2 == 0;
    }
}
