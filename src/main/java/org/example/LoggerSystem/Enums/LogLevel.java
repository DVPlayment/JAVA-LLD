package org.example.LoggerSystem.Enums;

public enum LogLevel {
    INFO("info"),
    WARNING("warning"),
    ERROR("error"),
    DEBUG("debug");

    private final String name;

    LogLevel(String name) {
    this.name = name;
    }

    public String getName() {
        return name;
    }
}
