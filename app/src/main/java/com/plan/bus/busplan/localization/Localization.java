package com.plan.bus.busplan.localization;

import android.content.Context;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;

import javax.inject.Inject;

/**
 * Created by slawek on 2016-07-23.
 */
public class Localization {

	public static final int MIN_DISTANCE_IN_METERS_BETWEEN_UPDATES = 1;
	public static final long MIN_TIME_BETWEEN_UPDATES = 1000L;
	private Context context;

	@Inject
	public Localization(Context context) {
		this.context = context;
	}

	public void init(final LocationChangeListener locationChangeListener) {
		LocationManager locationManager = (LocationManager) context.getSystemService(Context.LOCATION_SERVICE);
		if (!locationManager.isProviderEnabled(LocationManager.GPS_PROVIDER)) {
			locationChangeListener.onDisabledLocation();
		}

		locationManager.requestLocationUpdates(LocationManager.GPS_PROVIDER, MIN_TIME_BETWEEN_UPDATES, MIN_DISTANCE_IN_METERS_BETWEEN_UPDATES,
				new LocationListener() {
					@Override
					public void onLocationChanged(Location location) {
						locationChangeListener.updateLocation(location);
					}

					@Override
					public void onStatusChanged(String provider, int status, Bundle extras) {
					}

					@Override
					public void onProviderEnabled(String provider) {}

					@Override
					public void onProviderDisabled(String provider) {
						locationChangeListener.onDisabledLocation();
					}
				});
	}
}
