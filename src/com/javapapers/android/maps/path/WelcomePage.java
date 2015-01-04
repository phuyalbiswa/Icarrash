package com.javapapers.android.maps.path;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class WelcomePage extends Activity {

	Button button1;
	Button button2;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_welcome);
		addListenerOnButton();
	}

	public void addListenerOnButton() {

		final Context context = this;

		button1 = (Button) findViewById(R.id.button1);

		button1.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {

				Intent intent = new Intent(context, PathGoogleMapActivity.class);
				startActivity(intent);

			}

		});
		
		button2 = (Button) findViewById(R.id.button2);

		button2.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {

				Intent intent = new Intent(context, TailGateGoogleMapActivity.class);
				startActivity(intent);

			}

		});

	}

}
