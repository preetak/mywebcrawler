package com.scalable.capital.webcrawler.business.analytics;

import java.util.List;
import static java.util.Map.Entry;


/*
 * @author: preeta.kuruvilla
 * Interface for web crawler analyzer.
 * This determines the business metrics required.
 */
public interface WebCrawlerAnalyzer {
   List<Entry<String, Long>> getTop(long n, List<String> elements);
}
