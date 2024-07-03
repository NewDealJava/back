package com.newdeal.ledger.inquiry.service.impl;

import com.newdeal.ledger.inquiry.dto.InquiryDto;
import com.newdeal.ledger.inquiry.mapper.InquiryMapper;
import com.newdeal.ledger.inquiry.service.InquiryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class InquiryServiceImpl implements InquiryService {

    @Autowired
    InquiryMapper inquiryMapper;

    @Override
    public ArrayList<InquiryDto> iSelectAll(int page) {

        //1. 페이지 넘버링 - ②번째
        if(page <=0)
            page = 1;
        int contentCount = 10; //1Pg당 게시글 갯수
        int bottomArray = 10; //하단 페이지 넘버링 수
        int countAll = inquiryMapper.iSelectCountAll();
        int maxPage = (int) Math.ceil((double) countAll /contentCount); //게시글 최대페이지
        int startPageNum = ((page - 1) / bottomArray) * bottomArray + 1; //게시글 시작페이지
        int endPageNum = (startPageNum + bottomArray) - 1; //게시글 마지막 페이지
        if (endPageNum > maxPage) // *페이지 넘버링 최대페이지가 끝페이지보다 작을경우
            endPageNum = maxPage;
        int startContRowNum = (page - 1) * contentCount + 1; //page 시작 게시판 번호
        int endContRowNum = startContRowNum + contentCount - 1; // page 마지막 게시판 번호

        //2.문의 게시판 전체리스트 가져오기 - ①번째
        ArrayList<InquiryDto> list = inquiryMapper.iSelectAll();
        return list;
    }//selectAll
}//InquiryServiceImpl //서비스 임플
