package com.team.li.library.controller;


import com.team.li.library.service.Library;
import com.team.li.library.service.Member;

public interface LibraryDao {
	public int LibraryInsert(Library library);
	public String loginSign(Library library);
	public int memberAdd(Member member);
}
