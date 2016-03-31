package com.example.lab5;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends Activity {

	EditText editText;
	Button buton1;
	Button buton2;
	Button buton3;
	
	TextView text1;
	TextView text2;

	
	private ButtonListener buttonListener = new ButtonListener();
	private class ButtonListener implements View.OnClickListener {

		@Override
		public void onClick(View v) {
			switch (v.getId()) {
			case R.id.button1:
				if (editText.getText() != null) {
					int val = Integer.parseInt(editText.getText().toString());
					val++;
					text1.setText(String.valueOf(val));
				}
				break;
			case R.id.button2:
				int val2 = Integer.parseInt(text2.getText().toString());
				++val2;
				text2.setText(String.valueOf(val2));
				break;
			default:
				break;
			}
		}
		
	}
	
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         editText = (EditText) findViewById(R.id.edit1);
         editText.setText("0");
         
         buton1 = (Button) findViewById(R.id.button1);
         buton2 = (Button) findViewById(R.id.button2);
         buton3 = (Button) findViewById(R.id.button3);
         
         buton1.setOnClickListener(buttonListener);
         buton2.setOnClickListener(buttonListener);
         
         text1 = (TextView) findViewById(R.id.text1);
         text2 = (TextView) findViewById(R.id.text2);
         text2.setText("0");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
