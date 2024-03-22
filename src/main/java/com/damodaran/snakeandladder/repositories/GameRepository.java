package com.damodaran.snakeandladder.repositories;

import com.damodaran.snakeandladder.models.Game;
import lombok.NoArgsConstructor;

import java.util.HashMap;
import java.util.Map;


public class GameRepository {

    Map<String, Game> games = new HashMap<>();

    public void save(Game game){
        games.put(game.getGameId(),game);
    }

    public Game getGameById(String gameId){
        return games.get(gameId);
    }
}
