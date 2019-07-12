package com.stackroute.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringrepeatTest {

    Stringrepeat stringrepeat;

    @Before
    public void setUp() throws Exception {
        stringrepeat = new Stringrepeat();
    }

    @After
    public void tearDown() throws Exception {
        stringrepeat = null;
    }

    @Test
    public void givenNStringAndNumberShouldReturnString() {
        String result = stringrepeat.repeat("Hello",2);
        assertEquals("Hellololo", result);
    }

}