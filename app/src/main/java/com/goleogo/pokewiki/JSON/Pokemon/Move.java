
package com.goleogo.pokewiki.JSON.Pokemon;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Move {

    @SerializedName("move")
    @Expose
    private Move_ move;
    @SerializedName("version_group_details")
    @Expose
    private List<VersionGroupDetail> versionGroupDetails = new ArrayList<VersionGroupDetail>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Move() {
    }

    /**
     * 
     * @param versionGroupDetails
     * @param move
     */
    public Move(Move_ move, List<VersionGroupDetail> versionGroupDetails) {
        this.move = move;
        this.versionGroupDetails = versionGroupDetails;
    }

    /**
     * 
     * @return
     *     The move
     */
    public Move_ getMove() {
        return move;
    }

    /**
     * 
     * @param move
     *     The move
     */
    public void setMove(Move_ move) {
        this.move = move;
    }

    /**
     * 
     * @return
     *     The versionGroupDetails
     */
    public List<VersionGroupDetail> getVersionGroupDetails() {
        return versionGroupDetails;
    }

    /**
     * 
     * @param versionGroupDetails
     *     The version_group_details
     */
    public void setVersionGroupDetails(List<VersionGroupDetail> versionGroupDetails) {
        this.versionGroupDetails = versionGroupDetails;
    }

}
