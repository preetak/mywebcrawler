package com.scalable.capital.webcrawler;


import java.util.List;
import com.scalable.capital.webcrawler.business.*;
import com.scalable.capital.webcrawler.business.analytics.*;
import com.scalable.capital.webcrawler.console.*;
import com.scalable.capital.webcrawler.contstants.WebCrawlerConstants;

/*
 * @author : preeta.kuruvilla
 * Console application for Web Crawler
 * This application is assumed to be run by single user.
 * This is run as a standalone application from command prompt.
 */

public class WebCrawlerApplication {

    private WebCrawlerConsole console = new WebCrawlerConsoleImpl();
    private WebCrawlerLinkExtractor linkExtractor = new WebCrawlerLinkExtractorImpl();
    private WebCrawlerScriptExtractor scriptExtractor = new WebCrawlerScriptExtractorImpl();
    private WebCrawlerAnalyzer analyzer = new WebCrawlerAnalyzerImpl();

    public void displayConsole() {
        console.printMessage(WebCrawlerConstants.CONSOLE_HEADER);
        console.printMessage(WebCrawlerConstants.CONSOLE_SEARCH_STRING);
        String searchString = console.getSearchString();

        console.printMessage(WebCrawlerConstants.SEARCH_PAGE_INTRO);
        List<String> links = linkExtractor.getLinks(searchString);
        console.printMessage("\tFound " + links.size() + " links");

        console.printMessage(WebCrawlerConstants.EXTRACTING_SCRIPTS);
        List<String> scripts = scriptExtractor.getScripts(links);
        console.printMessage("\tFound " + scripts.size() + " scripts");

        console.printMessage(WebCrawlerConstants.ANALYZING_SCRIPTS);
        List topFiveList = analyzer.getTop(WebCrawlerConstants.TOP_JAVASCRIPT_LIBRARIES, scripts);

        console.printMessage(WebCrawlerConstants.TOP_FIVE);
        console.printMessage(WebCrawlerConstants.SPACER);
        console.printMessages(topFiveList);
        console.printMessage(WebCrawlerConstants.SPACER);
        console.printMessage(WebCrawlerConstants.WEBCRAWLER_FINISHED_ANALYSIS);
    }

    public static void main(String[] args) {
    	WebCrawlerApplication webcrawler = new WebCrawlerApplication();
        webcrawler.displayConsole();
    }
}
