package com.goleogo.pokewiki.Provider.pokemonmovimientos;

import com.goleogo.pokewiki.Provider.base.BaseModel;

import java.util.Date;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

/**
 * Join de Pokemon y Movimientos. Un pokemon puede tener varios movimientos, un movimiento puede ser de varios pokemon.
 */
public interface PokemonMovimientosModel extends BaseModel {

    /**
     * Get the {@code pokemon_id} value.
     */
    int getPokemonId();

    /**
     * Get the {@code movimientos_id} value.
     */
    int getMovimientosId();
}
