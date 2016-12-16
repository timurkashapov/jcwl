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

        assertEquals(11, array.length);
    }

    @Test
    public void testGet() {
        //TO-DO
    }

    @Test
    public void testRemove() {
        // TO-DO
    }
}
