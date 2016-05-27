package com.goleogo.pokewiki.UI.Adapters;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.SimpleCursorAdapter;
import android.widget.TextView;

import com.goleogo.pokewiki.Provider.pokemon.PokemonCursor;
import com.goleogo.pokewiki.R;
import com.squareup.picasso.Picasso;

/**
 * Created by Leosss on 26/05/2016.
 */
public class AdapterPokemonTodos extends SimpleCursorAdapter {
    TextView nombrePokemon;
    ImageView imagePokemon;

    Context context;

    public AdapterPokemonTodos(Context context, int layout, Cursor c, String[] from, int[] to, int flags) {
        super(context, layout, c, from, to, flags);
        this.context=context;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        Cursor cursor = getCursor();
        PokemonCursor pokemonCursor = new PokemonCursor(cursor);
        pokemonCursor.moveToPosition(position);

        if (convertView == null) {
            LayoutInflater inflater = LayoutInflater.from(context);
            convertView = inflater.inflate(R.layout.item_pokemon_todos_grid, parent, false);
        }

        //int id = character.getId();
        nombrePokemon = (TextView) convertView.findViewById(R.id.nombrePokemonTodos);
        nombrePokemon.setText(pokemonCursor.getName().toUpperCase());
        imagePokemon = (ImageView)convertView.findViewById(R.id.imagePokemonTodos);
        Picasso.with(context)
                    .load(pokemonCursor.getImage())
                    .fit()
                    .into(imagePokemon);

        return convertView;

    }
}
