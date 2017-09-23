package com.mycompany.app;
import java.util.*;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    public void testFound() {
      ArrayList<String> array = new ArrayList<>(Arrays.asList("ahmet", "ayse", "mehmet", "ahmet"));
      assertTrue(new App().search(array, "ahmet",2));
    }

    public void testNotFound() {
      ArrayList<String> array = new ArrayList<>(Arrays.asList("ahmet", "ayse", "mehmet", "fatma"));
      assertFalse(new App().search(array, "murat",2));
    }

    public void testNotEnoughTime() {
      ArrayList<String> array = new ArrayList<>(Arrays.asList("ahmet", "ayse", "mehmet", "fatma"));
      assertFalse(new App().search(array,"ahmet" ,3));
    }

    public void testNull() {
      assertFalse(new App().search(null,"a", 1));
    }
    public void testNegative() {
      ArrayList<String> array = new ArrayList<>(Arrays.asList("ahmet", "ayse", "mehmet", "fatma"));
      assertFalse(new App().search(array, "murat",-2));
    }

    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
}
