package com.timurkashapov.jwl.array;

/**
 * Array wrapper.
 * @author Timur Kashapov
 */
public final class Array {

    /**
     * Source array.
     */
    private int[] source;

    /**
     * Length of source array.
     */
    public int length;

    /**
     * Empty constructor.
     */
    public Array() {
        this.length = 0;
        this.source = new int[this.length];
    }

    /**
     * One argument constructor.
     */
    public Array(final int length) {
        this.length = length;
        this.source = new int[this.length];
    }

    /**
     * Insert the member to the end of the array.
     * @param member member
     * @return extended array
     */
    public int[] insert(final int member) {

        int[] extended = new int[this.source.length + 1];

        for (int i = 0; i < this.source.length ; i++) {
            this.source[i] = i;
            extended[i] = this.source[i];
        }
        extended[extended.length - 1] = member;
        this.length = extended.length;

        return extended;
    }
}
