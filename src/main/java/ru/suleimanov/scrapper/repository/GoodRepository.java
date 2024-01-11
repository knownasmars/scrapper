package ru.suleimanov.scrapper.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.suleimanov.scrapper.entities.Good;

@Repository
public interface GoodRepository extends JpaRepository<Good, Integer> {
}
