package fr.isep.tp4;

public final class RomanNumerals {

    public String convert(int number) {
        String result = "";
        for (int i = 0; i < number; i++) {
            result += "I";
        }
        return result;
    }

}
