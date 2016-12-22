package com.timurkashapov.jwl.algorithms;

/**
 * The comparator.
 *
 * @author Timur Kashapov
 */
public final class Comparator {

    /**
     * constructor.
     */
    public Comparator() {
        // TO-DO
    }

    /**
     * Compare the two char's.
     *
     * @param first  first char.
     * @param second second char.
     * @return result of compare.
     */
    public static boolean compare(final char first, final char second) {
        return first == second;
    }

    /**
     * Compare the two float's.
     *
     * @param first  first float.
     * @param second second float.
     * @return result of compare.
     */
    public static boolean compare(final float first, final float second) {
        return first == second;
    }

    /**
     * Get the HEX decimal of member.
     *
     * @param source char member.
     * @return hex string.
     */
    public static String getHexOf(char source) {
        return Integer.toHexString(source);
    }

    /**
     * Get the BIN decimal of member.
     *
     * @param source char member.
     * @return binary string.
     */
    public static String getBinOf(char source) {
        return Integer.toBinaryString(source);
    }
}
