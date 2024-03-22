package com.damodaran.snakeandladder.controller;

import com.damodaran.snakeandladder.models.CreateGameRequest;
import com.damodaran.snakeandladder.models.Game;
import com.damodaran.snakeandladder.service.GameService;
public class GameController {

    private GameService gameService = new GameService();

    public Game createGame(CreateGameRequest createGameRequest) {
        return gameService.createGame(createGameRequest);
    }

}
