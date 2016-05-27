package com.goleogo.pokewiki.Provider.pokemontipos;

import java.util.Date;

import android.content.Context;
import android.content.ContentResolver;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import com.goleogo.pokewiki.Provider.base.AbstractContentValues;

/**
 * Content values wrapper for the {@code pokemon_tipos} table.
 */
public class PokemonTiposContentValues extends AbstractContentValues {
    @Override
    public Uri uri() {
        return PokemonTiposColumns.CONTENT_URI;
    }

    /**
     * Update row(s) using the values stored by this object and the given selection.
     *
     * @param contentResolver The content resolver to use.
     * @param where The selection to use (can be {@code null}).
     */
    public int update(ContentResolver contentResolver, @Nullable PokemonTiposSelection where) {
        return contentResolver.update(uri(), values(), where == null ? null : where.sel(), where == null ? null : where.args());
    }

    /**
     * Update row(s) using the values stored by this object and the given selection.
     *
     * @param contentResolver The content resolver to use.
     * @param where The selection to use (can be {@code null}).
     */
    public int update(Context context, @Nullable PokemonTiposSelection where) {
        return context.getContentResolver().update(uri(), values(), where == null ? null : where.sel(), where == null ? null : where.args());
    }

    public PokemonTiposContentValues putPokemonId(int value) {
        mContentValues.put(PokemonTiposColumns.POKEMON_ID, value);
        return this;
    }


    public PokemonTiposContentValues putTiposId(int value) {
        mContentValues.put(PokemonTiposColumns.TIPOS_ID, value);
        return this;
    }

}
