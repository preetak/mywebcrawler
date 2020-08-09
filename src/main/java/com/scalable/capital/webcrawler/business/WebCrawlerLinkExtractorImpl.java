package com.scalable.capital.webcrawler.business;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import com.scalable.capital.webcrawler.contstants.WebCrawlerConstants;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import static java.util.stream.Collectors.toList;

/*
 * @author:preeta.kuruvilla
 * Implementation class for extracting all the web page links based on the search string.
 * 
 */

public class WebCrawlerLinkExtractorImpl implements WebCrawlerLinkExtractor {
    

    @Override
    public List<String> getLinks(final String searchTerm) {
        final List<String> urls = new ArrayList<>();
        try {
            final Document document = Jsoup
                    .connect(WebCrawlerConstants.SEARCH_Q + searchTerm)
                    .timeout(WebCrawlerConstants.TIMEOUT)
                    .get();
            final Elements divList = document.select("div.g");
            for(final Element div : divList) {
                final Elements elements = div.getElementsByTag("a");
                final String url = elements.attr("href");
                if (url.startsWith("http")) {
                    urls.add(url);
                }
            }
        } catch (final IOException e) {
            e.printStackTrace();
        }

        return urls
                .stream()
                .distinct()
                .collect(toList());
    }
}
