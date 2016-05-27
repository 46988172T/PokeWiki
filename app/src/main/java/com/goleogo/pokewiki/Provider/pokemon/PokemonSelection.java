package com.goleogo.pokewiki.Provider.pokemon;

import java.util.Date;

import android.content.Context;
import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;

import com.goleogo.pokewiki.Provider.base.AbstractSelection;

/**
 * Selection for the {@code pokemon} table.
 */
public class PokemonSelection extends AbstractSelection<PokemonSelection> {
    @Override
    protected Uri baseUri() {
        return PokemonColumns.CONTENT_URI;
    }

    /**
     * Query the given content resolver using this selection.
     *
     * @param contentResolver The content resolver to query.
     * @param projection A list of which columns to return. Passing null will return all columns, which is inefficient.
     * @return A {@code PokemonCursor} object, which is positioned before the first entry, or null.
     */
    public PokemonCursor query(ContentResolver contentResolver, String[] projection) {
        Cursor cursor = contentResolver.query(uri(), projection, sel(), args(), order());
        if (cursor == null) return null;
        return new PokemonCursor(cursor);
    }

    /**
     * Equivalent of calling {@code query(contentResolver, null)}.
     */
    public PokemonCursor query(ContentResolver contentResolver) {
        return query(contentResolver, null);
    }

    /**
     * Query the given content resolver using this selection.
     *
     * @param context The context to use for the query.
     * @param projection A list of which columns to return. Passing null will return all columns, which is inefficient.
     * @return A {@code PokemonCursor} object, which is positioned before the first entry, or null.
     */
    public PokemonCursor query(Context context, String[] projection) {
        Cursor cursor = context.getContentResolver().query(uri(), projection, sel(), args(), order());
        if (cursor == null) return null;
        return new PokemonCursor(cursor);
    }

    /**
     * Equivalent of calling {@code query(context, null)}.
     */
    public PokemonCursor query(Context context) {
        return query(context, null);
    }


    public PokemonSelection id(long... value) {
        addEquals("pokemon." + PokemonColumns._ID, toObjectArray(value));
        return this;
    }

    public PokemonSelection idNot(long... value) {
        addNotEquals("pokemon." + PokemonColumns._ID, toObjectArray(value));
        return this;
    }

    public PokemonSelection orderById(boolean desc) {
        orderBy("pokemon." + PokemonColumns._ID, desc);
        return this;
    }

    public PokemonSelection orderById() {
        return orderById(false);
    }

    public PokemonSelection idpokemon(Integer... value) {
        addEquals(PokemonColumns.IDPOKEMON, value);
        return this;
    }

    public PokemonSelection idpokemonNot(Integer... value) {
        addNotEquals(PokemonColumns.IDPOKEMON, value);
        return this;
    }

    public PokemonSelection idpokemonGt(int value) {
        addGreaterThan(PokemonColumns.IDPOKEMON, value);
        return this;
    }

    public PokemonSelection idpokemonGtEq(int value) {
        addGreaterThanOrEquals(PokemonColumns.IDPOKEMON, value);
        return this;
    }

    public PokemonSelection idpokemonLt(int value) {
        addLessThan(PokemonColumns.IDPOKEMON, value);
        return this;
    }

    public PokemonSelection idpokemonLtEq(int value) {
        addLessThanOrEquals(PokemonColumns.IDPOKEMON, value);
        return this;
    }

    public PokemonSelection orderByIdpokemon(boolean desc) {
        orderBy(PokemonColumns.IDPOKEMON, desc);
        return this;
    }

    public PokemonSelection orderByIdpokemon() {
        orderBy(PokemonColumns.IDPOKEMON, false);
        return this;
    }

    public PokemonSelection name(String... value) {
        addEquals(PokemonColumns.NAME, value);
        return this;
    }

    public PokemonSelection nameNot(String... value) {
        addNotEquals(PokemonColumns.NAME, value);
        return this;
    }

    public PokemonSelection nameLike(String... value) {
        addLike(PokemonColumns.NAME, value);
        return this;
    }

    public PokemonSelection nameContains(String... value) {
        addContains(PokemonColumns.NAME, value);
        return this;
    }

    public PokemonSelection nameStartsWith(String... value) {
        addStartsWith(PokemonColumns.NAME, value);
        return this;
    }

    public PokemonSelection nameEndsWith(String... value) {
        addEndsWith(PokemonColumns.NAME, value);
        return this;
    }

    public PokemonSelection orderByName(boolean desc) {
        orderBy(PokemonColumns.NAME, desc);
        return this;
    }

    public PokemonSelection orderByName() {
        orderBy(PokemonColumns.NAME, false);
        return this;
    }

    public PokemonSelection baseExperience(Integer... value) {
        addEquals(PokemonColumns.BASE_EXPERIENCE, value);
        return this;
    }

    public PokemonSelection baseExperienceNot(Integer... value) {
        addNotEquals(PokemonColumns.BASE_EXPERIENCE, value);
        return this;
    }

    public PokemonSelection baseExperienceGt(int value) {
        addGreaterThan(PokemonColumns.BASE_EXPERIENCE, value);
        return this;
    }

    public PokemonSelection baseExperienceGtEq(int value) {
        addGreaterThanOrEquals(PokemonColumns.BASE_EXPERIENCE, value);
        return this;
    }

    public PokemonSelection baseExperienceLt(int value) {
        addLessThan(PokemonColumns.BASE_EXPERIENCE, value);
        return this;
    }

    public PokemonSelection baseExperienceLtEq(int value) {
        addLessThanOrEquals(PokemonColumns.BASE_EXPERIENCE, value);
        return this;
    }

    public PokemonSelection orderByBaseExperience(boolean desc) {
        orderBy(PokemonColumns.BASE_EXPERIENCE, desc);
        return this;
    }

    public PokemonSelection orderByBaseExperience() {
        orderBy(PokemonColumns.BASE_EXPERIENCE, false);
        return this;
    }

    public PokemonSelection weight(Integer... value) {
        addEquals(PokemonColumns.WEIGHT, value);
        return this;
    }

    public PokemonSelection weightNot(Integer... value) {
        addNotEquals(PokemonColumns.WEIGHT, value);
        return this;
    }

    public PokemonSelection weightGt(int value) {
        addGreaterThan(PokemonColumns.WEIGHT, value);
        return this;
    }

    public PokemonSelection weightGtEq(int value) {
        addGreaterThanOrEquals(PokemonColumns.WEIGHT, value);
        return this;
    }

    public PokemonSelection weightLt(int value) {
        addLessThan(PokemonColumns.WEIGHT, value);
        return this;
    }

    public PokemonSelection weightLtEq(int value) {
        addLessThanOrEquals(PokemonColumns.WEIGHT, value);
        return this;
    }

    public PokemonSelection orderByWeight(boolean desc) {
        orderBy(PokemonColumns.WEIGHT, desc);
        return this;
    }

    public PokemonSelection orderByWeight() {
        orderBy(PokemonColumns.WEIGHT, false);
        return this;
    }

    public PokemonSelection height(Integer... value) {
        addEquals(PokemonColumns.HEIGHT, value);
        return this;
    }

    public PokemonSelection heightNot(Integer... value) {
        addNotEquals(PokemonColumns.HEIGHT, value);
        return this;
    }

    public PokemonSelection heightGt(int value) {
        addGreaterThan(PokemonColumns.HEIGHT, value);
        return this;
    }

    public PokemonSelection heightGtEq(int value) {
        addGreaterThanOrEquals(PokemonColumns.HEIGHT, value);
        return this;
    }

    public PokemonSelection heightLt(int value) {
        addLessThan(PokemonColumns.HEIGHT, value);
        return this;
    }

    public PokemonSelection heightLtEq(int value) {
        addLessThanOrEquals(PokemonColumns.HEIGHT, value);
        return this;
    }

    public PokemonSelection orderByHeight(boolean desc) {
        orderBy(PokemonColumns.HEIGHT, desc);
        return this;
    }

    public PokemonSelection orderByHeight() {
        orderBy(PokemonColumns.HEIGHT, false);
        return this;
    }

    public PokemonSelection image(String... value) {
        addEquals(PokemonColumns.IMAGE, value);
        return this;
    }

    public PokemonSelection imageNot(String... value) {
        addNotEquals(PokemonColumns.IMAGE, value);
        return this;
    }

    public PokemonSelection imageLike(String... value) {
        addLike(PokemonColumns.IMAGE, value);
        return this;
    }

    public PokemonSelection imageContains(String... value) {
        addContains(PokemonColumns.IMAGE, value);
        return this;
    }

    public PokemonSelection imageStartsWith(String... value) {
        addStartsWith(PokemonColumns.IMAGE, value);
        return this;
    }

    public PokemonSelection imageEndsWith(String... value) {
        addEndsWith(PokemonColumns.IMAGE, value);
        return this;
    }

    public PokemonSelection orderByImage(boolean desc) {
        orderBy(PokemonColumns.IMAGE, desc);
        return this;
    }

    public PokemonSelection orderByImage() {
        orderBy(PokemonColumns.IMAGE, false);
        return this;
    }
}
