package com.goleogo.pokewiki.Provider.pokemonmovimientos;

import java.util.Date;

import android.content.Context;
import android.content.ContentResolver;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import com.goleogo.pokewiki.Provider.base.AbstractContentValues;

/**
 * Content values wrapper for the {@code pokemon_movimientos} table.
 */
public class PokemonMovimientosContentValues extends AbstractContentValues {
    @Override
    public Uri uri() {
        return PokemonMovimientosColumns.CONTENT_URI;
    }

    /**
     * Update row(s) using the values stored by this object and the given selection.
     *
     * @param contentResolver The content resolver to use.
     * @param where The selection to use (can be {@code null}).
     */
    public int update(ContentResolver contentResolver, @Nullable PokemonMovimientosSelection where) {
        return contentResolver.update(uri(), values(), where == null ? null : where.sel(), where == null ? null : where.args());
    }

    /**
     * Update row(s) using the values stored by this object and the given selection.
     *
     * @param contentResolver The content resolver to use.
     * @param where The selection to use (can be {@code null}).
     */
    public int update(Context context, @Nullable PokemonMovimientosSelection where) {
        return context.getContentResolver().update(uri(), values(), where == null ? null : where.sel(), where == null ? null : where.args());
    }

    public PokemonMovimientosContentValues putPokemonId(int value) {
        mContentValues.put(PokemonMovimientosColumns.POKEMON_ID, value);
        return this;
    }


    public PokemonMovimientosContentValues putMovimientosId(int value) {
        mContentValues.put(PokemonMovimientosColumns.MOVIMIENTOS_ID, value);
        return this;
    }

}
