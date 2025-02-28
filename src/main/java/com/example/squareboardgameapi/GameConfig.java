package com.example.squareboardgameapi;

import fr.le_campus_numerique.square_games.engine.GameFactory;
import fr.le_campus_numerique.square_games.engine.tictactoe.*;
import fr.le_campus_numerique.square_games.engine.connectfour.*;
import fr.le_campus_numerique.square_games.engine.taquin.*;
//import java.util.ServiceLoader;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GameConfig {

    @Bean
    public GameFactory ticTacToeFactory() {
        return new TicTacToeGameFactory();
    }

    @Bean
    public GameFactory connect4Factory() {
        return new ConnectFourGameFactory();
    }

    @Bean
    public GameFactory taquinFactory() {
        return new TaquinGameFactory();
    }
}
