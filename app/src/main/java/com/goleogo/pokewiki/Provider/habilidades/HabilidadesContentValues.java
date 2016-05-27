package com.goleogo.pokewiki.Provider.habilidades;

import java.util.Date;

import android.content.Context;
import android.content.ContentResolver;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import com.goleogo.pokewiki.Provider.base.AbstractContentValues;

/**
 * Content values wrapper for the {@code habilidades} table.
 */
public class HabilidadesContentValues extends AbstractContentValues {
    @Override
    public Uri uri() {
        return HabilidadesColumns.CONTENT_URI;
    }

    /**
     * Update row(s) using the values stored by this object and the given selection.
     *
     * @param contentResolver The content resolver to use.
     * @param where The selection to use (can be {@code null}).
     */
    public int update(ContentResolver contentResolver, @Nullable HabilidadesSelection where) {
        return contentResolver.update(uri(), values(), where == null ? null : where.sel(), where == null ? null : where.args());
    }

    /**
     * Update row(s) using the values stored by this object and the given selection.
     *
     * @param contentResolver The content resolver to use.
     * @param where The selection to use (can be {@code null}).
     */
    public int update(Context context, @Nullable HabilidadesSelection where) {
        return context.getContentResolver().update(uri(), values(), where == null ? null : where.sel(), where == null ? null : where.args());
    }

    /**
     * idHabilidad
     */
    public HabilidadesContentValues putIdhabilidad(@Nullable Integer value) {
        mContentValues.put(HabilidadesColumns.IDHABILIDAD, value);
        return this;
    }

    public HabilidadesContentValues putIdhabilidadNull() {
        mContentValues.putNull(HabilidadesColumns.IDHABILIDAD);
        return this;
    }

    /**
     * nombre
     */
    public HabilidadesContentValues putName(@Nullable String value) {
        mContentValues.put(HabilidadesColumns.NAME, value);
        return this;
    }

    public HabilidadesContentValues putNameNull() {
        mContentValues.putNull(HabilidadesColumns.NAME);
        return this;
    }

    /**
     * generación
     */
    public HabilidadesContentValues putGeneration(@Nullable String value) {
        mContentValues.put(HabilidadesColumns.GENERATION, value);
        return this;
    }

    public HabilidadesContentValues putGenerationNull() {
        mContentValues.putNull(HabilidadesColumns.GENERATION);
        return this;
    }
}
