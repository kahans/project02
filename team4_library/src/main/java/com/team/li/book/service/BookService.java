package com.team.li.book.service;

import java.util.Map;

public interface BookService {
	//도서 등록
	public int bookAdd(Books books);
	//도서 폐기
	public int bookDis(Disposal disposal);
	//도서 대여
	public int bookRental(Rental rental);
	//도서 반납할 bookCode 조회
	public Rental returnSeachBook(Rental rental);
	//도서반납
	public int bookReturn(Rental rental);
	//도서목록
	public Map<String, Object> getBoardListPerCurrentPage(int currentPage);
	
}
