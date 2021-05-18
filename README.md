# Chuck Norris Jokes App

## Running App locally
Chuck Norris Jokes App is a [Spring Boot](https://spring.io/guides/gs/spring-boot) application built using [Maven](https://spring.io/guides/gs/maven/). You can build a jar file and run it from the command line:

```
git clone https://github.com/Priyanshu-git/spring5-jokes-app.git
cd spring5-jokes-app
mvnw package
cd target
java -jar spring5-jokes-app-0.0.1-SNAPSHOT.jar
```

You can then access Jokes App here: http://localhost:8080/

## Working with jokes-app in your IDE

### Prerequisites
The following items should be installed in your system:
* Java 11 or newer (full JDK not a JRE).
* git command line tool (https://help.github.com/articles/set-up-git)
* Your preferred IDE
    * Eclipse with the m2e plugin. Note: when m2e is available, there is an m2 icon in `Help -> About` dialog. If m2e is
      not there, just follow the install process here: https://www.eclipse.org/m2e/
    * [Spring Tools Suite](https://spring.io/tools) (STS)
    * IntelliJ IDEA
    * [VS Code](https://code.visualstudio.com)

### Steps:

1) On the command line
    ```
    git clone https://github.com/Priyanshu-git/spring5-jokes-app.git
    ```
2) Inside Eclipse or STS
    ```
    File -> Import -> Maven -> Existing Maven project
    ```

   Then either build on the command line `./mvnw generate-resources` or using the Eclipse launcher (right click on project and `Run As -> Maven install`) to generate the css. Run the application main method by right clicking on it and choosing `Run As -> Java Application`.

3) Inside IntelliJ IDEA
   In the main menu, choose `File -> Open` and select the jokes-app [pom.xml](pom.xml). Click on the `Open` button.

   CSS files are generated from the Maven build. You can either build them on the command line `./mvnw generate-resources` or right click on the `spring-jokes-app` project then `Maven -> Generates sources and Update Folders`.

   A run configuration named `jokes-appApplication` should have been created for you if you're using a recent Ultimate version. Otherwise, run the application by right clicking on the `jokes-appApplication` main class and choosing `Run 'jokes-appApplication'`.

4) Navigate to jokes-app

   Visit [http://localhost:8080](http://localhost:8080) in your browser.