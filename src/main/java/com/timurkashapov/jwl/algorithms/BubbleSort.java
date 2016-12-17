package com.timurkashapov.jwl.algorithms;

import com.timurkashapov.jwl.collections.Array;

import java.util.Arrays;

/**
 * @author Timur Kashapov
 */
public final class BubbleSort {

    /*
     * Constants
     */

    private static final String BOBBLE_SORT_TITLE = "BOBBLE SORT";

    /*
     * Constructors
     */

    /**
     * Empty constructor.
     */
    BubbleSort(){}

    /*
     * main()
     */

    public static void main(final String[] args) {

        final Integer[] data = new Integer[]{10, 0, 5, -55, 6, 100, -6};

        System.out.println(Arrays.toString(data));

        sort(data);
    }

    /*
     * Logic methods
     */

    /**
     * QuickSort algorithm for array of integers.
     * Сортировка для массива целых чисел.
     * @param data array
     * @return sort array
     */
    public static Integer[] sort(final Integer[] data) {

        for (int i = data.length - 1; i > 0; i--) {

            for (int j = 0; j < i; j++) {

                if (data[j] > data[j + 1]) {

                    swap(data, j, j + 1);

                }
            }
        }

        return data;
    }

    /**
     * QuickSort algorithm for array of floats.
     * Сортировка для массива вещественных чисел.
     * @param data array
     * @return sort array
     */
    public static Float[] sort(final Float[] data) {

        for (int i = data.length; i > 0; i--) {

            for (int j = 0; j < i; j++) {

                if (data[j] > data[j + 1]) {
                    final float temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                }
            }
        }

        return data;
    }

    /**
     * Swap the current members
     * Меняем местами указанные члены массива
     * @param data data
     * @param first index
     * @param second index
     */
    public static void swap(final Integer[] data, final Integer first, final Integer second) {
        final int temp = data[first];
        data[first] = data[second];
        data[second] = temp;
    }

    public static Array<Integer> sort(Array<Integer> array) {

        return array;
    }
}
