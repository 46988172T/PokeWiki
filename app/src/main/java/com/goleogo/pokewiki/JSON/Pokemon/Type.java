
package com.goleogo.pokewiki.JSON.Pokemon;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Type {

    @SerializedName("slot")
    @Expose
    private Integer slot;
    @SerializedName("type")
    @Expose
    private Type_ type;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Type() {
    }

    /**
     * 
     * @param type
     * @param slot
     */
    public Type(Integer slot, Type_ type) {
        this.slot = slot;
        this.type = type;
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
     *     The type
     */
    public Type_ getType() {
        return type;
    }

    /**
     * 
     * @param type
     *     The type
     */
    public void setType(Type_ type) {
        this.type = type;
    }

}
