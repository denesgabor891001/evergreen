package org.evergreen;

import java.util.ArrayList;
import java.util.List;

public class TimeFormatter {
    public static String formatDuration(int seconds) {
        if (seconds == 0) {
            return "now";
        }

        int years = seconds / (365 * 24 * 60 * 60);
        seconds %= 365 * 24 * 60 * 60;

        int days = seconds / (24 * 60 * 60);
        seconds %= 24 * 60 * 60;

        int hours = seconds / (60 * 60);
        seconds %= 60 * 60;

        int minutes = seconds / 60;
        seconds %= 60;

        int secs = seconds;

        List<String> parts = new ArrayList<>();

        if (years > 0) parts.add(years + " year" + (years > 1 ? "s" : ""));
        if (days > 0) parts.add(days + " day" + (days > 1 ? "s" : ""));
        if (hours > 0) parts.add(hours + " hour" + (hours > 1 ? "s" : ""));
        if (minutes > 0) parts.add(minutes + " minute" + (minutes > 1 ? "s" : ""));
        if (secs > 0) parts.add(secs + " second" + (secs > 1 ? "s" : ""));

        if (parts.size() == 1) {
            return parts.getFirst();
        } else {
            String lastPart = parts.removeLast();
            return String.join(", ", parts) + " and " + lastPart;
        }
    }
}