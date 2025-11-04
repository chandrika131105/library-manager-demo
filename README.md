# Library Manager (demo)

A simple Java 17 Maven project that models books and a small in-memory library manager.

## Build and test

```bash
mvn -DskipTests=false test
```

## Run the application

- Via Maven (exec plugin):

```bash
mvn exec:java
```

- As a runnable JAR:

```bash
mvn -DskipTests=true package
java -jar target/book-manager-1.0-SNAPSHOT.jar
```

## How it works

- `librarymanager.Book` – value object with title, author, and optional ISBN.
- `librarymanager.Librarymanager` – manages a list of books; can add and search by title.
- `librarymanager.Library` – simple collection wrapper for listing books (used by `Main`).
- `librarymanager.App` and `librarymanager.Main` – tiny console entry points to demonstrate usage.

## CI

A GitHub Actions workflow runs Maven tests on push/PR to main/master.

## Notes

- Requires JDK 17+ (configured via `maven-compiler-plugin`).
- Tests are written with JUnit 5 and run via Maven Surefire.
- The JAR manifest is configured with `Main-Class: librarymanager.App`.
