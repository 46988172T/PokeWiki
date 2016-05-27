package com.goleogo.pokewiki.Provider.pokemonmovimientos;

import java.util.Date;

import android.database.Cursor;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import com.goleogo.pokewiki.Provider.base.AbstractCursor;
import com.goleogo.pokewiki.Provider.pokemon.*;
import com.goleogo.pokewiki.Provider.movimientos.*;

/**
 * Cursor wrapper for the {@code pokemon_movimientos} table.
 */
public class PokemonMovimientosCursor extends AbstractCursor implements PokemonMovimientosModel {
    public PokemonMovimientosCursor(Cursor cursor) {
        super(cursor);
    }

    /**
     * Primary key.
     */
    public long getId() {
        Long res = getLongOrNull(PokemonMovimientosColumns._ID);
        if (res == null)
            throw new NullPointerException("The value of '_id' in the database was null, which is not allowed according to the model definition");
        return res;
    }

    /**
     * Get the {@code pokemon_id} value.
     */
    public int getPokemonId() {
        Integer res = getIntegerOrNull(PokemonMovimientosColumns.POKEMON_ID);
        if (res == null)
            throw new NullPointerException("The value of 'pokemon_id' in the database was null, which is not allowed according to the model definition");
        return res;
    }

    /**
     * idPokemon
     * Can be {@code null}.
     */
    @Nullable
    public Integer getPokemonIdpokemon() {
        Integer res = getIntegerOrNull(PokemonColumns.IDPOKEMON);
        return res;
    }

    /**
     * nombre
     * Can be {@code null}.
     */
    @Nullable
    public String getPokemonName() {
        String res = getStringOrNull(PokemonColumns.NAME);
        return res;
    }

    /**
     * experiencia_inicial
     * Can be {@code null}.
     */
    @Nullable
    public Integer getPokemonBaseExperience() {
        Integer res = getIntegerOrNull(PokemonColumns.BASE_EXPERIENCE);
        return res;
    }

    /**
     * peso
     * Can be {@code null}.
     */
    @Nullable
    public Integer getPokemonWeight() {
        Integer res = getIntegerOrNull(PokemonColumns.WEIGHT);
        return res;
    }

    /**
     * altura
     * Can be {@code null}.
     */
    @Nullable
    public Integer getPokemonHeight() {
        Integer res = getIntegerOrNull(PokemonColumns.HEIGHT);
        return res;
    }

    /**
     * imagen
     * Cannot be {@code null}.
     */
    @NonNull
    public String getPokemonImage() {
        String res = getStringOrNull(PokemonColumns.IMAGE);
        if (res == null)
            throw new NullPointerException("The value of 'image' in the database was null, which is not allowed according to the model definition");
        return res;
    }

    /**
     * Get the {@code movimientos_id} value.
     */
    public int getMovimientosId() {
        Integer res = getIntegerOrNull(PokemonMovimientosColumns.MOVIMIENTOS_ID);
        if (res == null)
            throw new NullPointerException("The value of 'movimientos_id' in the database was null, which is not allowed according to the model definition");
        return res;
    }

    /**
     * idMovimiento
     * Can be {@code null}.
     */
    @Nullable
    public Integer getMovimientosIdmovimiento() {
        Integer res = getIntegerOrNull(MovimientosColumns.IDMOVIMIENTO);
        return res;
    }

    /**
     * nombre
     * Can be {@code null}.
     */
    @Nullable
    public String getMovimientosName() {
        String res = getStringOrNull(MovimientosColumns.NAME);
        return res;
    }

    /**
     * accuracy
     */
    public int getMovimientosAccuracy() {
        Integer res = getIntegerOrNull(MovimientosColumns.ACCURACY);
        if (res == null)
            throw new NullPointerException("The value of 'accuracy' in the database was null, which is not allowed according to the model definition");
        return res;
    }

    /**
     * pp
     * Can be {@code null}.
     */
    @Nullable
    public Integer getMovimientosPp() {
        Integer res = getIntegerOrNull(MovimientosColumns.PP);
        return res;
    }
}
