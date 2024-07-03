package com.newdeal.ledger.inquiry.mapper;

import com.newdeal.ledger.inquiry.dto.InquiryDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.ArrayList;

@Mapper
public interface InquiryMapper {
    //1.문의 게시판 전체리스트 가져오기
    ArrayList<InquiryDto> iSelectAll(); //문의 게시판 전체리스트 가져오기

    //1-ⓐ회원정보 리스트 총갯수
    int iSelectCountAll();

}//InquiryMapper
