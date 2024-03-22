package com.damodaran.snakeandladder.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CreateGameRequest {

    private int size;
    private List<Cell> specialCells;
    private List<Player> players;
    private int diceFaces;

}
