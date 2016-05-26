
package com.goleogo.pokewiki.JSON.Pokemon;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Stat {

    @SerializedName("base_stat")
    @Expose
    private Integer baseStat;
    @SerializedName("effort")
    @Expose
    private Integer effort;
    @SerializedName("stat")
    @Expose
    private Stat_ stat;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Stat() {
    }

    /**
     * 
     * @param baseStat
     * @param effort
     * @param stat
     */
    public Stat(Integer baseStat, Integer effort, Stat_ stat) {
        this.baseStat = baseStat;
        this.effort = effort;
        this.stat = stat;
    }

    /**
     * 
     * @return
     *     The baseStat
     */
    public Integer getBaseStat() {
        return baseStat;
    }

    /**
     * 
     * @param baseStat
     *     The base_stat
     */
    public void setBaseStat(Integer baseStat) {
        this.baseStat = baseStat;
    }

    /**
     * 
     * @return
     *     The effort
     */
    public Integer getEffort() {
        return effort;
    }

    /**
     * 
     * @param effort
     *     The effort
     */
    public void setEffort(Integer effort) {
        this.effort = effort;
    }

    /**
     * 
     * @return
     *     The stat
     */
    public Stat_ getStat() {
        return stat;
    }

    /**
     * 
     * @param stat
     *     The stat
     */
    public void setStat(Stat_ stat) {
        this.stat = stat;
    }

}
