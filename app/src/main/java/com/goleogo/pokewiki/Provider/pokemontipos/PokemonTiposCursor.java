package com.goleogo.pokewiki.Provider.pokemontipos;

import java.util.Date;

import android.database.Cursor;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import com.goleogo.pokewiki.Provider.base.AbstractCursor;
import com.goleogo.pokewiki.Provider.pokemon.*;
import com.goleogo.pokewiki.Provider.tipos.*;

/**
 * Cursor wrapper for the {@code pokemon_tipos} table.
 */
public class PokemonTiposCursor extends AbstractCursor implements PokemonTiposModel {
    public PokemonTiposCursor(Cursor cursor) {
        super(cursor);
    }

    /**
     * Primary key.
     */
    public long getId() {
        Long res = getLongOrNull(PokemonTiposColumns._ID);
        if (res == null)
            throw new NullPointerException("The value of '_id' in the database was null, which is not allowed according to the model definition");
        return res;
    }

    /**
     * Get the {@code pokemon_id} value.
     */
    public int getPokemonId() {
        Integer res = getIntegerOrNull(PokemonTiposColumns.POKEMON_ID);
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
     * Get the {@code tipos_id} value.
     */
    public int getTiposId() {
        Integer res = getIntegerOrNull(PokemonTiposColumns.TIPOS_ID);
        if (res == null)
            throw new NullPointerException("The value of 'tipos_id' in the database was null, which is not allowed according to the model definition");
        return res;
    }

    /**
     * idTipos
     * Can be {@code null}.
     */
    @Nullable
    public Integer getTiposIdtipos() {
        Integer res = getIntegerOrNull(TiposColumns.IDTIPOS);
        return res;
    }

    /**
     * nombre
     * Can be {@code null}.
     */
    @Nullable
    public String getTiposName() {
        String res = getStringOrNull(TiposColumns.NAME);
        return res;
    }

    /**
     * generación
     * Cannot be {@code null}.
     */
    @NonNull
    public String getTiposGeneration() {
        String res = getStringOrNull(TiposColumns.GENERATION);
        if (res == null)
            throw new NullPointerException("The value of 'generation' in the database was null, which is not allowed according to the model definition");
        return res;
    }
}
