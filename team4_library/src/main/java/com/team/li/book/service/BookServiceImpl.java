package com.team.li.book.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.team.li.book.controller.BookDao;

@Service
public class BookServiceImpl implements BookService {

	@Autowired
	private static BookDao bookDao;
	@Override
	public int bookAdd(Books books) {
		// TODO Auto-generated method stub
		return bookDao.bookInsert(books);
	}

}
