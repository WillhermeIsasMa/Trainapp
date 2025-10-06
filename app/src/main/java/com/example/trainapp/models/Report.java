package com.example.trainapp.models;

public class Report {
    private String description;
    private long timestamp;

    public Report(String description, long timestamp) {
        this.description = description;
        this.timestamp = timestamp;
    }

    public String getDescription() { return description; }
    public long getTimestamp() { return timestamp; }
}
