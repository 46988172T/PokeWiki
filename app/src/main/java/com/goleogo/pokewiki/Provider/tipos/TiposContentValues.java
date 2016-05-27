package com.goleogo.pokewiki.Provider.tipos;

import java.util.Date;

import android.content.Context;
import android.content.ContentResolver;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import com.goleogo.pokewiki.Provider.base.AbstractContentValues;

/**
 * Content values wrapper for the {@code tipos} table.
 */
public class TiposContentValues extends AbstractContentValues {
    @Override
    public Uri uri() {
        return TiposColumns.CONTENT_URI;
    }

    /**
     * Update row(s) using the values stored by this object and the given selection.
     *
     * @param contentResolver The content resolver to use.
     * @param where The selection to use (can be {@code null}).
     */
    public int update(ContentResolver contentResolver, @Nullable TiposSelection where) {
        return contentResolver.update(uri(), values(), where == null ? null : where.sel(), where == null ? null : where.args());
    }

    /**
     * Update row(s) using the values stored by this object and the given selection.
     *
     * @param contentResolver The content resolver to use.
     * @param where The selection to use (can be {@code null}).
     */
    public int update(Context context, @Nullable TiposSelection where) {
        return context.getContentResolver().update(uri(), values(), where == null ? null : where.sel(), where == null ? null : where.args());
    }

    /**
     * idTipos
     */
    public TiposContentValues putIdtipos(@Nullable Integer value) {
        mContentValues.put(TiposColumns.IDTIPOS, value);
        return this;
    }

    public TiposContentValues putIdtiposNull() {
        mContentValues.putNull(TiposColumns.IDTIPOS);
        return this;
    }

    /**
     * nombre
     */
    public TiposContentValues putName(@Nullable String value) {
        mContentValues.put(TiposColumns.NAME, value);
        return this;
    }

    public TiposContentValues putNameNull() {
        mContentValues.putNull(TiposColumns.NAME);
        return this;
    }

    /**
     * generación
     */
    public TiposContentValues putGeneration(@NonNull String value) {
        if (value == null) throw new IllegalArgumentException("generation must not be null");
        mContentValues.put(TiposColumns.GENERATION, value);
        return this;
    }

}
