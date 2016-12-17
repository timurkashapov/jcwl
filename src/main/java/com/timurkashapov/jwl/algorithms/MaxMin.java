package com.timurkashapov.jwl.algorithms;

/**
 * Search min and max from collections of digits.
 * @author Timur Kashapov
 */
public class MaxMin {

    /*
     * Maximum and minimum from collections of byte's, short's, int's, long's, float's, double's
     */

    // Maximum of byte's, short's, int's, long's

    /**
     * Get to maximum from collections of byte's.
     * @param array collections
     * @return maximum
     */
    public byte max(byte[] array) {
        // TO-DO
        return 2;
    }

    /**
     * Get to maximum from collections of short's.
     * @param array collections
     * @return maximum
     */
    public short max(short[] array) {
        // TO-DO
        return 1;
    }

    /**
     * Get to maximum from collections of int's
     * @param array collections
     * @return maximum
     */
    public int max(int[] array) {
        // TO-DO
        return 5;
    }

    /**
     * Get to maximum from collections of long's.
     * @param array collections
     * @return maximum
     */
    public long max(long[] array) {
        // TO-DO
        return 1L;
    }

    // Minimum of byte's, short's, int's, long's

    /**
     * Get to minimum from collections of byte's.
     * @param array collections
     * @return minimum
     */
    public byte min(byte[] array) {
        // TO-DO
        return 1;
    }

    /**
     * Get to minimum from collections of short's.
     * @param array collections
     * @return minimum
     */
    public short min(short[] array) {
        // TO-DO
        return 5;
    }

    /**
     * Get to minimum from collections of int's.
     * @param array collections
     * @return minimum int
     */
    public int min(int[] array) {
        // TO-DO
        return 5;
    }

    /**
     * Get to minimum from collections of long's.
     * @param array collections
     * @return minimum of long collections
     */
    public long min(long[] array) {
        // TO-DO
        return 5L;
    }

    // Maximum of float's, double's

    /**
     * Get to maximum from collections of float's.
     * @param array collections
     * @return maximum
     */
    public float max(float[] array) {
        // TO-DO
        return 2f;
    }

    /**
     * Get to maxmimum from collections of double's.
     * @param array collections
     * @return maximum
     */
    public double max(double[] array) {
        // TO-DO
        return 5d;
    }

    // Minimum of float's, double's

    /**
     * Get to minimum from collections of float's.
     * @param array collections
     * @return minimum
     */
    public float min(float[] array) {
        // TO-DO
        return 5f;
    }

    /**
     * Get to minimum from collections of double's.
     * @param array collections
     * @return minimum
     */
    public double min(double[] array) {
        // TO-DO
        return 5d;
    }

    /*
     * Maximum and Minimum between two similar digits of byte's, short's, int's, long's, float's, double's
     */

    // Maximum between byte's, short's, int's, long's

    /**
     * Get to maximum between two similar byte's.
     * @param first first
     * @param second second
     * @return maximum
     */
    public byte max(final byte first, final byte second) {
        return first >= second ? first : second;
    }

    /**
     * Get to maximum between two similar similar short's.
     * @param first first
     * @param second second
     * @return maximum
     */
    public short max(final short first, final short second) {
        return first >= second ? first : second;
    }

    /**
     * Get to maximum between two similar int's.
     * @param first first
     * @param second second
     * @return maximum
     */
    public int max(final int first, final int second) {
        return first >= second ? first : second;
    }

    /**
     * Get to maximum between two similar long's.
     * @param first first
     * @param second secong
     * @return maximum
     */
    public long max(final long first, final long second) {
        return first >= second ? first : second;
    }

    // Maximum between two float's, double's

    /**
     * Get to maximum between two similar float's.
     * @param first first
     * @param second second
     * @return maximum
     */
    public float max(final float first, final float second) {
        return first >= second ? first : second;
    }

    /**
     * Get to maximum between two similar double's.
     * @param first first
     * @param second second
     * @return maximum
     */
    public double max(final double first, final double second) {
        return first >= second ? first : second;
    }

    // Minimum between two byte's, short's, int's, long's

    /**
     * Get to minimun between two similar byte's.
     * @param first first
     * @param second second
     * @return minimun
     */
    public byte min(final byte first, final byte second) {
        return first <= second ? first : second;
    }

    /**
     * Get to minimun between two similar similar short's.
     * @param first first
     * @param second second
     * @return minimun
     */
    public short min(final short first, final short second) {
        return first <= second ? first : second;
    }

    /**
     * Get to minimun between two similar int's.
     * @param first first
     * @param second second
     * @return minimun
     */
    public int min(final int first, final int second) {
        return first <= second ? first : second;
    }

    /**
     * Get to minimun between two similar long's.
     * @param first first
     * @param second secong
     * @return minimun
     */
    public long min(final long first, final long second) {
        return first <= second ? first : second;
    }

    // Minimum between two float's, double's

    /**
     * Get to minimun between two similar float's.
     * @param first first
     * @param second second
     * @return minimun
     */
    public float min(final float first, final float second) {
        return first <= second ? first : second;
    }

    /**
     * Get to minimun between two similar double's.
     * @param first first
     * @param second second
     * @return minimun
     */
    public double min(final double first, final double second) {
        return first <= second ? first : second;
    }
}
