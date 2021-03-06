
package com.goleogo.pokewiki.JSON.Habilidades;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class FlavorTextEntry {

    @SerializedName("flavor_text")
    @Expose
    private String flavorText;
    @SerializedName("language")
    @Expose
    private Language__ language;
    @SerializedName("version_group")
    @Expose
    private VersionGroup versionGroup;

    /**
     * No args constructor for use in serialization
     * 
     */
    public FlavorTextEntry() {
    }

    /**
     * 
     * @param versionGroup
     * @param flavorText
     * @param language
     */
    public FlavorTextEntry(String flavorText, Language__ language, VersionGroup versionGroup) {
        this.flavorText = flavorText;
        this.language = language;
        this.versionGroup = versionGroup;
    }

    /**
     * 
     * @return
     *     The flavorText
     */
    public String getFlavorText() {
        return flavorText;
    }

    /**
     * 
     * @param flavorText
     *     The flavor_text
     */
    public void setFlavorText(String flavorText) {
        this.flavorText = flavorText;
    }

    /**
     * 
     * @return
     *     The language
     */
    public Language__ getLanguage() {
        return language;
    }

    /**
     * 
     * @param language
     *     The language
     */
    public void setLanguage(Language__ language) {
        this.language = language;
    }

    /**
     * 
     * @return
     *     The versionGroup
     */
    public VersionGroup getVersionGroup() {
        return versionGroup;
    }

    /**
     * 
     * @param versionGroup
     *     The version_group
     */
    public void setVersionGroup(VersionGroup versionGroup) {
        this.versionGroup = versionGroup;
    }

}
