package com.plan.bus.busplan.configuration.dagger;

import android.content.Context;
import dagger.Module;
import dagger.Provides;

/**
 * Created by slawek on 2016-07-23.
 */
@Module
public class DaggerModule {
	private final Context context;

	public DaggerModule(Context context) {
		this.context = context;
	}

	@Provides //scope is not necessary for parameters stored within the module
	public Context context() {
		return context;
	}
}
