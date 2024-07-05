package com.newdeal.ledger.sample.service;

import java.util.List;

import com.newdeal.ledger.sample.dto.request.SampleRequest;
import com.newdeal.ledger.sample.dto.response.SampleResponse;

public interface SampleService {

	void createSample(SampleRequest.Create request);

	public SampleResponse.Get getSample(Integer id);

	public List<SampleResponse.Get> getAllSample();
}
