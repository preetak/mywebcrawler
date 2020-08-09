package com.scalable.capital.webcrawler.business;

import java.util.List;

/*
 * @author: preeta.kuruvilla
 * interface to extract the javascripts used in each web page link
 */
public interface WebCrawlerScriptExtractor {

    List<String> getScripts(List<String> links);
}
