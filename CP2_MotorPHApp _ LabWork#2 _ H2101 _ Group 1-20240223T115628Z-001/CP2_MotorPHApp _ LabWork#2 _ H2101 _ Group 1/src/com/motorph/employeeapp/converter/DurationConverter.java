package com.motorph.employeeapp.converter;

import java.time.Duration;

public class DurationConverter {

    public static Duration parseDurationString(String durationString) {
        String[] parts = durationString.split(":");
        int hours = Integer.parseInt(parts[0]);
        int minutes = Integer.parseInt(parts[1]);

        return Duration.ofHours(hours).plusMinutes(minutes);
    }

    public static String formatDuration(Duration duration) {
        long hours = duration.toHours();
        long minutes = duration.minusHours(hours).toMinutes();

        return String.format("%02d:%02d", hours, minutes);
    }
}
