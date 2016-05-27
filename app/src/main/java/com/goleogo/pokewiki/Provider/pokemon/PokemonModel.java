package com.goleogo.pokewiki.Provider.pokemon;

import com.goleogo.pokewiki.Provider.base.BaseModel;

import java.util.Date;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

/**
 * Lista de pokemon
 */
public interface PokemonModel extends BaseModel {

    /**
     * idPokemon
     * Can be {@code null}.
     */
    @Nullable
    Integer getIdpokemon();

    /**
     * nombre
     * Can be {@code null}.
     */
    @Nullable
    String getName();

    /**
     * experiencia_inicial
     * Can be {@code null}.
     */
    @Nullable
    Integer getBaseExperience();

    /**
     * peso
     * Can be {@code null}.
     */
    @Nullable
    Integer getWeight();

    /**
     * altura
     * Can be {@code null}.
     */
    @Nullable
    Integer getHeight();

    /**
     * imagen
     * Cannot be {@code null}.
     */
    @NonNull
    String getImage();
}
