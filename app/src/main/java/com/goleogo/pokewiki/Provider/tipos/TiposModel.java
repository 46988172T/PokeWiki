package com.goleogo.pokewiki.Provider.tipos;

import com.goleogo.pokewiki.Provider.base.BaseModel;

import java.util.Date;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

/**
 * Lista de tipos
 */
public interface TiposModel extends BaseModel {

    /**
     * idTipos
     * Can be {@code null}.
     */
    @Nullable
    Integer getIdtipos();

    /**
     * nombre
     * Can be {@code null}.
     */
    @Nullable
    String getName();

    /**
     * generación
     * Cannot be {@code null}.
     */
    @NonNull
    String getGeneration();
}
