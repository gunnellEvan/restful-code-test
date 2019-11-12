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

## Using the Program
Once the program is running, you will see the Spring Boot setup on the command line. If it does not state any errors, the program is up and running. 

To navigate to the HAL Browser. Go to the URL **http://localhost:8080/browser/index.html#/** This will bring you to a page such as seen below.

![Image of HAL Browser](images/HAL%20Browser%20Homepage.png)

Once there you can add any Users or Organizations through the **NON-GET** button, which defaults to **PUT**. Clicking that will bring up a window as seen below. 


![Image of PUT window](images/HAL%20user%20creation&20window.png)

Once data is created, you can **GET** the data by entering the url such as **http://localhost:8080/users** (Either in the address bar or the Explorer bar provded)
Or you can simply click on the Get button for the pertaining subject. Both of these will bring up the body of JSON data stored.

![Image of HAL Browser](images/Users%20body%20of%20data.png)

![Image of HAL Browser](images/Organizations%20body%20of%20data.png)

To target one user or organization in particular, simply add their pertaining ID number to the URL. ie **http://localhost:8080/users/1**

For deleting users, simply change your Action to **DELETE**, and specify the URL of the required User or Organization. This will remove the User or Organization entirely.



Unfortunately, due to my lack of experience in this subject, there are not DTOs utilized. Any removal of Users from Organizations, or vice versa, also must be done manually by the user. This latter portion could be fixed with Simple functions to automate these tasks on various calls, but was not able to be implemented do to errors. For more thoughts from the author on what could be improved about their work, feel free to see the author notes!

## Credits
Author: Evan Gunnell

A big thanks to both my recruiter and the staff for taking the time to interview me throughout this process!!
