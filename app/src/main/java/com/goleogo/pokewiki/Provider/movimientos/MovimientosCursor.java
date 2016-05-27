package com.goleogo.pokewiki.Provider.movimientos;

import java.util.Date;

import android.database.Cursor;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import com.goleogo.pokewiki.Provider.base.AbstractCursor;

/**
 * Cursor wrapper for the {@code movimientos} table.
 */
public class MovimientosCursor extends AbstractCursor implements MovimientosModel {
    public MovimientosCursor(Cursor cursor) {
        super(cursor);
    }

    /**
     * Primary key.
     */
    public long getId() {
        Long res = getLongOrNull(MovimientosColumns._ID);
        if (res == null)
            throw new NullPointerException("The value of '_id' in the database was null, which is not allowed according to the model definition");
        return res;
    }

    /**
     * idMovimiento
     * Can be {@code null}.
     */
    @Nullable
    public Integer getIdmovimiento() {
        Integer res = getIntegerOrNull(MovimientosColumns.IDMOVIMIENTO);
        return res;
    }

    /**
     * nombre
     * Can be {@code null}.
     */
    @Nullable
    public String getName() {
        String res = getStringOrNull(MovimientosColumns.NAME);
        return res;
    }

    /**
     * accuracy
     */
    public int getAccuracy() {
        Integer res = getIntegerOrNull(MovimientosColumns.ACCURACY);
        if (res == null)
            throw new NullPointerException("The value of 'accuracy' in the database was null, which is not allowed according to the model definition");
        return res;
    }

    /**
     * pp
     * Can be {@code null}.
     */
    @Nullable
    public Integer getPp() {
        Integer res = getIntegerOrNull(MovimientosColumns.PP);
        return res;
    }
}
