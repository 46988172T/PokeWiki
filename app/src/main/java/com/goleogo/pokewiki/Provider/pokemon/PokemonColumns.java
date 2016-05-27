package com.goleogo.pokewiki.Provider.pokemon;

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
 * Lista de pokemon
 */
public class PokemonColumns implements BaseColumns {
    public static final String TABLE_NAME = "pokemon";
    public static final Uri CONTENT_URI = Uri.parse(PokeWikiProvider.CONTENT_URI_BASE + "/" + TABLE_NAME);

    /**
     * Primary key.
     */
    public static final String _ID = BaseColumns._ID;

    /**
     * idPokemon
     */
    public static final String IDPOKEMON = "idPokemon";

    /**
     * nombre
     */
    public static final String NAME = "pokemon__name";

    /**
     * experiencia_inicial
     */
    public static final String BASE_EXPERIENCE = "base_experience";

    /**
     * peso
     */
    public static final String WEIGHT = "weight";

    /**
     * altura
     */
    public static final String HEIGHT = "height";

    /**
     * imagen
     */
    public static final String IMAGE = "image";


    public static final String DEFAULT_ORDER = TABLE_NAME + "." +_ID;

    // @formatter:off
    public static final String[] ALL_COLUMNS = new String[] {
            _ID,
            IDPOKEMON,
            NAME,
            BASE_EXPERIENCE,
            WEIGHT,
            HEIGHT,
            IMAGE
    };
    // @formatter:on

    public static boolean hasColumns(String[] projection) {
        if (projection == null) return true;
        for (String c : projection) {
            if (c.equals(IDPOKEMON) || c.contains("." + IDPOKEMON)) return true;
            if (c.equals(NAME) || c.contains("." + NAME)) return true;
            if (c.equals(BASE_EXPERIENCE) || c.contains("." + BASE_EXPERIENCE)) return true;
            if (c.equals(WEIGHT) || c.contains("." + WEIGHT)) return true;
            if (c.equals(HEIGHT) || c.contains("." + HEIGHT)) return true;
            if (c.equals(IMAGE) || c.contains("." + IMAGE)) return true;
        }
        return false;
    }

}
