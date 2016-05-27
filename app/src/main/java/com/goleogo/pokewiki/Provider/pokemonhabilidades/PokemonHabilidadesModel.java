package com.goleogo.pokewiki.Provider.pokemonhabilidades;

import com.goleogo.pokewiki.Provider.base.BaseModel;

import java.util.Date;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

/**
 * Join de Pokemon y Habilidades. Un pokemon puede tener varios habilidades, una habilidad puede ser de varios pokemon.
 */
public interface PokemonHabilidadesModel extends BaseModel {

    /**
     * Get the {@code pokemon_id} value.
     */
    int getPokemonId();

    /**
     * Get the {@code habilidades_id} value.
     */
    int getHabilidadesId();
}
