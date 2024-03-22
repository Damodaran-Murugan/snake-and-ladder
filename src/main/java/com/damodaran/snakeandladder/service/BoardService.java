package com.damodaran.snakeandladder.service;

import com.damodaran.snakeandladder.models.*;

import java.util.List;
import java.util.Optional;

public class BoardService {

    private GameService gameService = new GameService();

    public Board makeMove(String gameId, String userId) {
        Game game = gameService.getGameById(gameId);
        int faceValue = game.getDice().roll();

        Player currentPlayer = getCurrentPlayer(game, userId);
        removePlayerFromCurrentposition(game.getBoard(),currentPlayer.getCurrentPosition(),userId);

        Position newPosition=findNewPosition(currentPlayer.getCurrentPosition(),faceValue);
        updatePosition(game.getBoard(), newPosition,currentPlayer);

        return game.getBoard();
    }

    private Position findNewPosition(Position currentPosition, int faceValue) {
        return null;
    }

    private void removePlayerFromCurrentposition(Board board, Position currentPosition, String userId) {
        Cell currentCell = board.getCells()[currentPosition.getRow()][currentPosition.getColumn()];
        List<Player> players = currentCell.getPlayers();
        for(int i = 0; i< players.size(); i++){
            if(players.get(i).getUser().getUserId().equals(userId)){
                players.remove(i);
                break;
            }
        }
    }

    private void updatePosition(Board board, Position newPosition, Player currentPlayer) {
        Cell newCell = board.getCells()[newPosition.getRow()][newPosition.getColumn()];
        newCell.getPlayers().add(currentPlayer);

    }

    private Player getCurrentPlayer(Game game, String userId) {
        Optional<Player> player = game.getPlayers().stream().filter(player1 -> player1.getUser().getUserId().equals(userId)).findFirst();
        if (player.isPresent()) {
            return player.get();
        } else {
            throw new RuntimeException("Player not found");
        }
    }
}
