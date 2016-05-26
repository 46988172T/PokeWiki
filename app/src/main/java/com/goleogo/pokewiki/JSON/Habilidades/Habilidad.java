
package com.goleogo.pokewiki.JSON.Habilidades;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Habilidad {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("is_main_series")
    @Expose
    private Boolean isMainSeries;
    @SerializedName("generation")
    @Expose
    private Generation generation;
    @SerializedName("names")
    @Expose
    private List<Name> names = new ArrayList<Name>();
    @SerializedName("effect_entries")
    @Expose
    private List<EffectEntry> effectEntries = new ArrayList<EffectEntry>();
    @SerializedName("effect_changes")
    @Expose
    private List<Object> effectChanges = new ArrayList<Object>();
    @SerializedName("flavor_text_entries")
    @Expose
    private List<FlavorTextEntry> flavorTextEntries = new ArrayList<FlavorTextEntry>();
    @SerializedName("pokemon")
    @Expose
    private List<Pokemon> pokemon = new ArrayList<Pokemon>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Habilidad() {
    }

    /**
     * 
     * @param effectEntries
     * @param id
     * @param pokemon
     * @param flavorTextEntries
     * @param isMainSeries
     * @param effectChanges
     * @param names
     * @param name
     * @param generation
     */
    public Habilidad(Integer id, String name, Boolean isMainSeries, Generation generation, List<Name> names, List<EffectEntry> effectEntries, List<Object> effectChanges, List<FlavorTextEntry> flavorTextEntries, List<Pokemon> pokemon) {
        this.id = id;
        this.name = name;
        this.isMainSeries = isMainSeries;
        this.generation = generation;
        this.names = names;
        this.effectEntries = effectEntries;
        this.effectChanges = effectChanges;
        this.flavorTextEntries = flavorTextEntries;
        this.pokemon = pokemon;
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
     *     The isMainSeries
     */
    public Boolean getIsMainSeries() {
        return isMainSeries;
    }

    /**
     * 
     * @param isMainSeries
     *     The is_main_series
     */
    public void setIsMainSeries(Boolean isMainSeries) {
        this.isMainSeries = isMainSeries;
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

    /**
     * 
     * @return
     *     The names
     */
    public List<Name> getNames() {
        return names;
    }

    /**
     * 
     * @param names
     *     The names
     */
    public void setNames(List<Name> names) {
        this.names = names;
    }

    /**
     * 
     * @return
     *     The effectEntries
     */
    public List<EffectEntry> getEffectEntries() {
        return effectEntries;
    }

    /**
     * 
     * @param effectEntries
     *     The effect_entries
     */
    public void setEffectEntries(List<EffectEntry> effectEntries) {
        this.effectEntries = effectEntries;
    }

    /**
     * 
     * @return
     *     The effectChanges
     */
    public List<Object> getEffectChanges() {
        return effectChanges;
    }

    /**
     * 
     * @param effectChanges
     *     The effect_changes
     */
    public void setEffectChanges(List<Object> effectChanges) {
        this.effectChanges = effectChanges;
    }

    /**
     * 
     * @return
     *     The flavorTextEntries
     */
    public List<FlavorTextEntry> getFlavorTextEntries() {
        return flavorTextEntries;
    }

    /**
     * 
     * @param flavorTextEntries
     *     The flavor_text_entries
     */
    public void setFlavorTextEntries(List<FlavorTextEntry> flavorTextEntries) {
        this.flavorTextEntries = flavorTextEntries;
    }

    /**
     * 
     * @return
     *     The pokemon
     */
    public List<Pokemon> getPokemon() {
        return pokemon;
    }

    /**
     * 
     * @param pokemon
     *     The pokemon
     */
    public void setPokemon(List<Pokemon> pokemon) {
        this.pokemon = pokemon;
    }

}
