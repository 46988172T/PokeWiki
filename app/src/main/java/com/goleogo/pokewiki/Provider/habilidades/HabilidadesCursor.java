package com.goleogo.pokewiki.Provider.habilidades;

import java.util.Date;

import android.database.Cursor;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import com.goleogo.pokewiki.Provider.base.AbstractCursor;

/**
 * Cursor wrapper for the {@code habilidades} table.
 */
public class HabilidadesCursor extends AbstractCursor implements HabilidadesModel {
    public HabilidadesCursor(Cursor cursor) {
        super(cursor);
    }

    /**
     * Primary key.
     */
    public long getId() {
        Long res = getLongOrNull(HabilidadesColumns._ID);
        if (res == null)
            throw new NullPointerException("The value of '_id' in the database was null, which is not allowed according to the model definition");
        return res;
    }

    /**
     * idHabilidad
     * Can be {@code null}.
     */
    @Nullable
    public Integer getIdhabilidad() {
        Integer res = getIntegerOrNull(HabilidadesColumns.IDHABILIDAD);
        return res;
    }

    /**
     * nombre
     * Can be {@code null}.
     */
    @Nullable
    public String getName() {
        String res = getStringOrNull(HabilidadesColumns.NAME);
        return res;
    }

    /**
     * generación
     * Can be {@code null}.
     */
    @Nullable
    public String getGeneration() {
        String res = getStringOrNull(HabilidadesColumns.GENERATION);
        return res;
    }
}
