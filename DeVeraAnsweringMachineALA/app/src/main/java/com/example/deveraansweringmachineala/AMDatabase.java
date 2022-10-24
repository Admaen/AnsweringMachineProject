package com.example.deveraansweringmachineala;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class AMDatabase extends SQLiteOpenHelper {
    public static final String DATABASE_NAME = "answering_machine_instances.db";
    public static final String TABLE_NAME = "machine_instances";
    public static final String COL_1 = "ID";
    public static final String COL_2 = "STARTTIME";
    public static final String COL_3 = "ENDTIME";
    public static final String COL_4 = "MESSAGE";
    public static final String COL_5 = "DESCRIPTION";

    public AMDatabase(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version, @Nullable DatabaseErrorHandler errorHandler) {
        super(context, name, factory, version, errorHandler);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL("create table " + TABLE_NAME +" (ID INTEGER PRIMARY KEY AUTOINCREMENT,STARTTIME TEXT,ENDTIME TEXT,MESSAGE TEXT,DESCRIPTION TEXT)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS "+TABLE_NAME);
        onCreate(sqLiteDatabase);
    }
}
