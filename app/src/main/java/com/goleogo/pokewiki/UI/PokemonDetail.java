package com.goleogo.pokewiki.UI;


import android.database.Cursor;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.goleogo.pokewiki.JSON.Pokemon.Pokemon;
import com.goleogo.pokewiki.Provider.pokemon.PokemonColumns;
import com.goleogo.pokewiki.Provider.pokemon.PokemonCursor;
import com.goleogo.pokewiki.Provider.pokemontipos.PokemonTiposColumns;
import com.goleogo.pokewiki.Provider.pokemontipos.PokemonTiposCursor;
import com.goleogo.pokewiki.Provider.pokemontipos.PokemonTiposSelection;
import com.goleogo.pokewiki.Provider.tipos.TiposColumns;
import com.goleogo.pokewiki.Provider.tipos.TiposCursor;
import com.goleogo.pokewiki.Provider.tipos.TiposSelection;
import com.goleogo.pokewiki.R;
import com.goleogo.pokewiki.UI.Fragments.HabilidadesFragment;
import com.goleogo.pokewiki.UI.Fragments.MovimientosFragment;
import com.goleogo.pokewiki.UI.Fragments.TiposFragment;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

public class PokemonDetail extends FragmentActivity {
    private static final String TAG = PokemonDetail.class.getSimpleName();
    TextView nombre, baseExperience, height, weight;
    ImageView imagenPokemon;
    TabLayout tabs;
    ViewPager viewPager;
    static Bundle bundle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pokemon_detail);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        /*setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);*/

        Long id = getIntent().getLongExtra("id", -1);


        nombre = (TextView)findViewById(R.id.nombrePokemon);
        baseExperience = (TextView)findViewById(R.id.baseExperience);
        height = (TextView)findViewById(R.id.height);
        weight = (TextView)findViewById(R.id.weight);
        imagenPokemon = (ImageView)findViewById(R.id.imagenPokemon);
        tabs = (TabLayout) findViewById(R.id.tabs);
        viewPager = (ViewPager) findViewById(R.id.viewpager);

        Cursor cursor = this.getContentResolver().query(
                PokemonColumns.CONTENT_URI,
                null,
                PokemonColumns._ID + " = ?",
                new String[]{String.valueOf(id)},
                null);

        PokemonCursor pokemonCursor = new PokemonCursor(cursor);
        cursor.moveToNext();

        bundle = new Bundle();
        ArrayList<String> stringArrayList = new ArrayList<>();

        nombre.setText(pokemonCursor.getName().toUpperCase());
        baseExperience.setText(String.valueOf(pokemonCursor.getBaseExperience()));
        height.setText(String.valueOf(pokemonCursor.getHeight()));
        weight.setText(String.valueOf(pokemonCursor.getWeight()));

        Picasso.with(getBaseContext())
                .load(pokemonCursor.getImage())
                .fit()
                .into(imagenPokemon);


        setupTabs();
        setupViewPager(viewPager);
        tabs.setupWithViewPager(viewPager);
//
        PokemonTiposSelection pokemonTiposSelection = new PokemonTiposSelection();
        pokemonTiposSelection.pokemonId((int)pokemonCursor.getId());
        String[] projection = {PokemonTiposColumns.POKEMON_ID, PokemonTiposColumns.TIPOS_ID};
        PokemonTiposCursor c = pokemonTiposSelection.query(getContentResolver(), projection);
        while (c.moveToNext()) {
            Log.e(TAG, String.valueOf(c.getTiposId()));
            stringArrayList.add(String.valueOf(c.getTiposId()));
        }
        bundle.putStringArrayList("idPoke", stringArrayList);
        c.close();


    }

    private void setupTabs() {
        tabs.addTab(tabs.newTab().setText("Types"));
        tabs.addTab(tabs.newTab().setText("Abilities"));
        tabs.addTab(tabs.newTab().setText("Moves"));
    }

    private void setupViewPager(ViewPager viewPager) {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new TiposFragment());
        adapter.addFragment(new HabilidadesFragment());
        adapter.addFragment(new MovimientosFragment());

        viewPager.setAdapter(adapter);
    }

}

class ViewPagerAdapter extends FragmentPagerAdapter {
    private final List<Fragment> mFragmentList = new ArrayList<>();

    public ViewPagerAdapter(FragmentManager manager) {
        super(manager);
    }

    @Override
    public Fragment getItem(int position) {
        mFragmentList.get(position).setArguments(PokemonDetail.bundle);
        return mFragmentList.get(position);
    }

    @Override
    public int getCount() {
        return mFragmentList.size();
    }

    public void addFragment(Fragment fragment) {

        mFragmentList.add(fragment);
    }
}
