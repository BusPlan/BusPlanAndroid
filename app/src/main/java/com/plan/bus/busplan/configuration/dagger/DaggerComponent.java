package com.plan.bus.busplan.configuration.dagger;

import com.plan.bus.busplan.ui.MainActivity;
import dagger.Component;

import javax.inject.Singleton;

/**
 * Created by slawek on 2016-07-24.
 */
@Singleton
@Component(modules = DaggerModule.class)
public interface DaggerComponent {
	void inject(MainActivity activity);
}
