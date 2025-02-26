package com.example.squareboardgameapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HeartbeatController {

    private final HeartbeatSensor heartbeatSensor;

    // Inject the HeartbeatSensor using constructor injection
    @Autowired
    public HeartbeatController(HeartbeatSensor heartbeatSensor) {
        this.heartbeatSensor = heartbeatSensor;
    }

    // Handle GET requests to /heartbeat
    @GetMapping("/heartbeat")
    public int getHeartbeat() {
        return heartbeatSensor.get(); // Return the random heartbeat value
    }
}
