package com.goleogo.pokewiki.Provider.movimientos;

import java.util.Date;

import android.content.Context;
import android.content.ContentResolver;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import com.goleogo.pokewiki.Provider.base.AbstractContentValues;

/**
 * Content values wrapper for the {@code movimientos} table.
 */
public class MovimientosContentValues extends AbstractContentValues {
    @Override
    public Uri uri() {
        return MovimientosColumns.CONTENT_URI;
    }

    /**
     * Update row(s) using the values stored by this object and the given selection.
     *
     * @param contentResolver The content resolver to use.
     * @param where The selection to use (can be {@code null}).
     */
    public int update(ContentResolver contentResolver, @Nullable MovimientosSelection where) {
        return contentResolver.update(uri(), values(), where == null ? null : where.sel(), where == null ? null : where.args());
    }

    /**
     * Update row(s) using the values stored by this object and the given selection.
     *
     * @param contentResolver The content resolver to use.
     * @param where The selection to use (can be {@code null}).
     */
    public int update(Context context, @Nullable MovimientosSelection where) {
        return context.getContentResolver().update(uri(), values(), where == null ? null : where.sel(), where == null ? null : where.args());
    }

    /**
     * idMovimiento
     */
    public MovimientosContentValues putIdmovimiento(@Nullable Integer value) {
        mContentValues.put(MovimientosColumns.IDMOVIMIENTO, value);
        return this;
    }

    public MovimientosContentValues putIdmovimientoNull() {
        mContentValues.putNull(MovimientosColumns.IDMOVIMIENTO);
        return this;
    }

    /**
     * nombre
     */
    public MovimientosContentValues putName(@Nullable String value) {
        mContentValues.put(MovimientosColumns.NAME, value);
        return this;
    }

    public MovimientosContentValues putNameNull() {
        mContentValues.putNull(MovimientosColumns.NAME);
        return this;
    }

    /**
     * accuracy
     */
    public MovimientosContentValues putAccuracy(int value) {
        mContentValues.put(MovimientosColumns.ACCURACY, value);
        return this;
    }


    /**
     * pp
     */
    public MovimientosContentValues putPp(@Nullable Integer value) {
        mContentValues.put(MovimientosColumns.PP, value);
        return this;
    }

    public MovimientosContentValues putPpNull() {
        mContentValues.putNull(MovimientosColumns.PP);
        return this;
    }
}
