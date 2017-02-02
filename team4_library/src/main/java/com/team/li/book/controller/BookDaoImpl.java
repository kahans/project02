package com.team.li.book.controller;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.team.li.book.service.Books;
import com.team.li.book.service.Disposal;
import com.team.li.book.service.Rental;

@Repository
public class BookDaoImpl implements BookDao{
	private static final Logger logger = LoggerFactory.getLogger(BookDaoImpl.class);
	@Autowired
	private SqlSessionTemplate sql;
	
	private final String BOOKs_NS="book.";
	@Override
	public int bookInsert(Books books) {
		// TODO Auto-generated method stub
		logger.info(books.toString());
		return sql.insert(BOOKs_NS+"bookInsert", books);
	}
	@Override
	public int bookDisList(Disposal disposal) {
		// TODO Auto-generated method stub
		logger.info(disposal.toString());
		logger.debug("ddd : "+disposal);
		return sql.insert(BOOKs_NS+"bookDis", disposal);
	}
	@Override
	public int bookRental(Rental rental) {
		// TODO Auto-generated method stub
		return sql.insert(BOOKs_NS+"rentbook", rental);
	}
	@Override
	public Rental returnSeachBook(Rental rental) {
		// TODO Auto-generated method stub
		return sql.selectOne(BOOKs_NS+"bookReturnCheck", rental);
	}
	@Override
	public int bookReturn(Rental rental) {
		// TODO Auto-generated method stub
		return sql.update(BOOKs_NS+"bookReturn", rental);
	}
	@Override
	public List<Books> bookBoardList(Map<String, Integer> map) {
		// TODO Auto-generated method stub
		return sql.selectList(BOOKs_NS+"bookList", map);
	}
	@Override
	public int selectTotalBoardCount() {
		// TODO Auto-generated method stub
		return sql.selectOne(BOOKs_NS+"bookCount");
	}


}
