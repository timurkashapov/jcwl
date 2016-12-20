package com.timurkashapov.jwl.collections;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Timur Kashapov
 */
public class OrderedArrayTest {

    OrderedArray orderedArray;

    @Before
    public void createInstance() {
        orderedArray = new OrderedArray(new int[]{10, 52, -2, -0, -33333, -9989, 1});
    }

    @Test
    public void getArray() throws Exception {
        System.out.println(orderedArray.getArray());
    }

    @Test
    public void getSize() throws Exception {
        System.out.println(orderedArray.getSize());
    }

}