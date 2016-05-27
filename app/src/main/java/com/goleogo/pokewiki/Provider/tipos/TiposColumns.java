package com.goleogo.pokewiki.Provider.tipos;

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
 * Lista de tipos
 */
public class TiposColumns implements BaseColumns {
    public static final String TABLE_NAME = "tipos";
    public static final Uri CONTENT_URI = Uri.parse(PokeWikiProvider.CONTENT_URI_BASE + "/" + TABLE_NAME);

    /**
     * Primary key.
     */
    public static final String _ID = BaseColumns._ID;

    /**
     * idTipos
     */
    public static final String IDTIPOS = "idTipos";

    /**
     * nombre
     */
    public static final String NAME = "tipos__name";

    /**
     * generación
     */
    public static final String GENERATION = "generation";


    public static final String DEFAULT_ORDER = TABLE_NAME + "." +_ID;

    // @formatter:off
    public static final String[] ALL_COLUMNS = new String[] {
            _ID,
            IDTIPOS,
            NAME,
            GENERATION
    };
    // @formatter:on

    public static boolean hasColumns(String[] projection) {
        if (projection == null) return true;
        for (String c : projection) {
            if (c.equals(IDTIPOS) || c.contains("." + IDTIPOS)) return true;
            if (c.equals(NAME) || c.contains("." + NAME)) return true;
            if (c.equals(GENERATION) || c.contains("." + GENERATION)) return true;
        }
        return false;
    }

}
