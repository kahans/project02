package com.team.li.book.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.team.li.book.service.BookService;
import com.team.li.book.service.Books;

@Controller
public class BookController {
	private static final Logger logger = LoggerFactory.getLogger(BookController.class);
	
	@Autowired
	private BookService bookService;
	
	@RequestMapping(value="/bookAdd",method=RequestMethod.GET)
	public String bookAdd(){
		return "/view/bookRegister";
	}
	@RequestMapping(value="/bookAdd", method=RequestMethod.POST)
	public String bookAdd(Books books){
		bookService.bookAdd(books);
		return "redirect:/mainhome";
	}
	
}
