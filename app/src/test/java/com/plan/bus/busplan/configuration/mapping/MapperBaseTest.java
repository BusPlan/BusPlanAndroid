package com.plan.bus.busplan.configuration.mapping;

import org.junit.Before;

/**
 * Created by slawek on 2016-09-18.
 */
public abstract class MapperBaseTest {

	public Mapper mapper;

	@Before
	public void initMapper() {
		mapper = new Mapper();
	}

}