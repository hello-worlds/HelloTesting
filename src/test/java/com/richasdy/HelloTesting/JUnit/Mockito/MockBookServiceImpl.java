package com.richasdy.HelloTesting.JUnit.Mockito;

import java.util.ArrayList;
import java.util.List;

//I am a mock object!
import com.richasdy.HelloTesting.JUnit.model.Book;

public class MockBookServiceImpl implements BookService{
	
	 @Override
	    public List<Book> findBookByAuthor(String author) {
	        List<Book> books = new ArrayList<>();

	        if ("mkyong".equals(author)) {
	            books.add(new Book("mkyong in action"));
	            books.add(new Book("abc in action"));
	            books.add(new Book("bot"));
	        }

	        return books;
	    }

	    //implements other methods...

}
