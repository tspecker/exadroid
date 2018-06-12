package com.tspecker.exadroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

/**
 * TODO auto-generated, fill with pertinent comment
 * Created by SPECKETH on 08/06/2018.
 */
public class WelcomeActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_welcome);

		Toolbar tb = findViewById(R.id.toolBar);
		setSupportActionBar(tb);
	}
}
