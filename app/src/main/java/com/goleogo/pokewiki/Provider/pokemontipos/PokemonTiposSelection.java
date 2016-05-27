package com.goleogo.pokewiki.Provider.pokemontipos;

import java.util.Date;

import android.content.Context;
import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;

import com.goleogo.pokewiki.Provider.base.AbstractSelection;
import com.goleogo.pokewiki.Provider.pokemon.*;
import com.goleogo.pokewiki.Provider.tipos.*;

/**
 * Selection for the {@code pokemon_tipos} table.
 */
public class PokemonTiposSelection extends AbstractSelection<PokemonTiposSelection> {
    @Override
    protected Uri baseUri() {
        return PokemonTiposColumns.CONTENT_URI;
    }

    /**
     * Query the given content resolver using this selection.
     *
     * @param contentResolver The content resolver to query.
     * @param projection A list of which columns to return. Passing null will return all columns, which is inefficient.
     * @return A {@code PokemonTiposCursor} object, which is positioned before the first entry, or null.
     */
    public PokemonTiposCursor query(ContentResolver contentResolver, String[] projection) {
        Cursor cursor = contentResolver.query(uri(), projection, sel(), args(), order());
        if (cursor == null) return null;
        return new PokemonTiposCursor(cursor);
    }

    /**
     * Equivalent of calling {@code query(contentResolver, null)}.
     */
    public PokemonTiposCursor query(ContentResolver contentResolver) {
        return query(contentResolver, null);
    }

    /**
     * Query the given content resolver using this selection.
     *
     * @param context The context to use for the query.
     * @param projection A list of which columns to return. Passing null will return all columns, which is inefficient.
     * @return A {@code PokemonTiposCursor} object, which is positioned before the first entry, or null.
     */
    public PokemonTiposCursor query(Context context, String[] projection) {
        Cursor cursor = context.getContentResolver().query(uri(), projection, sel(), args(), order());
        if (cursor == null) return null;
        return new PokemonTiposCursor(cursor);
    }

    /**
     * Equivalent of calling {@code query(context, null)}.
     */
    public PokemonTiposCursor query(Context context) {
        return query(context, null);
    }


    public PokemonTiposSelection id(long... value) {
        addEquals("pokemon_tipos." + PokemonTiposColumns._ID, toObjectArray(value));
        return this;
    }

    public PokemonTiposSelection idNot(long... value) {
        addNotEquals("pokemon_tipos." + PokemonTiposColumns._ID, toObjectArray(value));
        return this;
    }

    public PokemonTiposSelection orderById(boolean desc) {
        orderBy("pokemon_tipos." + PokemonTiposColumns._ID, desc);
        return this;
    }

    public PokemonTiposSelection orderById() {
        return orderById(false);
    }

    public PokemonTiposSelection pokemonId(int... value) {
        addEquals(PokemonTiposColumns.POKEMON_ID, toObjectArray(value));
        return this;
    }

    public PokemonTiposSelection pokemonIdNot(int... value) {
        addNotEquals(PokemonTiposColumns.POKEMON_ID, toObjectArray(value));
        return this;
    }

    public PokemonTiposSelection pokemonIdGt(int value) {
        addGreaterThan(PokemonTiposColumns.POKEMON_ID, value);
        return this;
    }

    public PokemonTiposSelection pokemonIdGtEq(int value) {
        addGreaterThanOrEquals(PokemonTiposColumns.POKEMON_ID, value);
        return this;
    }

    public PokemonTiposSelection pokemonIdLt(int value) {
        addLessThan(PokemonTiposColumns.POKEMON_ID, value);
        return this;
    }

    public PokemonTiposSelection pokemonIdLtEq(int value) {
        addLessThanOrEquals(PokemonTiposColumns.POKEMON_ID, value);
        return this;
    }

    public PokemonTiposSelection orderByPokemonId(boolean desc) {
        orderBy(PokemonTiposColumns.POKEMON_ID, desc);
        return this;
    }

    public PokemonTiposSelection orderByPokemonId() {
        orderBy(PokemonTiposColumns.POKEMON_ID, false);
        return this;
    }

    public PokemonTiposSelection pokemonIdpokemon(Integer... value) {
        addEquals(PokemonColumns.IDPOKEMON, value);
        return this;
    }

    public PokemonTiposSelection pokemonIdpokemonNot(Integer... value) {
        addNotEquals(PokemonColumns.IDPOKEMON, value);
        return this;
    }

    public PokemonTiposSelection pokemonIdpokemonGt(int value) {
        addGreaterThan(PokemonColumns.IDPOKEMON, value);
        return this;
    }

    public PokemonTiposSelection pokemonIdpokemonGtEq(int value) {
        addGreaterThanOrEquals(PokemonColumns.IDPOKEMON, value);
        return this;
    }

    public PokemonTiposSelection pokemonIdpokemonLt(int value) {
        addLessThan(PokemonColumns.IDPOKEMON, value);
        return this;
    }

    public PokemonTiposSelection pokemonIdpokemonLtEq(int value) {
        addLessThanOrEquals(PokemonColumns.IDPOKEMON, value);
        return this;
    }

    public PokemonTiposSelection orderByPokemonIdpokemon(boolean desc) {
        orderBy(PokemonColumns.IDPOKEMON, desc);
        return this;
    }

    public PokemonTiposSelection orderByPokemonIdpokemon() {
        orderBy(PokemonColumns.IDPOKEMON, false);
        return this;
    }

    public PokemonTiposSelection pokemonName(String... value) {
        addEquals(PokemonColumns.NAME, value);
        return this;
    }

    public PokemonTiposSelection pokemonNameNot(String... value) {
        addNotEquals(PokemonColumns.NAME, value);
        return this;
    }

    public PokemonTiposSelection pokemonNameLike(String... value) {
        addLike(PokemonColumns.NAME, value);
        return this;
    }

    public PokemonTiposSelection pokemonNameContains(String... value) {
        addContains(PokemonColumns.NAME, value);
        return this;
    }

    public PokemonTiposSelection pokemonNameStartsWith(String... value) {
        addStartsWith(PokemonColumns.NAME, value);
        return this;
    }

    public PokemonTiposSelection pokemonNameEndsWith(String... value) {
        addEndsWith(PokemonColumns.NAME, value);
        return this;
    }

    public PokemonTiposSelection orderByPokemonName(boolean desc) {
        orderBy(PokemonColumns.NAME, desc);
        return this;
    }

    public PokemonTiposSelection orderByPokemonName() {
        orderBy(PokemonColumns.NAME, false);
        return this;
    }

    public PokemonTiposSelection pokemonBaseExperience(Integer... value) {
        addEquals(PokemonColumns.BASE_EXPERIENCE, value);
        return this;
    }

    public PokemonTiposSelection pokemonBaseExperienceNot(Integer... value) {
        addNotEquals(PokemonColumns.BASE_EXPERIENCE, value);
        return this;
    }

    public PokemonTiposSelection pokemonBaseExperienceGt(int value) {
        addGreaterThan(PokemonColumns.BASE_EXPERIENCE, value);
        return this;
    }

    public PokemonTiposSelection pokemonBaseExperienceGtEq(int value) {
        addGreaterThanOrEquals(PokemonColumns.BASE_EXPERIENCE, value);
        return this;
    }

    public PokemonTiposSelection pokemonBaseExperienceLt(int value) {
        addLessThan(PokemonColumns.BASE_EXPERIENCE, value);
        return this;
    }

    public PokemonTiposSelection pokemonBaseExperienceLtEq(int value) {
        addLessThanOrEquals(PokemonColumns.BASE_EXPERIENCE, value);
        return this;
    }

    public PokemonTiposSelection orderByPokemonBaseExperience(boolean desc) {
        orderBy(PokemonColumns.BASE_EXPERIENCE, desc);
        return this;
    }

    public PokemonTiposSelection orderByPokemonBaseExperience() {
        orderBy(PokemonColumns.BASE_EXPERIENCE, false);
        return this;
    }

    public PokemonTiposSelection pokemonWeight(Integer... value) {
        addEquals(PokemonColumns.WEIGHT, value);
        return this;
    }

    public PokemonTiposSelection pokemonWeightNot(Integer... value) {
        addNotEquals(PokemonColumns.WEIGHT, value);
        return this;
    }

    public PokemonTiposSelection pokemonWeightGt(int value) {
        addGreaterThan(PokemonColumns.WEIGHT, value);
        return this;
    }

    public PokemonTiposSelection pokemonWeightGtEq(int value) {
        addGreaterThanOrEquals(PokemonColumns.WEIGHT, value);
        return this;
    }

    public PokemonTiposSelection pokemonWeightLt(int value) {
        addLessThan(PokemonColumns.WEIGHT, value);
        return this;
    }

    public PokemonTiposSelection pokemonWeightLtEq(int value) {
        addLessThanOrEquals(PokemonColumns.WEIGHT, value);
        return this;
    }

    public PokemonTiposSelection orderByPokemonWeight(boolean desc) {
        orderBy(PokemonColumns.WEIGHT, desc);
        return this;
    }

    public PokemonTiposSelection orderByPokemonWeight() {
        orderBy(PokemonColumns.WEIGHT, false);
        return this;
    }

    public PokemonTiposSelection pokemonHeight(Integer... value) {
        addEquals(PokemonColumns.HEIGHT, value);
        return this;
    }

    public PokemonTiposSelection pokemonHeightNot(Integer... value) {
        addNotEquals(PokemonColumns.HEIGHT, value);
        return this;
    }

    public PokemonTiposSelection pokemonHeightGt(int value) {
        addGreaterThan(PokemonColumns.HEIGHT, value);
        return this;
    }

    public PokemonTiposSelection pokemonHeightGtEq(int value) {
        addGreaterThanOrEquals(PokemonColumns.HEIGHT, value);
        return this;
    }

    public PokemonTiposSelection pokemonHeightLt(int value) {
        addLessThan(PokemonColumns.HEIGHT, value);
        return this;
    }

    public PokemonTiposSelection pokemonHeightLtEq(int value) {
        addLessThanOrEquals(PokemonColumns.HEIGHT, value);
        return this;
    }

    public PokemonTiposSelection orderByPokemonHeight(boolean desc) {
        orderBy(PokemonColumns.HEIGHT, desc);
        return this;
    }

    public PokemonTiposSelection orderByPokemonHeight() {
        orderBy(PokemonColumns.HEIGHT, false);
        return this;
    }

    public PokemonTiposSelection pokemonImage(String... value) {
        addEquals(PokemonColumns.IMAGE, value);
        return this;
    }

    public PokemonTiposSelection pokemonImageNot(String... value) {
        addNotEquals(PokemonColumns.IMAGE, value);
        return this;
    }

    public PokemonTiposSelection pokemonImageLike(String... value) {
        addLike(PokemonColumns.IMAGE, value);
        return this;
    }

    public PokemonTiposSelection pokemonImageContains(String... value) {
        addContains(PokemonColumns.IMAGE, value);
        return this;
    }

    public PokemonTiposSelection pokemonImageStartsWith(String... value) {
        addStartsWith(PokemonColumns.IMAGE, value);
        return this;
    }

    public PokemonTiposSelection pokemonImageEndsWith(String... value) {
        addEndsWith(PokemonColumns.IMAGE, value);
        return this;
    }

    public PokemonTiposSelection orderByPokemonImage(boolean desc) {
        orderBy(PokemonColumns.IMAGE, desc);
        return this;
    }

    public PokemonTiposSelection orderByPokemonImage() {
        orderBy(PokemonColumns.IMAGE, false);
        return this;
    }

    public PokemonTiposSelection tiposId(int... value) {
        addEquals(PokemonTiposColumns.TIPOS_ID, toObjectArray(value));
        return this;
    }

    public PokemonTiposSelection tiposIdNot(int... value) {
        addNotEquals(PokemonTiposColumns.TIPOS_ID, toObjectArray(value));
        return this;
    }

    public PokemonTiposSelection tiposIdGt(int value) {
        addGreaterThan(PokemonTiposColumns.TIPOS_ID, value);
        return this;
    }

    public PokemonTiposSelection tiposIdGtEq(int value) {
        addGreaterThanOrEquals(PokemonTiposColumns.TIPOS_ID, value);
        return this;
    }

    public PokemonTiposSelection tiposIdLt(int value) {
        addLessThan(PokemonTiposColumns.TIPOS_ID, value);
        return this;
    }

    public PokemonTiposSelection tiposIdLtEq(int value) {
        addLessThanOrEquals(PokemonTiposColumns.TIPOS_ID, value);
        return this;
    }

    public PokemonTiposSelection orderByTiposId(boolean desc) {
        orderBy(PokemonTiposColumns.TIPOS_ID, desc);
        return this;
    }

    public PokemonTiposSelection orderByTiposId() {
        orderBy(PokemonTiposColumns.TIPOS_ID, false);
        return this;
    }

    public PokemonTiposSelection tiposIdtipos(Integer... value) {
        addEquals(TiposColumns.IDTIPOS, value);
        return this;
    }

    public PokemonTiposSelection tiposIdtiposNot(Integer... value) {
        addNotEquals(TiposColumns.IDTIPOS, value);
        return this;
    }

    public PokemonTiposSelection tiposIdtiposGt(int value) {
        addGreaterThan(TiposColumns.IDTIPOS, value);
        return this;
    }

    public PokemonTiposSelection tiposIdtiposGtEq(int value) {
        addGreaterThanOrEquals(TiposColumns.IDTIPOS, value);
        return this;
    }

    public PokemonTiposSelection tiposIdtiposLt(int value) {
        addLessThan(TiposColumns.IDTIPOS, value);
        return this;
    }

    public PokemonTiposSelection tiposIdtiposLtEq(int value) {
        addLessThanOrEquals(TiposColumns.IDTIPOS, value);
        return this;
    }

    public PokemonTiposSelection orderByTiposIdtipos(boolean desc) {
        orderBy(TiposColumns.IDTIPOS, desc);
        return this;
    }

    public PokemonTiposSelection orderByTiposIdtipos() {
        orderBy(TiposColumns.IDTIPOS, false);
        return this;
    }

    public PokemonTiposSelection tiposName(String... value) {
        addEquals(TiposColumns.NAME, value);
        return this;
    }

    public PokemonTiposSelection tiposNameNot(String... value) {
        addNotEquals(TiposColumns.NAME, value);
        return this;
    }

    public PokemonTiposSelection tiposNameLike(String... value) {
        addLike(TiposColumns.NAME, value);
        return this;
    }

    public PokemonTiposSelection tiposNameContains(String... value) {
        addContains(TiposColumns.NAME, value);
        return this;
    }

    public PokemonTiposSelection tiposNameStartsWith(String... value) {
        addStartsWith(TiposColumns.NAME, value);
        return this;
    }

    public PokemonTiposSelection tiposNameEndsWith(String... value) {
        addEndsWith(TiposColumns.NAME, value);
        return this;
    }

    public PokemonTiposSelection orderByTiposName(boolean desc) {
        orderBy(TiposColumns.NAME, desc);
        return this;
    }

    public PokemonTiposSelection orderByTiposName() {
        orderBy(TiposColumns.NAME, false);
        return this;
    }

    public PokemonTiposSelection tiposGeneration(String... value) {
        addEquals(TiposColumns.GENERATION, value);
        return this;
    }

    public PokemonTiposSelection tiposGenerationNot(String... value) {
        addNotEquals(TiposColumns.GENERATION, value);
        return this;
    }

    public PokemonTiposSelection tiposGenerationLike(String... value) {
        addLike(TiposColumns.GENERATION, value);
        return this;
    }

    public PokemonTiposSelection tiposGenerationContains(String... value) {
        addContains(TiposColumns.GENERATION, value);
        return this;
    }

    public PokemonTiposSelection tiposGenerationStartsWith(String... value) {
        addStartsWith(TiposColumns.GENERATION, value);
        return this;
    }

    public PokemonTiposSelection tiposGenerationEndsWith(String... value) {
        addEndsWith(TiposColumns.GENERATION, value);
        return this;
    }

    public PokemonTiposSelection orderByTiposGeneration(boolean desc) {
        orderBy(TiposColumns.GENERATION, desc);
        return this;
    }

    public PokemonTiposSelection orderByTiposGeneration() {
        orderBy(TiposColumns.GENERATION, false);
        return this;
    }
}
