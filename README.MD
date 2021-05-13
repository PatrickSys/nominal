***************************************
*            NOMINAL PROJECT          *
***************************************
Created by: Patrick John, Rodrigo Serna & Lluc Matas

What have we used to create this program?

- Spring Boot
- Java 16 JDK
- MariaDB as database
- Angular for WEB
- JasperSoft for PDF, HTML and CSV exports
- Visual Studio Code
- IntelliJ

What do you need to run this program?

- NodeJS 14.16.1 and Angular CLI 11.2.11
- JasperReports Library 6.17
- Spring Boot
- Access to our database
- Any java compatible IDE

How to be able run our project step by step.

1. First of all you need an IDE and preferably Java 16jdk, you can download any java jdk from the [official website](https://www.oracle.com/es/java/technologies/javase-downloads.html)

2. Once you have a favorite IDE and java installed, the next step is to download NodeJS and Angular CLI. For NodeJS you can go to the [official website](https://nodejs.org/es/download/) and download the version we previosly mentioned. Once NodeJS is installed, open the terminal/cmd and install Angular with this command ``` npm install -g @angular/cli ```

3. Next step is clone our project nominal and [NominalWeb](https://github.com/LMatass/nominalWeb), once you have it, go to the nominal/src/main/java/DbConn and modify the IP, username and password if needed ().

4. Now you need to install JasperReports library, to do that go to [JasperReports Downloads](https://community.jaspersoft.com/community-download) and downlaod ```jasperreports-6.17.0.jar```, once Is downloaded add the library to the nominal project you just cloned in the step 3.

5. Finally run the Nominal project in your IDE and with the terminal/cmd redirect to the folder where is located nominalWeb and execute ```ng serve```, Angular should start and you are good to test the website in ```http://localhost:4200/```
