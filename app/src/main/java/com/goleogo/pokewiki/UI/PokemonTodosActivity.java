package com.goleogo.pokewiki.UI;

import android.content.CursorLoader;
import android.content.Intent;
import android.content.Loader;
import android.database.Cursor;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import com.goleogo.pokewiki.JSON.Pokemon.Pokemon;
import com.goleogo.pokewiki.Provider.pokemon.PokemonColumns;
import com.goleogo.pokewiki.R;
import com.goleogo.pokewiki.UI.Adapters.AdapterPokemonTodos;

public class PokemonTodosActivity extends AppCompatActivity implements android.app.LoaderManager.LoaderCallbacks<Cursor> {

    AdapterPokemonTodos adapterPokemonTodos;
    GridView pokeGrid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pokemon_todos);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        pokeGrid = (GridView)findViewById(R.id.gridPokemonTodos);

        getLoaderManager().initLoader(0, null,(android.app.LoaderManager.LoaderCallbacks<Cursor>)this);

        adapterPokemonTodos = new AdapterPokemonTodos(this,
                R.layout.item_pokemon_todos_grid,
                null,
                new String[]{   },
                new int[]{  },
                0);

        pokeGrid.setAdapter(adapterPokemonTodos);

        pokeGrid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(getBaseContext(), PokemonDetail.class);
                intent.putExtra("id", id);
                startActivity(intent);
            }
        });

    }


    @Override
    public Loader<Cursor> onCreateLoader(int id, Bundle args) {
        return new CursorLoader(this,
                PokemonColumns.CONTENT_URI,
                null,
                null,
                null,
                "idpokemon");
    }

    @Override
    public void onLoadFinished(Loader<Cursor> loader, Cursor data) {
        adapterPokemonTodos.swapCursor(data);
    }

    @Override
    public void onLoaderReset(Loader<Cursor> loader) {
        adapterPokemonTodos.swapCursor(null);
    }
}
