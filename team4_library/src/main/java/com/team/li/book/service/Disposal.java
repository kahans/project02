package com.team.li.book.service;

public class Disposal {
	private int disposalNo;
	private int bookCode;
	private String disposalBookber;
	private String disposalAuthor;
	private int genroNo;
	private String disposalPublisher;
	private String disposalRegisterDay;
	
	public int getDisposalNo() {
		return disposalNo;
	}
	public void setDisposalNo(int disposalNo) {
		this.disposalNo = disposalNo;
	}
	public int getBookCode() {
		return bookCode;
	}
	public void setBookCode(int bookCode) {
		this.bookCode = bookCode;
	}
	public String getDisposalBookber() {
		return disposalBookber;
	}
	public void setDisposalBookber(String disposalBookber) {
		this.disposalBookber = disposalBookber;
	}
	public String getDisposalAuthor() {
		return disposalAuthor;
	}
	public void setDisposalAuthor(String disposalAuthor) {
		this.disposalAuthor = disposalAuthor;
	}
	public int getGenroNo() {
		return genroNo;
	}
	public void setGenroNo(int genroNo) {
		this.genroNo = genroNo;
	}
	public String getDisposalPublisher() {
		return disposalPublisher;
	}
	public void setDisposalPublisher(String disposalPublisher) {
		this.disposalPublisher = disposalPublisher;
	}
	public String getDisposalRegisterDay() {
		return disposalRegisterDay;
	}
	public void setDisposalRegisterDay(String disposalRegisterDay) {
		this.disposalRegisterDay = disposalRegisterDay;
	}
	@Override
	public String toString() {
		return "Disposal [disposalNo=" + disposalNo + ", bookCode=" + bookCode + ", disposalBookber=" + disposalBookber
				+ ", disposalAuthor=" + disposalAuthor + ", genroNo=" + genroNo + ", disposalPublisher="
				+ disposalPublisher + ", disposalRegisterDay=" + disposalRegisterDay + "]";
	}
	
}
