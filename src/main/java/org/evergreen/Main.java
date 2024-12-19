package org.evergreen;

public class Main {
    public static void main(String[] args) {
        System.out.println(TimeFormatter.formatDuration(62));        // Output: "1 minute and 2 seconds"
        System.out.println(TimeFormatter.formatDuration(3662));      // Output: "1 hour, 1 minute and 2 seconds"
        System.out.println(TimeFormatter.formatDuration(0));         // Output: "now"
        System.out.println(TimeFormatter.formatDuration(31536000));  // Output: "1 year"
    }
}