package com.team.li.library.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.team.li.library.controller.LibraryDao;

@Service
public class LibraryServiceImpl implements LibraryService{
	private static final Logger logger = LoggerFactory.getLogger(LibraryServiceImpl.class);
	@Autowired
	private LibraryDao libraryDao;
	
	@Override
	public int LibraryAdd(Library library) {
		// TODO Auto-generated method stub
		return libraryDao.LibraryInsert(library);
	}

	@Override
	public Library LibraryLogin(Library library) {
		logger.info(library.toString());
		return libraryDao.loginSign(library);
	}

	@Override
	public int memberAdd(Member member) {
		logger.info(member.toString());
		return libraryDao.memberAdd(member);
	}

}
