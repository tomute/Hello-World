package com.example;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class TravisSampleTest
{
    @Test
    public void testAdd()
    {
        TravisSample sut = new TravisSample();
        assertThat(sut.add(4, 2), is(6));
    }
}
