package com.example.demo.helper;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ItemViewHelper {

    private final String esService;

    @Value("${walmart.es.service}")
    private String propertyEsService;

    public ItemViewHelper() {
        esService = "http://catalog-es-service.prod.walmart.com/es-service";
    }

    public String getProductUrl(String sequence) {
        String url = String.format("%s/product/%s/search?sourceId=all&logloc=stack011", esService, sequence);
        return url;
    }

    public String getEsService() {
        return propertyEsService;
    }

}

