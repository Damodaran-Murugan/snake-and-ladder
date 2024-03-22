package com.damodaran.snakeandladder.models;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Dice {

    private final int faces;

    public int roll() {
        return (int) (Math.random() % faces);
    }
}
