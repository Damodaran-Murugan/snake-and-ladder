package com.damodaran.snakeandladder.models;

import com.damodaran.snakeandladder.constants.SnakeAndLadderConstants.CellType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Getter
@Builder
@NoArgsConstructor
public class Cell {

    private Position position;
    private CellType type;
    private Position nextPosition;
    private List<Player> players;

}
