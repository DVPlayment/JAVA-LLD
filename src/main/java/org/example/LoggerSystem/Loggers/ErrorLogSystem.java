package org.example.LoggerSystem.Loggers;

import org.example.LoggerSystem.Enums.LogLevel;

public class ErrorLogSystem extends LoggingSystem{
    public ErrorLogSystem(LoggingSystem loggingSystem) {
        super(loggingSystem);
    }

    @Override
    public void log(LogLevel level, String message) {
        if (level.getName().equals("error")) {
            System.out.println("Error logging system triggered " + message);
        } else {
            super.log(level, message);
        }
    }
}
