package fr.isep.tp4;

public final class RomanNumerals {

    public String convert(int number) {
        return switch (number) {
            case 4 -> "IV";
            case 5 -> "V";
            case 9 -> "IX";
            case 10 -> "X";
            default -> "I".repeat(number);
        };
    }

}
