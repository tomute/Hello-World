package com.example;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TravisSampleTest
{

    TravisSample sut;

    @Before
    public void setUp()
    {
        sut = new TravisSample();
    }

    @Test
    public void testAdd()
    {
        assertThat(sut.add(5, 2), is(7));
    }

    @Test
    public void testSubtract()
    {
        assertThat(sut.subtract(4, 2), is(2));
    }

}
