package com.simpumind.funfact;

import android.app.Activity;
import android.app.Fragment;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.TextView;

public class FunFactsActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_fun_facts);

		if (savedInstanceState == null) {
			getFragmentManager().beginTransaction()
					.add(R.id.container, new PlaceholderFragment()).commit();
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.fun_facts, menu);
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

	/**
	 * A placeholder fragment containing a simple view.
	 */
	public static class PlaceholderFragment extends Fragment {
		private FactBook factBook = new FactBook();
		private ColorWheel colorWheel = new ColorWheel();
		public PlaceholderFragment() {
		}

		@Override
		public View onCreateView(LayoutInflater inflater, ViewGroup container,
				Bundle savedInstanceState) {
			View rootView = inflater.inflate(R.layout.fragment_fun_facts,
					container, false);
			
			//Declare our view variable and assgin the view from the layout file
			final TextView factLabel = (TextView)rootView.findViewById(R.id.factTextView);
			final Button showFactButton = (Button)rootView.findViewById(R.id.showFactButton);
			final RelativeLayout relativeLayout = (RelativeLayout)rootView.findViewById(R.id.relativeLayout);
			
			showFactButton.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					//Display to the  	 user
					String fact = factBook.getFact();
					factLabel.setText(fact);
					int color = colorWheel.setColor();
					relativeLayout.setBackgroundColor(color);
					showFactButton.setTextColor(color);
				}
			});
			
			return rootView;
		}
	}

}
