package com.timurkashapov.jwl.collections;

import com.timurkashapov.jwl.algorithms.BubbleSort;
import com.timurkashapov.jwl.api.utils.Generatable;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Test the array wrapper.
 * @author Timur Kashapov
 */
public class ArrayTest implements Generatable {

    @Test
    public void testSet() {

        Array array = new Array(5);

        array.set(0, 101);
        array.set(1, 1341);
        array.set(2, 1);
        array.set(3, 10);
        array.set(4, 1566);
    }

    @Test
    public void testGet() {

        Array array = new Array(5);

        array.get(0);
        array.get(1);
        array.get(2);
        array.get(3);
        array.get(4);

    }

    @Test
    public void testAdd() {

        Array array = new Array(10);

        array.add(12);
        array.add(0);
        array.add(-120);
        array.add(19);
        array.add(1900000);
        array.add(50);
        array.add(-5550);
        array.add(2);
        array.add(2);
        array.add(34);

        assertEquals(20, array.length);

        System.out.println(array.toString());
    }

    @Test
    public void testFind() {

        Array array = new Array(50);

        for (int i = 0; i < 50; i++) {
            array.add(Generatable.RANDOM.nextInt(100));
        }

        System.out.printf("\nSize is: %d", array.length);
        System.out.printf("\nArray:  %s", array.toString());

        array = BubbleSort.sort(array);

        System.out.printf("\nSorted : %s", array.toString());

        assertTrue("\nElement not find", array.find(55));
        System.out.printf("\nElement find - %d", 55);

    }

    @Test
    public void testRemove() {

        Array array = new Array(6);

        array.set(0, 1);
        array.set(1, 541);
        array.set(2, 1);
        array.set(3, 10);
        array.set(4, 196);
        array.set(5, 69);

        System.out.printf("\n%s",array.toString());

        array.remove(10);

        System.out.printf("\n%s", array.toString());

    }

    @Override
    public void generate() {
        // TO-DO
    }
}
