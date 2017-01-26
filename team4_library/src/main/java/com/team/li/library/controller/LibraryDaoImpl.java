package com.team.li.library.controller;

import org.mybatis.spring.SqlSessionTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.team.li.library.service.Library;
import com.team.li.library.service.Member;

@Repository
public class LibraryDaoImpl implements LibraryDao{
	private static final Logger logger = LoggerFactory.getLogger(LibraryDaoImpl.class);
	
	@Autowired
	private SqlSessionTemplate sqlSession;
	
	private final String Library_NS="library.";
	
	@Override
	public int LibraryInsert(Library library) {
		
		return sqlSession.insert(Library_NS+"libraryInsert", library);
	}

	@Override
	public String loginSign(Library library) {
		logger.info(library.toString());
		return sqlSession.selectOne("library.librarylogin", library);
	}

	@Override
	public int memberAdd(Member member) {
		// TODO Auto-generated method stub
		return sqlSession.insert(Library_NS+"memberAdd", member);
	}

}
