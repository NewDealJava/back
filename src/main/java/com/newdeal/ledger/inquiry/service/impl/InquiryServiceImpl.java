package com.newdeal.ledger.inquiry.service.impl;

import com.newdeal.ledger.inquiry.dto.InquiryDto;
import com.newdeal.ledger.inquiry.mapper.InquiryMapper;
import com.newdeal.ledger.inquiry.service.InquiryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@Service
public class InquiryServiceImpl implements InquiryService {

    //@Autowired InquiryMapper inquiryMapper; ← :스프링 의존성 주입방식 : 필드주입 방식
    //▼(스프링 의존성 주입 방식: 생성자 주입방식)
    private final InquiryMapper inquiryMapper;

    public InquiryServiceImpl(InquiryMapper inquiryMapper) {
        this.inquiryMapper = inquiryMapper;
    } //생성자 주입 방식

    //1.문의 게시판_전체 리스트 가져오기
    @Override
    public Map<String, Object> iSelectAll(int page) {

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

        //2.문의 게시판_전체리스트 가져오기 - ①번째
        ArrayList<InquiryDto> list = inquiryMapper.iSelectAll(startContRowNum,endContRowNum);
        System.out.println("list정보 : " + list);
        //retrun타입 ArrayList → Map으로 변경 - ③번째
        Map<String, Object> map = new HashMap<>();
        map.put("list",list);
        map.put("page",page);
        map.put("maxPage",maxPage);
        map.put("startPageNum",startPageNum);
        map.put("endPageNum",endPageNum);

        return map;
    }//selectAll(page) : 문의게시판 전체 리스트 가저오기

    //2.문의 게시판_게시글 1개 가져오기
    @Override
    public InquiryDto iSelectOne(int qbno) {

        //게시글 1개가져오기(현재글)
        InquiryDto ibdto = inquiryMapper.IselectOne(qbno);

        return ibdto;
    }//iSelectOne(qbno) :  문의게시판 게시글 1개 가져오기
}//InquiryServiceImpl //서비스 임플
