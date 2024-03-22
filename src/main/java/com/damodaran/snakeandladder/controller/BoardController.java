package com.damodaran.snakeandladder.controller;

import com.damodaran.snakeandladder.models.Board;
import com.damodaran.snakeandladder.service.BoardService;

public class BoardController {

    private BoardService boardService = new BoardService();

    public Board makeMove(String gameId, String userId) {
        return boardService.makeMove(gameId, userId);
    }
}
