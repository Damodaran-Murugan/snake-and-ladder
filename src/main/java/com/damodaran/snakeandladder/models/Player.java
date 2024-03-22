package com.damodaran.snakeandladder.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Player {

    private User user;
    private Piece piece;
    private Position currentPosition;
    private int rank;
}
