package com.goleogo.pokewiki.Provider.habilidades;

import java.util.Date;

import android.content.Context;
import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;

import com.goleogo.pokewiki.Provider.base.AbstractSelection;

/**
 * Selection for the {@code habilidades} table.
 */
public class HabilidadesSelection extends AbstractSelection<HabilidadesSelection> {
    @Override
    protected Uri baseUri() {
        return HabilidadesColumns.CONTENT_URI;
    }

    /**
     * Query the given content resolver using this selection.
     *
     * @param contentResolver The content resolver to query.
     * @param projection A list of which columns to return. Passing null will return all columns, which is inefficient.
     * @return A {@code HabilidadesCursor} object, which is positioned before the first entry, or null.
     */
    public HabilidadesCursor query(ContentResolver contentResolver, String[] projection) {
        Cursor cursor = contentResolver.query(uri(), projection, sel(), args(), order());
        if (cursor == null) return null;
        return new HabilidadesCursor(cursor);
    }

    /**
     * Equivalent of calling {@code query(contentResolver, null)}.
     */
    public HabilidadesCursor query(ContentResolver contentResolver) {
        return query(contentResolver, null);
    }

    /**
     * Query the given content resolver using this selection.
     *
     * @param context The context to use for the query.
     * @param projection A list of which columns to return. Passing null will return all columns, which is inefficient.
     * @return A {@code HabilidadesCursor} object, which is positioned before the first entry, or null.
     */
    public HabilidadesCursor query(Context context, String[] projection) {
        Cursor cursor = context.getContentResolver().query(uri(), projection, sel(), args(), order());
        if (cursor == null) return null;
        return new HabilidadesCursor(cursor);
    }

    /**
     * Equivalent of calling {@code query(context, null)}.
     */
    public HabilidadesCursor query(Context context) {
        return query(context, null);
    }


    public HabilidadesSelection id(long... value) {
        addEquals("habilidades." + HabilidadesColumns._ID, toObjectArray(value));
        return this;
    }

    public HabilidadesSelection idNot(long... value) {
        addNotEquals("habilidades." + HabilidadesColumns._ID, toObjectArray(value));
        return this;
    }

    public HabilidadesSelection orderById(boolean desc) {
        orderBy("habilidades." + HabilidadesColumns._ID, desc);
        return this;
    }

    public HabilidadesSelection orderById() {
        return orderById(false);
    }

    public HabilidadesSelection idhabilidad(Integer... value) {
        addEquals(HabilidadesColumns.IDHABILIDAD, value);
        return this;
    }

    public HabilidadesSelection idhabilidadNot(Integer... value) {
        addNotEquals(HabilidadesColumns.IDHABILIDAD, value);
        return this;
    }

    public HabilidadesSelection idhabilidadGt(int value) {
        addGreaterThan(HabilidadesColumns.IDHABILIDAD, value);
        return this;
    }

    public HabilidadesSelection idhabilidadGtEq(int value) {
        addGreaterThanOrEquals(HabilidadesColumns.IDHABILIDAD, value);
        return this;
    }

    public HabilidadesSelection idhabilidadLt(int value) {
        addLessThan(HabilidadesColumns.IDHABILIDAD, value);
        return this;
    }

    public HabilidadesSelection idhabilidadLtEq(int value) {
        addLessThanOrEquals(HabilidadesColumns.IDHABILIDAD, value);
        return this;
    }

    public HabilidadesSelection orderByIdhabilidad(boolean desc) {
        orderBy(HabilidadesColumns.IDHABILIDAD, desc);
        return this;
    }

    public HabilidadesSelection orderByIdhabilidad() {
        orderBy(HabilidadesColumns.IDHABILIDAD, false);
        return this;
    }

    public HabilidadesSelection name(String... value) {
        addEquals(HabilidadesColumns.NAME, value);
        return this;
    }

    public HabilidadesSelection nameNot(String... value) {
        addNotEquals(HabilidadesColumns.NAME, value);
        return this;
    }

    public HabilidadesSelection nameLike(String... value) {
        addLike(HabilidadesColumns.NAME, value);
        return this;
    }

    public HabilidadesSelection nameContains(String... value) {
        addContains(HabilidadesColumns.NAME, value);
        return this;
    }

    public HabilidadesSelection nameStartsWith(String... value) {
        addStartsWith(HabilidadesColumns.NAME, value);
        return this;
    }

    public HabilidadesSelection nameEndsWith(String... value) {
        addEndsWith(HabilidadesColumns.NAME, value);
        return this;
    }

    public HabilidadesSelection orderByName(boolean desc) {
        orderBy(HabilidadesColumns.NAME, desc);
        return this;
    }

    public HabilidadesSelection orderByName() {
        orderBy(HabilidadesColumns.NAME, false);
        return this;
    }

    public HabilidadesSelection generation(String... value) {
        addEquals(HabilidadesColumns.GENERATION, value);
        return this;
    }

    public HabilidadesSelection generationNot(String... value) {
        addNotEquals(HabilidadesColumns.GENERATION, value);
        return this;
    }

    public HabilidadesSelection generationLike(String... value) {
        addLike(HabilidadesColumns.GENERATION, value);
        return this;
    }

    public HabilidadesSelection generationContains(String... value) {
        addContains(HabilidadesColumns.GENERATION, value);
        return this;
    }

    public HabilidadesSelection generationStartsWith(String... value) {
        addStartsWith(HabilidadesColumns.GENERATION, value);
        return this;
    }

    public HabilidadesSelection generationEndsWith(String... value) {
        addEndsWith(HabilidadesColumns.GENERATION, value);
        return this;
    }

    public HabilidadesSelection orderByGeneration(boolean desc) {
        orderBy(HabilidadesColumns.GENERATION, desc);
        return this;
    }

    public HabilidadesSelection orderByGeneration() {
        orderBy(HabilidadesColumns.GENERATION, false);
        return this;
    }
}
