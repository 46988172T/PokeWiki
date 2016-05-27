package com.goleogo.pokewiki.Provider.tipos;

import java.util.Date;

import android.database.Cursor;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import com.goleogo.pokewiki.Provider.base.AbstractCursor;

/**
 * Cursor wrapper for the {@code tipos} table.
 */
public class TiposCursor extends AbstractCursor implements TiposModel {
    public TiposCursor(Cursor cursor) {
        super(cursor);
    }

    /**
     * Primary key.
     */
    public long getId() {
        Long res = getLongOrNull(TiposColumns._ID);
        if (res == null)
            throw new NullPointerException("The value of '_id' in the database was null, which is not allowed according to the model definition");
        return res;
    }

    /**
     * idTipos
     * Can be {@code null}.
     */
    @Nullable
    public Integer getIdtipos() {
        Integer res = getIntegerOrNull(TiposColumns.IDTIPOS);
        return res;
    }

    /**
     * nombre
     * Can be {@code null}.
     */
    @Nullable
    public String getName() {
        String res = getStringOrNull(TiposColumns.NAME);
        return res;
    }

    /**
     * generación
     * Cannot be {@code null}.
     */
    @NonNull
    public String getGeneration() {
        String res = getStringOrNull(TiposColumns.GENERATION);
        if (res == null)
            throw new NullPointerException("The value of 'generation' in the database was null, which is not allowed according to the model definition");
        return res;
    }
}
