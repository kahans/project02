package com.team.li.book.controller;

import java.util.List;
import java.util.Map;

import com.team.li.book.service.Books;
import com.team.li.book.service.Disposal;
import com.team.li.book.service.Rental;

public interface BookDao {
	public int bookInsert(Books books);
	public int bookDisList(Disposal disposal);
	public int bookRental(Rental rental);
	public Rental returnSeachBook(Rental rental);
	public int bookReturn(Rental rental);
	//도서 목록
	List<Books> bookBoardList(Map<String, Integer> map);
	//도서 전체 갯수
	public int selectTotalBoardCount();
}
