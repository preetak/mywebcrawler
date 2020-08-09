package com.scalable.capital.webcrawler.console;

import java.util.List;
import java.util.Map.Entry;

/*
 * @author: preeta.kuruvilla
 * interface for web crawler console.
 */
public interface WebCrawlerConsole {
    String getSearchString();
    void printMessage(String message);
    void printMessages(List<Entry<String, Long>> topFiveList);
    void clearScreen();
}
