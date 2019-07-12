package com.stackroute.pe1;

import org.junit.*;

import static org.junit.Assert.*;

public class JunitDemoTest {
    JunitDemo junitDemo;

    @Before
    public void setup() {
        System.out.println("Inside Before");
        this.junitDemo = new JunitDemo();
    }

    @After
    public void tearDown() {
        System.out.println("Inside After");
    }

    @BeforeClass
    public static void beforeClass() {
        System.out.println("before class");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("After Class");
    }


    @Test
    public void givenTwoStringShouldReturnConcatedUpperString() {
        //act
        String actualResult = junitDemo.concatAndUpperCase("hello", "world");
        //assert
        assertNotNull(actualResult);
        assertEquals("HELLOWORLD", actualResult);

    }

    @Test
    public void givenAStringAndNullShouldReturnErrorMessage() {
        //act
        String actualResult = junitDemo.concatAndUpperCase("hello", null);
        //assert
        assertNotNull(actualResult);
        assertEquals("Null Value Not Allowed", actualResult);

    }
//    @Test
//    public void GivenStringShouldReturnTheReverse()
//    {
//        String actualResult=junitDemo.reverseString("hello");
//        //assert
//        assertEquals("olleH",actualResult);
//    }

}