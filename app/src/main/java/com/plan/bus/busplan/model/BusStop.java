package com.plan.bus.busplan.model;

/**
 * Created by slawek on 2016-09-13.
 */
public class BusStop {
	private Integer id;
	private float latitude;
	private float longitude;
	private String name;
	private String serverUID;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

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
