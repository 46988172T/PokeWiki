
package com.goleogo.pokewiki.JSON.Movimientos;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Name {

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("language")
    @Expose
    private Language_ language;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Name() {
    }

    /**
     * 
     * @param name
     * @param language
     */
    public Name(String name, Language_ language) {
        this.name = name;
        this.language = language;
    }

    /**
     * 
     * @return
     *     The name
     */
    public String getName() {
        return name;
    }

    /**
     * 
     * @param name
     *     The name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 
     * @return
     *     The language
     */
    public Language_ getLanguage() {
        return language;
    }

    /**
     * 
     * @param language
     *     The language
     */
    public void setLanguage(Language_ language) {
        this.language = language;
    }

}
