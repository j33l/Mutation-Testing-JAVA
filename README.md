# Maven, Test Coverage, Mutation Analysis #

- To compile all code: `mvn compile`
- To run all tests: `mvn test`
- To determine coverage information:
    - `mvn jacoco:report`
    - Open `target/site/jacoco/index.html` for an HTML coverage report
- To perform mutation testing / analysis:
    - `mvn org.pitest:pitest-maven:mutationCoverage`
    - Open `target/pit-reports/CURRENT_DATE_TIME/index.html` for an HTML report
- If running on `k200.ecs.csun.edu`:
    - I have Maven installed already; do `export PATH=$PATH:/home/users5/kdewey/maven_public/apache-maven-3.5.4/bin`
    - Change `maven.compiler.source` and `maven.compiler.target` to `1.8` instead of the existing `1.10`

# Installing Java and Maven

1. brew install java --force
2. java - version
3. brew install Maven
4. mvn --version
