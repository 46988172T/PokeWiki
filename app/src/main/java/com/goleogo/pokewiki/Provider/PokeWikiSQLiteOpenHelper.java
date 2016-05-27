package com.goleogo.pokewiki.Provider;

import android.annotation.TargetApi;
import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.DefaultDatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build;
import android.util.Log;

import com.goleogo.pokewiki.BuildConfig;
import com.goleogo.pokewiki.Provider.habilidades.HabilidadesColumns;
import com.goleogo.pokewiki.Provider.movimientos.MovimientosColumns;
import com.goleogo.pokewiki.Provider.pokemon.PokemonColumns;
import com.goleogo.pokewiki.Provider.pokemonhabilidades.PokemonHabilidadesColumns;
import com.goleogo.pokewiki.Provider.pokemonmovimientos.PokemonMovimientosColumns;
import com.goleogo.pokewiki.Provider.pokemontipos.PokemonTiposColumns;
import com.goleogo.pokewiki.Provider.tipos.TiposColumns;

public class PokeWikiSQLiteOpenHelper extends SQLiteOpenHelper {
    private static final String TAG = PokeWikiSQLiteOpenHelper.class.getSimpleName();

    public static final String DATABASE_FILE_NAME = "PokeWiki.db";
    private static final int DATABASE_VERSION = 1;
    private static PokeWikiSQLiteOpenHelper sInstance;
    private final Context mContext;
    private final PokeWikiSQLiteOpenHelperCallbacks mOpenHelperCallbacks;

    // @formatter:off
    public static final String SQL_CREATE_TABLE_HABILIDADES = "CREATE TABLE IF NOT EXISTS "
            + HabilidadesColumns.TABLE_NAME + " ( "
            + HabilidadesColumns._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
            + HabilidadesColumns.IDHABILIDAD + " INTEGER, "
            + HabilidadesColumns.NAME + " TEXT, "
            + HabilidadesColumns.GENERATION + " TEXT "
            + ", CONSTRAINT unique_idHabilidad UNIQUE (idHabilidad) ON CONFLICT REPLACE"
            + " );";

    public static final String SQL_CREATE_TABLE_MOVIMIENTOS = "CREATE TABLE IF NOT EXISTS "
            + MovimientosColumns.TABLE_NAME + " ( "
            + MovimientosColumns._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
            + MovimientosColumns.IDMOVIMIENTO + " INTEGER, "
            + MovimientosColumns.NAME + " TEXT, "
            + MovimientosColumns.ACCURACY + " INTEGER NOT NULL, "
            + MovimientosColumns.PP + " INTEGER "
            + ", CONSTRAINT unique_idMovimiento UNIQUE (idMovimiento) ON CONFLICT REPLACE"
            + " );";

    public static final String SQL_CREATE_TABLE_POKEMON = "CREATE TABLE IF NOT EXISTS "
            + PokemonColumns.TABLE_NAME + " ( "
            + PokemonColumns._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
            + PokemonColumns.IDPOKEMON + " INTEGER, "
            + PokemonColumns.NAME + " TEXT, "
            + PokemonColumns.BASE_EXPERIENCE + " INTEGER, "
            + PokemonColumns.WEIGHT + " INTEGER, "
            + PokemonColumns.HEIGHT + " INTEGER, "
            + PokemonColumns.IMAGE + " TEXT NOT NULL "
            + ", CONSTRAINT unique_idPokemon UNIQUE (idPokemon) ON CONFLICT REPLACE"
            + " );";

    public static final String SQL_CREATE_TABLE_POKEMON_HABILIDADES = "CREATE TABLE IF NOT EXISTS "
            + PokemonHabilidadesColumns.TABLE_NAME + " ( "
            + PokemonHabilidadesColumns._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
            + PokemonHabilidadesColumns.POKEMON_ID + " INTEGER NOT NULL, "
            + PokemonHabilidadesColumns.HABILIDADES_ID + " INTEGER NOT NULL "
            + ", CONSTRAINT fk_pokemon_id FOREIGN KEY (" + PokemonHabilidadesColumns.POKEMON_ID + ") REFERENCES pokemon (_id) ON DELETE RESTRICT"
            + ", CONSTRAINT fk_habilidades_id FOREIGN KEY (" + PokemonHabilidadesColumns.HABILIDADES_ID + ") REFERENCES habilidades (_id) ON DELETE RESTRICT"
            + ", CONSTRAINT unique_pokemon_habilidades UNIQUE (pokemon_id, habilidades_id) ON CONFLICT REPLACE"
            + " );";

    public static final String SQL_CREATE_TABLE_POKEMON_MOVIMIENTOS = "CREATE TABLE IF NOT EXISTS "
            + PokemonMovimientosColumns.TABLE_NAME + " ( "
            + PokemonMovimientosColumns._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
            + PokemonMovimientosColumns.POKEMON_ID + " INTEGER NOT NULL, "
            + PokemonMovimientosColumns.MOVIMIENTOS_ID + " INTEGER NOT NULL "
            + ", CONSTRAINT fk_pokemon_id FOREIGN KEY (" + PokemonMovimientosColumns.POKEMON_ID + ") REFERENCES pokemon (_id) ON DELETE RESTRICT"
            + ", CONSTRAINT fk_movimientos_id FOREIGN KEY (" + PokemonMovimientosColumns.MOVIMIENTOS_ID + ") REFERENCES movimientos (_id) ON DELETE RESTRICT"
            + ", CONSTRAINT unique_pokemon_movimiento UNIQUE (pokemon_id, movimientos_id) ON CONFLICT REPLACE"
            + " );";

    public static final String SQL_CREATE_TABLE_POKEMON_TIPOS = "CREATE TABLE IF NOT EXISTS "
            + PokemonTiposColumns.TABLE_NAME + " ( "
            + PokemonTiposColumns._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
            + PokemonTiposColumns.POKEMON_ID + " INTEGER NOT NULL, "
            + PokemonTiposColumns.TIPOS_ID + " INTEGER NOT NULL "
            + ", CONSTRAINT fk_pokemon_id FOREIGN KEY (" + PokemonTiposColumns.POKEMON_ID + ") REFERENCES pokemon (_id) ON DELETE RESTRICT"
            + ", CONSTRAINT fk_tipos_id FOREIGN KEY (" + PokemonTiposColumns.TIPOS_ID + ") REFERENCES tipos (_id) ON DELETE RESTRICT"
            + ", CONSTRAINT unique_pokemon_tipo UNIQUE (pokemon_id, tipos_id) ON CONFLICT REPLACE"
            + " );";

    public static final String SQL_CREATE_TABLE_TIPOS = "CREATE TABLE IF NOT EXISTS "
            + TiposColumns.TABLE_NAME + " ( "
            + TiposColumns._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
            + TiposColumns.IDTIPOS + " INTEGER, "
            + TiposColumns.NAME + " TEXT, "
            + TiposColumns.GENERATION + " TEXT NOT NULL "
            + ", CONSTRAINT unique_idTipos UNIQUE (idTipos) ON CONFLICT REPLACE"
            + " );";

    // @formatter:on

    public static PokeWikiSQLiteOpenHelper getInstance(Context context) {
        // Use the application context, which will ensure that you
        // don't accidentally leak an Activity's context.
        // See this article for more information: http://bit.ly/6LRzfx
        if (sInstance == null) {
            sInstance = newInstance(context.getApplicationContext());
        }
        return sInstance;
    }

    private static PokeWikiSQLiteOpenHelper newInstance(Context context) {
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.HONEYCOMB) {
            return newInstancePreHoneycomb(context);
        }
        return newInstancePostHoneycomb(context);
    }


    /*
     * Pre Honeycomb.
     */
    private static PokeWikiSQLiteOpenHelper newInstancePreHoneycomb(Context context) {
        return new PokeWikiSQLiteOpenHelper(context);
    }

    private PokeWikiSQLiteOpenHelper(Context context) {
        super(context, DATABASE_FILE_NAME, null, DATABASE_VERSION);
        mContext = context;
        mOpenHelperCallbacks = new PokeWikiSQLiteOpenHelperCallbacks();
    }


    /*
     * Post Honeycomb.
     */
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    private static PokeWikiSQLiteOpenHelper newInstancePostHoneycomb(Context context) {
        return new PokeWikiSQLiteOpenHelper(context, new DefaultDatabaseErrorHandler());
    }

    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    private PokeWikiSQLiteOpenHelper(Context context, DatabaseErrorHandler errorHandler) {
        super(context, DATABASE_FILE_NAME, null, DATABASE_VERSION, errorHandler);
        mContext = context;
        mOpenHelperCallbacks = new PokeWikiSQLiteOpenHelperCallbacks();
    }


    @Override
    public void onCreate(SQLiteDatabase db) {
        if (BuildConfig.DEBUG) Log.d(TAG, "onCreate");
        mOpenHelperCallbacks.onPreCreate(mContext, db);
        db.execSQL(SQL_CREATE_TABLE_HABILIDADES);
        db.execSQL(SQL_CREATE_TABLE_MOVIMIENTOS);
        db.execSQL(SQL_CREATE_TABLE_POKEMON);
        db.execSQL(SQL_CREATE_TABLE_POKEMON_HABILIDADES);
        db.execSQL(SQL_CREATE_TABLE_POKEMON_MOVIMIENTOS);
        db.execSQL(SQL_CREATE_TABLE_POKEMON_TIPOS);
        db.execSQL(SQL_CREATE_TABLE_TIPOS);
        mOpenHelperCallbacks.onPostCreate(mContext, db);
    }

    @Override
    public void onOpen(SQLiteDatabase db) {
        super.onOpen(db);
        if (!db.isReadOnly()) {
            setForeignKeyConstraintsEnabled(db);
        }
        mOpenHelperCallbacks.onOpen(mContext, db);
    }

    private void setForeignKeyConstraintsEnabled(SQLiteDatabase db) {
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.JELLY_BEAN) {
            setForeignKeyConstraintsEnabledPreJellyBean(db);
        } else {
            setForeignKeyConstraintsEnabledPostJellyBean(db);
        }
    }

    private void setForeignKeyConstraintsEnabledPreJellyBean(SQLiteDatabase db) {
        db.execSQL("PRAGMA foreign_keys=ON;");
    }

    @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
    private void setForeignKeyConstraintsEnabledPostJellyBean(SQLiteDatabase db) {
        db.setForeignKeyConstraintsEnabled(true);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        mOpenHelperCallbacks.onUpgrade(mContext, db, oldVersion, newVersion);
    }
}
