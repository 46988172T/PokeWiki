
package com.goleogo.pokewiki.JSON.Movimientos;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Meta {

    @SerializedName("ailment")
    @Expose
    private Ailment ailment;
    @SerializedName("category")
    @Expose
    private Category category;
    @SerializedName("min_hits")
    @Expose
    private Integer minHits;
    @SerializedName("max_hits")
    @Expose
    private Integer maxHits;
    @SerializedName("min_turns")
    @Expose
    private Object minTurns;
    @SerializedName("max_turns")
    @Expose
    private Object maxTurns;
    @SerializedName("drain")
    @Expose
    private Integer drain;
    @SerializedName("healing")
    @Expose
    private Integer healing;
    @SerializedName("crit_rate")
    @Expose
    private Integer critRate;
    @SerializedName("ailment_chance")
    @Expose
    private Integer ailmentChance;
    @SerializedName("flinch_chance")
    @Expose
    private Integer flinchChance;
    @SerializedName("stat_chance")
    @Expose
    private Integer statChance;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Meta() {
    }

    /**
     * 
     * @param ailmentChance
     * @param maxTurns
     * @param category
     * @param flinchChance
     * @param critRate
     * @param minHits
     * @param healing
     * @param maxHits
     * @param statChance
     * @param drain
     * @param ailment
     * @param minTurns
     */
    public Meta(Ailment ailment, Category category, Integer minHits, Integer maxHits, Object minTurns, Object maxTurns, Integer drain, Integer healing, Integer critRate, Integer ailmentChance, Integer flinchChance, Integer statChance) {
        this.ailment = ailment;
        this.category = category;
        this.minHits = minHits;
        this.maxHits = maxHits;
        this.minTurns = minTurns;
        this.maxTurns = maxTurns;
        this.drain = drain;
        this.healing = healing;
        this.critRate = critRate;
        this.ailmentChance = ailmentChance;
        this.flinchChance = flinchChance;
        this.statChance = statChance;
    }

    /**
     * 
     * @return
     *     The ailment
     */
    public Ailment getAilment() {
        return ailment;
    }

    /**
     * 
     * @param ailment
     *     The ailment
     */
    public void setAilment(Ailment ailment) {
        this.ailment = ailment;
    }

    /**
     * 
     * @return
     *     The category
     */
    public Category getCategory() {
        return category;
    }

    /**
     * 
     * @param category
     *     The category
     */
    public void setCategory(Category category) {
        this.category = category;
    }

    /**
     * 
     * @return
     *     The minHits
     */
    public Integer getMinHits() {
        return minHits;
    }

    /**
     * 
     * @param minHits
     *     The min_hits
     */
    public void setMinHits(Integer minHits) {
        this.minHits = minHits;
    }

    /**
     * 
     * @return
     *     The maxHits
     */
    public Integer getMaxHits() {
        return maxHits;
    }

    /**
     * 
     * @param maxHits
     *     The max_hits
     */
    public void setMaxHits(Integer maxHits) {
        this.maxHits = maxHits;
    }

    /**
     * 
     * @return
     *     The minTurns
     */
    public Object getMinTurns() {
        return minTurns;
    }

    /**
     * 
     * @param minTurns
     *     The min_turns
     */
    public void setMinTurns(Object minTurns) {
        this.minTurns = minTurns;
    }

    /**
     * 
     * @return
     *     The maxTurns
     */
    public Object getMaxTurns() {
        return maxTurns;
    }

    /**
     * 
     * @param maxTurns
     *     The max_turns
     */
    public void setMaxTurns(Object maxTurns) {
        this.maxTurns = maxTurns;
    }

    /**
     * 
     * @return
     *     The drain
     */
    public Integer getDrain() {
        return drain;
    }

    /**
     * 
     * @param drain
     *     The drain
     */
    public void setDrain(Integer drain) {
        this.drain = drain;
    }

    /**
     * 
     * @return
     *     The healing
     */
    public Integer getHealing() {
        return healing;
    }

    /**
     * 
     * @param healing
     *     The healing
     */
    public void setHealing(Integer healing) {
        this.healing = healing;
    }

    /**
     * 
     * @return
     *     The critRate
     */
    public Integer getCritRate() {
        return critRate;
    }

    /**
     * 
     * @param critRate
     *     The crit_rate
     */
    public void setCritRate(Integer critRate) {
        this.critRate = critRate;
    }

    /**
     * 
     * @return
     *     The ailmentChance
     */
    public Integer getAilmentChance() {
        return ailmentChance;
    }

    /**
     * 
     * @param ailmentChance
     *     The ailment_chance
     */
    public void setAilmentChance(Integer ailmentChance) {
        this.ailmentChance = ailmentChance;
    }

    /**
     * 
     * @return
     *     The flinchChance
     */
    public Integer getFlinchChance() {
        return flinchChance;
    }

    /**
     * 
     * @param flinchChance
     *     The flinch_chance
     */
    public void setFlinchChance(Integer flinchChance) {
        this.flinchChance = flinchChance;
    }

    /**
     * 
     * @return
     *     The statChance
     */
    public Integer getStatChance() {
        return statChance;
    }

    /**
     * 
     * @param statChance
     *     The stat_chance
     */
    public void setStatChance(Integer statChance) {
        this.statChance = statChance;
    }

}
