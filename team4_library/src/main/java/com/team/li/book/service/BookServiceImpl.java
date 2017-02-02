package com.team.li.book.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.team.li.book.controller.BookDao;

@Service
public class BookServiceImpl implements BookService {
	private static final Logger logger = LoggerFactory.getLogger(BookServiceImpl.class);
	@Autowired
	private BookDao bookDao;
	
	@Override
	public int bookAdd(Books books) {
		// TODO Auto-generated method stub
		return bookDao.bookInsert(books);
	}
	@Override
	public int bookDis(Disposal disposal) {
		// TODO Auto-generated method stub
		logger.info(disposal.toString());
		logger.debug("service : "); 
		return bookDao.bookDisList(disposal);
	}
	@Override
	public int bookRental(Rental rental) {
		// TODO Auto-generated method stub
		return bookDao.bookRental(rental);
	}

	@Override
	public Rental returnSeachBook(Rental rental) {
		// TODO Auto-generated method stub
		return bookDao.returnSeachBook(rental);
	}
	@Override
	public int bookReturn(Rental rental) {
		// TODO Auto-generated method stub
		return bookDao.bookReturn(rental);
	}
	@Override
	public Map<String, Object> getBoardListPerCurrentPage(int currentPage) {
		//pagePerRow, beginRow
				int pagePerRow =10;
				int beginRow = (currentPage-1)*pagePerRow;
				
				//totalCount
				int totalRowCount = bookDao.selectTotalBoardCount();
				
				//lastPage
				int lastPage = totalRowCount/pagePerRow;
		        if(totalRowCount%pagePerRow != 0) {
		            lastPage++;
		        }
				
		        //boardList
		        Map<String, Integer> map = new HashMap<String, Integer>();
		        map.put("beginRow", beginRow);
		        map.put("pagePerRow", pagePerRow);
				List<Books> list = bookDao.bookBoardList(map);
				
				Map<String, Object> returnMap = new HashMap<String, Object>();
				returnMap.put("totalRowCount", totalRowCount);
				returnMap.put("lastPage", lastPage);
				returnMap.put("list", list);
				
				return returnMap;
	}

}
