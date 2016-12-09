package com.timurkashapov.jwl.time;

import com.timurkashapov.jwl.api.Constants;

/**
 * Stopwatch.
 *
 * @author Timur Kashapov
 * @since 0.1
 * @version 0.1
 */
public final class Stopwatch {

    /**
     * Zero long.
     */
    private static final long ZERO = 0L;

    /**
     * Fifty Nine long.
     */
    private static final long FIFTY_NINE = 59L;

    /**
     * Thousand long.
     */
    private static final long THOUSAND = 1000L;

    /**
     * Current time in UNIX time stamp.
     */
    private long current;

    /**
     * Last time in UNIX time stamp.
     */
    private long last;

    /**
     * @deprecated
     */
    private long currentMilliseconds = 0L;
    /**
     * @deprecated
     */
    private long lastMilliseconds = 0L;

    /**
     * Milliseconds in UNIX time stamp.
     */
    private long milliseconds = 0L;

    /**
     * Seconds for local measurement.
     */
    private long seconds = 0L;

    /**
     * Minutes for local measurement.
     */
    private long minutes = 0L;

    /**
     * Hours for local measurement.
     */
    private long hours = 0L;

    /**
     * Constructor.
     * @param args command-line arguments
     */
    public Stopwatch(final String... args) {
        System.out.printf("\nREADY");
        }

    /**
     * Main test.
     * @param args command-line arguments
     */
    public static void main(final String[] args) {

        new Stopwatch(args).start();

    }

    /**
     * Start stopwatch.
     */
    public void start() {

        current = System.currentTimeMillis();
        milliseconds = current;

        System.out.printf("\n%d h : %d min : %d sec", hours, minutes, seconds);
        seconds++;

        System.out.printf("\n-------------------");
        System.out.printf("\n- Start stopwatch -");
        System.out.printf("\n-------------------");

        while (true) {

            last = System.currentTimeMillis();

            if ((last - current) > Stopwatch.THOUSAND) {
                System.out.printf("\n%d h : %d min : %d sec", hours, minutes, seconds);
                seconds++;
                current = last;
            }

            if (hours > Stopwatch.FIFTY_NINE & minutes > Stopwatch.FIFTY_NINE & seconds > Stopwatch.FIFTY_NINE) {
                seconds = Stopwatch.ZERO;
                minutes = Stopwatch.ZERO;
                hours   = Stopwatch.ZERO;
                System.out.println("ONE HOUR");
                System.exit(Constants.ZERO);
            }

            if (minutes > Stopwatch.FIFTY_NINE & seconds > Stopwatch.FIFTY_NINE) {
                seconds = Stopwatch.ZERO;
                minutes = Stopwatch.ZERO;
                hours++;
            }

            if (seconds > Stopwatch.FIFTY_NINE) {
                seconds = Stopwatch.ZERO;
                minutes++;
            }
        }
    }
}
