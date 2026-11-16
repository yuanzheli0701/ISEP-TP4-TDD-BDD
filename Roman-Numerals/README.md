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
