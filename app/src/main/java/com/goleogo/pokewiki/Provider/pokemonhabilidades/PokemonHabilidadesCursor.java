package com.goleogo.pokewiki.Provider.pokemonhabilidades;

import java.util.Date;

import android.database.Cursor;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import com.goleogo.pokewiki.Provider.base.AbstractCursor;
import com.goleogo.pokewiki.Provider.pokemon.*;
import com.goleogo.pokewiki.Provider.habilidades.*;

/**
 * Cursor wrapper for the {@code pokemon_habilidades} table.
 */
public class PokemonHabilidadesCursor extends AbstractCursor implements PokemonHabilidadesModel {
    public PokemonHabilidadesCursor(Cursor cursor) {
        super(cursor);
    }

    /**
     * Primary key.
     */
    public long getId() {
        Long res = getLongOrNull(PokemonHabilidadesColumns._ID);
        if (res == null)
            throw new NullPointerException("The value of '_id' in the database was null, which is not allowed according to the model definition");
        return res;
    }

    /**
     * Get the {@code pokemon_id} value.
     */
    public int getPokemonId() {
        Integer res = getIntegerOrNull(PokemonHabilidadesColumns.POKEMON_ID);
        if (res == null)
            throw new NullPointerException("The value of 'pokemon_id' in the database was null, which is not allowed according to the model definition");
        return res;
    }

    /**
     * idPokemon
     * Can be {@code null}.
     */
    @Nullable
    public Integer getPokemonIdpokemon() {
        Integer res = getIntegerOrNull(PokemonColumns.IDPOKEMON);
        return res;
    }

    /**
     * nombre
     * Can be {@code null}.
     */
    @Nullable
    public String getPokemonName() {
        String res = getStringOrNull(PokemonColumns.NAME);
        return res;
    }

    /**
     * experiencia_inicial
     * Can be {@code null}.
     */
    @Nullable
    public Integer getPokemonBaseExperience() {
        Integer res = getIntegerOrNull(PokemonColumns.BASE_EXPERIENCE);
        return res;
    }

    /**
     * peso
     * Can be {@code null}.
     */
    @Nullable
    public Integer getPokemonWeight() {
        Integer res = getIntegerOrNull(PokemonColumns.WEIGHT);
        return res;
    }

    /**
     * altura
     * Can be {@code null}.
     */
    @Nullable
    public Integer getPokemonHeight() {
        Integer res = getIntegerOrNull(PokemonColumns.HEIGHT);
        return res;
    }

    /**
     * imagen
     * Cannot be {@code null}.
     */
    @NonNull
    public String getPokemonImage() {
        String res = getStringOrNull(PokemonColumns.IMAGE);
        if (res == null)
            throw new NullPointerException("The value of 'image' in the database was null, which is not allowed according to the model definition");
        return res;
    }

    /**
     * Get the {@code habilidades_id} value.
     */
    public int getHabilidadesId() {
        Integer res = getIntegerOrNull(PokemonHabilidadesColumns.HABILIDADES_ID);
        if (res == null)
            throw new NullPointerException("The value of 'habilidades_id' in the database was null, which is not allowed according to the model definition");
        return res;
    }

    /**
     * idHabilidad
     * Can be {@code null}.
     */
    @Nullable
    public Integer getHabilidadesIdhabilidad() {
        Integer res = getIntegerOrNull(HabilidadesColumns.IDHABILIDAD);
        return res;
    }

    /**
     * nombre
     * Can be {@code null}.
     */
    @Nullable
    public String getHabilidadesName() {
        String res = getStringOrNull(HabilidadesColumns.NAME);
        return res;
    }

    /**
     * generación
     * Can be {@code null}.
     */
    @Nullable
    public String getHabilidadesGeneration() {
        String res = getStringOrNull(HabilidadesColumns.GENERATION);
        return res;
    }
}
