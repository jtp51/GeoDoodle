package com.todd.geodoodle;

import android.app.Activity;
import android.content.Context;
//import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class DisplaydetailsActivity extends Activity {
	
	private TextView textfield;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_displaydetails);
		
		if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB){
			getActionBar().setDisplayHomeAsUpEnabled(true);
		}
	}
	
	@Override
	public void onResume(){
		super.onResume();
		Context context = this.getApplicationContext();
		SharedPreferences sp = context.getSharedPreferences("quiz", 0);
		String msg = sp.getString("key0", "Bye");
		
		// Get the message from the intent
//	    Intent intent = getIntent();
//	    String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
	    this.textfield = (TextView)findViewById(R.id.displaytext);
	    this.textfield.setText(msg);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.displaydetails, menu);
		return true;
	}
	
	@Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
        case android.R.id.home:
            NavUtils.navigateUpFromSameTask(this);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

}
