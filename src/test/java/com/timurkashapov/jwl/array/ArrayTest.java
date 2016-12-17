package com.timurkashapov.jwl.array;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Test the array wrapper
 * @author Timur Kashapov
 */
public class ArrayTest {

    @Test
    public void testInsert() {

        Array array = new Array(10);

        array.insert(12);
        array.insert(50);
        array.insert(20);
        array.insert(34);

        assertEquals(14, array.length);

        System.out.println(array.toString());
    }

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
}
