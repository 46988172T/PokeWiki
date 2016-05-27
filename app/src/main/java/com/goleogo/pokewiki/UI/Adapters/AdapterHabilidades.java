package com.goleogo.pokewiki.UI.Adapters;

import android.content.Context;
import android.database.Cursor;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SimpleCursorAdapter;
import android.widget.TextView;

import com.goleogo.pokewiki.Provider.habilidades.HabilidadesCursor;
import com.goleogo.pokewiki.Provider.tipos.TiposCursor;
import com.goleogo.pokewiki.R;

/**
 * Created by Leosss on 27/05/2016.
 */
public class AdapterHabilidades extends SimpleCursorAdapter{
    TextView tvIdHabs;
    TextView tvNameHabs;

    Context context;

    public AdapterHabilidades(Context context, int layout, Cursor c, String[] from, int[] to, int flags) {
        super(context, layout, c, from, to, flags);
        this.context=context;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        Cursor cursor = getCursor();
        HabilidadesCursor habilidadesCursor = new HabilidadesCursor(cursor);
        habilidadesCursor.moveToPosition(position);

        if (convertView == null) {
            LayoutInflater inflater = LayoutInflater.from(context);
            convertView = inflater.inflate(R.layout.item_habilidades_fragment_list, parent, false);
        }

        tvIdHabs = (TextView) convertView.findViewById(R.id.tvIdHabs);
        tvIdHabs.setText(String.valueOf(habilidadesCursor.getId()));

        tvNameHabs = (TextView) convertView.findViewById(R.id.tvNameHabs);
        tvNameHabs.setText(habilidadesCursor.getName().toUpperCase());

        return convertView;
    }
}
