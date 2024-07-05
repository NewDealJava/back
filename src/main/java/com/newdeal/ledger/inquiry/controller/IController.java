package com.newdeal.ledger.inquiry.controller;

import com.newdeal.ledger.inquiry.dto.InquiryDto;
import com.newdeal.ledger.inquiry.service.InquiryService;
import org.eclipse.tags.shaded.org.apache.xpath.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.Map;

@Controller

public class IController{
	//@Autowired private InquiryService inquiryService; ← :스프링 의존성 주입방식 : 필드주입 방식
	//▼(스프링 의존성 주입 방식: 생성자 주입방식)
	private final InquiryService inquiryService;
	public IController(InquiryService inquiryService){
		this.inquiryService=inquiryService;
	} //생성자 주입 방식


	/**
	 * 문의 게시판 페이지
	 * 
	 * @return index 최창윤
	 */
	@GetMapping("/index")
	public String index(Model model, @RequestParam (defaultValue = "1") int page) {

		// ▼ service 연결
		Map<String,Object> map = inquiryService.iSelectAll(page); //ArrayList에서 Map으로 변경 됨

		// ▽ model저장 후 전송
		model.addAttribute("map",map);


		return "index"; // 수정
	}//index(문의 게시판 전체리스트 보기)

	@GetMapping("/iView")
	public String iView(Model model, @RequestParam(defaultValue = "1") int qbno){

		// ▼ service 연결
		InquiryDto ibdto = inquiryService.iSelectOne(qbno);
		System.out.println("확인 : " + ibdto);

		// ▽ model저장 후 전송
		model.addAttribute("idto",ibdto);

		return "iView";
	}//iView(문의 게시물 1개보기)


}//IController
