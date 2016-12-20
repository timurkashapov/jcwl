package com.timurkashapov.jwl.collections;


/**
 * Native ordered array of integers.
 */
public class OrderedArray {

	private int[] source;
	private int lenght;

	/**
	 * Empty constructor.
	 */
	public OrderedArray() {
		// TO-DO
	}

	/**
	 * constructor.
	 */
	public OrderedArray(final int lenght) {
		this.lenght = lenght;
		this.source = new int[this.lenght];
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
	 * Get the lenght of ordered array of integers.
	 */ 
	public int getSize() {
		return this.lenght;
	}
}