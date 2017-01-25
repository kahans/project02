package com.team.li.book.controller;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.team.li.book.service.Books;

@Repository
public class BookDaoImpl implements BookDao{

	@Autowired
	private static SqlSessionTemplate sql;
	@Override
	public int bookInsert(Books books) {
		// TODO Auto-generated method stub
		return sql.insert("book.bookInsert", books);
	}

}
