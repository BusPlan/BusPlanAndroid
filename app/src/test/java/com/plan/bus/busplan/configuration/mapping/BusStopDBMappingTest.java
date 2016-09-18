package com.plan.bus.busplan.configuration.mapping;

import com.plan.bus.busplan.db.model.BusStopDB;
import com.plan.bus.busplan.model.BusStop;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by slawek on 2016-09-18.
 */
public class BusStopDBMappingTest extends MapperBaseTest {

	@Test
	public void testMapFromDbToModel() {
		BusStopDB stopDB = new BusStopDB();
		stopDB.setId(1);
		stopDB.setLatitude(2.3f);
		stopDB.setLongitude(6.7f);
		stopDB.setName("name_nn");
		stopDB.setServerUID("42432_88_lk");

		BusStop busStop = mapper.map(stopDB, BusStop.class);

		assertThat(busStop.getId()).isEqualTo(1);
		assertThat(busStop.getLatitude()).isEqualTo(2.3f);
		assertThat(busStop.getLongitude()).isEqualTo(6.7f);
		assertThat(busStop.getName()).isEqualTo("name_nn");
		assertThat(busStop.getServerUID()).isEqualTo("42432_88_lk");
	}

	@Test
	public void testMapFromModelToDB() {
		BusStop busStop = new BusStop();
		busStop.setId(1);
		busStop.setLatitude(2.3f);
		busStop.setLongitude(6.7f);
		busStop.setName("name_nn");
		busStop.setServerUID("42432_88_lk");

		BusStopDB busStopDB = mapper.map(busStop, BusStopDB.class);

		assertThat(busStopDB.getId()).isEqualTo(1);
		assertThat(busStopDB.getLatitude()).isEqualTo(2.3f);
		assertThat(busStopDB.getLongitude()).isEqualTo(6.7f);
		assertThat(busStopDB.getName()).isEqualTo("name_nn");
		assertThat(busStopDB.getServerUID()).isEqualTo("42432_88_lk");
	}

	@Test
	public void testMapId0FromDB_shouldBeNullInModel() {
		BusStopDB stopDB = new BusStopDB();
		stopDB.setId(0);

		BusStop busStop = mapper.map(stopDB, BusStop.class);

		assertThat(busStop.getId()).isNull();
	}

	@Test
	public void testMapIdNullFromModel_shouldBeNullInDB() {
		BusStop busStop = new BusStop();
		busStop.setId(null);

		BusStopDB busStopDB = mapper.map(busStop, BusStopDB.class);

		assertThat(busStopDB.getId()).isEqualTo(null);
	}
}