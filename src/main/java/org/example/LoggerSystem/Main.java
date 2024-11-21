package org.example.LoggerSystem;

import org.example.LoggerSystem.Enums.LogLevel;
import org.example.LoggerSystem.Loggers.ErrorLogSystem;
import org.example.LoggerSystem.Loggers.InfoLogSystem;
import org.example.LoggerSystem.Loggers.LoggingSystem;
import org.example.LoggerSystem.Loggers.WarningLogSystem;

public class Main {
    public static void main(String[] args) {
        LoggingSystem loggingSystem = new InfoLogSystem(new WarningLogSystem(new ErrorLogSystem(null)));

        loggingSystem.log(LogLevel.INFO, "YOUR LOG MESSAGE");
        loggingSystem.log(LogLevel.DEBUG, "YOUR LOG MESSAGE");
        loggingSystem.log(LogLevel.ERROR, "YOUR LOG MESSAGE");
        loggingSystem.log(LogLevel.WARNING, "YOUR LOG MESSAGE");
    }
}
