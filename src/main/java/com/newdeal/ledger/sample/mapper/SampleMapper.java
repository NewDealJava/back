package com.newdeal.ledger.sample.mapper;

import java.util.List;
import java.util.Optional;

import org.apache.ibatis.annotations.Mapper;

import com.newdeal.ledger.sample.dto.object.SampleDto;

@Mapper
public interface SampleMapper {
	void save(SampleDto sample);

	Optional<SampleDto> find(Integer id);

	List<SampleDto> findAll();

}
