package com.newdeal.ledger.sample.dto.object;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SampleDto {
	private Integer sbno;
	private String stitle;
	private String scontent;

	public static SampleDto init(String stitle, String scontent) {
		return new SampleDto(null, stitle, scontent);
	}

}
