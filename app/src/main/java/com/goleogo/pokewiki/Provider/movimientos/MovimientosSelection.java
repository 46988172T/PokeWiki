package com.goleogo.pokewiki.Provider.movimientos;

import java.util.Date;

import android.content.Context;
import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;

import com.goleogo.pokewiki.Provider.base.AbstractSelection;

/**
 * Selection for the {@code movimientos} table.
 */
public class MovimientosSelection extends AbstractSelection<MovimientosSelection> {
    @Override
    protected Uri baseUri() {
        return MovimientosColumns.CONTENT_URI;
    }

    /**
     * Query the given content resolver using this selection.
     *
     * @param contentResolver The content resolver to query.
     * @param projection A list of which columns to return. Passing null will return all columns, which is inefficient.
     * @return A {@code MovimientosCursor} object, which is positioned before the first entry, or null.
     */
    public MovimientosCursor query(ContentResolver contentResolver, String[] projection) {
        Cursor cursor = contentResolver.query(uri(), projection, sel(), args(), order());
        if (cursor == null) return null;
        return new MovimientosCursor(cursor);
    }

    /**
     * Equivalent of calling {@code query(contentResolver, null)}.
     */
    public MovimientosCursor query(ContentResolver contentResolver) {
        return query(contentResolver, null);
    }

    /**
     * Query the given content resolver using this selection.
     *
     * @param context The context to use for the query.
     * @param projection A list of which columns to return. Passing null will return all columns, which is inefficient.
     * @return A {@code MovimientosCursor} object, which is positioned before the first entry, or null.
     */
    public MovimientosCursor query(Context context, String[] projection) {
        Cursor cursor = context.getContentResolver().query(uri(), projection, sel(), args(), order());
        if (cursor == null) return null;
        return new MovimientosCursor(cursor);
    }

    /**
     * Equivalent of calling {@code query(context, null)}.
     */
    public MovimientosCursor query(Context context) {
        return query(context, null);
    }


    public MovimientosSelection id(long... value) {
        addEquals("movimientos." + MovimientosColumns._ID, toObjectArray(value));
        return this;
    }

    public MovimientosSelection idNot(long... value) {
        addNotEquals("movimientos." + MovimientosColumns._ID, toObjectArray(value));
        return this;
    }

    public MovimientosSelection orderById(boolean desc) {
        orderBy("movimientos." + MovimientosColumns._ID, desc);
        return this;
    }

    public MovimientosSelection orderById() {
        return orderById(false);
    }

    public MovimientosSelection idmovimiento(Integer... value) {
        addEquals(MovimientosColumns.IDMOVIMIENTO, value);
        return this;
    }

    public MovimientosSelection idmovimientoNot(Integer... value) {
        addNotEquals(MovimientosColumns.IDMOVIMIENTO, value);
        return this;
    }

    public MovimientosSelection idmovimientoGt(int value) {
        addGreaterThan(MovimientosColumns.IDMOVIMIENTO, value);
        return this;
    }

    public MovimientosSelection idmovimientoGtEq(int value) {
        addGreaterThanOrEquals(MovimientosColumns.IDMOVIMIENTO, value);
        return this;
    }

    public MovimientosSelection idmovimientoLt(int value) {
        addLessThan(MovimientosColumns.IDMOVIMIENTO, value);
        return this;
    }

    public MovimientosSelection idmovimientoLtEq(int value) {
        addLessThanOrEquals(MovimientosColumns.IDMOVIMIENTO, value);
        return this;
    }

    public MovimientosSelection orderByIdmovimiento(boolean desc) {
        orderBy(MovimientosColumns.IDMOVIMIENTO, desc);
        return this;
    }

    public MovimientosSelection orderByIdmovimiento() {
        orderBy(MovimientosColumns.IDMOVIMIENTO, false);
        return this;
    }

    public MovimientosSelection name(String... value) {
        addEquals(MovimientosColumns.NAME, value);
        return this;
    }

    public MovimientosSelection nameNot(String... value) {
        addNotEquals(MovimientosColumns.NAME, value);
        return this;
    }

    public MovimientosSelection nameLike(String... value) {
        addLike(MovimientosColumns.NAME, value);
        return this;
    }

    public MovimientosSelection nameContains(String... value) {
        addContains(MovimientosColumns.NAME, value);
        return this;
    }

    public MovimientosSelection nameStartsWith(String... value) {
        addStartsWith(MovimientosColumns.NAME, value);
        return this;
    }

    public MovimientosSelection nameEndsWith(String... value) {
        addEndsWith(MovimientosColumns.NAME, value);
        return this;
    }

    public MovimientosSelection orderByName(boolean desc) {
        orderBy(MovimientosColumns.NAME, desc);
        return this;
    }

    public MovimientosSelection orderByName() {
        orderBy(MovimientosColumns.NAME, false);
        return this;
    }

    public MovimientosSelection accuracy(int... value) {
        addEquals(MovimientosColumns.ACCURACY, toObjectArray(value));
        return this;
    }

    public MovimientosSelection accuracyNot(int... value) {
        addNotEquals(MovimientosColumns.ACCURACY, toObjectArray(value));
        return this;
    }

    public MovimientosSelection accuracyGt(int value) {
        addGreaterThan(MovimientosColumns.ACCURACY, value);
        return this;
    }

    public MovimientosSelection accuracyGtEq(int value) {
        addGreaterThanOrEquals(MovimientosColumns.ACCURACY, value);
        return this;
    }

    public MovimientosSelection accuracyLt(int value) {
        addLessThan(MovimientosColumns.ACCURACY, value);
        return this;
    }

    public MovimientosSelection accuracyLtEq(int value) {
        addLessThanOrEquals(MovimientosColumns.ACCURACY, value);
        return this;
    }

    public MovimientosSelection orderByAccuracy(boolean desc) {
        orderBy(MovimientosColumns.ACCURACY, desc);
        return this;
    }

    public MovimientosSelection orderByAccuracy() {
        orderBy(MovimientosColumns.ACCURACY, false);
        return this;
    }

    public MovimientosSelection pp(Integer... value) {
        addEquals(MovimientosColumns.PP, value);
        return this;
    }

    public MovimientosSelection ppNot(Integer... value) {
        addNotEquals(MovimientosColumns.PP, value);
        return this;
    }

    public MovimientosSelection ppGt(int value) {
        addGreaterThan(MovimientosColumns.PP, value);
        return this;
    }

    public MovimientosSelection ppGtEq(int value) {
        addGreaterThanOrEquals(MovimientosColumns.PP, value);
        return this;
    }

    public MovimientosSelection ppLt(int value) {
        addLessThan(MovimientosColumns.PP, value);
        return this;
    }

    public MovimientosSelection ppLtEq(int value) {
        addLessThanOrEquals(MovimientosColumns.PP, value);
        return this;
    }

    public MovimientosSelection orderByPp(boolean desc) {
        orderBy(MovimientosColumns.PP, desc);
        return this;
    }

    public MovimientosSelection orderByPp() {
        orderBy(MovimientosColumns.PP, false);
        return this;
    }
}
