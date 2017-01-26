package com.team.li.book.service;

public class Rental {
	private int rentalCode;
	private int bookCode;
	private String rDStrat;//대여 시작일
	private String rDEnd;//대여 종료일
	private int memberId;//회원아이디
	private int rentalPay;
	private int rentalstateNo;//대여상태 여부
	private String bookName;
	private String mName;
	private String rentalState;
	
	public String getRentalState() {
		return rentalState;
	}
	public void setRentalState(String rentalState) {
		this.rentalState = rentalState;
	}
	
	
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getmName() {
		return mName;
	}
	public void setmName(String mName) {
		this.mName = mName;
	}
	public int getRentalCode() {
		return rentalCode;
	}
	public void setRentalCode(int rentalCode) {
		this.rentalCode = rentalCode;
	}
	public int getBookCode() {
		return bookCode;
	}
	public void setBookCode(int bookCode) {
		this.bookCode = bookCode;
	}
	public String getrDStrat() {
		return rDStrat;
	}
	public void setrDStrat(String rDStrat) {
		this.rDStrat = rDStrat;
	}
	public String getrDEnd() {
		return rDEnd;
	}
	public void setrDEnd(String rDEnd) {
		this.rDEnd = rDEnd;
	}
	public int getMemberId() {
		return memberId;
	}
	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}
	public int getRentalPay() {
		return rentalPay;
	}
	public void setRentalPay(int rentalPay) {
		this.rentalPay = rentalPay;
	}
	public int getRentalstateNo() {
		return rentalstateNo;
	}
	public void setRentalstateNo(int rentalstateNo) {
		this.rentalstateNo = rentalstateNo;
	}
	@Override
	public String toString() {
		return "Rental [rentalCode=" + rentalCode + ", bookCode=" + bookCode + ", rDStrat=" + rDStrat + ", rDEnd="
				+ rDEnd + ", memberId=" + memberId + ", rentalPay=" + rentalPay + ", rentalstateNo=" + rentalstateNo
				+ "]";
	}
	
	
}
