# Java-XML-parsing-and-PDF-writing

This is a java application that is able to create and write data into and xml file using DOM, the application is also able to read data from the written xml into a pdf file Automatically.
The Application is and examples of a restaurant receipt that is sent to a customer, it contains information about the restaurant, Customer, items ordered from the restaurant and their prices.

The WriteXml.java class contains a static WriteToXml method which uses various java modules to such as "javax.xml.parsers.DocumentBuilder" for creating the xml document and "javax.xml.transform.TransformerFactory" for transforming the DOM object to an XML file.

The javaApplication3 class reads 


#  Getting Started (Downloading and installing Java Development Kit)

To run the Application on your local machine you need to have the Java Development Kit(JDK) installed.
I recommend that you install only the latest JDK. Although you can install multiple versions of JDK/JRE concurrently, it is messy.

If you have previously installed older version(s) of JDK/JRE, un-install ALL of them. Goto "Control Panel" ⇒ (optional) "Programs" ⇒ "Programs and Features" ⇒ Un-install ALL programs begin with "Java", such as "Java SE Development Kit ...", "Java SE Runtime ...", "Java X Update ...", and etc.

STEP 1: Download JDK
  1. Goto Java SE download site @ http://www.oracle.com/technetwork/java/javase/downloads/index.html.
  2. Under "Java Platform, Standard Edition" ⇒ "Java SE 13.0.{x}", where {x} denotes a fast running security-update number ⇒ Click the      "Oracle JDK Download" button.
  3. Under "Java SE Development Kit 13.0.{x}" ⇒ Check "Accept License Agreement".
     Choose the JDK for your operating system, i.e., "Windows". Download the "exe" installer (e.g., "jdk-13.0.{x}_windows-x64_bin.exe" -      about 159MB).
     
STEP 2: Install JDK
  Run the downloaded installer (e.g., "jdk-13.0.{x}_windows-x64_bin.exe"), which installs both the JDK and JRE.

  By default, JDK is installed in directory "C:\Program Files\Java\jdk-13.0.{x}", where {x} denotes the update number. Accept the         defaults and follow the screen instructions to install JDK.

  Use your "File Explorer", navigate to "C:\Program Files\Java" to inspect the sub-directories. Take note of your JDK installed           directory jdk-13.0.{x}, in particular, the update number {x}, which you will need in the next step.

GOTTEN FROM: https://www.ntu.edu.sg/home/ehchua/programming/howto/JDK_HowTo.html ALSO ARTICLE FOR INSTALLING JDK ON WINDOWS AND OTHER MACHINES

#  Installing NetBeans IDE for running java programs
STEP 1: Download
  Download "NetBeans IDE" installer from http://netbeans.org/downloads/index.html. There are many "bundles" available. For beginners,     choose the 1st entry "Java SE" (e.g., "netbeans-8.2-javase-windows.exe" 95MB).

STEP 2: Run the Installer
  Run the downloaded installer.
  
# Cloning the repository

To clone the repo you need to have git bash installed to be able to clone it remotely.
Below there is a link to the official git bash site on how to install git bash on windows and other machines.
https://www.stanleyulili.com/git/how-to-install-git-bash-on-windows/

Below is a link from github help on how to clone the repo on various  machines Download or remote clone.
https://help.github.com/en/enterprise/2.13/user/articles/cloning-a-repository
  

# Running Application on Netbeans

To run the application ensure all above steps were followed without any exceptions, the instructions below are for windows users, links on how to open the project on other machines will be provided.

WINDOWS:
  Launch the netbeans IDE wait for it to load and a start page will be displayed.
  Click on File -> OpenProject
  Navigate to the cloned project click on it
  Click on "Open Project".
  The project will open IDE.
  FOR MORE DETAILED EXPLANATIONS: http://blog.jdevelop.eu/?p=29
  
MACOS and LINUX:
  https://www.youtube.com/watch?v=tSTLrQCTlYE
  

# Running unit tests

The Application has unit test written with JUnit for all classes. You can run JUnit tests on the entire application or on individual files and see the results in the IDE. 

The easiest way to run all the unit tests for the project is to choose Run > Test <PROJECT_NAME> from the main menu. And to run individual test on a particular class then right click on the Files -> Expand JavaApplication3 folder -> Expand src folder -> Expand javaApplication3 folder -> Right click on the class you want to test and click on "Test file".
FOR FURTHER READING: https://netbeans.org/kb/docs/java/junit-intro.html#:~:text=The%20easiest%20way%20to%20run,node%20and%20choose%20Run%20File.
All test files are in the JavaApplication3 -> test -> javaApplication3 folder.


# Conclucion

This is my actual first project in java, contributions and pull requests are highly welcomed as well as critism.
During the creation of the application a few articles were used for knowledge of writing/reading xml files with java and also writing to a pdf file references to the articles will be listed below.

References:
  
  General Knowledge of java - https://www.w3schools.com/java/default.asp
 
 Writing to xml file - https://examples.javacodegeeks.com/core-java/xml/parsers/documentbuilderfactory/create-xml-file-in-java-using-dom-parser-example/
  
  Reading from xml file - https://www.javatpoint.com/how-to-read-xml-file-in-java
  
  Writing to pdf file - https://www.chillyfacts.com/create-pdf-dynamically-images-using-java/
  





