package com.example.service1;

import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;

public class MainActivity extends Service{


	int mstartmode;
	IBinder mbinder;
	boolean malloc;

	@Override
	public void onCreate() {
		
	}

	
	
	@Override
	public boolean onUnbind(Intent intent) {
		// TODO Auto-generated method stub
		return malloc;
	}
	
	@Override
	public void onDestroy() {
		
	}



	

	

	@Override
	public IBinder onBind(Intent arg0) {
		// TODO Auto-generated method stub
		return null;
	}


}
