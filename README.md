# Presentation
Project for TP for Maven lesson.

## Compilation

To compile the project run the following command inside the project directory
```shell script
    mvn compile
```

## Tests

To execute all tests run the following command inside the project directory
```shell script
    mvn test
```

## Documentation

To create only the JavaDoc of the project run the following command inside the project directory
```shell script
  mvn javadoc:aggregate
```
The documentation is available in the directory `target/site/apidocs`, open the `index.html` file

To create a static web page (HTML) contained the documentation of the project and data about quality and tests
run the following command inside the project directory
```shell script
  mvn site
  mvn site:stage
```
The site of the project is available in the `target/staging` folder in the parent directory of the project,
open the `index.html` file

## Deploiement

Project is deploying in a folder `repo` in the parent directory of the project directory.
To deploy this project in this local repository run the following command inside the project directory
```shell script
    mvn deploy
```