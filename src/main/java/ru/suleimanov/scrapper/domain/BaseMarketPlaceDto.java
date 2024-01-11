package ru.suleimanov.scrapper.domain;

import org.springframework.stereotype.Component;

@Component
public abstract class BaseMarketPlaceDto implements BaseDto {
    private long id;
    private String name;
    private long price;
}
