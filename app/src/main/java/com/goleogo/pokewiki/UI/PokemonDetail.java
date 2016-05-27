package com.goleogo.pokewiki.UI;

import android.database.Cursor;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.goleogo.pokewiki.JSON.Pokemon.Pokemon;
import com.goleogo.pokewiki.Provider.pokemon.PokemonColumns;
import com.goleogo.pokewiki.Provider.pokemon.PokemonCursor;
import com.goleogo.pokewiki.R;
import com.squareup.picasso.Picasso;

public class PokemonDetail extends AppCompatActivity {

    TextView nombre, baseExperience, height, weight;
    ImageView imagenPokemon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pokemon_detail);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Long id = getIntent().getLongExtra("id", -1);

        nombre = (TextView)findViewById(R.id.nombrePokemon);
        baseExperience = (TextView)findViewById(R.id.baseExperience);
        height = (TextView)findViewById(R.id.height);
        weight = (TextView)findViewById(R.id.weight);
        imagenPokemon = (ImageView)findViewById(R.id.imagenPokemon);

        Cursor cursor = this.getContentResolver().query(
                PokemonColumns.CONTENT_URI,
                null,
                PokemonColumns._ID + " = ?",
                new String[]{String.valueOf(id)},
                null);

        PokemonCursor pokemonCursor = new PokemonCursor(cursor);
        cursor.moveToNext();

        nombre.setText(pokemonCursor.getName().toUpperCase());
        baseExperience.setText(String.valueOf(pokemonCursor.getBaseExperience()));
        height.setText(String.valueOf(pokemonCursor.getHeight()));
        weight.setText(String.valueOf(pokemonCursor.getWeight()));

        Picasso.with(getBaseContext())
                .load(pokemonCursor.getImage())
                .fit()
                .into(imagenPokemon);

    }

}
