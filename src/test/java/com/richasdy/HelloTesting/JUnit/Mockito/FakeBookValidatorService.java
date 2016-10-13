package com.richasdy.HelloTesting.JUnit.Mockito;

import com.richasdy.HelloTesting.JUnit.Book;

public class FakeBookValidatorService implements BookValidatorService {

	@Override
	public boolean isValid(Book book) {
		if (book == null)
			return false;

		if ("bot".equals(book.getName())) {
			return false;
		} else {
			return true;
		}

	}

}
