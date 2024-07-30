# Four Bit Full Adder Project

## Project Description

This project implements a four-bit full adder using Java. The adder is tested using the Spock framework with Groovy for testing purposes.

## Contributors
- Deepak Anantha
- Digvijay Hethur Jagadeesha
- Gokul Sekar

## Project Setup

### Prerequisites

- Java 11
- Maven
- IntelliJ IDEA (recommended for development)
- Groovy
- Spock framework

### Project Structure

```plaintext
.
├── pom.xml
├── README.md
├── TestCaseExecutionScreenShot1.png
├── TestCaseExecutionScreenShot2.png
└── src
    ├── main
    │   └── java
    │       └── edu
    │           └── csudh
    │               └── ooad
    │                   └── logicgates
    │                       ├── AbstractGate.java
    │                       ├── AndGate.java
    │                       ├── NandGate.java
    │                       └── OrGate.java
    │                   └── adder
    │                       ├── FullAdder.java
    │                       ├── FourBitAdder.java
    │                       └── HalfAdder.java
    └── test
        └── groovy
            └── edu
                └── csudh
                    └── ooad
                        ├── FourBitAdderSpec.groovy
                        ├── AndGateSpec.groovy
                        ├── FullAdderSpec.groovy
                        ├── HalfAdderSpec.groovy
                        ├── NandGateSpec.groovy
                        └── OrGateSpec.groovy
```

## Installation

1. **Clone the repository:**

```sh
git clone https://github.com/Digvijayhj/CSC582-Object-Oriented-Analysis-And-Design.git
cd fourbitfulladder
```

2. **Install the required packages:**

```sh
mvn clean install
```

## Usage

### Building the Project

To compile and build the project, run:

```sh
mvn clean compile
```

### Running Tests

To run individual test cases or the entire test suite, you can use the following commands:

- **Run all tests:**

```sh
mvn test
```

- **Run a specific test class:**

```sh
mvn -Dtest=FourBitAdderSpec test
```

### Running the Project in IntelliJ IDEA

1. **Open IntelliJ IDEA.**
2. **Import the project:**
   - Go to `File > Open` and select the project's root directory.
   - IntelliJ will detect the `pom.xml` file and import the project as a Maven project.
3. **Build the project:**
   - Go to `Build > Build Project` or press `Ctrl+F9`.
4. **Run tests:**
   - Right-click on the test class or method and select `Run`.

## Project Dependencies

The project uses the following dependencies:

- **Groovy:** 3.0.8
- **Spock Framework:** 2.0-M5-groovy-3.0
- **JUnit:** 4.13.2

These dependencies are managed using Maven and are specified in the `pom.xml` file.

## Java Version

This project requires Java 11. Ensure that your environment is set up to use Java 11 before building or running the project.

## Javadoc Documentation

Javadoc documentation for this project has been generated as an alternative to Doxygen. To generate the Javadoc documentation, run the following command:

```sh
javadoc -d docs src/main/java/**/*.java
```

The generated documentation can be found in the `docs` directory.

## Code Formatting

For code formatting, instead of using Astyle, I used the built-in formatting tools provided by IntelliJ IDEA. You can reformat your code in IntelliJ IDEA by following these steps:

1. **Open IntelliJ IDEA.**
2. **Go to the `Code` menu and select `Reformat Code`, or use the shortcut `Ctrl + Alt + L` (Windows/Linux) or `Cmd + Alt + L` (macOS).**
3. **The code will be automatically formatted according to the code style settings configured in IntelliJ IDEA.**

## Notes

- Ensure that you have the correct versions of Java, Maven, Groovy, and Spock installed.
- If you encounter any issues, ensure that your environment variables are correctly set, especially `JAVA_HOME` and `MAVEN_HOME`.
- For detailed project documentation, refer to the Javadoc generated in the `docs` directory.
