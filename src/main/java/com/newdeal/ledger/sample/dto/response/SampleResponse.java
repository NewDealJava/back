package com.newdeal.ledger.sample.dto.response;

import com.newdeal.ledger.sample.dto.object.SampleDto;

import lombok.AllArgsConstructor;
import lombok.Getter;

public class SampleResponse {

	@Getter
	@AllArgsConstructor
	public static class Get {
		private Integer sbno;
		private String stitle;
		private String scontent;

		public static Get fromDto(SampleDto dto) {
			return new Get(dto.getSbno(), dto.getStitle(), dto.getScontent());
		}
	}
}
