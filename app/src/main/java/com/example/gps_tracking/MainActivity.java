package com.example.gps_tracking;

import android.location.Location;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {
    Button btnShowLocation;
    GPSTracker gpsin;
    
    
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		btnShowLocation=(Button)findViewById(R.id.button1);
		btnShowLocation.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				gpsin =new GPSTracker(MainActivity.this);
				if(gpsin.canGetLocation()){
					double lat=gpsin.getLatitude();
					double lng=gpsin.getLongitude();
					Toast.makeText(MainActivity.this, "Your Current latitude is "+lat+" and your longitude is "+lng, Toast.LENGTH_LONG).show();
				

					}
				
				
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}