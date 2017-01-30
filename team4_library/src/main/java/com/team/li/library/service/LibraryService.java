package com.team.li.library.service;

public interface LibraryService {
	//도서관 등록(관리자 가입)
	public int LibraryAdd(Library library);
	//도서관 관리자 로그인
	public Library LibraryLogin(Library library);
	//맴버 가입
	public int memberAdd(Member member);
	
}
