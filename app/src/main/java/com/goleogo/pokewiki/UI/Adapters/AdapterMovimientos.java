package com.goleogo.pokewiki.UI.Adapters;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SimpleCursorAdapter;
import android.widget.TextView;

import com.goleogo.pokewiki.Provider.habilidades.HabilidadesCursor;
import com.goleogo.pokewiki.Provider.movimientos.MovimientosCursor;
import com.goleogo.pokewiki.R;

/**
 * Created by Leosss on 27/05/2016.
 */
public class AdapterMovimientos extends SimpleCursorAdapter{
    TextView tvIdMoves;
    TextView tvNameMoves;

    Context context;

    public AdapterMovimientos(Context context, int layout, Cursor c, String[] from, int[] to, int flags) {
        super(context, layout, c, from, to, flags);
        this.context=context;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        Cursor cursor = getCursor();
        MovimientosCursor movimientosCursor = new MovimientosCursor(cursor);
        movimientosCursor.moveToPosition(position);

        if (convertView == null) {
            LayoutInflater inflater = LayoutInflater.from(context);
            convertView = inflater.inflate(R.layout.item_movimientos_fragment_list, parent, false);
        }

        tvIdMoves = (TextView) convertView.findViewById(R.id.tvIdMoves);
        tvIdMoves.setText(String.valueOf(movimientosCursor.getId()));

        tvNameMoves = (TextView) convertView.findViewById(R.id.tvNameMoves);
        tvNameMoves.setText(movimientosCursor.getName().toUpperCase());

        return convertView;
    }
}
