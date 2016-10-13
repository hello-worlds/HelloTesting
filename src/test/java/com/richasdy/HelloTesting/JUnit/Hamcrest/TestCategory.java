package com.richasdy.HelloTesting.JUnit.Hamcrest;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import com.richasdy.HelloTesting.JUnit.category.PerformanceTests;
import com.richasdy.HelloTesting.JUnit.category.RegressionTests;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

@Category({PerformanceTests.class, RegressionTests.class})
public class TestCategory {
	@Test
    public void test_b_1() {
        assertThat(1 == 1, is(true));
    }
}
