package com.plan.bus.busplan.db.model;

import com.plan.bus.busplan.db.BusPlanDatabase;
import com.raizlabs.android.dbflow.annotation.Column;
import com.raizlabs.android.dbflow.annotation.Table;

/**
 * Created by slawek on 2016-09-13.
 */
@Table(database = BusPlanDatabase.class)
public class BusStopDB extends MyBaseModel {
	@Column
	private float latitude;
	@Column
	private float longitude;
	@Column
	private String name;
	@Column
	private String serverUID;

	public float getLatitude() {
		return latitude;
	}

	public void setLatitude(float latitude) {
		this.latitude = latitude;
	}

	public float getLongitude() {
		return longitude;
	}

	public void setLongitude(float longitude) {
		this.longitude = longitude;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getServerUID() {
		return serverUID;
	}

	public void setServerUID(String serverUID) {
		this.serverUID = serverUID;
	}
}
