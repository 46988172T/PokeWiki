package com.goleogo.pokewiki.Provider.habilidades;

import com.goleogo.pokewiki.Provider.base.BaseModel;

import java.util.Date;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

/**
 * Lista de habilidades
 */
public interface HabilidadesModel extends BaseModel {

    /**
     * idHabilidad
     * Can be {@code null}.
     */
    @Nullable
    Integer getIdhabilidad();

    /**
     * nombre
     * Can be {@code null}.
     */
    @Nullable
    String getName();

    /**
     * generación
     * Can be {@code null}.
     */
    @Nullable
    String getGeneration();
}
