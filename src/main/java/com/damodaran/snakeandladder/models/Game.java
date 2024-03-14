package com.damodaran.snakeandladder.models;

import com.damodaran.snakeandladder.constants.SnakeAndLadderConstants.GameStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Getter
@Builder
@NoArgsConstructor
public class Game {
    private Board board;
    private List<Player> players;
    private GameStatus status;
    private LeaderBoard leaderBoard;
    private Dice dice;
}
