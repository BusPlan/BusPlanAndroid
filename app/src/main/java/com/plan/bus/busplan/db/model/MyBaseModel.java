package com.plan.bus.busplan.db.model;

import com.raizlabs.android.dbflow.annotation.PrimaryKey;
import com.raizlabs.android.dbflow.structure.BaseModel;

/**
 * Created by slawek on 2016-09-18.
 */
public class MyBaseModel extends BaseModel {

	@PrimaryKey(autoincrement = true)
	private int id;

	public Integer getId() {
		if (id == 0) {
			return null;
		} else {
			return id;
		}
	}

	public void setId(Integer id) {
		if (id == null) {
			this.id = 0;
		} else {
			this.id = id;
		}
	}
}
