# restful-code-test
Coding Challenge utilizing Java to create a simple application to serve a RESTful API to perform operations on Organizations and Users. 


## Tech used
-JDK 1.8
-Spring Boot 2.2.1
  -JPA
  -HAL Browser
  -H2
-Maven 3.6.2

## Code Example
Program allows for adding or removing of Users and Organizations by standard PUT and PATCH requests, as well as deletion(DELETE) and retrievl(GET).

All functionality can be either typed into the address bar or by utilizing the interface of the the HAL Browser.



## Installation
First, let's download the test folder from the GitHub repo. Unzip the package and place it somewhere on your computer.

Secondly, make sure you have JDK 1.8 or greater installed as well as Apache Maven 3.2 or greater installed.
After downloading and installing, make sure to add the location of Maven's bin folder to your path environment variable. Also, make sure your environment variable JAVA_HOME points to the proper location of the JDK.
This may look something like the following:

```
JAVA_HOME   C:\Program Files\Java\jdk1.8.0_221
path         C:\Users\Dave\Desktop\apache-maven-3.6.2\bin
```

To check that both are setup correectly, you can check the versions of both in the command line via the following:

```bash
mvn -v
java -version
```

This should display the version you just installed if they are setup correctly.

Once everything is functioning, navigate to the test folder in your command line. 
To run the program, first compile it through maven. You can run the application by typing **mvn spring-bot:run**.
Or, I would recommend creating a jar and running that. Creating the jar can be done with **mvn clean package**.
Then, simply run the jar file

```bash
java -jar/target/test-0.0.1-SNAPSHOT.jar
```
