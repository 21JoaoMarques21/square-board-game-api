package com.example.squareboardgameapi;

import org.springframework.stereotype.Component;

@Component
public class TicTacToeGameFactory {
    public String getGameIdentifier() {
        return "tic-tac-toe";
    }
}
