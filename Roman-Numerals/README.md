# Roman Numerals

Java, JUnit and Cucumber implementation of the Roman Numerals exercise.

With Java 17 or newer, run from this folder:

```powershell
.\mvnw.cmd clean test
```

On Linux or macOS, use `./mvnw clean test`. In IntelliJ IDEA, open this folder as a Maven project and run `RunCucumberTest`.

The scenarios are in `src/test/resources/features/roman-numerals.feature`.
The Given / When / Then definitions are in `RomanNumeralsSteps.java`.
The production converter is `RomanNumerals.java`.

Red commits intentionally contain failing assertions. Green makes the current scenarios pass, then Blue improves the implementation while keeping the tests green. Each stage is committed and pushed separately.

## Final coverage

There are exactly 1000 scenarios, covering every integer from 1 to 1000 once.
The seven initial examples are 1, 2, 3, 4, 5, 9 and 10. The full range includes
IV, IX, XL, XC, CD and CM, as well as the upper boundary 1000 = M.

Expected values are generated from decimal place tables; the Java converter uses
a descending list of Roman symbols. The generator does not call the converter.
To regenerate the examples, run `python tools/generate_scenarios.py` with Python 3.9 or newer.

The final test run should report **1000 tests, 0 failures, 0 errors, 0 skipped**.
The HTML report is generated at `target/cucumber-report.html`.

## Recorded TDD runs

| Cycle | Red | Green | Blue |
| --- | --- | --- | --- |
| Basic symbols | 3 tests, 3 failures | 3 tests passing | 3 tests passing |
| Seven starting examples | 7 tests, 4 failures | 7 tests passing | 7 tests passing |
| Full range | 1000 tests, 993 failures | 1000 tests passing | 1000 tests passing |

All Red failures are assertion failures, with no execution errors or skipped scenarios.
