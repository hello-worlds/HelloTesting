package com.richasdy.HelloTesting.JUnit.Hamcrest;

import org.junit.Test;

import com.richasdy.HelloTesting.JUnit.Book;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.Matchers.hasProperty;
import static org.junit.Assert.assertThat;

// Class Property always failed
public class TestClassProperty {
	// Single Object
	@Test
	public void testClassProperty() {

		Book obj = new Book("Mkyong in Action");

		assertThat(obj, hasProperty("name"));

		assertThat(obj, hasProperty("name", is("Mkyong in Action")));

	}

	// List Objects
	@Test
	public void testClassPropertyInList() {

		List<Book> list = Arrays.asList(new Book("Java in Action"), new Book("Spring in Action"));

		assertThat(list, containsInAnyOrder(hasProperty("name", is("Spring in Action")),
				hasProperty("name", is("Java in Action"))));

	}
}
