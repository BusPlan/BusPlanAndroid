package com.plan.bus.busplan;

import android.app.Application;
import com.plan.bus.busplan.db.BusPlanDatabase;

/**
 * Created by slawek on 2016-07-24.
 */
public class BusPlanApplication extends Application {

	@Override
	public void onCreate() {
		super.onCreate();
		BusPlanDatabase.initDatabase(this);
	}
}
