# Zoo04Lab

> Welcome to our Zoo! 

[![Known Vulnerabilities](https://snyk.io/test/github/denisecase/Zoo04Lab/badge.svg)](https://snyk.io/test/github/denisecase/Zoo04Lab)
[![Codacy Badge](https://app.codacy.com/project/badge/Grade/62545caa0c744a12a7f3995641b73766)](https://www.codacy.com/gh/denisecase/Zoo04Lab/dashboard?utm_source=github.com&amp;utm_medium=referral&amp;utm_content=denisecase/Zoo04Lab&amp;utm_campaign=Badge_Grade)

## Check Code with Static Analysis Tools

- Snyk monitors our code for vulnerabilities in the packages we include.
- Codacy checks our code for common 'code smells' and recommends improvements.
- Click the badges to learn more. 

## API

- Explore API at <https://denisecase.github.io/Zoo04Lab/edu/nwmissouri/zoo04lab/package-summary.html>

-----

## Web App

A user interface (besides the console) would be nice. 
We voted on a web front end.

```Bash
$ mvn clean package spring-boot:repackage
$ java -jar target/Zoo04Lab-1.0-SNAPSHOT
```

## Keep Current - Upgrade to Java 17

5 steps to update (details below):

1. Netbeans -> 12.5 
2. Java -> 17 
3. Windows Edit System Environment Variables (JAVA_HOME, path)
4. pom.xml (already complete - verify our current versions)
5. IDE project settings -> set compile to JDK 17

### 1) Upgrade Netbeans

- Uninstall 12.4 (program available in C:\Program Files\NetBeans-12.4)
- Download and install 12.5

### 2) Upgrade Java

Open Powershell as Admin and run this command to install Java 17. Must use --exact or -e.
(winget works with install / upgrade / uninstall).

```Powershell
winget install Microsoft.OpenJDK.17 -e
```

Verify location on your machine, e.g., C:\Program Files\Microsoft\jdk-17.0.0.35-hotspot

### 3) Edit System Environment Variables (JAVA_HOME and path)

Windows path must have exactly one JDK entry.

- Hit Win key, Edit System Environment Variables. 
- Verify/add JAVA_HOME (mine is C:\Program Files\Microsoft\jdk-17.0.0.35-hotspot)
- Verify path includes exactly one Java entry - either %JAVA_HOME%\bin OR C:\Program Files\Microsoft\jdk-17.0.0.35-hotspot\bin and no other JDK or Java entries. 

### 4) pom.xml  

These have been updated. Find these in pom.xml:

- java.version = 17
- junit = 5.8.1
- maven - see different versions by plugin

### 5) NetBeans Project Compiler

Open NetBeans. Right-click our Project / Properties  / Build / Compile / Java Platform

- click "Manage Java Platforms", click "Add Platform", Type = Java Std Edition / Next 
- Locate your new JDK 17 (mine is in  C:\Program Files\Microsoft\jdk-17.0.0.35-hotspot), click Next. It will fill in the information. Click Finish, Close.
- Back in the Java Platform dropdown, Select JDK 17. 
- Clean and build project to verify everything compiles. Try running ZooApp to verify.

-----

## 4 Principles of Object-Oriented Programming (OOP)

- Encapsulation. Wrap code in good interfaces. Hide private data, expose publicly accessible methods.
- Abstraction. Abstract general ideas that work for many, e.g. move is an abstraction of crawl, slither, fly.
- Inheritance. Write once in a parent class and all the derived child classes get it for free.
- Polymorphism. "Many shapes". One thing (e.g. move) can take many forms, e.g. a snake might move by slithering, while a bird might move by flying. 

## SOLID Principles ([Wikipedia](https://en.wikipedia.org/wiki/SOLID))

- Single Responsibility Principle. Only one reason to change.
- Open-Closed Principle. Open for extesion; closed for modification.
- Liskov Substitution Principle. Use derived class just like base.
- Interface Segregation Principle. Many client-specific interfaces.
- Dependency Inversion Principle. Depend on abstract rather than concrete.
