package com.richasdy.HelloTesting.JUnit.Mockito;

import java.util.List;

import com.richasdy.HelloTesting.JUnit.Book;

public interface BookDao {
	
	List<Book> findBookByAuthor(String author);

}
