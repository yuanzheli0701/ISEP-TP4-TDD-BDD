"""Generate Roman numeral examples using decimal place tables."""
from pathlib import Path

ONES = ("", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX")
TENS = ("", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC")
HUNDREDS = ("", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM")

def reference(number):
    return "M" * (number // 1000) + HUNDREDS[number // 100 % 10] + TENS[number // 10 % 10] + ONES[number % 10]

def generate():
    seed = (1, 2, 3, 4, 5, 9, 10)
    numbers = (*seed, *(n for n in range(1, 1001) if n not in seed))
    header = 'Feature: Convert integers to Roman numerals\n  Convert integers from 1 to 1000 using standard Roman notation.\n\n  Scenario Outline: Convert <number> to <roman>\n    Given the integer <number>\n    When I convert it to a Roman numeral\n    Then the Roman numeral is "<roman>"\n\n    Examples:\n      | number | roman |\n'
    rows = "\n".join(f"      | {n} | {reference(n)} |" for n in numbers)
    destination = Path(__file__).resolve().parents[1] / "src/test/resources/features/roman-numerals.feature"
    destination.write_text(header + rows + "\n", encoding="utf-8")

if __name__ == "__main__":
    generate()
