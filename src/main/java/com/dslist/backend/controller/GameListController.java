package com.dslist.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.dslist.backend.dto.GameListDTO;
import com.dslist.backend.dto.GameMinDto;
import com.dslist.backend.services.GameListService;
import com.dslist.backend.services.GameService;


@RestController
@RequestMapping(value = "/lists")
public class GameListController {

    @Autowired
    private GameListService gameListService;

    @Autowired
    private GameService gameService;

    @GetMapping
    public List<GameListDTO> findAll() {
        List<GameListDTO> result = gameListService.findAll();
        return result;
    }

    @GetMapping (value = "/{listId}/games")
    public List<GameMinDto> findbyList(@PathVariable Long listId) {
        List<GameMinDto> result = gameService.findbyList(listId);
        return result;
    }
    
}
