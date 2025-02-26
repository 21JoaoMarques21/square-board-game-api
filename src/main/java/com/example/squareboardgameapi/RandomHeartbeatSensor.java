package com.example.squareboardgameapi;

import org.springframework.stereotype.Component;
import java.util.Random;

@Component
public class RandomHeartbeatSensor implements HeartbeatSensor {

    @Override
    public int get() {
        Random random = new Random();
        return 40 + random.nextInt(191); // Random value between 40 and 230
    }
}