package com.goleogo.pokewiki.UI;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.AsyncTask;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.util.Log;

import com.goleogo.pokewiki.API.PokemonAPI;
import com.goleogo.pokewiki.R;

public class SplashActivity extends Activity {

   /* @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);
    }*/


    private ProgressDialog progressDialog;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);

        SharedPreferences sharedPreferences;
        sharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);
        boolean boot = sharedPreferences.getBoolean(getString(R.string.boot), true);

        if (boot){
            SharedPreferences.Editor editor = sharedPreferences.edit();
            editor.putBoolean("", false);
            editor.apply();
            Log.e("Llamando a API", "Llamando a API");
            RefreshBackground getTask = new RefreshBackground();
            getTask.execute();
        }else{
            Intent i = new Intent(getApplicationContext(),MainActivity.class);
            startActivity(i);
        }
    }


    private class RefreshBackground extends AsyncTask {
        @Override
        protected void onPreExecute() {
            //Create a new progress dialog
            progressDialog = new ProgressDialog(SplashActivity.this);
            //Set the progress dialog to display a horizontal progress bar
            progressDialog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
            //Set the dialog title to 'Loading...'
            progressDialog.setTitle("Descargando datos desde PokeApi.co");
            //Set the dialog message to 'Loading application View, please wait...'
            progressDialog.setMessage("No cierres la aplicación!");
            //This dialog can't be canceled by pressing the back key
            progressDialog.setCancelable(false);
            //This dialog isn't indeterminate
            progressDialog.setIndeterminate(false);
            //The maximum number of items is 100
            progressDialog.setMax(100);
            //Set the current progress to zero
            progressDialog.setProgress(1);
            //Display the progress dialog
            progressDialog.show();
        }

        @Override
        protected Object doInBackground(Object[] params) {
            progressDialog.setProgress(20);
            PokemonAPI api = new PokemonAPI();
            api.getPokemon(getBaseContext());
            api.getTipos(getBaseContext());
            api.getHabilidades(getBaseContext());
            api.getMovimientos(getBaseContext());
            api.getPokemonJoins(getBaseContext());

            return null;
        }

        @Override
        protected void onPostExecute(Object o) {
            super.onPostExecute(o);
            //progressDialog.dismiss();
            Intent i = new Intent(getApplicationContext(),MainActivity.class);
            startActivity(i);
        }
    }

}
