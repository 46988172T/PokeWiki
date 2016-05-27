package com.goleogo.pokewiki.Provider;

import java.util.Arrays;

import android.content.ContentValues;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.sqlite.SQLiteOpenHelper;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.util.Log;

import com.goleogo.pokewiki.BuildConfig;
import com.goleogo.pokewiki.Provider.base.BaseContentProvider;
import com.goleogo.pokewiki.Provider.habilidades.HabilidadesColumns;
import com.goleogo.pokewiki.Provider.movimientos.MovimientosColumns;
import com.goleogo.pokewiki.Provider.pokemon.PokemonColumns;
import com.goleogo.pokewiki.Provider.pokemonhabilidades.PokemonHabilidadesColumns;
import com.goleogo.pokewiki.Provider.pokemonmovimientos.PokemonMovimientosColumns;
import com.goleogo.pokewiki.Provider.pokemontipos.PokemonTiposColumns;
import com.goleogo.pokewiki.Provider.tipos.TiposColumns;

public class PokeWikiProvider extends BaseContentProvider {
    private static final String TAG = PokeWikiProvider.class.getSimpleName();

    private static final boolean DEBUG = BuildConfig.DEBUG;

    private static final String TYPE_CURSOR_ITEM = "vnd.android.cursor.item/";
    private static final String TYPE_CURSOR_DIR = "vnd.android.cursor.dir/";

    public static final String AUTHORITY = "com.goleogo.pokewiki.Provider";
    public static final String CONTENT_URI_BASE = "content://" + AUTHORITY;

    private static final int URI_TYPE_HABILIDADES = 0;
    private static final int URI_TYPE_HABILIDADES_ID = 1;

    private static final int URI_TYPE_MOVIMIENTOS = 2;
    private static final int URI_TYPE_MOVIMIENTOS_ID = 3;

    private static final int URI_TYPE_POKEMON = 4;
    private static final int URI_TYPE_POKEMON_ID = 5;

    private static final int URI_TYPE_POKEMON_HABILIDADES = 6;
    private static final int URI_TYPE_POKEMON_HABILIDADES_ID = 7;

    private static final int URI_TYPE_POKEMON_MOVIMIENTOS = 8;
    private static final int URI_TYPE_POKEMON_MOVIMIENTOS_ID = 9;

    private static final int URI_TYPE_POKEMON_TIPOS = 10;
    private static final int URI_TYPE_POKEMON_TIPOS_ID = 11;

    private static final int URI_TYPE_TIPOS = 12;
    private static final int URI_TYPE_TIPOS_ID = 13;



    private static final UriMatcher URI_MATCHER = new UriMatcher(UriMatcher.NO_MATCH);

    static {
        URI_MATCHER.addURI(AUTHORITY, HabilidadesColumns.TABLE_NAME, URI_TYPE_HABILIDADES);
        URI_MATCHER.addURI(AUTHORITY, HabilidadesColumns.TABLE_NAME + "/#", URI_TYPE_HABILIDADES_ID);
        URI_MATCHER.addURI(AUTHORITY, MovimientosColumns.TABLE_NAME, URI_TYPE_MOVIMIENTOS);
        URI_MATCHER.addURI(AUTHORITY, MovimientosColumns.TABLE_NAME + "/#", URI_TYPE_MOVIMIENTOS_ID);
        URI_MATCHER.addURI(AUTHORITY, PokemonColumns.TABLE_NAME, URI_TYPE_POKEMON);
        URI_MATCHER.addURI(AUTHORITY, PokemonColumns.TABLE_NAME + "/#", URI_TYPE_POKEMON_ID);
        URI_MATCHER.addURI(AUTHORITY, PokemonHabilidadesColumns.TABLE_NAME, URI_TYPE_POKEMON_HABILIDADES);
        URI_MATCHER.addURI(AUTHORITY, PokemonHabilidadesColumns.TABLE_NAME + "/#", URI_TYPE_POKEMON_HABILIDADES_ID);
        URI_MATCHER.addURI(AUTHORITY, PokemonMovimientosColumns.TABLE_NAME, URI_TYPE_POKEMON_MOVIMIENTOS);
        URI_MATCHER.addURI(AUTHORITY, PokemonMovimientosColumns.TABLE_NAME + "/#", URI_TYPE_POKEMON_MOVIMIENTOS_ID);
        URI_MATCHER.addURI(AUTHORITY, PokemonTiposColumns.TABLE_NAME, URI_TYPE_POKEMON_TIPOS);
        URI_MATCHER.addURI(AUTHORITY, PokemonTiposColumns.TABLE_NAME + "/#", URI_TYPE_POKEMON_TIPOS_ID);
        URI_MATCHER.addURI(AUTHORITY, TiposColumns.TABLE_NAME, URI_TYPE_TIPOS);
        URI_MATCHER.addURI(AUTHORITY, TiposColumns.TABLE_NAME + "/#", URI_TYPE_TIPOS_ID);
    }

    @Override
    protected SQLiteOpenHelper createSqLiteOpenHelper() {
        return PokeWikiSQLiteOpenHelper.getInstance(getContext());
    }

    @Override
    protected boolean hasDebug() {
        return DEBUG;
    }

    @Override
    public String getType(Uri uri) {
        int match = URI_MATCHER.match(uri);
        switch (match) {
            case URI_TYPE_HABILIDADES:
                return TYPE_CURSOR_DIR + HabilidadesColumns.TABLE_NAME;
            case URI_TYPE_HABILIDADES_ID:
                return TYPE_CURSOR_ITEM + HabilidadesColumns.TABLE_NAME;

            case URI_TYPE_MOVIMIENTOS:
                return TYPE_CURSOR_DIR + MovimientosColumns.TABLE_NAME;
            case URI_TYPE_MOVIMIENTOS_ID:
                return TYPE_CURSOR_ITEM + MovimientosColumns.TABLE_NAME;

            case URI_TYPE_POKEMON:
                return TYPE_CURSOR_DIR + PokemonColumns.TABLE_NAME;
            case URI_TYPE_POKEMON_ID:
                return TYPE_CURSOR_ITEM + PokemonColumns.TABLE_NAME;

            case URI_TYPE_POKEMON_HABILIDADES:
                return TYPE_CURSOR_DIR + PokemonHabilidadesColumns.TABLE_NAME;
            case URI_TYPE_POKEMON_HABILIDADES_ID:
                return TYPE_CURSOR_ITEM + PokemonHabilidadesColumns.TABLE_NAME;

            case URI_TYPE_POKEMON_MOVIMIENTOS:
                return TYPE_CURSOR_DIR + PokemonMovimientosColumns.TABLE_NAME;
            case URI_TYPE_POKEMON_MOVIMIENTOS_ID:
                return TYPE_CURSOR_ITEM + PokemonMovimientosColumns.TABLE_NAME;

            case URI_TYPE_POKEMON_TIPOS:
                return TYPE_CURSOR_DIR + PokemonTiposColumns.TABLE_NAME;
            case URI_TYPE_POKEMON_TIPOS_ID:
                return TYPE_CURSOR_ITEM + PokemonTiposColumns.TABLE_NAME;

            case URI_TYPE_TIPOS:
                return TYPE_CURSOR_DIR + TiposColumns.TABLE_NAME;
            case URI_TYPE_TIPOS_ID:
                return TYPE_CURSOR_ITEM + TiposColumns.TABLE_NAME;

        }
        return null;
    }

    @Override
    public Uri insert(Uri uri, ContentValues values) {
        if (DEBUG) Log.d(TAG, "insert uri=" + uri + " values=" + values);
        return super.insert(uri, values);
    }

    @Override
    public int bulkInsert(Uri uri, ContentValues[] values) {
        if (DEBUG) Log.d(TAG, "bulkInsert uri=" + uri + " values.length=" + values.length);
        return super.bulkInsert(uri, values);
    }

    @Override
    public int update(Uri uri, ContentValues values, String selection, String[] selectionArgs) {
        if (DEBUG) Log.d(TAG, "update uri=" + uri + " values=" + values + " selection=" + selection + " selectionArgs=" + Arrays.toString(selectionArgs));
        return super.update(uri, values, selection, selectionArgs);
    }

    @Override
    public int delete(Uri uri, String selection, String[] selectionArgs) {
        if (DEBUG) Log.d(TAG, "delete uri=" + uri + " selection=" + selection + " selectionArgs=" + Arrays.toString(selectionArgs));
        return super.delete(uri, selection, selectionArgs);
    }

    @Override
    public Cursor query(Uri uri, String[] projection, String selection, String[] selectionArgs, String sortOrder) {
        if (DEBUG)
            Log.d(TAG, "query uri=" + uri + " selection=" + selection + " selectionArgs=" + Arrays.toString(selectionArgs) + " sortOrder=" + sortOrder
                    + " groupBy=" + uri.getQueryParameter(QUERY_GROUP_BY) + " having=" + uri.getQueryParameter(QUERY_HAVING) + " limit=" + uri.getQueryParameter(QUERY_LIMIT));
        return super.query(uri, projection, selection, selectionArgs, sortOrder);
    }

    @Override
    protected QueryParams getQueryParams(Uri uri, String selection, String[] projection) {
        QueryParams res = new QueryParams();
        String id = null;
        int matchedId = URI_MATCHER.match(uri);
        switch (matchedId) {
            case URI_TYPE_HABILIDADES:
            case URI_TYPE_HABILIDADES_ID:
                res.table = HabilidadesColumns.TABLE_NAME;
                res.idColumn = HabilidadesColumns._ID;
                res.tablesWithJoins = HabilidadesColumns.TABLE_NAME;
                res.orderBy = HabilidadesColumns.DEFAULT_ORDER;
                break;

            case URI_TYPE_MOVIMIENTOS:
            case URI_TYPE_MOVIMIENTOS_ID:
                res.table = MovimientosColumns.TABLE_NAME;
                res.idColumn = MovimientosColumns._ID;
                res.tablesWithJoins = MovimientosColumns.TABLE_NAME;
                res.orderBy = MovimientosColumns.DEFAULT_ORDER;
                break;

            case URI_TYPE_POKEMON:
            case URI_TYPE_POKEMON_ID:
                res.table = PokemonColumns.TABLE_NAME;
                res.idColumn = PokemonColumns._ID;
                res.tablesWithJoins = PokemonColumns.TABLE_NAME;
                res.orderBy = PokemonColumns.DEFAULT_ORDER;
                break;

            case URI_TYPE_POKEMON_HABILIDADES:
            case URI_TYPE_POKEMON_HABILIDADES_ID:
                res.table = PokemonHabilidadesColumns.TABLE_NAME;
                res.idColumn = PokemonHabilidadesColumns._ID;
                res.tablesWithJoins = PokemonHabilidadesColumns.TABLE_NAME;
                if (PokemonColumns.hasColumns(projection)) {
                    res.tablesWithJoins += " LEFT OUTER JOIN " + PokemonColumns.TABLE_NAME + " AS " + PokemonHabilidadesColumns.PREFIX_POKEMON + " ON " + PokemonHabilidadesColumns.TABLE_NAME + "." + PokemonHabilidadesColumns.POKEMON_ID + "=" + PokemonHabilidadesColumns.PREFIX_POKEMON + "." + PokemonColumns._ID;
                }
                if (HabilidadesColumns.hasColumns(projection)) {
                    res.tablesWithJoins += " LEFT OUTER JOIN " + HabilidadesColumns.TABLE_NAME + " AS " + PokemonHabilidadesColumns.PREFIX_HABILIDADES + " ON " + PokemonHabilidadesColumns.TABLE_NAME + "." + PokemonHabilidadesColumns.HABILIDADES_ID + "=" + PokemonHabilidadesColumns.PREFIX_HABILIDADES + "." + HabilidadesColumns._ID;
                }
                res.orderBy = PokemonHabilidadesColumns.DEFAULT_ORDER;
                break;

            case URI_TYPE_POKEMON_MOVIMIENTOS:
            case URI_TYPE_POKEMON_MOVIMIENTOS_ID:
                res.table = PokemonMovimientosColumns.TABLE_NAME;
                res.idColumn = PokemonMovimientosColumns._ID;
                res.tablesWithJoins = PokemonMovimientosColumns.TABLE_NAME;
                if (PokemonColumns.hasColumns(projection)) {
                    res.tablesWithJoins += " LEFT OUTER JOIN " + PokemonColumns.TABLE_NAME + " AS " + PokemonMovimientosColumns.PREFIX_POKEMON + " ON " + PokemonMovimientosColumns.TABLE_NAME + "." + PokemonMovimientosColumns.POKEMON_ID + "=" + PokemonMovimientosColumns.PREFIX_POKEMON + "." + PokemonColumns._ID;
                }
                if (MovimientosColumns.hasColumns(projection)) {
                    res.tablesWithJoins += " LEFT OUTER JOIN " + MovimientosColumns.TABLE_NAME + " AS " + PokemonMovimientosColumns.PREFIX_MOVIMIENTOS + " ON " + PokemonMovimientosColumns.TABLE_NAME + "." + PokemonMovimientosColumns.MOVIMIENTOS_ID + "=" + PokemonMovimientosColumns.PREFIX_MOVIMIENTOS + "." + MovimientosColumns._ID;
                }
                res.orderBy = PokemonMovimientosColumns.DEFAULT_ORDER;
                break;

            case URI_TYPE_POKEMON_TIPOS:
            case URI_TYPE_POKEMON_TIPOS_ID:
                res.table = PokemonTiposColumns.TABLE_NAME;
                res.idColumn = PokemonTiposColumns._ID;
                res.tablesWithJoins = PokemonTiposColumns.TABLE_NAME;
                if (PokemonColumns.hasColumns(projection)) {
                    res.tablesWithJoins += " LEFT OUTER JOIN " + PokemonColumns.TABLE_NAME + " AS " + PokemonTiposColumns.PREFIX_POKEMON + " ON " + PokemonTiposColumns.TABLE_NAME + "." + PokemonTiposColumns.POKEMON_ID + "=" + PokemonTiposColumns.PREFIX_POKEMON + "." + PokemonColumns._ID;
                }
                if (TiposColumns.hasColumns(projection)) {
                    res.tablesWithJoins += " LEFT OUTER JOIN " + TiposColumns.TABLE_NAME + " AS " + PokemonTiposColumns.PREFIX_TIPOS + " ON " + PokemonTiposColumns.TABLE_NAME + "." + PokemonTiposColumns.TIPOS_ID + "=" + PokemonTiposColumns.PREFIX_TIPOS + "." + TiposColumns._ID;
                }
                res.orderBy = PokemonTiposColumns.DEFAULT_ORDER;
                break;

            case URI_TYPE_TIPOS:
            case URI_TYPE_TIPOS_ID:
                res.table = TiposColumns.TABLE_NAME;
                res.idColumn = TiposColumns._ID;
                res.tablesWithJoins = TiposColumns.TABLE_NAME;
                res.orderBy = TiposColumns.DEFAULT_ORDER;
                break;

            default:
                throw new IllegalArgumentException("The uri '" + uri + "' is not supported by this ContentProvider");
        }

        switch (matchedId) {
            case URI_TYPE_HABILIDADES_ID:
            case URI_TYPE_MOVIMIENTOS_ID:
            case URI_TYPE_POKEMON_ID:
            case URI_TYPE_POKEMON_HABILIDADES_ID:
            case URI_TYPE_POKEMON_MOVIMIENTOS_ID:
            case URI_TYPE_POKEMON_TIPOS_ID:
            case URI_TYPE_TIPOS_ID:
                id = uri.getLastPathSegment();
        }
        if (id != null) {
            if (selection != null) {
                res.selection = res.table + "." + res.idColumn + "=" + id + " and (" + selection + ")";
            } else {
                res.selection = res.table + "." + res.idColumn + "=" + id;
            }
        } else {
            res.selection = selection;
        }
        return res;
    }
}
