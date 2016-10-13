package com.richasdy.HelloTesting.JUnit.Mockito;

import java.util.List;

import com.richasdy.HelloTesting.JUnit.Model.Book;

public class BookServiceImpl implements BookService {
	private BookDao bookDao;

	public BookDao getBookDao() {
		return bookDao;
	}

	public void setBookDao(BookDao bookDao) {
		this.bookDao = bookDao;
	}

	@Override
	public List<Book> findBookByAuthor(String name) {
		return bookDao.findBookByAuthor(name);
	}
}
