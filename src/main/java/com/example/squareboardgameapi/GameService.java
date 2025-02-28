package com.example.squareboardgameapi;

import fr.le_campus_numerique.square_games.engine.Game;
import fr.le_campus_numerique.square_games.engine.GameFactory;
import org.springframework.stereotype.Service;

import java.util.Set;
import java.util.UUID;

@Service
public class GameService {
    private final GameFactory gameFactory;

    public GameService(GameFactory gameFactory) {
        this.gameFactory = gameFactory;
    }

    public Game createGame(int playerCount, int boardSize) {
        return gameFactory.createGame(playerCount, boardSize);
    }

    public Game createGame(int boardSize, Set<UUID> playerIds) {
        return gameFactory.createGame(boardSize, playerIds);
    }
}
