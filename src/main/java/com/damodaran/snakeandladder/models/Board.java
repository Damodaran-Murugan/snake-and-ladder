package com.damodaran.snakeandladder.models;

import com.damodaran.snakeandladder.constants.SnakeAndLadderConstants.CellType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Board {

    private final String delimiter = "#";
    private Cell[][] cells;

    public Board(int size, List<Cell> specialCells) {
        cells = new Cell[size][size];
        initializeCells(specialCells);
    }

    private void initializeCells(List<Cell> specialCells) {

        for (Cell specialCell : specialCells) {
            cells[specialCell.getPosition().getRow()][specialCell.getPosition().getColumn()] = specialCell;
        }

        for (int i = 0; i < cells.length; i++) {
            for (int j = 0; j < cells.length; j++) {
                if (cells[i][j] == null) {
                    cells[i][j] = Cell.builder()
                            .type(CellType.BASECELL)
                            .position(new Position(i, j))
                            .nextPosition(new Position(i, j))
                            .build();
                }
            }
        }
    }
}
