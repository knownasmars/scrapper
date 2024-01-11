package ru.suleimanov.scrapper.client;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class WildberriesClient implements MarketPlaceClient {

    private final String URL;
    @Autowired
    public WildberriesClient(@Value ("${wildberries.address}") String url) {
        URL = url;
    }
}
