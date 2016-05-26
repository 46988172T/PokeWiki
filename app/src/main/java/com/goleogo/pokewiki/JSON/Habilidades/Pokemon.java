
package com.goleogo.pokewiki.JSON.Habilidades;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Pokemon {

    @SerializedName("is_hidden")
    @Expose
    private Boolean isHidden;
    @SerializedName("slot")
    @Expose
    private Integer slot;
    @SerializedName("pokemon")
    @Expose
    private Pokemon_ pokemon;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Pokemon() {
    }

    /**
     * 
     * @param isHidden
     * @param pokemon
     * @param slot
     */
    public Pokemon(Boolean isHidden, Integer slot, Pokemon_ pokemon) {
        this.isHidden = isHidden;
        this.slot = slot;
        this.pokemon = pokemon;
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
     *     The pokemon
     */
    public Pokemon_ getPokemon() {
        return pokemon;
    }

    /**
     * 
     * @param pokemon
     *     The pokemon
     */
    public void setPokemon(Pokemon_ pokemon) {
        this.pokemon = pokemon;
    }

}
