package com.timurkashapov.jwl.algorithms;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Timur Kashapov
 */
public class ComparatorTest {
    @Test
    public void compare() throws Exception {

        System.out.println(Comparator.compare(26.125f, 26.125f));
        Comparator.getHexOf('b');
    }

}