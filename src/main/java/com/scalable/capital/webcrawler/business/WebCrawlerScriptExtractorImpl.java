package com.scalable.capital.webcrawler.business;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
/*
 * @author:preeta.kuruvilla
 * implementation class to extract the java scripts from the web page links
 * 
 */
public class WebCrawlerScriptExtractorImpl implements WebCrawlerScriptExtractor {

    @Override
    public List<String> getScripts(List<String> links) {
        final List<String> scripts = new Vector<>();
        final List<WebCrawlerScriptThread> threads = new ArrayList<>();

        for (final String link : links) {
            threads.add(new WebCrawlerScriptThread(link, scripts));
        }

        for (final WebCrawlerScriptThread scriptThread : threads) {
            while (scriptThread.isAlive()) {
                try {
                    scriptThread.join();
                } catch (final InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        return scripts;
    }
}
