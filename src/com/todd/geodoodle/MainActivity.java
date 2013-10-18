package com.todd.geodoodle;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {
	
	private Button mTrueButton;
	private Button mFalseButton;
	
	public final static String EXTRA_MESSAGE = "com.todd.geodoodle.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        this.mTrueButton = (Button)findViewById(R.id.true_button);
        this.mFalseButton = (Button)findViewById(R.id.false_button);
        
        this.mTrueButton.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
			}
		});
        
        this.mFalseButton.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				sendMessage(v);
			}
		});
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
    public void sendMessage(View view) {
        Intent intent = new Intent(this, DisplaydetailsActivity.class);
        intent.putExtra(EXTRA_MESSAGE, "Pass this message");
        startActivity(intent);
    }	
    
}
