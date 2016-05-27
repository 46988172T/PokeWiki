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

import com.goleogo.pokewiki.Provider.tipos.TiposColumns;
import com.goleogo.pokewiki.R;

import com.goleogo.pokewiki.UI.Adapters.AdapterTipos;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class TiposFragment extends Fragment implements LoaderManager.LoaderCallbacks<Cursor> {

    ArrayList<String> stringArraylist;
    AdapterTipos adapterTipos;

    public TiposFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_tipos, container, false);
        stringArraylist = this.getArguments().getStringArrayList("idPoke");
        getLoaderManager().initLoader(0, null, this);
        ListView lvTipos = (ListView)view.findViewById(R.id.lvTipos);

        adapterTipos = new AdapterTipos(view.getContext(),
                R.layout.item_tipos_fragment_list,
                null,
                new String[]{   },
                new int[]{  },
                0);

        lvTipos.setAdapter(adapterTipos);

        return view;
    }

    @Override
    public Loader<Cursor> onCreateLoader(int id, Bundle args) {
        String[] selectionArguments = stringArraylist.toArray(new String[stringArraylist.size()]);
        return  new CursorLoader(getContext(),
                            TiposColumns.CONTENT_URI,
                            null,
                            null,
                            null,
                            "");

    }

    @Override
    public void onLoadFinished(Loader<Cursor> loader, Cursor data) {
        adapterTipos.swapCursor(data);
    }

    @Override
    public void onLoaderReset(Loader<Cursor> loader) {
        adapterTipos.swapCursor(null);
    }
}
