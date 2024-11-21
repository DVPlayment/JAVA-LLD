package org.example.LoggerSystem.Loggers;

import org.example.LoggerSystem.Enums.LogLevel;

public class WarningLogSystem extends LoggingSystem{
    public WarningLogSystem(LoggingSystem loggingSystem) {
        super(loggingSystem);
    }

    @Override
    public void log(LogLevel level, String message) {
        if (level.getName().equals("warning")) {
            System.out.println("Warning logging system triggered " + message);
        } else {
            super.log(level, message);
        }
    }
}
