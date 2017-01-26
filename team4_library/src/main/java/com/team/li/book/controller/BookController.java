package com.team.li.book.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.team.li.book.service.BookService;
import com.team.li.book.service.Books;
import com.team.li.book.service.Disposal;
import com.team.li.book.service.Rental;

@Controller
public class BookController {
	private static final Logger logger = LoggerFactory.getLogger(BookController.class);
	
	@Autowired
	private BookService bookService;
	
	//책등록
	@RequestMapping(value="/bookAdd",method=RequestMethod.GET)
	public String bookAdd(){
		return "/view/bookRegister";
	}
	@RequestMapping(value="/bookAdd", method=RequestMethod.POST)
	public String bookAdd(Books books){
		bookService.bookAdd(books);
		return "redirect:/mainhome";
	}
	//도서폐기
	@RequestMapping(value="/bookDis", method=RequestMethod.GET)
	public String bookDis(){		
		
		return "/view/bookDisposal";
	}
	@RequestMapping(value="/bookDis", method=RequestMethod.POST)
	public String bookDis(Disposal disposal){
		logger.info(disposal.toString());
		bookService.bookDis(disposal);
		return "redirect:/mainhome";
	}
	//도서 대여
	@RequestMapping(value="/rentbook", method=RequestMethod.GET)
	public String rentbook(){
		return "/view/bookRent";
	}
	
	@RequestMapping(value="/rentbook",method=RequestMethod.POST)
	public String rentbook(Rental rental){
		logger.info(rental.toString());
		bookService.bookRental(rental);
		return "redirect:/mainhome";
	}
	//도서반납
	@RequestMapping(value="/returnbook", method=RequestMethod.GET)
	public String returnBook(){
		return "/view/bookReturn";
	}
	
	@RequestMapping(value="/returnbook",method=RequestMethod.POST)
	public String returnBook(Rental rental, Model model){
		logger.info(model.toString());

		Rental returnMap = bookService.bookReturn(rental);
		logger.info(rental.toString());
		model.addAttribute("book",returnMap);
		
		return "/view/bookReturn";
	}
	
}
