package com.team.li.book.controller;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.team.li.book.service.BookService;
import com.team.li.book.service.Books;
import com.team.li.book.service.Disposal;
import com.team.li.book.service.Rental;

@Controller
public class BookController {
	private static final Logger logger = LoggerFactory.getLogger(BookController.class);
	
	@Autowired
	private BookService bookService;
	
	//책등록GET
	@RequestMapping(value="/bookAdd",method=RequestMethod.GET)
	public String bookAdd(){
		return "/view/bookRegister";
	}
	//책등록POST
	@RequestMapping(value="/bookAdd", method=RequestMethod.POST)
	public String bookAdd(Books books){
		bookService.bookAdd(books);
		return "redirect:/mainhome";
	}
	//도서폐기GET 폼을 불러온다.
	@RequestMapping(value="/bookDis", method=RequestMethod.GET)
	public String bookDis(){		
		
		return "/view/bookDisposal";
	}
	//도서폐기POST 
	@RequestMapping(value="/bookDis", method=RequestMethod.POST)
	public String bookDis(Disposal disposal){
		logger.info(disposal.toString());
		bookService.bookDis(disposal);
		return "redirect:/mainhome";
	}
	//도서 대여 GET
	@RequestMapping(value="/rentbook", method=RequestMethod.GET)
	public String rentbook(){
		return "/view/bookRent";
	}
	//도서 대여 POST
	@RequestMapping(value="/rentbook",method=RequestMethod.POST)
	public String rentbook(Rental rental){
		logger.info(rental.toString());
		bookService.bookRental(rental);
		return "redirect:/mainhome";
	}
	//도서반납조회 GET
	@RequestMapping(value="/bookReturnCheck", method=RequestMethod.GET)
	public String returnSeachBook(){
		return "/view/bookSeachReturn";
	}
	//도서반납조회 POST
	@RequestMapping(value="/bookReturnCheck",method=RequestMethod.POST)
	public String returnSeachBook(Rental rental, Model model){
		logger.info(model.toString());
		
		Rental returnMap = bookService.returnSeachBook(rental);
			
		logger.info(rental.toString());
		model.addAttribute("book",returnMap);
		
		return "/view/bookReturn";
	}
	//도서반납 GET
	@RequestMapping(value="/bookReturn", method=RequestMethod.GET)
	public String returnBook(){
		return "/view/bookReturn";
	}
	//도서반납 POST
	@RequestMapping(value="/bookReturn",method=RequestMethod.POST)
	public String returnBook(Rental rental){
		logger.info(rental.toString());
		
		bookService.bookReturn(rental);			
		
		return "redirect:/mainhome";
	}
	//도서 목록 
	@RequestMapping(value="/bookList")
	public String boardList(Model model,
			@RequestParam(value="currentPage", defaultValue="1") int currentPage){
		Map<String, Object> returnMap
		 = bookService.getBoardListPerCurrentPage(currentPage);
		model.addAttribute("totalRowCount", returnMap.get("totalRowCount"));
		model.addAttribute("currentPage",currentPage);
		model.addAttribute("lastPage", returnMap.get("lastPage"));
		model.addAttribute("list", returnMap.get("list"));

		return "/view/bookList";
	}
	
}
