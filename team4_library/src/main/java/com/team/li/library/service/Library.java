package com.team.li.library.service;

public class Library {
	//도서관관리자 등록 객체
	private String libraryId;
	private String libraryPw;
	private int localNo;
	
	public String getLibraryId() {
		return libraryId;
	}
	public void setLibraryId(String libraryId) {
		this.libraryId = libraryId;
	}
	public String getLibraryPw() {
		return libraryPw;
	}
	public void setLibraryPw(String libraryPw) {
		this.libraryPw = libraryPw;
	}
	public int getLocalNo() {
		return localNo;
	}
	public void setLocalNo(int localNo) {
		this.localNo = localNo;
	}
	@Override
	public String toString() {
		return "Library [libraryId=" + libraryId + ", libraryPw=" + libraryPw + ", localNo=" + localNo + "]";
	}
	
	
}
