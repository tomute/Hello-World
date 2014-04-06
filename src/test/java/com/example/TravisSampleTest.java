package com.example;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class TravisSampleTest extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public TravisSampleTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( TravisSampleTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testAdd()
    {
        TravisSample sut = new TravisSample();
        assertEquals(5, sut.add(3, 2));
    }
}
