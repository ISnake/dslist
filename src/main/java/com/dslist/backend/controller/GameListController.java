package com.dslist.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.dslist.backend.dto.GameListDTO;
import com.dslist.backend.dto.GameMinDto;
import com.dslist.backend.dto.ReplacementDTO;
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

    @PostMapping (value = "/{listId}/replacement")
    public void move(@PathVariable Long listId, @RequestBody ReplacementDTO body) {

        gameListService.move(listId, body.getSourceIndex(), body.getDestinationIndex());

    }
    
}
