package com.goleogo.pokewiki.UI.Fragments;


import android.database.Cursor;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.LoaderManager;
import android.support.v4.content.CursorLoader;
import android.support.v4.content.Loader;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.goleogo.pokewiki.Provider.habilidades.HabilidadesColumns;
import com.goleogo.pokewiki.Provider.movimientos.MovimientosColumns;
import com.goleogo.pokewiki.R;
import com.goleogo.pokewiki.UI.Adapters.AdapterHabilidades;
import com.goleogo.pokewiki.UI.Adapters.AdapterMovimientos;

/**
 * A simple {@link Fragment} subclass.
 */
public class MovimientosFragment extends Fragment implements LoaderManager.LoaderCallbacks<Cursor>{

    AdapterMovimientos adapterMovimientos;

    public MovimientosFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_movimientos, container, false);

        getLoaderManager().initLoader(0, null, this);
        ListView lvMoves = (ListView)view.findViewById(R.id.lvMovimientos);

        adapterMovimientos = new AdapterMovimientos(view.getContext(),
                R.layout.item_movimientos_fragment_list,
                null,
                new String[]{   },
                new int[]{  },
                0);

        lvMoves.setAdapter(adapterMovimientos);

        return view;
    }

    @Override
    public Loader<Cursor> onCreateLoader(int id, Bundle args) {

        return  new CursorLoader(getContext(),
                MovimientosColumns.CONTENT_URI,
                null,
                null,
                null,
                "");

    }

    @Override
    public void onLoadFinished(Loader<Cursor> loader, Cursor data) {
        adapterMovimientos.swapCursor(data);
    }

    @Override
    public void onLoaderReset(Loader<Cursor> loader) {
        adapterMovimientos.swapCursor(null);
    }
}
