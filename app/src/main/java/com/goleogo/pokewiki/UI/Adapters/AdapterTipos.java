package com.goleogo.pokewiki.UI.Adapters;

import android.content.Context;
import android.database.Cursor;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.SimpleCursorAdapter;
import android.widget.TextView;

import com.goleogo.pokewiki.Provider.pokemon.PokemonCursor;
import com.goleogo.pokewiki.Provider.pokemontipos.PokemonTiposColumns;
import com.goleogo.pokewiki.Provider.pokemontipos.PokemonTiposCursor;
import com.goleogo.pokewiki.Provider.pokemontipos.PokemonTiposSelection;
import com.goleogo.pokewiki.Provider.tipos.TiposCursor;
import com.goleogo.pokewiki.R;
import com.squareup.picasso.Picasso;

/**
 * Created by Leosss on 27/05/2016.
 */
public class AdapterTipos extends SimpleCursorAdapter {
    TextView tvIdTipo;
    TextView tvNameTipo;

    Context context;

    public AdapterTipos(Context context, int layout, Cursor c, String[] from, int[] to, int flags) {
        super(context, layout, c, from, to, flags);
        this.context=context;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        Cursor cursor = getCursor();
        TiposCursor tiposCursor = new TiposCursor(cursor);
        tiposCursor.moveToPosition(position);

        Log.e("Prueba",String.valueOf(tiposCursor.getId()));
        if (convertView == null) {
            LayoutInflater inflater = LayoutInflater.from(context);
            convertView = inflater.inflate(R.layout.item_tipos_fragment_list, parent, false);
        }

        tvIdTipo = (TextView) convertView.findViewById(R.id.tvIdTipo);
        tvIdTipo.setText(String.valueOf(tiposCursor.getId()));

        tvNameTipo = (TextView) convertView.findViewById(R.id.tvNameTipo);
        tvNameTipo.setText(tiposCursor.getName().toUpperCase());

        return convertView;
    }
}
