package com.example.squareboardgameapi;

import fr.le_campus_numerique.square_games.engine.tictactoe.TicTacToeGameFactory;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.Collection;

@Service
public class GameCatalogImpl implements GameCatalog {

    private final TicTacToeGameFactory ticTacToeGameFactory = new TicTacToeGameFactory();

    public GameCatalogImpl() {
    }

    @Override
    public Collection<String> getGameIdentifiers() {
        // Currently, only Tic Tac Toe is available
        return Collections.singletonList(ticTacToeGameFactory.getGameFactoryId());
    }
}
