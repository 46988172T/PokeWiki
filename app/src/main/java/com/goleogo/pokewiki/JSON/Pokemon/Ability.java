
package com.goleogo.pokewiki.JSON.Pokemon;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Ability {

    @SerializedName("is_hidden")
    @Expose
    private Boolean isHidden;
    @SerializedName("slot")
    @Expose
    private Integer slot;
    @SerializedName("ability")
    @Expose
    private Ability_ ability;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Ability() {
    }

    /**
     * 
     * @param isHidden
     * @param slot
     * @param ability
     */
    public Ability(Boolean isHidden, Integer slot, Ability_ ability) {
        this.isHidden = isHidden;
        this.slot = slot;
        this.ability = ability;
    }

    /**
     * 
     * @return
     *     The isHidden
     */
    public Boolean getIsHidden() {
        return isHidden;
    }

    /**
     * 
     * @param isHidden
     *     The is_hidden
     */
    public void setIsHidden(Boolean isHidden) {
        this.isHidden = isHidden;
    }

    /**
     * 
     * @return
     *     The slot
     */
    public Integer getSlot() {
        return slot;
    }

    /**
     * 
     * @param slot
     *     The slot
     */
    public void setSlot(Integer slot) {
        this.slot = slot;
    }

    /**
     * 
     * @return
     *     The ability
     */
    public Ability_ getAbility() {
        return ability;
    }

    /**
     * 
     * @param ability
     *     The ability
     */
    public void setAbility(Ability_ ability) {
        this.ability = ability;
    }

}
