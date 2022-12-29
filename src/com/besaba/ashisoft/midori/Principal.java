package com.besaba.ashisoft.midori;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.widget.Toast;

public class Principal extends Activity
{

	@Override
	public void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		//No permite que la pantalla se apague
		getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
		this.requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_principal);
		ImageButton portada = (ImageButton) findViewById(R.id.ibtnPortada);
		portada.setOnClickListener(new OnClickListener() 
		{
			@Override
			public void onClick(View v) 
			{
				cantos();
			}
		});
	}
	public void cantos()
	{
		Intent i = new Intent(this, Cantos.class );
        startActivity(i);
	}
	
	@Override
    public boolean onCreateOptionsMenu(Menu menu) 
	{
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.principal, menu);
        return true;
    }
	
	@Override
    public boolean onOptionsItemSelected(MenuItem item) 
	{
		switch (item.getItemId()) 
		{
		case R.id.acercade:
			Toast.makeText(
					this,
					"App: " + getString(R.string.app_name) + "\nVersión: " + getString(R.string.version) + "\n"
							+ getString(R.string.plataforma) + "\nProporcionado por: "
							+ getString(R.string.cliente) + "\n" + getString(R.string.autor) + "\n"
							+ getString(R.string.empresa), Toast.LENGTH_LONG).show();
			break;
		case R.id.salir:
			finish();
		}
        return true;
    }

}
