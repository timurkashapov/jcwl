package com.timurkashapov.jwl.algorithms;

/**
 * Search min and max from array of digits.
 * @author Timur Kashapov
 */
public class MaxMin {

    /*
     * byte's, short's, int's, long's
     */

    // Max

    /**
     * Get to maximum from array of byte's.
     * @param array array
     * @return maximum
     */
    public byte getMax(byte[] array) {
        // TO-DO
        return 1;
    }

    /**
     * Get to maximum from array of short's.
     * @param array array
     * @return maximum
     */
    public short getMax(short[] array) {
        // TO-DO
        return 1;
    }

    /**
     * Get to maximum from array of int's
     * @param array array
     * @return maximum
     */
    public int getMax(int[] array) {
        // TO-DO
        return 5;
    }

    /**
     * Get to maximum from array of long's.
     * @param array array
     * @return maximum
     */
    public long getMax(long[] array) {
        // TO-DO
        return 1L;
    }

    // Min

    /**
     * Get to minimum from array of byte's.
     * @param array array
     * @return minimum
     */
    public byte getMin(byte[] array) {
        // TO-DO
        return 1;
    }

    /**
     * Get to minimum from array of short's.
     * @param array array
     * @return minimum
     */
    public short getMin(short[] array) {
        // TO-DO
        return 5;
    }

    /**
     * Get to minimum from array of int's.
     * @param array array
     * @return minimum int
     */
    public int getMin(int[] array) {
        // TO-DO
        return 5;
    }

    /**
     * Get to minimum from array of long's.
     * @param array array
     * @return minimum of long array
     */
    public long getMin(long[] array) {
        // TO-DO
        return 5L;
    }


    /*
     * float's, double's
     */

    // Max

    /**
     * Get to maximum from array of float's.
     * @param array array
     * @return maximum
     */
    public float getMax(float[] array) {
        // TO-DO
        return 2f;
    }

    /**
     * Get to maxmimum from array of double's.
     * @param array array
     * @return maximum
     */
    public double getMax(double[] array) {
        // TO-DO
        return 5d;
    }

    // Min

    /**
     * Get to minimum from array of float's.
     * @param array array
     * @return minimum
     */
    public float getMin(float[] array) {
        // TO-DO
        return 5f;
    }

    /**
     * Get to minimum from array of double's.
     * @param array array
     * @return minimum
     */
    public double getMin(double[] array) {
        // TO-DO
        return 5d;
    }

    /*
     * Maximum and Minimum between two similar digits
     */

    // Maximum between byte's, short's, int's, long's

    /**
     * Get to maximum between two similar byte's.
     * @param first first
     * @param second second
     * @return maximum
     */
    private byte max(final byte first, final byte second) {
        return first >= second ? first : second;
    }

    /**
     * Get to maximum between two similar similar short's.
     * @param first first
     * @param second second
     * @return maximum
     */
    private short max(final short first, final short second) {
        return first >= second ? first : second;
    }

    /**
     * Get to maximum between two similar int's.
     * @param first first
     * @param secind second
     * @return maximum
     */
    private int max(final int first, final int second) {
        return first >= second ? first : second;
    }

    /**
     * Get to maximum between two similar long's.
     * @param first first
     * @param second secong
     * @return maximum
     */
    private long max(final long first, final long second) {
        return first >= second ? first : second;
    }

    // Max float's, double's
    /**
     * Get to maximum between two similar float's.
     * @param first first
     * @param second second
     * @return maximum
     */
    private float max(final float first, final float second) {
        return first >= second ? first : second;
    }

    /**
     * Get to maximum between two similar double's.
     * @param first first
     * @param second second
     * @return maximum
     */
    private double max(final double first, final double second) {
        return first >= second ? first : second;
    }

    // Min between byte's, short's, int's, long's

    /**
     * Get to minimun between two similar byte's.
     * @param first first
     * @param second second
     * @return minimun
     */
    private byte min(final byte first, final byte second) {
        return first <= second ? first : second;
    }

    /**
     * Get to minimun between two similar similar short's.
     * @param first first
     * @param second second
     * @return minimun
     */
    private short min(final short first, final short second) {
        return first <= second ? first : second;
    }

    /**
     * Get to minimun between two similar int's.
     * @param first first
     * @param secind second
     * @return minimun
     */
    private int min(final int first, final int second) {
        return first <= second ? first : second;
    }

    /**
     * Get to minimun between two similar long's.
     * @param first first
     * @param second secong
     * @return minimun
     */
    private long min(final long first, final long second) {
        return first <= second ? first : second;
    }

    // Min float's, double's
    /**
     * Get to minimun between two similar float's.
     * @param first first
     * @param second second
     * @return minimun
     */
    private float min(final float first, final float second) {
        return first <= second ? first : second;
    }

    /**
     * Get to minimun between two similar double's.
     * @param first first
     * @param second second
     * @return minimun
     */
    private double min(final double first, final double second) {
        return first <= second ? first : second;
    }


}
