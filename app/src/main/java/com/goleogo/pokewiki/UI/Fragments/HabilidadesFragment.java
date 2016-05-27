package com.goleogo.pokewiki.UI.Fragments;

import android.support.v4.app.LoaderManager;
import android.support.v4.content.CursorLoader;
import android.support.v4.content.Loader;
import android.database.Cursor;
import android.os.Bundle;
import android.support.v4.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.goleogo.pokewiki.Provider.habilidades.HabilidadesColumns;
import com.goleogo.pokewiki.Provider.tipos.TiposColumns;
import com.goleogo.pokewiki.R;
import com.goleogo.pokewiki.UI.Adapters.AdapterHabilidades;
import com.goleogo.pokewiki.UI.Adapters.AdapterTipos;

/**
 * A simple {@link Fragment} subclass.
 */
public class HabilidadesFragment extends Fragment implements LoaderManager.LoaderCallbacks<Cursor>{

    AdapterHabilidades adapterHabilidades;

    public HabilidadesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_habilidades, container, false);

        getLoaderManager().initLoader(0, null, this);
        ListView lvHabs = (ListView)view.findViewById(R.id.lvHabilidades);

        adapterHabilidades = new AdapterHabilidades(view.getContext(),
                R.layout.item_habilidades_fragment_list,
                null,
                new String[]{   },
                new int[]{  },
                0);

        lvHabs.setAdapter(adapterHabilidades);

        return view;
    }

    @Override
    public Loader<Cursor> onCreateLoader(int id, Bundle args) {

        return  new CursorLoader(getContext(),
                HabilidadesColumns.CONTENT_URI,
                null,
                null,
                null,
                "");

    }

    @Override
    public void onLoadFinished(Loader<Cursor> loader, Cursor data) {
        adapterHabilidades.swapCursor(data);
    }

    @Override
    public void onLoaderReset(Loader<Cursor> loader) {
        adapterHabilidades.swapCursor(null);
    }


}
