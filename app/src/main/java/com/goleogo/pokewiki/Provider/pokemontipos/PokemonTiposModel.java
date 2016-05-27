package com.goleogo.pokewiki.Provider.pokemontipos;

import com.goleogo.pokewiki.Provider.base.BaseModel;

import java.util.Date;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

/**
 * Join de Pokemon y Tipos. Un pokemon puede tener varios tipos, un tipo puede ser de varios pokemon.
 */
public interface PokemonTiposModel extends BaseModel {

    /**
     * Get the {@code pokemon_id} value.
     */
    int getPokemonId();

    /**
     * Get the {@code tipos_id} value.
     */
    int getTiposId();
}
