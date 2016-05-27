package com.goleogo.pokewiki.Provider.movimientos;

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
 * Lista de movimientos
 */
public class MovimientosColumns implements BaseColumns {
    public static final String TABLE_NAME = "movimientos";
    public static final Uri CONTENT_URI = Uri.parse(PokeWikiProvider.CONTENT_URI_BASE + "/" + TABLE_NAME);

    /**
     * Primary key.
     */
    public static final String _ID = BaseColumns._ID;

    /**
     * idMovimiento
     */
    public static final String IDMOVIMIENTO = "idMovimiento";

    /**
     * nombre
     */
    public static final String NAME = "movimientos__name";

    /**
     * accuracy
     */
    public static final String ACCURACY = "accuracy";

    /**
     * pp
     */
    public static final String PP = "pp";


    public static final String DEFAULT_ORDER = TABLE_NAME + "." +_ID;

    // @formatter:off
    public static final String[] ALL_COLUMNS = new String[] {
            _ID,
            IDMOVIMIENTO,
            NAME,
            ACCURACY,
            PP
    };
    // @formatter:on

    public static boolean hasColumns(String[] projection) {
        if (projection == null) return true;
        for (String c : projection) {
            if (c.equals(IDMOVIMIENTO) || c.contains("." + IDMOVIMIENTO)) return true;
            if (c.equals(NAME) || c.contains("." + NAME)) return true;
            if (c.equals(ACCURACY) || c.contains("." + ACCURACY)) return true;
            if (c.equals(PP) || c.contains("." + PP)) return true;
        }
        return false;
    }

}
