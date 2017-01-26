package com.team.li.book.service;

public class Books {
	private int bookCode;
	private String libraryId;
	private int stateNo;
	private int rentalstateNo;
	private int genreNo;
	private String bookName;
	private String bookAuthor;
	private String bookPublisher;
	private String bookFirstday;
	private int bookTotalDay;
	private int bookTotalCount;
	public int getBookCode() {
		return bookCode;
	}
	public void setBookCode(int bookCode) {
		this.bookCode = bookCode;
	}
	public String getLibraryId() {
		return libraryId;
	}
	public void setLibraryId(String libraryId) {
		this.libraryId = libraryId;
	}
	public int getStateNo() {
		return stateNo;
	}
	public void setStateNo(int stateNo) {
		this.stateNo = stateNo;
	}
	public int getRentalstateNo() {
		return rentalstateNo;
	}
	public void setRentalstateNo(int rentalstateNo) {
		this.rentalstateNo = rentalstateNo;
	}
	public int getGenreNo() {
		return genreNo;
	}
	public void setGenreNo(int genreNo) {
		this.genreNo = genreNo;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getBookAuthor() {
		return bookAuthor;
	}
	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}
	public String getBookPublisher() {
		return bookPublisher;
	}
	public void setBookPublisher(String bookPublisher) {
		this.bookPublisher = bookPublisher;
	}
	public String getBookFirstday() {
		return bookFirstday;
	}
	public void setBookFirstday(String bookFirstday) {
		this.bookFirstday = bookFirstday;
	}
	public int getBookTotalDay() {
		return bookTotalDay;
	}
	public void setBookTotalDay(int bookTotalDay) {
		this.bookTotalDay = bookTotalDay;
	}
	public int getBookTotalCount() {
		return bookTotalCount;
	}
	public void setBookTotalCount(int bookTotalCount) {
		this.bookTotalCount = bookTotalCount;
	}
	@Override
	public String toString() {
		return "Books [bookCode=" + bookCode + ", libraryId=" + libraryId + ", stateNo=" + stateNo + ", rentalstateNo="
				+ rentalstateNo + ", genreNo=" + genreNo + ", bookName=" + bookName + ", bookAuthor=" + bookAuthor
				+ ", bookPublisher=" + bookPublisher + ", bookFirstday=" + bookFirstday + ", bookTotalDay="
				+ bookTotalDay + ", bookTotalCount=" + bookTotalCount + "]";
	}
	
	
}
