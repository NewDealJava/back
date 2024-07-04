package com.newdeal.ledger.inquiry.service;

import com.newdeal.ledger.inquiry.dto.InquiryDto;

import java.util.Map;

public interface InquiryService {

	//1.문의 게시판_전체 리스트 가져오기
	Map<String, Object> iSelectAll(int page);

	//2.문의 게시판_게시글 1개 가져오기
	InquiryDto iSelectOne(int qbno);
}//InquiryService //서비스
