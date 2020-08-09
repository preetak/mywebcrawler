package com.scalable.capital.webcrawler.business.analytics;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

/*
 * @author: preeta.kuruvilla
 * Implementation class for determining the top N javascripts.
 */
public class WebCrawlerAnalyzerImpl implements WebCrawlerAnalyzer {

    @Override
    public List<Entry<String, Long>> getTop(final long n, final List<String> elements) {
        final Map<String, Long> groupedElements = elements
                .stream()
                .collect(groupingBy(element->element, counting()));

        return groupedElements
                .entrySet()
                .stream()
                .sorted((o1, o2) ->  o2.getValue().compareTo(o1.getValue()))
                .limit(n)
                .collect(Collectors.toList());
    }
}
