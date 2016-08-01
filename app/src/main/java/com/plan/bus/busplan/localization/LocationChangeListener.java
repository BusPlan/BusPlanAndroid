package com.plan.bus.busplan.localization;

import android.location.Location;

/**
 * Created by slawek on 2016-07-23.
 */
public interface LocationChangeListener {
	void updateLocation(Location location);

	void onDisabledLocation();
}
