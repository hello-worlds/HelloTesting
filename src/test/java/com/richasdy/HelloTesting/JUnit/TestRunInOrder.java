package com.richasdy.HelloTesting.JUnit;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

//Sorts by method name
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestRunInOrder {
	@Test
	public void testB() {

		assertThat(1 + 1, is(2));

	}

	@Test
	public void test1() {

		assertThat(1 + 1, is(2));

	}

	@Test
	public void testA() {

		assertThat(1 + 1, is(2));

	}

	@Test
	public void test2() {

		assertThat(1 + 1, is(2));

	}

	@Test
	public void testC() {

		assertThat(1 + 1, is(2));

	}
}
