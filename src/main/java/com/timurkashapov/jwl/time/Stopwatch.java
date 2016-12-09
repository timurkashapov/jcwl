package com.timurkashapov.jwl.time;

import com.timurkashapov.jwl.api.Constants;

/**
 * Stopwatch.
 *
 * @author Timur Kashapov
 * @since 0.1
 * @version 0.1
 */
public final class Stopwatch implements Constants {

    /**
     * Zero long.
     */
    private final long ZERO_L = 0L;

    /**
     * Fifty Nine long.
     */
    private final long FIFTY_NINE_L = 59L;

    /**
     * Thousand long
     */
    private final long THOUSAND_L = 1000L;

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
     * Empty constructor.
     */
    public Stopwatch() {
        System.out.printf("\nREADY");
        }

    /**
     * Main test.
     * @param args command-line arguments
     */
    public static void main(String[] args) {

        new Stopwatch().start();

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

            if ((last - current) > THOUSAND_L) {
                System.out.printf("\n%d h : %d min : %d sec", hours, minutes, seconds);
                seconds++;
                current = last;
            }

            if (hours > FIFTY_NINE_L & minutes > FIFTY_NINE_L & seconds > FIFTY_NINE_L) {
                seconds = ZERO_L;
                minutes = ZERO_L;
                hours   = ZERO_L;
                System.out.println("ONE HOUR");
                System.exit(Constants.ZERO);
            }

            if (minutes > FIFTY_NINE_L & seconds > FIFTY_NINE_L) {
                seconds = ZERO_L;
                minutes = ZERO_L;
                hours++;
            }

            if (seconds > FIFTY_NINE_L) {
                seconds = ZERO_L;
                minutes++;
            }
        }
    }
}
