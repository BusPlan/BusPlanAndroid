package com.plan.bus.busplan.db;

import android.app.Application;
import com.raizlabs.android.dbflow.annotation.Database;
import com.raizlabs.android.dbflow.config.FlowConfig;
import com.raizlabs.android.dbflow.config.FlowManager;

/**
 * Created by slawek on 2016-09-13.
 */
@Database(name = BusPlanDatabase.NAME, version = BusPlanDatabase.VERSION)
public class BusPlanDatabase {
	public static final String NAME = "AppDatabase"; // we will add the .db extension
	public static final int VERSION = 1;

	public static void initDatabase(Application application) {
		FlowManager.init(new FlowConfig.Builder(application)
				.openDatabasesOnInit(true).build());
	}
}
