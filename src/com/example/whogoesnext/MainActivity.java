package com.example.whogoesnext;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.LinearLayout;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		TableLayout table = (TableLayout)this.findViewById(R.id.itemsTable);
		
		LinearLayout rowContents1 = new LinearLayout(this);
		TextView tv1 = new TextView(this);
        tv1.setText("Blow Out Candle");
        rowContents1.addView(tv1,200, 60);
        
        TableRow row1 = new TableRow(this);
		row1.addView(rowContents1);
		
		table.addView(row1);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

}
