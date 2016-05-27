package com.goleogo.pokewiki.API;

import android.content.Context;
import android.util.Log;

import com.goleogo.pokewiki.JSON.Habilidades.Habilidad;
import com.goleogo.pokewiki.JSON.Movimientos.Movimiento;
import com.goleogo.pokewiki.JSON.Pokemon.Pokemon;
import com.goleogo.pokewiki.JSON.Tipos.Tipo;
import com.goleogo.pokewiki.Provider.habilidades.HabilidadesColumns;
import com.goleogo.pokewiki.Provider.habilidades.HabilidadesContentValues;
import com.goleogo.pokewiki.Provider.movimientos.MovimientosColumns;
import com.goleogo.pokewiki.Provider.movimientos.MovimientosContentValues;
import com.goleogo.pokewiki.Provider.pokemon.PokemonColumns;
import com.goleogo.pokewiki.Provider.pokemon.PokemonContentValues;
import com.goleogo.pokewiki.Provider.pokemonhabilidades.PokemonHabilidadesColumns;
import com.goleogo.pokewiki.Provider.pokemonhabilidades.PokemonHabilidadesContentValues;
import com.goleogo.pokewiki.Provider.pokemonmovimientos.PokemonMovimientosColumns;
import com.goleogo.pokewiki.Provider.pokemonmovimientos.PokemonMovimientosContentValues;
import com.goleogo.pokewiki.Provider.pokemontipos.PokemonTiposColumns;
import com.goleogo.pokewiki.Provider.pokemontipos.PokemonTiposContentValues;
import com.goleogo.pokewiki.Provider.tipos.TiposColumns;
import com.goleogo.pokewiki.Provider.tipos.TiposContentValues;

import java.util.Arrays;

import retrofit.Call;
import retrofit.Callback;
import retrofit.GsonConverterFactory;
import retrofit.Response;
import retrofit.Retrofit;
import retrofit.http.GET;
import retrofit.http.Path;

/**
 * Created by Leosss on 26/05/2016.
 */
public class PokemonAPI {
    final String BASE_URL = "http://pokeapi.co/api/v2/";

    Retrofit retrofit = new Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build();

    final PokemonAPInterface pokeApi = retrofit.create(PokemonAPInterface.class);

    public PokemonAPI(){
        super();
        Log.e("PRUEBA", "PRUEBA");
    }

    public void getPokemon(final Context context) {
        Log.e("prueba", "yea");
        for (int i = 1; i <= 15; i++) {
            Call<Pokemon> call = pokeApi.pokemon(String.valueOf(i));
            call.enqueue(new Callback<Pokemon>() {
                @Override
                public void onResponse(final Response<Pokemon> response, Retrofit retrofit) {

                    if (response.isSuccess()) {
                        Pokemon pokemon = response.body();

                        PokemonContentValues pokemonContentValues = new PokemonContentValues();
                        pokemonContentValues.putIdpokemon(pokemon.getId());
                        Log.e("Pokemon", String.valueOf(pokemon.getId()));
                        pokemonContentValues.putName(pokemon.getName());
                        pokemonContentValues.putBaseExperience(pokemon.getBaseExperience());
                        pokemonContentValues.putWeight(pokemon.getWeight());
                        pokemonContentValues.putHeight(pokemon.getHeight());
                        pokemonContentValues.putImage(pokemon.getSprites().getFrontDefault());

                        System.out.println("-----------------------------------------" + pokemon.getName());

                        context.getContentResolver().insert(PokemonColumns.CONTENT_URI, pokemonContentValues.values());
                    }

                }

                @Override
                public void onFailure(Throwable t) {
                    Log.w(null, Arrays.toString(t.getStackTrace()));
                    System.out.println("ERROR AL DESCARGAR INFO");
                }
            });
        }
    }

    public void getTipos(final Context context) {

        for (int i = 1; i <= 18; i++) {
            Call<Tipo> call = pokeApi.tipo(String.valueOf(i));
            call.enqueue(new Callback<Tipo>() {
                @Override
                public void onResponse(final Response<Tipo> response, Retrofit retrofit) {

                    if (response.isSuccess()) {
                        Tipo tipo = response.body();
                        TiposContentValues tiposContentValues = new TiposContentValues();
                        tiposContentValues.putIdtipos(tipo.getId());
                        Log.e("Tipo", String.valueOf(tipo.getId()));
                        tiposContentValues.putName(tipo.getName());
                        tiposContentValues.putGeneration(tipo.getGeneration().getName());

                        context.getContentResolver().insert(TiposColumns.CONTENT_URI, tiposContentValues.values());
                    }

                }

                @Override
                public void onFailure(Throwable t) {
                    Log.w(null, Arrays.toString(t.getStackTrace()));
                    System.out.println("ERROR AL DESCARGAR INFO");
                }
            });
        }
    }

    public void getHabilidades(final Context context) {

        for (int i = 1; i <= 191; i++) {
            Call<Habilidad> call = pokeApi.habilidad(String.valueOf(i));
            call.enqueue(new Callback<Habilidad>() {
                @Override
                public void onResponse(final Response<Habilidad> response, Retrofit retrofit) {

                    if (response.isSuccess()) {
                        Habilidad habilidad = response.body();
                        HabilidadesContentValues habilidadesContentValues = new HabilidadesContentValues();
                        habilidadesContentValues.putIdhabilidad(habilidad.getId());
                        Log.e("Habilidad", String.valueOf(habilidad.getId()));
                        habilidadesContentValues.putName(habilidad.getName());
                        habilidadesContentValues.putGeneration(habilidad.getGeneration().getName());

                        context.getContentResolver().insert(HabilidadesColumns.CONTENT_URI, habilidadesContentValues.values());
                    }
                }

                @Override
                public void onFailure(Throwable t) {
                    Log.w(null, Arrays.toString(t.getStackTrace()));
                    System.out.println("ERROR AL DESCARGAR INFO");
                }
            });
        }
    }

    public void getMovimientos(final Context context) {

        for (int i = 1; i <= 621; i++) {

            Call<Movimiento> call = pokeApi.movimiento(String.valueOf(i));
            call.enqueue(new Callback<Movimiento>() {
                @Override
                public void onResponse(final Response<Movimiento> response, Retrofit retrofit) {

                    if (response.isSuccess()) {
                        Movimiento movimiento = response.body();
                        MovimientosContentValues movimientosContentValues = new MovimientosContentValues();
                        movimientosContentValues.putIdmovimiento(movimiento.getId());
                        movimientosContentValues.putName(movimiento.getName());
                        Log.e("Movimiento", String.valueOf(movimiento.getId()));
                        if(movimiento.getAccuracy() == null){
                            movimientosContentValues.putAccuracy(0);
                        }else{
                            movimientosContentValues.putAccuracy(movimiento.getAccuracy());
                        }
                        movimientosContentValues.putPp(movimiento.getId());


                        context.getContentResolver().insert(MovimientosColumns.CONTENT_URI, movimientosContentValues.values());
                    }

                }

                @Override
                public void onFailure(Throwable t) {
                    Log.w(null, Arrays.toString(t.getStackTrace()));
                    System.out.println("ERROR AL DESCARGAR INFO");
                }
            });
        }
    }

    public void getPokemonJoins(final Context context) {
        for (int i = 1; i <= 15; i++) {
            Call<Pokemon> call = pokeApi.pokemon(String.valueOf(i));
            call.enqueue(new Callback<Pokemon>() {
                @Override
                public void onResponse(final Response<Pokemon> response, Retrofit retrofit) {

                    if (response.isSuccess()) {
                        Pokemon pokemon = response.body();
                        for (int t = 0; t < pokemon.getTypes().size();t++){

                            PokemonTiposContentValues pokemonTiposContentValues = new PokemonTiposContentValues();
                            pokemonTiposContentValues.putPokemonId(pokemon.getId());
                            String urlTipo = pokemon.getTypes().get(t).getType().getUrl();
                            String [] arrayTipos = urlTipo.split("/");
                            pokemonTiposContentValues.putTiposId(Integer.parseInt(arrayTipos[6]));
                            Log.e("guardando tipos",pokemon.getId()+" con "+arrayTipos[6]);
                            context.getContentResolver().insert(PokemonTiposColumns.CONTENT_URI, pokemonTiposContentValues.values());
                        }

                        for (int a = 0; a < pokemon.getAbilities().size();a++){
                            PokemonHabilidadesContentValues pokemonHabilidadesContentValues = new PokemonHabilidadesContentValues();
                            pokemonHabilidadesContentValues.putPokemonId(pokemon.getId());
                            String urlHab = pokemon.getAbilities().get(a).getAbility().getUrl();
                            String [] arrayHab = urlHab.split("/");
                            pokemonHabilidadesContentValues.putHabilidadesId(Integer.parseInt(arrayHab[6]));
                            Log.e("guardando habs",pokemon.getId()+" con "+arrayHab[6]);
                            context.getContentResolver().insert(PokemonHabilidadesColumns.CONTENT_URI, pokemonHabilidadesContentValues.values());
                        }

                        for (int m = 0; m < pokemon.getMoves().size();m++){
                            PokemonMovimientosContentValues pokemonMovimientosContentValues = new PokemonMovimientosContentValues();
                            pokemonMovimientosContentValues.putPokemonId(pokemon.getId());
                            String urlMov = pokemon.getMoves().get(m).getMove().getUrl();
                            String [] arrayMov = urlMov.split("/");
                            pokemonMovimientosContentValues.putMovimientosId(Integer.parseInt(arrayMov[6]));
                            Log.e("guardando movs",pokemon.getId()+" con "+arrayMov[6]);
                            context.getContentResolver().insert(PokemonMovimientosColumns.CONTENT_URI, pokemonMovimientosContentValues.values());
                        }
                    }

                }

                @Override
                public void onFailure(Throwable t) {
                    Log.w(null, Arrays.toString(t.getStackTrace()));
                    System.out.println("ERROR AL DESCARGAR INFO");
                }
            });
        }
    }

}

interface PokemonAPInterface {
    @GET("pokemon/{id}")
    Call<Pokemon> pokemon(
            @Path("id") String id
    );

    @GET("type/{id}")
    Call<Tipo> tipo(
            @Path("id") String id
    );
    @GET("ability/{id}")
    Call<Habilidad> habilidad(
            @Path("id") String id
    );

    @GET("move/{id}")
    Call<Movimiento> movimiento(
            @Path("id") String id
    );
}
