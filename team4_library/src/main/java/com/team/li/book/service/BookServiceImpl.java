package com.team.li.book.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.team.li.book.controller.BookDao;

@Service
public class BookServiceImpl implements BookService {
	private static final Logger logger = LoggerFactory.getLogger(BookServiceImpl.class);
	@Autowired
	private BookDao bookDao;
	
	@Override
	public int bookAdd(Books books) {
		// TODO Auto-generated method stub
		return bookDao.bookInsert(books);
	}
	@Override
	public int bookDis(Disposal disposal) {
		// TODO Auto-generated method stub
		logger.info(disposal.toString());
		logger.debug("service : "); 
		return bookDao.bookDisList(disposal);
	}
	@Override
	public int bookRental(Rental rental) {
		// TODO Auto-generated method stub
		return bookDao.bookRental(rental);
	}

	@Override
	public Rental bookReturn(Rental rental) {
		// TODO Auto-generated method stub
		return bookDao.bookReturn(rental);
	}

}
