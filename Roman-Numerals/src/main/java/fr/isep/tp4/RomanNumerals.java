package fr.isep.tp4;

public final class RomanNumerals {

    public String convert(int number) {
        if (number == 4) return "IV";
        if (number == 5) return "V";
        if (number == 9) return "IX";
        if (number == 10) return "X";
        return "I".repeat(number);
    }

}
