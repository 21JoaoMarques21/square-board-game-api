package com.example.squareboardgameapi;

import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.Collection;

@Service
public class GameCatalogImpl implements GameCatalog {

    private final TicTacToeGameFactory ticTacToeGameFactory;

    public GameCatalogImpl(TicTacToeGameFactory ticTacToeGameFactory) {
        this.ticTacToeGameFactory = ticTacToeGameFactory;
    }

    @Override
    public Collection<String> getGameIdentifiers() {
        // Currently, only Tic Tac Toe is available
        return Collections.singletonList(ticTacToeGameFactory.getGameIdentifier());
    }
}
