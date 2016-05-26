
package com.goleogo.pokewiki.JSON.Pokemon;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Pokemon {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("base_experience")
    @Expose
    private Integer baseExperience;
    @SerializedName("height")
    @Expose
    private Integer height;
    @SerializedName("is_default")
    @Expose
    private Boolean isDefault;
    @SerializedName("order")
    @Expose
    private Integer order;
    @SerializedName("weight")
    @Expose
    private Integer weight;
    @SerializedName("abilities")
    @Expose
    private List<Ability> abilities = new ArrayList<Ability>();
    @SerializedName("forms")
    @Expose
    private List<Form> forms = new ArrayList<Form>();
    @SerializedName("game_indices")
    @Expose
    private List<GameIndex> gameIndices = new ArrayList<GameIndex>();
    @SerializedName("held_items")
    @Expose
    private List<Object> heldItems = new ArrayList<Object>();
    @SerializedName("location_area_encounters")
    @Expose
    private List<Object> locationAreaEncounters = new ArrayList<Object>();
    @SerializedName("moves")
    @Expose
    private List<Move> moves = new ArrayList<Move>();
    @SerializedName("species")
    @Expose
    private Species species;
    @SerializedName("sprites")
    @Expose
    private Sprites sprites;
    @SerializedName("stats")
    @Expose
    private List<Stat> stats = new ArrayList<Stat>();
    @SerializedName("types")
    @Expose
    private List<Type> types = new ArrayList<Type>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Pokemon() {
    }

    /**
     * 
     * @param gameIndices
     * @param weight
     * @param species
     * @param stats
     * @param moves
     * @param locationAreaEncounters
     * @param heldItems
     * @param id
     * @param baseExperience
     * @param height
     * @param order
     * @param abilities
     * @param isDefault
     * @param name
     * @param sprites
     * @param types
     * @param forms
     */
    public Pokemon(Integer id, String name, Integer baseExperience, Integer height, Boolean isDefault, Integer order, Integer weight, List<Ability> abilities, List<Form> forms, List<GameIndex> gameIndices, List<Object> heldItems, List<Object> locationAreaEncounters, List<Move> moves, Species species, Sprites sprites, List<Stat> stats, List<Type> types) {
        this.id = id;
        this.name = name;
        this.baseExperience = baseExperience;
        this.height = height;
        this.isDefault = isDefault;
        this.order = order;
        this.weight = weight;
        this.abilities = abilities;
        this.forms = forms;
        this.gameIndices = gameIndices;
        this.heldItems = heldItems;
        this.locationAreaEncounters = locationAreaEncounters;
        this.moves = moves;
        this.species = species;
        this.sprites = sprites;
        this.stats = stats;
        this.types = types;
    }

    /**
     * 
     * @return
     *     The id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 
     * @param id
     *     The id
     */
    public void setId(Integer id) {
        this.id = id;
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
     *     The baseExperience
     */
    public Integer getBaseExperience() {
        return baseExperience;
    }

    /**
     * 
     * @param baseExperience
     *     The base_experience
     */
    public void setBaseExperience(Integer baseExperience) {
        this.baseExperience = baseExperience;
    }

    /**
     * 
     * @return
     *     The height
     */
    public Integer getHeight() {
        return height;
    }

    /**
     * 
     * @param height
     *     The height
     */
    public void setHeight(Integer height) {
        this.height = height;
    }

    /**
     * 
     * @return
     *     The isDefault
     */
    public Boolean getIsDefault() {
        return isDefault;
    }

    /**
     * 
     * @param isDefault
     *     The is_default
     */
    public void setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
    }

    /**
     * 
     * @return
     *     The order
     */
    public Integer getOrder() {
        return order;
    }

    /**
     * 
     * @param order
     *     The order
     */
    public void setOrder(Integer order) {
        this.order = order;
    }

    /**
     * 
     * @return
     *     The weight
     */
    public Integer getWeight() {
        return weight;
    }

    /**
     * 
     * @param weight
     *     The weight
     */
    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    /**
     * 
     * @return
     *     The abilities
     */
    public List<Ability> getAbilities() {
        return abilities;
    }

    /**
     * 
     * @param abilities
     *     The abilities
     */
    public void setAbilities(List<Ability> abilities) {
        this.abilities = abilities;
    }

    /**
     * 
     * @return
     *     The forms
     */
    public List<Form> getForms() {
        return forms;
    }

    /**
     * 
     * @param forms
     *     The forms
     */
    public void setForms(List<Form> forms) {
        this.forms = forms;
    }

    /**
     * 
     * @return
     *     The gameIndices
     */
    public List<GameIndex> getGameIndices() {
        return gameIndices;
    }

    /**
     * 
     * @param gameIndices
     *     The game_indices
     */
    public void setGameIndices(List<GameIndex> gameIndices) {
        this.gameIndices = gameIndices;
    }

    /**
     * 
     * @return
     *     The heldItems
     */
    public List<Object> getHeldItems() {
        return heldItems;
    }

    /**
     * 
     * @param heldItems
     *     The held_items
     */
    public void setHeldItems(List<Object> heldItems) {
        this.heldItems = heldItems;
    }

    /**
     * 
     * @return
     *     The locationAreaEncounters
     */
    public List<Object> getLocationAreaEncounters() {
        return locationAreaEncounters;
    }

    /**
     * 
     * @param locationAreaEncounters
     *     The location_area_encounters
     */
    public void setLocationAreaEncounters(List<Object> locationAreaEncounters) {
        this.locationAreaEncounters = locationAreaEncounters;
    }

    /**
     * 
     * @return
     *     The moves
     */
    public List<Move> getMoves() {
        return moves;
    }

    /**
     * 
     * @param moves
     *     The moves
     */
    public void setMoves(List<Move> moves) {
        this.moves = moves;
    }

    /**
     * 
     * @return
     *     The species
     */
    public Species getSpecies() {
        return species;
    }

    /**
     * 
     * @param species
     *     The species
     */
    public void setSpecies(Species species) {
        this.species = species;
    }

    /**
     * 
     * @return
     *     The sprites
     */
    public Sprites getSprites() {
        return sprites;
    }

    /**
     * 
     * @param sprites
     *     The sprites
     */
    public void setSprites(Sprites sprites) {
        this.sprites = sprites;
    }

    /**
     * 
     * @return
     *     The stats
     */
    public List<Stat> getStats() {
        return stats;
    }

    /**
     * 
     * @param stats
     *     The stats
     */
    public void setStats(List<Stat> stats) {
        this.stats = stats;
    }

    /**
     * 
     * @return
     *     The types
     */
    public List<Type> getTypes() {
        return types;
    }

    /**
     * 
     * @param types
     *     The types
     */
    public void setTypes(List<Type> types) {
        this.types = types;
    }

}
