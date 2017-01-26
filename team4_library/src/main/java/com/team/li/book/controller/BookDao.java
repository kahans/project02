package com.team.li.book.controller;

import com.team.li.book.service.Books;
import com.team.li.book.service.Disposal;
import com.team.li.book.service.Rental;

public interface BookDao {
	public int bookInsert(Books books);
	public int bookDisList(Disposal disposal);
	public int bookRental(Rental rental);
	public Rental bookReturn(Rental rental);
}
