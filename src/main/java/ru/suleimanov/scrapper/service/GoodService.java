package ru.suleimanov.scrapper.service;

import org.springframework.stereotype.Service;
import ru.suleimanov.scrapper.entities.Good;
import ru.suleimanov.scrapper.repository.GoodRepository;

import java.util.List;

@Service
public class GoodService {

    GoodRepository repository;

    public List<Good> findAll() {
        return repository.findAll();
    }
}

