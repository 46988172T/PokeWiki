
package com.goleogo.pokewiki.JSON.Tipos;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class GameIndex {

    @SerializedName("game_index")
    @Expose
    private Integer gameIndex;
    @SerializedName("generation")
    @Expose
    private Generation generation;

    /**
     * No args constructor for use in serialization
     * 
     */
    public GameIndex() {
    }

    /**
     * 
     * @param gameIndex
     * @param generation
     */
    public GameIndex(Integer gameIndex, Generation generation) {
        this.gameIndex = gameIndex;
        this.generation = generation;
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
     *     The generation
     */
    public Generation getGeneration() {
        return generation;
    }

    /**
     * 
     * @param generation
     *     The generation
     */
    public void setGeneration(Generation generation) {
        this.generation = generation;
    }

}
