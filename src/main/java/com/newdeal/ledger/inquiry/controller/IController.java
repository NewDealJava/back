package com.newdeal.ledger.inquiry.controller;

import com.newdeal.ledger.inquiry.dto.InquiryDto;
import com.newdeal.ledger.inquiry.service.InquiryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;

@Controller

public class IController {
	@Autowired
	private InquiryService inquiryService;

	/**
	 * 문의 게시판 페이지
	 * 
	 * @return index 최창윤
	 */
	@GetMapping("/index")
	public String index(Model model, @RequestParam (defaultValue = "1") int page) {

		ArrayList<InquiryDto> list = inquiryService.iSelectAll(page);


		//▼model저장 후 전송
		model.addAttribute("list",list);

		return "index"; // 수정
	}//index


}//IController
