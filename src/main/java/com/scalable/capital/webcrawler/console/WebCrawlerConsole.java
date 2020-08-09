package com.scalable.capital.webcrawler.console;

import java.util.List;

/*
 * @author: preeta.kuruvilla
 * interface for web crawler console.
 */
public interface WebCrawlerConsole {
    String getSearchString();
    void printMessage(String message);
    void printMessages(List<String> messages);
    void clearScreen();
}
