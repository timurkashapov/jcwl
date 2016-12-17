package com.timurkashapov.jwl.collections;

/**
 * Array wrapper.
 * @author Timur Kashapov
 */
public final class Array<T>  {

    /**
     * Source collections.
     */
    private T[] source;

    /**
     * Length of source collections.
     */
    public Integer length;

    /**
     * Empty constructor.
     */
    public Array() {

    }

    /**
     * One argument constructor.
     */
    public Array(final Integer length) {
        this.length = length;
        this.source = (T[]) new Object[this.length];

        for (int i = 0; i < this.length; i++) {
            this.source[i] = (T) new Object();
        }
    }

    /**
     * Set the element to index place.
     * @param index index
     * @param element member
     */
    public void set(final int index, final T element) {
        this.source[index] = element;
    }

    /**
     * Get the element from collections.
     */
    public T get(final int index) {
        return this.source[index];
    }

    /**
     * Insert the element to the end of the collections.
     * @param element member
     * @return extended collections
     */
    public T[] insert(final T element) {

        T[] extended = (T[]) new Object[this.length + 1];

        for (int i = 0; i < this.length ; i++) {
            extended[i] = this.source[i];
        }

        extended[extended.length - 1] = element;
        this.length++;
        this.source = extended;

        return this.source;
    }

    /**
     * Remove the element from collections.
     */
    public void remove(final T element) {

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
     * Print the collections.
     * @return collections
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

