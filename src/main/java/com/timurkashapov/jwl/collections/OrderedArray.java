package com.timurkashapov.jwl.collections;

import com.timurkashapov.jwl.algorithms.BubbleSort;

/**
 * Native ordered array of integers.
 */
public class OrderedArray {

	/**
	 * Source array.
	 */
	private int[] source;

	/**
	 * Array length.
	 */
	private int length;

	/**
	 * Empty constructor.
	 */
	public OrderedArray() {
		// TO-DO
	}

	/**
	 * constructor.
	 */
	public OrderedArray(final int length) {
		this.length = length;
		this.source = new int[this.length];
	}

	public OrderedArray(final int[] data) {
		this.source = BubbleSort.sort(data);
		this.length = source.length;
	}

	/**
	 * Get the ordered array of integers.
	 */
	public int[] getArray() {
		return this.source;
	}

	/**
	 * Get the length of ordered array of integers.
	 */ 
	public int getSize() {
		return this.length;
	}

    @Override
    public String toString() {

	    String result = "";

        for (int i = 0; i < this.length; i++) {
            result = new StringBuilder(result).append(this.source[i]).append(" ").toString();
        }

        return result;
    }
}