package com.newdeal.ledger.sample.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.newdeal.ledger.sample.dto.request.SampleRequest;
import com.newdeal.ledger.sample.dto.response.SampleResponse;
import com.newdeal.ledger.sample.service.SampleService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping(value = "/sample")
@RequiredArgsConstructor
public class SController {
	private final SampleService sampleService;

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public void createSample(@RequestBody SampleRequest.Create request) {
		sampleService.createSample(request);
	}

	@GetMapping
	@ResponseStatus(HttpStatus.OK)
	public List<SampleResponse.Get> getSamples() {
		return sampleService.getAllSample();
	}

	@GetMapping(path = "/{id}")
	@ResponseStatus(HttpStatus.OK)
	public SampleResponse.Get getSample(@PathVariable(name = "id") Integer id) {
		return sampleService.getSample(id);
	}

}
