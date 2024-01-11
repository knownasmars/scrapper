package ru.suleimanov.scrapper.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.suleimanov.scrapper.entities.Good;
import ru.suleimanov.scrapper.service.GoodService;

import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("/goods")
public class GoodController {

    private final GoodService goodService;

    @GetMapping()
    public String getAllGoods() {
        return "privet";
    }
//    @GetMapping()
//    public List<Good> getAllGoods() {
//        return goodService.findAll();
//    }
}
