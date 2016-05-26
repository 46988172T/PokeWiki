
package com.goleogo.pokewiki.JSON.Pokemon;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class VersionGroupDetail {

    @SerializedName("level_learned_at")
    @Expose
    private Integer levelLearnedAt;
    @SerializedName("version_group")
    @Expose
    private VersionGroup versionGroup;
    @SerializedName("move_learn_method")
    @Expose
    private MoveLearnMethod moveLearnMethod;

    /**
     * No args constructor for use in serialization
     * 
     */
    public VersionGroupDetail() {
    }

    /**
     * 
     * @param versionGroup
     * @param levelLearnedAt
     * @param moveLearnMethod
     */
    public VersionGroupDetail(Integer levelLearnedAt, VersionGroup versionGroup, MoveLearnMethod moveLearnMethod) {
        this.levelLearnedAt = levelLearnedAt;
        this.versionGroup = versionGroup;
        this.moveLearnMethod = moveLearnMethod;
    }

    /**
     * 
     * @return
     *     The levelLearnedAt
     */
    public Integer getLevelLearnedAt() {
        return levelLearnedAt;
    }

    /**
     * 
     * @param levelLearnedAt
     *     The level_learned_at
     */
    public void setLevelLearnedAt(Integer levelLearnedAt) {
        this.levelLearnedAt = levelLearnedAt;
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

    /**
     * 
     * @return
     *     The moveLearnMethod
     */
    public MoveLearnMethod getMoveLearnMethod() {
        return moveLearnMethod;
    }

    /**
     * 
     * @param moveLearnMethod
     *     The move_learn_method
     */
    public void setMoveLearnMethod(MoveLearnMethod moveLearnMethod) {
        this.moveLearnMethod = moveLearnMethod;
    }

}
