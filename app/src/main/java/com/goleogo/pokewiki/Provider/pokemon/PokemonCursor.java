package com.goleogo.pokewiki.Provider.pokemon;

import java.util.Date;

import android.database.Cursor;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import com.goleogo.pokewiki.Provider.base.AbstractCursor;

/**
 * Cursor wrapper for the {@code pokemon} table.
 */
public class PokemonCursor extends AbstractCursor implements PokemonModel {
    public PokemonCursor(Cursor cursor) {
        super(cursor);
    }

    /**
     * Primary key.
     */
    public long getId() {
        Long res = getLongOrNull(PokemonColumns._ID);
        if (res == null)
            throw new NullPointerException("The value of '_id' in the database was null, which is not allowed according to the model definition");
        return res;
    }

    /**
     * idPokemon
     * Can be {@code null}.
     */
    @Nullable
    public Integer getIdpokemon() {
        Integer res = getIntegerOrNull(PokemonColumns.IDPOKEMON);
        return res;
    }

    /**
     * nombre
     * Can be {@code null}.
     */
    @Nullable
    public String getName() {
        String res = getStringOrNull(PokemonColumns.NAME);
        return res;
    }

    /**
     * experiencia_inicial
     * Can be {@code null}.
     */
    @Nullable
    public Integer getBaseExperience() {
        Integer res = getIntegerOrNull(PokemonColumns.BASE_EXPERIENCE);
        return res;
    }

    /**
     * peso
     * Can be {@code null}.
     */
    @Nullable
    public Integer getWeight() {
        Integer res = getIntegerOrNull(PokemonColumns.WEIGHT);
        return res;
    }

    /**
     * altura
     * Can be {@code null}.
     */
    @Nullable
    public Integer getHeight() {
        Integer res = getIntegerOrNull(PokemonColumns.HEIGHT);
        return res;
    }

    /**
     * imagen
     * Cannot be {@code null}.
     */
    @NonNull
    public String getImage() {
        String res = getStringOrNull(PokemonColumns.IMAGE);
        if (res == null)
            throw new NullPointerException("The value of 'image' in the database was null, which is not allowed according to the model definition");
        return res;
    }
}
