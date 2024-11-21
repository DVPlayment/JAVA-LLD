package org.example.LoggerSystem.Loggers;

import org.example.LoggerSystem.Enums.LogLevel;

public class InfoLogSystem extends LoggingSystem {
    public InfoLogSystem(LoggingSystem loggingSystem) {
        super(loggingSystem);
    }

    @Override
    public void log(LogLevel level, String message) {
        if (level.getName().equals("info")) {
            System.out.println("Using info log system " + message);
        } else {
            super.log(level, message);
        }
    }
}
