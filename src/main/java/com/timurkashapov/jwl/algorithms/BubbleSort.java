package com.timurkashapov.jwl.algorithms;

import com.timurkashapov.jwl.collections.Array;

/**
 * Classic bubble sort algorithms.
 *
 * @author Timur Kashapov
 */
public final class BubbleSort {

    /**
     * Title of algorithm.
     */
    private static final String TITLE = "BOBBLE SORT";

    /**
     * Empty constructor.
     */
    public BubbleSort() {
    }

    /**
     * QuickSort algorithm for array of integers.
     * Сортировка для массива целых чисел.
     *
     * @param array array
     * @return sort array
     */
    public static int[] sort(final int[] array) {

        for (int i = array.length - 1; i > 0; i--) {

            for (int j = 0; j < i; j++) {

                if (array[j] > array[j + 1]) {

                    BubbleSort.swap(array, array[j], array[j + 1]);

                }
            }
        }

        return array;
    }

    /**
     * QuickSort algorithm for array of floats.
     * Сортировка для массива вещественных чисел.
     *
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
     * QuickSort algorithm for array of integers.
     * Сортировка для массива целых чисел.
     *
     * @param array array
     * @return array
     */
    public static Array sort(final Array array) {

        for (int i = array.length - 1; i > 0; i--) {

            for (int j = 0; j < i; j++) {

                if (array.get(j) > array.get(j + 1)) {

                    swap(array, j, j + 1);

                }
            }
        }

        return array;
    }

    /**
     * Swap the current members.
     * Меняем местами указанные члены массива.
     *
     * @param array  array
     * @param first  index
     * @param second index
     */
    public static void swap(final int[] array, final int first, final int second) {

        final int temp = array[first];
        array[first] = array[second];
        array[second] = temp;

    }

    /**
     * Swap the current members.
     * Меняем местами указанные члены массива.
     *
     * @param array  array
     * @param first  index
     * @param second index
     */
    public static void swap(final Array array, final Integer first, final Integer second) {

        final int temp = array.get(first);
        array.set(first, array.get(second));
        array.set(second, temp);

    }
}
