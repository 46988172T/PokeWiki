package com.goleogo.pokewiki.Provider.pokemontipos;

import android.net.Uri;
import android.provider.BaseColumns;

import com.goleogo.pokewiki.Provider.PokeWikiProvider;
import com.goleogo.pokewiki.Provider.habilidades.HabilidadesColumns;
import com.goleogo.pokewiki.Provider.movimientos.MovimientosColumns;
import com.goleogo.pokewiki.Provider.pokemon.PokemonColumns;
import com.goleogo.pokewiki.Provider.pokemonhabilidades.PokemonHabilidadesColumns;
import com.goleogo.pokewiki.Provider.pokemonmovimientos.PokemonMovimientosColumns;
import com.goleogo.pokewiki.Provider.pokemontipos.PokemonTiposColumns;
import com.goleogo.pokewiki.Provider.tipos.TiposColumns;

/**
 * Join de Pokemon y Tipos. Un pokemon puede tener varios tipos, un tipo puede ser de varios pokemon.
 */
public class PokemonTiposColumns implements BaseColumns {
    public static final String TABLE_NAME = "pokemon_tipos";
    public static final Uri CONTENT_URI = Uri.parse(PokeWikiProvider.CONTENT_URI_BASE + "/" + TABLE_NAME);

    /**
     * Primary key.
     */
    public static final String _ID = BaseColumns._ID;

    public static final String POKEMON_ID = "pokemon_id";

    public static final String TIPOS_ID = "tipos_id";


    public static final String DEFAULT_ORDER = TABLE_NAME + "." +_ID;

    // @formatter:off
    public static final String[] ALL_COLUMNS = new String[] {
            _ID,
            POKEMON_ID,
            TIPOS_ID
    };
    // @formatter:on

    public static boolean hasColumns(String[] projection) {
        if (projection == null) return true;
        for (String c : projection) {
            if (c.equals(POKEMON_ID) || c.contains("." + POKEMON_ID)) return true;
            if (c.equals(TIPOS_ID) || c.contains("." + TIPOS_ID)) return true;
        }
        return false;
    }

    public static final String PREFIX_POKEMON = TABLE_NAME + "__" + PokemonColumns.TABLE_NAME;
    public static final String PREFIX_TIPOS = TABLE_NAME + "__" + TiposColumns.TABLE_NAME;
}
