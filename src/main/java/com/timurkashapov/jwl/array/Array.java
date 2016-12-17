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

    }

    /**
     * One argument constructor.
     */
    public Array(final int length) {
        this.length = length;
        this.source = new int[this.length];

        for (int i = 0; i < this.length; i++) {
            this.source[i] = i;
        }
    }

    /**
     * Set the element to index place.
     * @param index index
     * @param element member
     */
    public void set(final int index, final int element) {
        this.source[index] = element;
    }

    /**
     * Get the element from array.
     */
    public int get(final int index) {
        return this.source[index];
    }

    /**
     * Insert the element to the end of the array.
     * @param element member
     * @return extended array
     */
    public int[] insert(final int element) {

        int[] extended = new int[this.length + 1];

        for (int i = 0; i < this.length ; i++) {
            extended[i] = this.source[i];
        }

        extended[extended.length - 1] = element;
        this.length++;
        this.source = extended;

        return this.source;
    }

    /**
     * Remove the element from array.
     */
    public void remove(final int element) {

        int i;

        for (i = 0; i < this.length; i++) {
            if (this.source[i] == element) {
                System.out.printf("\nFind %d", this.source[i]);
                break;
            }
        }

        this.length--;

        for (int j = i; j < this.length; j++) {
            this.source[j] = this.source[j + 1];
        }
    }

    /**
     * Print the array.
     * @return array
     */
    @Override
    public String toString() {

        String s = "";

        for (int i = 0; i < this.length; i++) {
            s = new StringBuilder(s).append(this.source[i]).append(" ").toString();
        }

        return s;
    }
}
