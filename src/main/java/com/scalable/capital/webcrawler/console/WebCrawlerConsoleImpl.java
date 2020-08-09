package com.scalable.capital.webcrawler.console;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import com.scalable.capital.webcrawler.contstants.WebCrawlerConstants;


/*
 * @author: preeta.kuruvilla
 * Implementation Class Utility to accept the search string from console 
 * and print messages on console
 * 
 */
public class WebCrawlerConsoleImpl implements WebCrawlerConsole {
    
    private final BufferedReader bufferedReader;

    public WebCrawlerConsoleImpl() {
        bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    }

    @Override
    public String getSearchString() {
        try {
            return bufferedReader.readLine();
        } catch (final IOException e) {
            e.printStackTrace();
        }

        return getSearchString();
    }

    @Override
    public void printMessage(final String message) {
        System.out.println(message);
    }

    @Override
    public void printMessages(List<String> messages) {
        if (messages != null && messages.size() > 0) {
            messages.stream()
                    .forEach(System.out::println);
        }
    }

    @Override
    public void clearScreen() {
        try {
            if (WebCrawlerConstants.OS_NAME.contains("Windows")) {
                Runtime.getRuntime().exec("cls");
            } else {
                Runtime.getRuntime().exec("clear");
            }
        } catch (final Exception e) {
            System.out.println(e.getMessage());
            //  Handle any exceptions.
        }
    }
}
