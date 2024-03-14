package com.damodaran.snakeandladder.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@NoArgsConstructor
public class Player {

    private User user;
    private Piece piece;
    private int rank;
}
