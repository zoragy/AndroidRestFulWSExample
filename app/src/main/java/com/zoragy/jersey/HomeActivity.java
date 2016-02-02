package com.zoragy.jersey;

import android.app.Activity;
import android.os.Bundle;

import com.prgguru.example.R;

public class HomeActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		//Displays Home Screen
		setContentView(R.layout.home);
	}

}
