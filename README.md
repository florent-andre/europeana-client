#europeana-client
================

This project implements a java client for the Europeana Search Api.

The project was forked from [Europeana4J] (http://code.google.com/p/europeana4j/) mavenized and refactored.

##integration in Eclipse workspace

git clone ....

File => Import => Existing Maven Projects ...

update compilation level and the java version in the facets to 1.6 (through Window/Project => Preferences => Java Compiler) 

## Create configuration files
``` 
cd europeana-client/src/main/resources
cp europeana-client.properties.template europeana-client.properties
cp log4j.xml.template log4j.xml
```

Note : europeana-client.properties and log4j.xml file are in the .gitignore file to not commit them in the repository
