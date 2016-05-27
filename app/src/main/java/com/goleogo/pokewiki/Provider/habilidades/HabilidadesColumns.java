package com.goleogo.pokewiki.Provider.habilidades;

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
 * Lista de habilidades
 */
public class HabilidadesColumns implements BaseColumns {
    public static final String TABLE_NAME = "habilidades";
    public static final Uri CONTENT_URI = Uri.parse(PokeWikiProvider.CONTENT_URI_BASE + "/" + TABLE_NAME);

    /**
     * Primary key.
     */
    public static final String _ID = BaseColumns._ID;

    /**
     * idHabilidad
     */
    public static final String IDHABILIDAD = "idHabilidad";

    /**
     * nombre
     */
    public static final String NAME = "habilidades__name";

    /**
     * generación
     */
    public static final String GENERATION = "generation";


    public static final String DEFAULT_ORDER = TABLE_NAME + "." +_ID;

    // @formatter:off
    public static final String[] ALL_COLUMNS = new String[] {
            _ID,
            IDHABILIDAD,
            NAME,
            GENERATION
    };
    // @formatter:on

    public static boolean hasColumns(String[] projection) {
        if (projection == null) return true;
        for (String c : projection) {
            if (c.equals(IDHABILIDAD) || c.contains("." + IDHABILIDAD)) return true;
            if (c.equals(NAME) || c.contains("." + NAME)) return true;
            if (c.equals(GENERATION) || c.contains("." + GENERATION)) return true;
        }
        return false;
    }

}
