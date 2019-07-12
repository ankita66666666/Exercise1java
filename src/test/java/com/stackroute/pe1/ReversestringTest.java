
package com.stackroute.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReversestringTest {

    Reversestring reversestring;

    @Before
    public void setUp() throws Exception {
        reversestring = new Reversestring();
    }

    @After
    public void tearDown() throws Exception {
        reversestring = null;
    }

    @Test
    public void stringReverse() {
        String result = reversestring.stringReverse("london");
        assertEquals("nodnol", result);
    }
}