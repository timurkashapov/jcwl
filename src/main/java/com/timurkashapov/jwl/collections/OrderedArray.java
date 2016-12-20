package com.timurkashapov.jwl.collections;

import com.timurkashapov.jwl.algorithms.BubbleSort;

/**
 * Native ordered array of integers.
 */
public class OrderedArray {

	private int[] source;
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
		this.source = BubbleSort.sort(new int[this.length]);
	}

	public OrderedArray(final int[] data) {

		// create ordered array from mixed array of integers
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
}