package com.damodaran.snakeandladder.models;

import com.damodaran.snakeandladder.constants.SnakeAndLadderConstants.PieceColor;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@NoArgsConstructor
public class Piece {

    private PieceColor color;
}
