
package com.goleogo.pokewiki.JSON.Tipos;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class DamageRelations {

    @SerializedName("no_damage_to")
    @Expose
    private List<Object> noDamageTo = new ArrayList<Object>();
    @SerializedName("half_damage_to")
    @Expose
    private List<HalfDamageTo> halfDamageTo = new ArrayList<HalfDamageTo>();
    @SerializedName("double_damage_to")
    @Expose
    private List<DoubleDamageTo> doubleDamageTo = new ArrayList<DoubleDamageTo>();
    @SerializedName("no_damage_from")
    @Expose
    private List<NoDamageFrom> noDamageFrom = new ArrayList<NoDamageFrom>();
    @SerializedName("half_damage_from")
    @Expose
    private List<HalfDamageFrom> halfDamageFrom = new ArrayList<HalfDamageFrom>();
    @SerializedName("double_damage_from")
    @Expose
    private List<DoubleDamageFrom> doubleDamageFrom = new ArrayList<DoubleDamageFrom>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public DamageRelations() {
    }

    /**
     * 
     * @param doubleDamageFrom
     * @param noDamageTo
     * @param noDamageFrom
     * @param doubleDamageTo
     * @param halfDamageFrom
     * @param halfDamageTo
     */
    public DamageRelations(List<Object> noDamageTo, List<HalfDamageTo> halfDamageTo, List<DoubleDamageTo> doubleDamageTo, List<NoDamageFrom> noDamageFrom, List<HalfDamageFrom> halfDamageFrom, List<DoubleDamageFrom> doubleDamageFrom) {
        this.noDamageTo = noDamageTo;
        this.halfDamageTo = halfDamageTo;
        this.doubleDamageTo = doubleDamageTo;
        this.noDamageFrom = noDamageFrom;
        this.halfDamageFrom = halfDamageFrom;
        this.doubleDamageFrom = doubleDamageFrom;
    }

    /**
     * 
     * @return
     *     The noDamageTo
     */
    public List<Object> getNoDamageTo() {
        return noDamageTo;
    }

    /**
     * 
     * @param noDamageTo
     *     The no_damage_to
     */
    public void setNoDamageTo(List<Object> noDamageTo) {
        this.noDamageTo = noDamageTo;
    }

    /**
     * 
     * @return
     *     The halfDamageTo
     */
    public List<HalfDamageTo> getHalfDamageTo() {
        return halfDamageTo;
    }

    /**
     * 
     * @param halfDamageTo
     *     The half_damage_to
     */
    public void setHalfDamageTo(List<HalfDamageTo> halfDamageTo) {
        this.halfDamageTo = halfDamageTo;
    }

    /**
     * 
     * @return
     *     The doubleDamageTo
     */
    public List<DoubleDamageTo> getDoubleDamageTo() {
        return doubleDamageTo;
    }

    /**
     * 
     * @param doubleDamageTo
     *     The double_damage_to
     */
    public void setDoubleDamageTo(List<DoubleDamageTo> doubleDamageTo) {
        this.doubleDamageTo = doubleDamageTo;
    }

    /**
     * 
     * @return
     *     The noDamageFrom
     */
    public List<NoDamageFrom> getNoDamageFrom() {
        return noDamageFrom;
    }

    /**
     * 
     * @param noDamageFrom
     *     The no_damage_from
     */
    public void setNoDamageFrom(List<NoDamageFrom> noDamageFrom) {
        this.noDamageFrom = noDamageFrom;
    }

    /**
     * 
     * @return
     *     The halfDamageFrom
     */
    public List<HalfDamageFrom> getHalfDamageFrom() {
        return halfDamageFrom;
    }

    /**
     * 
     * @param halfDamageFrom
     *     The half_damage_from
     */
    public void setHalfDamageFrom(List<HalfDamageFrom> halfDamageFrom) {
        this.halfDamageFrom = halfDamageFrom;
    }

    /**
     * 
     * @return
     *     The doubleDamageFrom
     */
    public List<DoubleDamageFrom> getDoubleDamageFrom() {
        return doubleDamageFrom;
    }

    /**
     * 
     * @param doubleDamageFrom
     *     The double_damage_from
     */
    public void setDoubleDamageFrom(List<DoubleDamageFrom> doubleDamageFrom) {
        this.doubleDamageFrom = doubleDamageFrom;
    }

}
