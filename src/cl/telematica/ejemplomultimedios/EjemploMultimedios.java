package cl.telematica.ejemplomultimedios;

import java.util.Calendar;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class EjemploMultimedios extends Activity {
	
	long timestamp;
	Button boton;
	EditText editText;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_ejemplo_multimedios);
		Toast.makeText(getApplicationContext(), getString(R.string.on_create), Toast.LENGTH_SHORT).show();
		
		boton = (Button) findViewById(R.id.buttonTelo);
		editText = (EditText) findViewById(R.id.editText1);
		
		boton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Toast.makeText(getApplicationContext(), editText.getText().toString(), Toast.LENGTH_SHORT).show();
			}
		});
		
		timestamp = Calendar.getInstance().getTimeInMillis();
	}
	
	@Override
	protected void onResume(){
		super.onResume();
		Toast.makeText(getApplicationContext(), getString(R.string.on_resume), Toast.LENGTH_SHORT).show();
	}
	
	@Override
	protected void onPause(){
		super.onPause();
		Toast.makeText(getApplicationContext(), getString(R.string.on_pause), Toast.LENGTH_SHORT).show();
	}
	
	@Override
	protected void onDestroy(){
		super.onDestroy();
		Toast.makeText(getApplicationContext(), getString(R.string.on_destroy), Toast.LENGTH_SHORT).show();
		
		timestamp = Calendar.getInstance().getTimeInMillis();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.ejemplo_multimedios, menu);
		return true;
	}

}
