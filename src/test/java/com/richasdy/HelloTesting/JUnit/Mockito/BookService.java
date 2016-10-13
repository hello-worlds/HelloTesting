package com.richasdy.HelloTesting.JUnit.Mockito;

import java.util.List;

import com.richasdy.HelloTesting.JUnit.Model.Book;

public interface BookService {
	
	List<Book> findBookByAuthor(String author);

}
