package com.goleogo.pokewiki.Provider.tipos;

import java.util.Date;

import android.content.Context;
import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;

import com.goleogo.pokewiki.Provider.base.AbstractSelection;

/**
 * Selection for the {@code tipos} table.
 */
public class TiposSelection extends AbstractSelection<TiposSelection> {
    @Override
    protected Uri baseUri() {
        return TiposColumns.CONTENT_URI;
    }

    /**
     * Query the given content resolver using this selection.
     *
     * @param contentResolver The content resolver to query.
     * @param projection A list of which columns to return. Passing null will return all columns, which is inefficient.
     * @return A {@code TiposCursor} object, which is positioned before the first entry, or null.
     */
    public TiposCursor query(ContentResolver contentResolver, String[] projection) {
        Cursor cursor = contentResolver.query(uri(), projection, sel(), args(), order());
        if (cursor == null) return null;
        return new TiposCursor(cursor);
    }

    /**
     * Equivalent of calling {@code query(contentResolver, null)}.
     */
    public TiposCursor query(ContentResolver contentResolver) {
        return query(contentResolver, null);
    }

    /**
     * Query the given content resolver using this selection.
     *
     * @param context The context to use for the query.
     * @param projection A list of which columns to return. Passing null will return all columns, which is inefficient.
     * @return A {@code TiposCursor} object, which is positioned before the first entry, or null.
     */
    public TiposCursor query(Context context, String[] projection) {
        Cursor cursor = context.getContentResolver().query(uri(), projection, sel(), args(), order());
        if (cursor == null) return null;
        return new TiposCursor(cursor);
    }

    /**
     * Equivalent of calling {@code query(context, null)}.
     */
    public TiposCursor query(Context context) {
        return query(context, null);
    }


    public TiposSelection id(long... value) {
        addEquals("tipos." + TiposColumns._ID, toObjectArray(value));
        return this;
    }

    public TiposSelection idNot(long... value) {
        addNotEquals("tipos." + TiposColumns._ID, toObjectArray(value));
        return this;
    }

    public TiposSelection orderById(boolean desc) {
        orderBy("tipos." + TiposColumns._ID, desc);
        return this;
    }

    public TiposSelection orderById() {
        return orderById(false);
    }

    public TiposSelection idtipos(Integer... value) {
        addEquals(TiposColumns.IDTIPOS, value);
        return this;
    }

    public TiposSelection idtiposNot(Integer... value) {
        addNotEquals(TiposColumns.IDTIPOS, value);
        return this;
    }

    public TiposSelection idtiposGt(int value) {
        addGreaterThan(TiposColumns.IDTIPOS, value);
        return this;
    }

    public TiposSelection idtiposGtEq(int value) {
        addGreaterThanOrEquals(TiposColumns.IDTIPOS, value);
        return this;
    }

    public TiposSelection idtiposLt(int value) {
        addLessThan(TiposColumns.IDTIPOS, value);
        return this;
    }

    public TiposSelection idtiposLtEq(int value) {
        addLessThanOrEquals(TiposColumns.IDTIPOS, value);
        return this;
    }

    public TiposSelection orderByIdtipos(boolean desc) {
        orderBy(TiposColumns.IDTIPOS, desc);
        return this;
    }

    public TiposSelection orderByIdtipos() {
        orderBy(TiposColumns.IDTIPOS, false);
        return this;
    }

    public TiposSelection name(String... value) {
        addEquals(TiposColumns.NAME, value);
        return this;
    }

    public TiposSelection nameNot(String... value) {
        addNotEquals(TiposColumns.NAME, value);
        return this;
    }

    public TiposSelection nameLike(String... value) {
        addLike(TiposColumns.NAME, value);
        return this;
    }

    public TiposSelection nameContains(String... value) {
        addContains(TiposColumns.NAME, value);
        return this;
    }

    public TiposSelection nameStartsWith(String... value) {
        addStartsWith(TiposColumns.NAME, value);
        return this;
    }

    public TiposSelection nameEndsWith(String... value) {
        addEndsWith(TiposColumns.NAME, value);
        return this;
    }

    public TiposSelection orderByName(boolean desc) {
        orderBy(TiposColumns.NAME, desc);
        return this;
    }

    public TiposSelection orderByName() {
        orderBy(TiposColumns.NAME, false);
        return this;
    }

    public TiposSelection generation(String... value) {
        addEquals(TiposColumns.GENERATION, value);
        return this;
    }

    public TiposSelection generationNot(String... value) {
        addNotEquals(TiposColumns.GENERATION, value);
        return this;
    }

    public TiposSelection generationLike(String... value) {
        addLike(TiposColumns.GENERATION, value);
        return this;
    }

    public TiposSelection generationContains(String... value) {
        addContains(TiposColumns.GENERATION, value);
        return this;
    }

    public TiposSelection generationStartsWith(String... value) {
        addStartsWith(TiposColumns.GENERATION, value);
        return this;
    }

    public TiposSelection generationEndsWith(String... value) {
        addEndsWith(TiposColumns.GENERATION, value);
        return this;
    }

    public TiposSelection orderByGeneration(boolean desc) {
        orderBy(TiposColumns.GENERATION, desc);
        return this;
    }

    public TiposSelection orderByGeneration() {
        orderBy(TiposColumns.GENERATION, false);
        return this;
    }
}
