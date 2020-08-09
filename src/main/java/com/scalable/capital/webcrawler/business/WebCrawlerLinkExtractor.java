package com.scalable.capital.webcrawler.business;

import java.util.List;


/*
 * @author: preeta.kuruvilla
 * Interface to get all the web page links for the search string
 * 
 */
public interface WebCrawlerLinkExtractor {

    List<String> getLinks(String searchString);
}
