
package com.goleogo.pokewiki.JSON.Pokemon;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class GameIndex {

    @SerializedName("game_index")
    @Expose
    private Integer gameIndex;
    @SerializedName("version")
    @Expose
    private Version version;

    /**
     * No args constructor for use in serialization
     * 
     */
    public GameIndex() {
    }

    /**
     * 
     * @param gameIndex
     * @param version
     */
    public GameIndex(Integer gameIndex, Version version) {
        this.gameIndex = gameIndex;
        this.version = version;
    }

    /**
     * 
     * @return
     *     The gameIndex
     */
    public Integer getGameIndex() {
        return gameIndex;
    }

    /**
     * 
     * @param gameIndex
     *     The game_index
     */
    public void setGameIndex(Integer gameIndex) {
        this.gameIndex = gameIndex;
    }

    /**
     * 
     * @return
     *     The version
     */
    public Version getVersion() {
        return version;
    }

    /**
     * 
     * @param version
     *     The version
     */
    public void setVersion(Version version) {
        this.version = version;
    }

}
