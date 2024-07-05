package com.newdeal.ledger.sample.service.impl;

import static com.newdeal.ledger.global.exception.ErrorCode.*;

import java.util.List;

import org.springframework.stereotype.Service;

import com.newdeal.ledger.global.exception.NewDealException;
import com.newdeal.ledger.sample.dto.object.SampleDto;
import com.newdeal.ledger.sample.dto.request.SampleRequest;
import com.newdeal.ledger.sample.dto.response.SampleResponse;
import com.newdeal.ledger.sample.mapper.SampleMapper;
import com.newdeal.ledger.sample.service.SampleService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class SampleServiceImpl implements SampleService {
	private final SampleMapper sampleMapper;

	public void createSample(SampleRequest.Create request) {
		SampleDto dto = request.toDto();
		sampleMapper.save(dto);
	}

	public SampleResponse.Get getSample(Integer id) {
		SampleDto dto = sampleMapper.find(id)
			.orElseThrow(() -> new NewDealException(NOT_FOUND_SAMPLE));

		return SampleResponse.Get.fromDto(dto);
	}

	public List<SampleResponse.Get> getAllSample() {
		List<SampleDto> dtos = sampleMapper.findAll();

		return dtos.stream().map(dto -> SampleResponse.Get.fromDto(dto)).toList();
	}

}
