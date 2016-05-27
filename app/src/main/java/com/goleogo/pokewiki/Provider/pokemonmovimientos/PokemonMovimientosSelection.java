package com.goleogo.pokewiki.Provider.pokemonmovimientos;

import java.util.Date;

import android.content.Context;
import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;

import com.goleogo.pokewiki.Provider.base.AbstractSelection;
import com.goleogo.pokewiki.Provider.pokemon.*;
import com.goleogo.pokewiki.Provider.movimientos.*;

/**
 * Selection for the {@code pokemon_movimientos} table.
 */
public class PokemonMovimientosSelection extends AbstractSelection<PokemonMovimientosSelection> {
    @Override
    protected Uri baseUri() {
        return PokemonMovimientosColumns.CONTENT_URI;
    }

    /**
     * Query the given content resolver using this selection.
     *
     * @param contentResolver The content resolver to query.
     * @param projection A list of which columns to return. Passing null will return all columns, which is inefficient.
     * @return A {@code PokemonMovimientosCursor} object, which is positioned before the first entry, or null.
     */
    public PokemonMovimientosCursor query(ContentResolver contentResolver, String[] projection) {
        Cursor cursor = contentResolver.query(uri(), projection, sel(), args(), order());
        if (cursor == null) return null;
        return new PokemonMovimientosCursor(cursor);
    }

    /**
     * Equivalent of calling {@code query(contentResolver, null)}.
     */
    public PokemonMovimientosCursor query(ContentResolver contentResolver) {
        return query(contentResolver, null);
    }

    /**
     * Query the given content resolver using this selection.
     *
     * @param context The context to use for the query.
     * @param projection A list of which columns to return. Passing null will return all columns, which is inefficient.
     * @return A {@code PokemonMovimientosCursor} object, which is positioned before the first entry, or null.
     */
    public PokemonMovimientosCursor query(Context context, String[] projection) {
        Cursor cursor = context.getContentResolver().query(uri(), projection, sel(), args(), order());
        if (cursor == null) return null;
        return new PokemonMovimientosCursor(cursor);
    }

    /**
     * Equivalent of calling {@code query(context, null)}.
     */
    public PokemonMovimientosCursor query(Context context) {
        return query(context, null);
    }


    public PokemonMovimientosSelection id(long... value) {
        addEquals("pokemon_movimientos." + PokemonMovimientosColumns._ID, toObjectArray(value));
        return this;
    }

    public PokemonMovimientosSelection idNot(long... value) {
        addNotEquals("pokemon_movimientos." + PokemonMovimientosColumns._ID, toObjectArray(value));
        return this;
    }

    public PokemonMovimientosSelection orderById(boolean desc) {
        orderBy("pokemon_movimientos." + PokemonMovimientosColumns._ID, desc);
        return this;
    }

    public PokemonMovimientosSelection orderById() {
        return orderById(false);
    }

    public PokemonMovimientosSelection pokemonId(int... value) {
        addEquals(PokemonMovimientosColumns.POKEMON_ID, toObjectArray(value));
        return this;
    }

    public PokemonMovimientosSelection pokemonIdNot(int... value) {
        addNotEquals(PokemonMovimientosColumns.POKEMON_ID, toObjectArray(value));
        return this;
    }

    public PokemonMovimientosSelection pokemonIdGt(int value) {
        addGreaterThan(PokemonMovimientosColumns.POKEMON_ID, value);
        return this;
    }

    public PokemonMovimientosSelection pokemonIdGtEq(int value) {
        addGreaterThanOrEquals(PokemonMovimientosColumns.POKEMON_ID, value);
        return this;
    }

    public PokemonMovimientosSelection pokemonIdLt(int value) {
        addLessThan(PokemonMovimientosColumns.POKEMON_ID, value);
        return this;
    }

    public PokemonMovimientosSelection pokemonIdLtEq(int value) {
        addLessThanOrEquals(PokemonMovimientosColumns.POKEMON_ID, value);
        return this;
    }

    public PokemonMovimientosSelection orderByPokemonId(boolean desc) {
        orderBy(PokemonMovimientosColumns.POKEMON_ID, desc);
        return this;
    }

    public PokemonMovimientosSelection orderByPokemonId() {
        orderBy(PokemonMovimientosColumns.POKEMON_ID, false);
        return this;
    }

    public PokemonMovimientosSelection pokemonIdpokemon(Integer... value) {
        addEquals(PokemonColumns.IDPOKEMON, value);
        return this;
    }

    public PokemonMovimientosSelection pokemonIdpokemonNot(Integer... value) {
        addNotEquals(PokemonColumns.IDPOKEMON, value);
        return this;
    }

    public PokemonMovimientosSelection pokemonIdpokemonGt(int value) {
        addGreaterThan(PokemonColumns.IDPOKEMON, value);
        return this;
    }

    public PokemonMovimientosSelection pokemonIdpokemonGtEq(int value) {
        addGreaterThanOrEquals(PokemonColumns.IDPOKEMON, value);
        return this;
    }

    public PokemonMovimientosSelection pokemonIdpokemonLt(int value) {
        addLessThan(PokemonColumns.IDPOKEMON, value);
        return this;
    }

    public PokemonMovimientosSelection pokemonIdpokemonLtEq(int value) {
        addLessThanOrEquals(PokemonColumns.IDPOKEMON, value);
        return this;
    }

    public PokemonMovimientosSelection orderByPokemonIdpokemon(boolean desc) {
        orderBy(PokemonColumns.IDPOKEMON, desc);
        return this;
    }

    public PokemonMovimientosSelection orderByPokemonIdpokemon() {
        orderBy(PokemonColumns.IDPOKEMON, false);
        return this;
    }

    public PokemonMovimientosSelection pokemonName(String... value) {
        addEquals(PokemonColumns.NAME, value);
        return this;
    }

    public PokemonMovimientosSelection pokemonNameNot(String... value) {
        addNotEquals(PokemonColumns.NAME, value);
        return this;
    }

    public PokemonMovimientosSelection pokemonNameLike(String... value) {
        addLike(PokemonColumns.NAME, value);
        return this;
    }

    public PokemonMovimientosSelection pokemonNameContains(String... value) {
        addContains(PokemonColumns.NAME, value);
        return this;
    }

    public PokemonMovimientosSelection pokemonNameStartsWith(String... value) {
        addStartsWith(PokemonColumns.NAME, value);
        return this;
    }

    public PokemonMovimientosSelection pokemonNameEndsWith(String... value) {
        addEndsWith(PokemonColumns.NAME, value);
        return this;
    }

    public PokemonMovimientosSelection orderByPokemonName(boolean desc) {
        orderBy(PokemonColumns.NAME, desc);
        return this;
    }

    public PokemonMovimientosSelection orderByPokemonName() {
        orderBy(PokemonColumns.NAME, false);
        return this;
    }

    public PokemonMovimientosSelection pokemonBaseExperience(Integer... value) {
        addEquals(PokemonColumns.BASE_EXPERIENCE, value);
        return this;
    }

    public PokemonMovimientosSelection pokemonBaseExperienceNot(Integer... value) {
        addNotEquals(PokemonColumns.BASE_EXPERIENCE, value);
        return this;
    }

    public PokemonMovimientosSelection pokemonBaseExperienceGt(int value) {
        addGreaterThan(PokemonColumns.BASE_EXPERIENCE, value);
        return this;
    }

    public PokemonMovimientosSelection pokemonBaseExperienceGtEq(int value) {
        addGreaterThanOrEquals(PokemonColumns.BASE_EXPERIENCE, value);
        return this;
    }

    public PokemonMovimientosSelection pokemonBaseExperienceLt(int value) {
        addLessThan(PokemonColumns.BASE_EXPERIENCE, value);
        return this;
    }

    public PokemonMovimientosSelection pokemonBaseExperienceLtEq(int value) {
        addLessThanOrEquals(PokemonColumns.BASE_EXPERIENCE, value);
        return this;
    }

    public PokemonMovimientosSelection orderByPokemonBaseExperience(boolean desc) {
        orderBy(PokemonColumns.BASE_EXPERIENCE, desc);
        return this;
    }

    public PokemonMovimientosSelection orderByPokemonBaseExperience() {
        orderBy(PokemonColumns.BASE_EXPERIENCE, false);
        return this;
    }

    public PokemonMovimientosSelection pokemonWeight(Integer... value) {
        addEquals(PokemonColumns.WEIGHT, value);
        return this;
    }

    public PokemonMovimientosSelection pokemonWeightNot(Integer... value) {
        addNotEquals(PokemonColumns.WEIGHT, value);
        return this;
    }

    public PokemonMovimientosSelection pokemonWeightGt(int value) {
        addGreaterThan(PokemonColumns.WEIGHT, value);
        return this;
    }

    public PokemonMovimientosSelection pokemonWeightGtEq(int value) {
        addGreaterThanOrEquals(PokemonColumns.WEIGHT, value);
        return this;
    }

    public PokemonMovimientosSelection pokemonWeightLt(int value) {
        addLessThan(PokemonColumns.WEIGHT, value);
        return this;
    }

    public PokemonMovimientosSelection pokemonWeightLtEq(int value) {
        addLessThanOrEquals(PokemonColumns.WEIGHT, value);
        return this;
    }

    public PokemonMovimientosSelection orderByPokemonWeight(boolean desc) {
        orderBy(PokemonColumns.WEIGHT, desc);
        return this;
    }

    public PokemonMovimientosSelection orderByPokemonWeight() {
        orderBy(PokemonColumns.WEIGHT, false);
        return this;
    }

    public PokemonMovimientosSelection pokemonHeight(Integer... value) {
        addEquals(PokemonColumns.HEIGHT, value);
        return this;
    }

    public PokemonMovimientosSelection pokemonHeightNot(Integer... value) {
        addNotEquals(PokemonColumns.HEIGHT, value);
        return this;
    }

    public PokemonMovimientosSelection pokemonHeightGt(int value) {
        addGreaterThan(PokemonColumns.HEIGHT, value);
        return this;
    }

    public PokemonMovimientosSelection pokemonHeightGtEq(int value) {
        addGreaterThanOrEquals(PokemonColumns.HEIGHT, value);
        return this;
    }

    public PokemonMovimientosSelection pokemonHeightLt(int value) {
        addLessThan(PokemonColumns.HEIGHT, value);
        return this;
    }

    public PokemonMovimientosSelection pokemonHeightLtEq(int value) {
        addLessThanOrEquals(PokemonColumns.HEIGHT, value);
        return this;
    }

    public PokemonMovimientosSelection orderByPokemonHeight(boolean desc) {
        orderBy(PokemonColumns.HEIGHT, desc);
        return this;
    }

    public PokemonMovimientosSelection orderByPokemonHeight() {
        orderBy(PokemonColumns.HEIGHT, false);
        return this;
    }

    public PokemonMovimientosSelection pokemonImage(String... value) {
        addEquals(PokemonColumns.IMAGE, value);
        return this;
    }

    public PokemonMovimientosSelection pokemonImageNot(String... value) {
        addNotEquals(PokemonColumns.IMAGE, value);
        return this;
    }

    public PokemonMovimientosSelection pokemonImageLike(String... value) {
        addLike(PokemonColumns.IMAGE, value);
        return this;
    }

    public PokemonMovimientosSelection pokemonImageContains(String... value) {
        addContains(PokemonColumns.IMAGE, value);
        return this;
    }

    public PokemonMovimientosSelection pokemonImageStartsWith(String... value) {
        addStartsWith(PokemonColumns.IMAGE, value);
        return this;
    }

    public PokemonMovimientosSelection pokemonImageEndsWith(String... value) {
        addEndsWith(PokemonColumns.IMAGE, value);
        return this;
    }

    public PokemonMovimientosSelection orderByPokemonImage(boolean desc) {
        orderBy(PokemonColumns.IMAGE, desc);
        return this;
    }

    public PokemonMovimientosSelection orderByPokemonImage() {
        orderBy(PokemonColumns.IMAGE, false);
        return this;
    }

    public PokemonMovimientosSelection movimientosId(int... value) {
        addEquals(PokemonMovimientosColumns.MOVIMIENTOS_ID, toObjectArray(value));
        return this;
    }

    public PokemonMovimientosSelection movimientosIdNot(int... value) {
        addNotEquals(PokemonMovimientosColumns.MOVIMIENTOS_ID, toObjectArray(value));
        return this;
    }

    public PokemonMovimientosSelection movimientosIdGt(int value) {
        addGreaterThan(PokemonMovimientosColumns.MOVIMIENTOS_ID, value);
        return this;
    }

    public PokemonMovimientosSelection movimientosIdGtEq(int value) {
        addGreaterThanOrEquals(PokemonMovimientosColumns.MOVIMIENTOS_ID, value);
        return this;
    }

    public PokemonMovimientosSelection movimientosIdLt(int value) {
        addLessThan(PokemonMovimientosColumns.MOVIMIENTOS_ID, value);
        return this;
    }

    public PokemonMovimientosSelection movimientosIdLtEq(int value) {
        addLessThanOrEquals(PokemonMovimientosColumns.MOVIMIENTOS_ID, value);
        return this;
    }

    public PokemonMovimientosSelection orderByMovimientosId(boolean desc) {
        orderBy(PokemonMovimientosColumns.MOVIMIENTOS_ID, desc);
        return this;
    }

    public PokemonMovimientosSelection orderByMovimientosId() {
        orderBy(PokemonMovimientosColumns.MOVIMIENTOS_ID, false);
        return this;
    }

    public PokemonMovimientosSelection movimientosIdmovimiento(Integer... value) {
        addEquals(MovimientosColumns.IDMOVIMIENTO, value);
        return this;
    }

    public PokemonMovimientosSelection movimientosIdmovimientoNot(Integer... value) {
        addNotEquals(MovimientosColumns.IDMOVIMIENTO, value);
        return this;
    }

    public PokemonMovimientosSelection movimientosIdmovimientoGt(int value) {
        addGreaterThan(MovimientosColumns.IDMOVIMIENTO, value);
        return this;
    }

    public PokemonMovimientosSelection movimientosIdmovimientoGtEq(int value) {
        addGreaterThanOrEquals(MovimientosColumns.IDMOVIMIENTO, value);
        return this;
    }

    public PokemonMovimientosSelection movimientosIdmovimientoLt(int value) {
        addLessThan(MovimientosColumns.IDMOVIMIENTO, value);
        return this;
    }

    public PokemonMovimientosSelection movimientosIdmovimientoLtEq(int value) {
        addLessThanOrEquals(MovimientosColumns.IDMOVIMIENTO, value);
        return this;
    }

    public PokemonMovimientosSelection orderByMovimientosIdmovimiento(boolean desc) {
        orderBy(MovimientosColumns.IDMOVIMIENTO, desc);
        return this;
    }

    public PokemonMovimientosSelection orderByMovimientosIdmovimiento() {
        orderBy(MovimientosColumns.IDMOVIMIENTO, false);
        return this;
    }

    public PokemonMovimientosSelection movimientosName(String... value) {
        addEquals(MovimientosColumns.NAME, value);
        return this;
    }

    public PokemonMovimientosSelection movimientosNameNot(String... value) {
        addNotEquals(MovimientosColumns.NAME, value);
        return this;
    }

    public PokemonMovimientosSelection movimientosNameLike(String... value) {
        addLike(MovimientosColumns.NAME, value);
        return this;
    }

    public PokemonMovimientosSelection movimientosNameContains(String... value) {
        addContains(MovimientosColumns.NAME, value);
        return this;
    }

    public PokemonMovimientosSelection movimientosNameStartsWith(String... value) {
        addStartsWith(MovimientosColumns.NAME, value);
        return this;
    }

    public PokemonMovimientosSelection movimientosNameEndsWith(String... value) {
        addEndsWith(MovimientosColumns.NAME, value);
        return this;
    }

    public PokemonMovimientosSelection orderByMovimientosName(boolean desc) {
        orderBy(MovimientosColumns.NAME, desc);
        return this;
    }

    public PokemonMovimientosSelection orderByMovimientosName() {
        orderBy(MovimientosColumns.NAME, false);
        return this;
    }

    public PokemonMovimientosSelection movimientosAccuracy(int... value) {
        addEquals(MovimientosColumns.ACCURACY, toObjectArray(value));
        return this;
    }

    public PokemonMovimientosSelection movimientosAccuracyNot(int... value) {
        addNotEquals(MovimientosColumns.ACCURACY, toObjectArray(value));
        return this;
    }

    public PokemonMovimientosSelection movimientosAccuracyGt(int value) {
        addGreaterThan(MovimientosColumns.ACCURACY, value);
        return this;
    }

    public PokemonMovimientosSelection movimientosAccuracyGtEq(int value) {
        addGreaterThanOrEquals(MovimientosColumns.ACCURACY, value);
        return this;
    }

    public PokemonMovimientosSelection movimientosAccuracyLt(int value) {
        addLessThan(MovimientosColumns.ACCURACY, value);
        return this;
    }

    public PokemonMovimientosSelection movimientosAccuracyLtEq(int value) {
        addLessThanOrEquals(MovimientosColumns.ACCURACY, value);
        return this;
    }

    public PokemonMovimientosSelection orderByMovimientosAccuracy(boolean desc) {
        orderBy(MovimientosColumns.ACCURACY, desc);
        return this;
    }

    public PokemonMovimientosSelection orderByMovimientosAccuracy() {
        orderBy(MovimientosColumns.ACCURACY, false);
        return this;
    }

    public PokemonMovimientosSelection movimientosPp(Integer... value) {
        addEquals(MovimientosColumns.PP, value);
        return this;
    }

    public PokemonMovimientosSelection movimientosPpNot(Integer... value) {
        addNotEquals(MovimientosColumns.PP, value);
        return this;
    }

    public PokemonMovimientosSelection movimientosPpGt(int value) {
        addGreaterThan(MovimientosColumns.PP, value);
        return this;
    }

    public PokemonMovimientosSelection movimientosPpGtEq(int value) {
        addGreaterThanOrEquals(MovimientosColumns.PP, value);
        return this;
    }

    public PokemonMovimientosSelection movimientosPpLt(int value) {
        addLessThan(MovimientosColumns.PP, value);
        return this;
    }

    public PokemonMovimientosSelection movimientosPpLtEq(int value) {
        addLessThanOrEquals(MovimientosColumns.PP, value);
        return this;
    }

    public PokemonMovimientosSelection orderByMovimientosPp(boolean desc) {
        orderBy(MovimientosColumns.PP, desc);
        return this;
    }

    public PokemonMovimientosSelection orderByMovimientosPp() {
        orderBy(MovimientosColumns.PP, false);
        return this;
    }
}
