package com.plan.bus.busplan.configuration.dagger;

import com.plan.bus.busplan.ui.MainActivity;

/**
 * Created by slawek on 2016-09-13.
 */
public class DaggerUIInjecter {
	public static void inject(MainActivity activity) {
		DaggerComponent daggerComponent = DaggerDaggerComponent.builder().daggerModule(new DaggerModule(activity)).build();
		daggerComponent.inject(activity);
	}
}
