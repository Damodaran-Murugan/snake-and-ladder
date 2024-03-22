package com.damodaran.snakeandladder.service;

import com.damodaran.snakeandladder.constants.SnakeAndLadderConstants.GameStatus;
import com.damodaran.snakeandladder.models.Board;
import com.damodaran.snakeandladder.models.CreateGameRequest;
import com.damodaran.snakeandladder.models.Dice;
import com.damodaran.snakeandladder.models.Game;
import com.damodaran.snakeandladder.repositories.GameRepository;

public class GameService {

    private GameRepository gameRepository = new GameRepository();

    public Game createGame(CreateGameRequest gameRequest) {
        Game game = Game.builder()
                .board(new Board(gameRequest.getSize(), gameRequest.getSpecialCells()))
                .players(gameRequest.getPlayers())
                .dice(new Dice(gameRequest.getDiceFaces()))
                .status(GameStatus.ON)
                .build();
        gameRepository.save(game);
        return game;
    }

    public Game getGameById(String gameId){
        return gameRepository.getGameById(gameId);
    }
}
