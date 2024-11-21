package org.example.LoggerSystem.Loggers;

import org.example.LoggerSystem.Enums.LogLevel;

public abstract class LoggingSystem {

    private final LoggingSystem nextLoggingSystem;

    public LoggingSystem(LoggingSystem loggingSystem) {
        this.nextLoggingSystem = loggingSystem;
    }

    public void log(LogLevel level, String message) {
        if (nextLoggingSystem != null) {
            nextLoggingSystem.log(level, message);
        } else {
            System.out.println("Logging system " + level.getName() + " not supported");
        }
    }
}
