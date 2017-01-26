package com.team.li.library.controller;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.team.li.library.service.Library;
import com.team.li.library.service.LibraryService;
import com.team.li.library.service.Member;

@Controller
public class LibraryController {
	// info, debug로 통해서 경로에 따라 잘 실행되고 있는지 확인
	private static final Logger logger = LoggerFactory.getLogger(LibraryController.class);

	@Autowired
	private LibraryService libraryService;

	// 도서관 등록
	@RequestMapping(value = "/libraryAdd", method = RequestMethod.GET)
	public String libraryAdd() {
		return "/view/libraryJoin";
	}

	@RequestMapping(value = "/libraryAdd", method = RequestMethod.POST)
	public String libraryAdd(Library library) {
		// LibraryService에 있는 메소드를 실행한다.

		logger.info(library.toString());
		libraryService.LibraryAdd(library);
		logger.debug("add : ");
		return "redirect:/login";

	}

	// 로그인
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String loginSign() {
		return "/view/loginform";
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String loginSign(Library library, HttpSession session) {

		logger.info(library.toString());
		// session.setAttribute("LibraryLogin",library);
		libraryService.LibraryLogin(library);

		logger.debug("login : ");
		return "redirect:/mainhome";
	}

	// 회원 등록
	@RequestMapping(value = "/memberadd", method = RequestMethod.GET)
	public String memberAdd() {
		return "/view/memberJoin";
	}

	@RequestMapping(value = "/memberadd", method = RequestMethod.POST)
	public String memberAdd(Member member) {
		logger.info(member.toString());
		libraryService.memberAdd(member);
		return "redirect:/mainhome";
	}

}
