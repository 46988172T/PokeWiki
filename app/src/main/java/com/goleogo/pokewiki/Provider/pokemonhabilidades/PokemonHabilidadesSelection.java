package com.goleogo.pokewiki.Provider.pokemonhabilidades;

import java.util.Date;

import android.content.Context;
import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;

import com.goleogo.pokewiki.Provider.base.AbstractSelection;
import com.goleogo.pokewiki.Provider.pokemon.*;
import com.goleogo.pokewiki.Provider.habilidades.*;

/**
 * Selection for the {@code pokemon_habilidades} table.
 */
public class PokemonHabilidadesSelection extends AbstractSelection<PokemonHabilidadesSelection> {
    @Override
    protected Uri baseUri() {
        return PokemonHabilidadesColumns.CONTENT_URI;
    }

    /**
     * Query the given content resolver using this selection.
     *
     * @param contentResolver The content resolver to query.
     * @param projection A list of which columns to return. Passing null will return all columns, which is inefficient.
     * @return A {@code PokemonHabilidadesCursor} object, which is positioned before the first entry, or null.
     */
    public PokemonHabilidadesCursor query(ContentResolver contentResolver, String[] projection) {
        Cursor cursor = contentResolver.query(uri(), projection, sel(), args(), order());
        if (cursor == null) return null;
        return new PokemonHabilidadesCursor(cursor);
    }

    /**
     * Equivalent of calling {@code query(contentResolver, null)}.
     */
    public PokemonHabilidadesCursor query(ContentResolver contentResolver) {
        return query(contentResolver, null);
    }

    /**
     * Query the given content resolver using this selection.
     *
     * @param context The context to use for the query.
     * @param projection A list of which columns to return. Passing null will return all columns, which is inefficient.
     * @return A {@code PokemonHabilidadesCursor} object, which is positioned before the first entry, or null.
     */
    public PokemonHabilidadesCursor query(Context context, String[] projection) {
        Cursor cursor = context.getContentResolver().query(uri(), projection, sel(), args(), order());
        if (cursor == null) return null;
        return new PokemonHabilidadesCursor(cursor);
    }

    /**
     * Equivalent of calling {@code query(context, null)}.
     */
    public PokemonHabilidadesCursor query(Context context) {
        return query(context, null);
    }


    public PokemonHabilidadesSelection id(long... value) {
        addEquals("pokemon_habilidades." + PokemonHabilidadesColumns._ID, toObjectArray(value));
        return this;
    }

    public PokemonHabilidadesSelection idNot(long... value) {
        addNotEquals("pokemon_habilidades." + PokemonHabilidadesColumns._ID, toObjectArray(value));
        return this;
    }

    public PokemonHabilidadesSelection orderById(boolean desc) {
        orderBy("pokemon_habilidades." + PokemonHabilidadesColumns._ID, desc);
        return this;
    }

    public PokemonHabilidadesSelection orderById() {
        return orderById(false);
    }

    public PokemonHabilidadesSelection pokemonId(int... value) {
        addEquals(PokemonHabilidadesColumns.POKEMON_ID, toObjectArray(value));
        return this;
    }

    public PokemonHabilidadesSelection pokemonIdNot(int... value) {
        addNotEquals(PokemonHabilidadesColumns.POKEMON_ID, toObjectArray(value));
        return this;
    }

    public PokemonHabilidadesSelection pokemonIdGt(int value) {
        addGreaterThan(PokemonHabilidadesColumns.POKEMON_ID, value);
        return this;
    }

    public PokemonHabilidadesSelection pokemonIdGtEq(int value) {
        addGreaterThanOrEquals(PokemonHabilidadesColumns.POKEMON_ID, value);
        return this;
    }

    public PokemonHabilidadesSelection pokemonIdLt(int value) {
        addLessThan(PokemonHabilidadesColumns.POKEMON_ID, value);
        return this;
    }

    public PokemonHabilidadesSelection pokemonIdLtEq(int value) {
        addLessThanOrEquals(PokemonHabilidadesColumns.POKEMON_ID, value);
        return this;
    }

    public PokemonHabilidadesSelection orderByPokemonId(boolean desc) {
        orderBy(PokemonHabilidadesColumns.POKEMON_ID, desc);
        return this;
    }

    public PokemonHabilidadesSelection orderByPokemonId() {
        orderBy(PokemonHabilidadesColumns.POKEMON_ID, false);
        return this;
    }

    public PokemonHabilidadesSelection pokemonIdpokemon(Integer... value) {
        addEquals(PokemonColumns.IDPOKEMON, value);
        return this;
    }

    public PokemonHabilidadesSelection pokemonIdpokemonNot(Integer... value) {
        addNotEquals(PokemonColumns.IDPOKEMON, value);
        return this;
    }

    public PokemonHabilidadesSelection pokemonIdpokemonGt(int value) {
        addGreaterThan(PokemonColumns.IDPOKEMON, value);
        return this;
    }

    public PokemonHabilidadesSelection pokemonIdpokemonGtEq(int value) {
        addGreaterThanOrEquals(PokemonColumns.IDPOKEMON, value);
        return this;
    }

    public PokemonHabilidadesSelection pokemonIdpokemonLt(int value) {
        addLessThan(PokemonColumns.IDPOKEMON, value);
        return this;
    }

    public PokemonHabilidadesSelection pokemonIdpokemonLtEq(int value) {
        addLessThanOrEquals(PokemonColumns.IDPOKEMON, value);
        return this;
    }

    public PokemonHabilidadesSelection orderByPokemonIdpokemon(boolean desc) {
        orderBy(PokemonColumns.IDPOKEMON, desc);
        return this;
    }

    public PokemonHabilidadesSelection orderByPokemonIdpokemon() {
        orderBy(PokemonColumns.IDPOKEMON, false);
        return this;
    }

    public PokemonHabilidadesSelection pokemonName(String... value) {
        addEquals(PokemonColumns.NAME, value);
        return this;
    }

    public PokemonHabilidadesSelection pokemonNameNot(String... value) {
        addNotEquals(PokemonColumns.NAME, value);
        return this;
    }

    public PokemonHabilidadesSelection pokemonNameLike(String... value) {
        addLike(PokemonColumns.NAME, value);
        return this;
    }

    public PokemonHabilidadesSelection pokemonNameContains(String... value) {
        addContains(PokemonColumns.NAME, value);
        return this;
    }

    public PokemonHabilidadesSelection pokemonNameStartsWith(String... value) {
        addStartsWith(PokemonColumns.NAME, value);
        return this;
    }

    public PokemonHabilidadesSelection pokemonNameEndsWith(String... value) {
        addEndsWith(PokemonColumns.NAME, value);
        return this;
    }

    public PokemonHabilidadesSelection orderByPokemonName(boolean desc) {
        orderBy(PokemonColumns.NAME, desc);
        return this;
    }

    public PokemonHabilidadesSelection orderByPokemonName() {
        orderBy(PokemonColumns.NAME, false);
        return this;
    }

    public PokemonHabilidadesSelection pokemonBaseExperience(Integer... value) {
        addEquals(PokemonColumns.BASE_EXPERIENCE, value);
        return this;
    }

    public PokemonHabilidadesSelection pokemonBaseExperienceNot(Integer... value) {
        addNotEquals(PokemonColumns.BASE_EXPERIENCE, value);
        return this;
    }

    public PokemonHabilidadesSelection pokemonBaseExperienceGt(int value) {
        addGreaterThan(PokemonColumns.BASE_EXPERIENCE, value);
        return this;
    }

    public PokemonHabilidadesSelection pokemonBaseExperienceGtEq(int value) {
        addGreaterThanOrEquals(PokemonColumns.BASE_EXPERIENCE, value);
        return this;
    }

    public PokemonHabilidadesSelection pokemonBaseExperienceLt(int value) {
        addLessThan(PokemonColumns.BASE_EXPERIENCE, value);
        return this;
    }

    public PokemonHabilidadesSelection pokemonBaseExperienceLtEq(int value) {
        addLessThanOrEquals(PokemonColumns.BASE_EXPERIENCE, value);
        return this;
    }

    public PokemonHabilidadesSelection orderByPokemonBaseExperience(boolean desc) {
        orderBy(PokemonColumns.BASE_EXPERIENCE, desc);
        return this;
    }

    public PokemonHabilidadesSelection orderByPokemonBaseExperience() {
        orderBy(PokemonColumns.BASE_EXPERIENCE, false);
        return this;
    }

    public PokemonHabilidadesSelection pokemonWeight(Integer... value) {
        addEquals(PokemonColumns.WEIGHT, value);
        return this;
    }

    public PokemonHabilidadesSelection pokemonWeightNot(Integer... value) {
        addNotEquals(PokemonColumns.WEIGHT, value);
        return this;
    }

    public PokemonHabilidadesSelection pokemonWeightGt(int value) {
        addGreaterThan(PokemonColumns.WEIGHT, value);
        return this;
    }

    public PokemonHabilidadesSelection pokemonWeightGtEq(int value) {
        addGreaterThanOrEquals(PokemonColumns.WEIGHT, value);
        return this;
    }

    public PokemonHabilidadesSelection pokemonWeightLt(int value) {
        addLessThan(PokemonColumns.WEIGHT, value);
        return this;
    }

    public PokemonHabilidadesSelection pokemonWeightLtEq(int value) {
        addLessThanOrEquals(PokemonColumns.WEIGHT, value);
        return this;
    }

    public PokemonHabilidadesSelection orderByPokemonWeight(boolean desc) {
        orderBy(PokemonColumns.WEIGHT, desc);
        return this;
    }

    public PokemonHabilidadesSelection orderByPokemonWeight() {
        orderBy(PokemonColumns.WEIGHT, false);
        return this;
    }

    public PokemonHabilidadesSelection pokemonHeight(Integer... value) {
        addEquals(PokemonColumns.HEIGHT, value);
        return this;
    }

    public PokemonHabilidadesSelection pokemonHeightNot(Integer... value) {
        addNotEquals(PokemonColumns.HEIGHT, value);
        return this;
    }

    public PokemonHabilidadesSelection pokemonHeightGt(int value) {
        addGreaterThan(PokemonColumns.HEIGHT, value);
        return this;
    }

    public PokemonHabilidadesSelection pokemonHeightGtEq(int value) {
        addGreaterThanOrEquals(PokemonColumns.HEIGHT, value);
        return this;
    }

    public PokemonHabilidadesSelection pokemonHeightLt(int value) {
        addLessThan(PokemonColumns.HEIGHT, value);
        return this;
    }

    public PokemonHabilidadesSelection pokemonHeightLtEq(int value) {
        addLessThanOrEquals(PokemonColumns.HEIGHT, value);
        return this;
    }

    public PokemonHabilidadesSelection orderByPokemonHeight(boolean desc) {
        orderBy(PokemonColumns.HEIGHT, desc);
        return this;
    }

    public PokemonHabilidadesSelection orderByPokemonHeight() {
        orderBy(PokemonColumns.HEIGHT, false);
        return this;
    }

    public PokemonHabilidadesSelection pokemonImage(String... value) {
        addEquals(PokemonColumns.IMAGE, value);
        return this;
    }

    public PokemonHabilidadesSelection pokemonImageNot(String... value) {
        addNotEquals(PokemonColumns.IMAGE, value);
        return this;
    }

    public PokemonHabilidadesSelection pokemonImageLike(String... value) {
        addLike(PokemonColumns.IMAGE, value);
        return this;
    }

    public PokemonHabilidadesSelection pokemonImageContains(String... value) {
        addContains(PokemonColumns.IMAGE, value);
        return this;
    }

    public PokemonHabilidadesSelection pokemonImageStartsWith(String... value) {
        addStartsWith(PokemonColumns.IMAGE, value);
        return this;
    }

    public PokemonHabilidadesSelection pokemonImageEndsWith(String... value) {
        addEndsWith(PokemonColumns.IMAGE, value);
        return this;
    }

    public PokemonHabilidadesSelection orderByPokemonImage(boolean desc) {
        orderBy(PokemonColumns.IMAGE, desc);
        return this;
    }

    public PokemonHabilidadesSelection orderByPokemonImage() {
        orderBy(PokemonColumns.IMAGE, false);
        return this;
    }

    public PokemonHabilidadesSelection habilidadesId(int... value) {
        addEquals(PokemonHabilidadesColumns.HABILIDADES_ID, toObjectArray(value));
        return this;
    }

    public PokemonHabilidadesSelection habilidadesIdNot(int... value) {
        addNotEquals(PokemonHabilidadesColumns.HABILIDADES_ID, toObjectArray(value));
        return this;
    }

    public PokemonHabilidadesSelection habilidadesIdGt(int value) {
        addGreaterThan(PokemonHabilidadesColumns.HABILIDADES_ID, value);
        return this;
    }

    public PokemonHabilidadesSelection habilidadesIdGtEq(int value) {
        addGreaterThanOrEquals(PokemonHabilidadesColumns.HABILIDADES_ID, value);
        return this;
    }

    public PokemonHabilidadesSelection habilidadesIdLt(int value) {
        addLessThan(PokemonHabilidadesColumns.HABILIDADES_ID, value);
        return this;
    }

    public PokemonHabilidadesSelection habilidadesIdLtEq(int value) {
        addLessThanOrEquals(PokemonHabilidadesColumns.HABILIDADES_ID, value);
        return this;
    }

    public PokemonHabilidadesSelection orderByHabilidadesId(boolean desc) {
        orderBy(PokemonHabilidadesColumns.HABILIDADES_ID, desc);
        return this;
    }

    public PokemonHabilidadesSelection orderByHabilidadesId() {
        orderBy(PokemonHabilidadesColumns.HABILIDADES_ID, false);
        return this;
    }

    public PokemonHabilidadesSelection habilidadesIdhabilidad(Integer... value) {
        addEquals(HabilidadesColumns.IDHABILIDAD, value);
        return this;
    }

    public PokemonHabilidadesSelection habilidadesIdhabilidadNot(Integer... value) {
        addNotEquals(HabilidadesColumns.IDHABILIDAD, value);
        return this;
    }

    public PokemonHabilidadesSelection habilidadesIdhabilidadGt(int value) {
        addGreaterThan(HabilidadesColumns.IDHABILIDAD, value);
        return this;
    }

    public PokemonHabilidadesSelection habilidadesIdhabilidadGtEq(int value) {
        addGreaterThanOrEquals(HabilidadesColumns.IDHABILIDAD, value);
        return this;
    }

    public PokemonHabilidadesSelection habilidadesIdhabilidadLt(int value) {
        addLessThan(HabilidadesColumns.IDHABILIDAD, value);
        return this;
    }

    public PokemonHabilidadesSelection habilidadesIdhabilidadLtEq(int value) {
        addLessThanOrEquals(HabilidadesColumns.IDHABILIDAD, value);
        return this;
    }

    public PokemonHabilidadesSelection orderByHabilidadesIdhabilidad(boolean desc) {
        orderBy(HabilidadesColumns.IDHABILIDAD, desc);
        return this;
    }

    public PokemonHabilidadesSelection orderByHabilidadesIdhabilidad() {
        orderBy(HabilidadesColumns.IDHABILIDAD, false);
        return this;
    }

    public PokemonHabilidadesSelection habilidadesName(String... value) {
        addEquals(HabilidadesColumns.NAME, value);
        return this;
    }

    public PokemonHabilidadesSelection habilidadesNameNot(String... value) {
        addNotEquals(HabilidadesColumns.NAME, value);
        return this;
    }

    public PokemonHabilidadesSelection habilidadesNameLike(String... value) {
        addLike(HabilidadesColumns.NAME, value);
        return this;
    }

    public PokemonHabilidadesSelection habilidadesNameContains(String... value) {
        addContains(HabilidadesColumns.NAME, value);
        return this;
    }

    public PokemonHabilidadesSelection habilidadesNameStartsWith(String... value) {
        addStartsWith(HabilidadesColumns.NAME, value);
        return this;
    }

    public PokemonHabilidadesSelection habilidadesNameEndsWith(String... value) {
        addEndsWith(HabilidadesColumns.NAME, value);
        return this;
    }

    public PokemonHabilidadesSelection orderByHabilidadesName(boolean desc) {
        orderBy(HabilidadesColumns.NAME, desc);
        return this;
    }

    public PokemonHabilidadesSelection orderByHabilidadesName() {
        orderBy(HabilidadesColumns.NAME, false);
        return this;
    }

    public PokemonHabilidadesSelection habilidadesGeneration(String... value) {
        addEquals(HabilidadesColumns.GENERATION, value);
        return this;
    }

    public PokemonHabilidadesSelection habilidadesGenerationNot(String... value) {
        addNotEquals(HabilidadesColumns.GENERATION, value);
        return this;
    }

    public PokemonHabilidadesSelection habilidadesGenerationLike(String... value) {
        addLike(HabilidadesColumns.GENERATION, value);
        return this;
    }

    public PokemonHabilidadesSelection habilidadesGenerationContains(String... value) {
        addContains(HabilidadesColumns.GENERATION, value);
        return this;
    }

    public PokemonHabilidadesSelection habilidadesGenerationStartsWith(String... value) {
        addStartsWith(HabilidadesColumns.GENERATION, value);
        return this;
    }

    public PokemonHabilidadesSelection habilidadesGenerationEndsWith(String... value) {
        addEndsWith(HabilidadesColumns.GENERATION, value);
        return this;
    }

    public PokemonHabilidadesSelection orderByHabilidadesGeneration(boolean desc) {
        orderBy(HabilidadesColumns.GENERATION, desc);
        return this;
    }

    public PokemonHabilidadesSelection orderByHabilidadesGeneration() {
        orderBy(HabilidadesColumns.GENERATION, false);
        return this;
    }
}
