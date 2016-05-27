package com.goleogo.pokewiki.Provider.movimientos;

import com.goleogo.pokewiki.Provider.base.BaseModel;

import java.util.Date;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

/**
 * Lista de movimientos
 */
public interface MovimientosModel extends BaseModel {

    /**
     * idMovimiento
     * Can be {@code null}.
     */
    @Nullable
    Integer getIdmovimiento();

    /**
     * nombre
     * Can be {@code null}.
     */
    @Nullable
    String getName();

    /**
     * accuracy
     */
    int getAccuracy();

    /**
     * pp
     * Can be {@code null}.
     */
    @Nullable
    Integer getPp();
}
