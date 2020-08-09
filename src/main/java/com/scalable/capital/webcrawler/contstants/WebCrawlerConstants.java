package com.scalable.capital.webcrawler.contstants;


/*
 * @author: preeta.kuruvilla
 * Constants class for Web Crawler
 * 
 */
public class WebCrawlerConstants {

	    public static final String OS_NAME = System.getProperty("os.name");
	    public static final long TOP_JAVASCRIPT_LIBRARIES = 5L;	
	    public static final String CONSOLE_HEADER = "\nWeb Crawler Engine from Scalable Capital";
	    public static final String CONSOLE_SEARCH_STRING = "\nPlease enter the search string:";
	    public static final String SEARCH_PAGE_INTRO = "\nProcessing search page...";
	    public static final String EXTRACTING_SCRIPTS = "\nExtracting scripts...";
	    public static final String ANALYZING_SCRIPTS = "\nAnalyzing Scripts...";
	    public static final String TOP_FIVE = "\nThe top five is:";
	    public static final String WEBCRAWLER_FINISHED_ANALYSIS = "\n***Task execution finished***\n";
	    public static final String SPACER = "------------------------------------";
	    public static final int RESULT_SIZE = 15;
	    public static final int TIMEOUT = 5000;
	    public static String SEARCH_Q = "https://www.google.com/search?num=" + RESULT_SIZE + "&q=";

	    private WebCrawlerConstants() {

	    }
}
