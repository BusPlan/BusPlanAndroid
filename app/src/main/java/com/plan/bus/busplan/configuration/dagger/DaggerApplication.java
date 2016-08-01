package com.plan.bus.busplan.configuration.dagger;

import android.app.Application;
import com.plan.bus.busplan.ui.MainActivity;

/**
 * Created by slawek on 2016-07-24.
 */
public class DaggerApplication extends Application {
	private static DaggerComponent daggerComponent;

	public static void inject(MainActivity activity) {
		daggerComponent.inject(activity);
	}

	@Override
	public void onCreate() {
		super.onCreate();
		daggerComponent = DaggerDaggerComponent.builder().daggerModule(new DaggerModule(this)).build();
	}
}
