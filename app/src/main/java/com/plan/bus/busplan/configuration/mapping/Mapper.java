package com.plan.bus.busplan.configuration.mapping;

import org.modelmapper.ModelMapper;

import javax.inject.Singleton;

/**
 * Created by slawek on 2016-09-13.
 */
@Singleton
public class Mapper {

	private ModelMapper modelMapper = new ModelMapper();

	public <T> T map(Object o, Class<T> destinationClass) {
		return modelMapper.map(o, destinationClass);
	}
}
