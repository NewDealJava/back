package com.newdeal.ledger.inquiry.service;

import com.newdeal.ledger.inquiry.dto.InquiryDto;

import java.util.ArrayList;

public interface InquiryService {

	//1.문의 게시판 전체 리스트 가져오기
	ArrayList<InquiryDto> iSelectAll(int page);

}//InquiryService //서비스
