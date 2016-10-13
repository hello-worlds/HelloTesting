package com.richasdy.HelloTesting.JUnit.Hamcrest;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import com.richasdy.HelloTesting.JUnit.Category.PerformanceTests;
import com.richasdy.HelloTesting.JUnit.Category.RegressionTests;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class TestCategory3 {
	@Category({ PerformanceTests.class, RegressionTests.class })
	@Test
	public void test_c_1() {
		assertThat(1 == 1, is(true));
	}

	@Category(RegressionTests.class)
	@Test
	public void test_c_2() {
		assertThat(1 == 1, is(true));
	}

}
