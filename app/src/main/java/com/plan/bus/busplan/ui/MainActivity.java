package com.plan.bus.busplan.ui;

import android.location.Location;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import com.plan.bus.busplan.R;
import com.plan.bus.busplan.configuration.dagger.DaggerApplication;
import com.plan.bus.busplan.localization.Localization;
import com.plan.bus.busplan.localization.LocationChangeListener;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

	@Inject
	Localization localization;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		DaggerApplication.inject(this);
		localization.init(new LocationChangeListener() {
			@Override
			public void updateLocation(Location location) {
				Log.e("TAG", "updateLocation: " + location.toString());
			}

			@Override
			public void onDisabledLocation() {

			}
		});
		setContentView(R.layout.activity_main);
	}
}
