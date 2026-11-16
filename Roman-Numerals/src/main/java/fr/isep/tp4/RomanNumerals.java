package fr.isep.tp4;

public final class RomanNumerals {

    private record Symbol(int value, String text) { }

    private static final Symbol[] SYMBOLS = {
        new Symbol(1000, "M"), new Symbol(900, "CM"), new Symbol(500, "D"),
        new Symbol(400, "CD"), new Symbol(100, "C"), new Symbol(90, "XC"),
        new Symbol(50, "L"), new Symbol(40, "XL"), new Symbol(10, "X"),
        new Symbol(9, "IX"), new Symbol(5, "V"), new Symbol(4, "IV"),
        new Symbol(1, "I")
    };

    // The exercise covers integers from 1 to 1000.
    public String convert(int number) {
        StringBuilder result = new StringBuilder();
        int remaining = number;
        // Each value stays paired with its text, including subtractive forms such as IV.
        for (Symbol symbol : SYMBOLS) {
            while (remaining >= symbol.value()) {
                result.append(symbol.text());
                remaining -= symbol.value();
            }
        }
        return result.toString();
    }

}
