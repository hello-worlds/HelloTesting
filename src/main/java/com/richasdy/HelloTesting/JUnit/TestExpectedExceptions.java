package com.richasdy.HelloTesting.JUnit;

import org.junit.Test;

import static org.junit.Assert.fail;

import java.util.ArrayList;

public class TestExpectedExceptions {
	@Test(expected = ArithmeticException.class)
    public void testDivisionWithException() {
        int i = 1 / 0;
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testEmptyList() {
        new ArrayList<Object>().get(0);
    }

    @Test
    public void testDivisionWithExceptionTryCatchAlwaysFail() {
        try {
            int i = 1 / 0;
            fail(); //remember this line, else 'may' false positive
        } catch (ArithmeticException e) {
            assertThat(e.getMessage(), is("/ by zero"));
			//assert others
        }
    }
    
    @Test
    public void testEmptyListTryCatchAlwaysFail() {
        try {
            new ArrayList<Object>().get(0);
            fail();
        } catch (IndexOutOfBoundsException e) {
            assertThat(e.getMessage(), is("Index: 0, Size: 0"));
        }
    }

}
