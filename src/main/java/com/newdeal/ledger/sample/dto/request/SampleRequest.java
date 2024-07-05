package com.newdeal.ledger.sample.dto.request;

import com.newdeal.ledger.sample.dto.object.SampleDto;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;

public class SampleRequest {

	@Getter
	public static class Create {
		@NotBlank
		private String stitle;
		@NotBlank
		private String scontent;

		public SampleDto toDto() {
			return SampleDto.init(stitle, scontent);
		}
	}
}
