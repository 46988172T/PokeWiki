package com.goleogo.pokewiki.Provider.pokemonhabilidades;

import java.util.Date;

import android.content.Context;
import android.content.ContentResolver;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import com.goleogo.pokewiki.Provider.base.AbstractContentValues;

/**
 * Content values wrapper for the {@code pokemon_habilidades} table.
 */
public class PokemonHabilidadesContentValues extends AbstractContentValues {
    @Override
    public Uri uri() {
        return PokemonHabilidadesColumns.CONTENT_URI;
    }

    /**
     * Update row(s) using the values stored by this object and the given selection.
     *
     * @param contentResolver The content resolver to use.
     * @param where The selection to use (can be {@code null}).
     */
    public int update(ContentResolver contentResolver, @Nullable PokemonHabilidadesSelection where) {
        return contentResolver.update(uri(), values(), where == null ? null : where.sel(), where == null ? null : where.args());
    }

    /**
     * Update row(s) using the values stored by this object and the given selection.
     *
     * @param contentResolver The content resolver to use.
     * @param where The selection to use (can be {@code null}).
     */
    public int update(Context context, @Nullable PokemonHabilidadesSelection where) {
        return context.getContentResolver().update(uri(), values(), where == null ? null : where.sel(), where == null ? null : where.args());
    }

    public PokemonHabilidadesContentValues putPokemonId(int value) {
        mContentValues.put(PokemonHabilidadesColumns.POKEMON_ID, value);
        return this;
    }


    public PokemonHabilidadesContentValues putHabilidadesId(int value) {
        mContentValues.put(PokemonHabilidadesColumns.HABILIDADES_ID, value);
        return this;
    }

}
