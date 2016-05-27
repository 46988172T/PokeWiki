package com.goleogo.pokewiki.Provider.pokemon;

import java.util.Date;

import android.content.Context;
import android.content.ContentResolver;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import com.goleogo.pokewiki.Provider.base.AbstractContentValues;

/**
 * Content values wrapper for the {@code pokemon} table.
 */
public class PokemonContentValues extends AbstractContentValues {
    @Override
    public Uri uri() {
        return PokemonColumns.CONTENT_URI;
    }

    /**
     * Update row(s) using the values stored by this object and the given selection.
     *
     * @param contentResolver The content resolver to use.
     * @param where The selection to use (can be {@code null}).
     */
    public int update(ContentResolver contentResolver, @Nullable PokemonSelection where) {
        return contentResolver.update(uri(), values(), where == null ? null : where.sel(), where == null ? null : where.args());
    }

    /**
     * Update row(s) using the values stored by this object and the given selection.
     *
     * @param contentResolver The content resolver to use.
     * @param where The selection to use (can be {@code null}).
     */
    public int update(Context context, @Nullable PokemonSelection where) {
        return context.getContentResolver().update(uri(), values(), where == null ? null : where.sel(), where == null ? null : where.args());
    }

    /**
     * idPokemon
     */
    public PokemonContentValues putIdpokemon(@Nullable Integer value) {
        mContentValues.put(PokemonColumns.IDPOKEMON, value);
        return this;
    }

    public PokemonContentValues putIdpokemonNull() {
        mContentValues.putNull(PokemonColumns.IDPOKEMON);
        return this;
    }

    /**
     * nombre
     */
    public PokemonContentValues putName(@Nullable String value) {
        mContentValues.put(PokemonColumns.NAME, value);
        return this;
    }

    public PokemonContentValues putNameNull() {
        mContentValues.putNull(PokemonColumns.NAME);
        return this;
    }

    /**
     * experiencia_inicial
     */
    public PokemonContentValues putBaseExperience(@Nullable Integer value) {
        mContentValues.put(PokemonColumns.BASE_EXPERIENCE, value);
        return this;
    }

    public PokemonContentValues putBaseExperienceNull() {
        mContentValues.putNull(PokemonColumns.BASE_EXPERIENCE);
        return this;
    }

    /**
     * peso
     */
    public PokemonContentValues putWeight(@Nullable Integer value) {
        mContentValues.put(PokemonColumns.WEIGHT, value);
        return this;
    }

    public PokemonContentValues putWeightNull() {
        mContentValues.putNull(PokemonColumns.WEIGHT);
        return this;
    }

    /**
     * altura
     */
    public PokemonContentValues putHeight(@Nullable Integer value) {
        mContentValues.put(PokemonColumns.HEIGHT, value);
        return this;
    }

    public PokemonContentValues putHeightNull() {
        mContentValues.putNull(PokemonColumns.HEIGHT);
        return this;
    }

    /**
     * imagen
     */
    public PokemonContentValues putImage(@NonNull String value) {
        if (value == null) throw new IllegalArgumentException("image must not be null");
        mContentValues.put(PokemonColumns.IMAGE, value);
        return this;
    }

}
