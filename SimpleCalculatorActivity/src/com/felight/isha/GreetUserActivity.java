package com.felight.isha;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class GreetUserActivity extends Activity {
	
	public void greetUser(View view){
		EditText etFirstName = (EditText) findViewById(R.id.etFirstName);
		EditText etLastName = (EditText) findViewById(R.id.etLastName);
		
		String fname = etFirstName.getText().toString();
		String lname = etLastName.getText().toString();
		
		TextView tvResult = (TextView) findViewById(R.id.tvResult);
		tvResult.setText("Hello " + fname + " " + lname);
	}
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.greetuser_layout);
		
	}

}
