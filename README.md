# Web-Crawler for Scalable Capital
Java program which counts top Javascript libraries used on web pages found in google


# Approach and improvements
Segregated the business logic into 3 parts. 
1. Extracting the links to web pages based on the search string.
2. Extracting the scripts in each of these links. This is efficiently done by using multi-threading.
and the result list is sanitized by removing the path and parameters in order to identify duplicated libs.

Regarding the tests, I added some unit tests and integration tesing, the code coverage isn't 100% but it's an example of what we can do.


# How to build it
You only need to use maven as follows:    

    mvn clean package

# How to run it
Use the following in the terminal:    
    
    java -jar target/webcrawler-1.0.0-SNAPSHOT-jar-with-dependencies.jar

# How to run tests
    mvn verify

## Release History
* 1.0.0
   

## Features
 * Java 11
 * JSoup
 * Maven
 
## Output when the search term is "java"
    
    Web Crawler Engine from Scalable Capital
    
    Please enter the search string:<citibank>
    
    Processing search page...
	Found 15 links
	
	Extracting scripts...
	Found 271 scripts
	
	Analyzing Scripts...
	
	The top five is:
	
	------------------------------------
	main.js=2
	intl.en-US-v2975869048a.js=2
	Bootstrap.js=2
	adsbygoogle.js=2
	TMXProfiling.js=2
	------------------------------------

***Task execution finished***

## Contributing

Clone and checkout (https://github.com/preetak/mywebcrawler/tree/feature-webcrawler/src/main/java/com/scalable/capital/webcrawler)

