package com.team.li.book.service;

public interface BookService {
	//도서 등록
	public int bookAdd(Books books);
	//도서 폐기
	public int bookDis(Disposal disposal);
	//도서 대여
	public int bookRental(Rental rental);
	//도서 반납
	public Rental bookReturn(Rental rental);
	
}
