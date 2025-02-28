package com.example.squareboardgameapi;

//import com.example.squareboardgameapi.service.GameService;
import fr.le_campus_numerique.square_games.engine.Game;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Set;
import java.util.UUID;

@RestController
@RequestMapping("/games")
public class GameController {
    private final GameService gameService;

    public GameController(GameService gameService) {
        this.gameService = gameService;
    }

    @PostMapping("/create")
    public ResponseEntity<Game> createGame(@RequestParam int playerCount, @RequestParam int boardSize) {
        Game game = gameService.createGame(playerCount, boardSize);
        return ResponseEntity.ok(game);
    }

    @PostMapping("/create-with-players")
    public ResponseEntity<Game> createGameWithPlayers(@RequestParam int boardSize, @RequestBody Set<UUID> playerIds) {
        Game game = gameService.createGame(boardSize, playerIds);
        return ResponseEntity.ok(game);
    }
}
