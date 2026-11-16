Feature: Convert integers to Roman numerals
  Convert integers from 1 to 1000 using standard Roman notation.

  Scenario Outline: Convert <number> to <roman>
    Given the integer <number>
    When I convert it to a Roman numeral
    Then the Roman numeral is "<roman>"

    Examples:
      | number | roman |
      | 1 | I |
      | 2 | II |
      | 3 | III |
