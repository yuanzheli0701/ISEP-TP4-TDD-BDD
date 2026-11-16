# Prime Numbers: first Red step

This project contains one test: **zero is not a prime number**.

The `isPrime` method is a placeholder returning `true`. The test expects `false`, so it fails intentionally. The Green and Blue steps have not been implemented.

## Run

Open this folder in IntelliJ IDEA as a Maven project. Open `PrimeCheckerTest.java` and run `zeroIsNotPrime` using the run icon beside the test.

Alternatively, with Java 17 or newer, run in PowerShell:

```powershell
.\mvnw.cmd clean test
```

On Linux or macOS, use `./mvnw clean test`. Maven and JUnit are downloaded on the first run.

Expected result: **1 test, 1 failure, 0 errors, 0 skipped**. `BUILD FAILURE` is the intended Red result.

## Roman Numerals

The complete Roman Numerals exercise is in [Roman-Numerals](Roman-Numerals), with its own Maven project, Gherkin scenarios and Cucumber step definitions.

From the repository root, run it with:

```powershell
cd Roman-Numerals
.\mvnw.cmd clean test
```

The final version passes all 1000 scenarios. Its history records three Red / Green / Blue cycles using `submit red`, `submit green` and `submit blue` commits.
