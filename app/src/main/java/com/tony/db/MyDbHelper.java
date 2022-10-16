package com.tony.db;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.tony.MyApplication;

/**
 * @description
 * @author: tonyxiong
 * @date: 2022/9/25
 */
public class MyDbHelper extends SQLiteOpenHelper {

    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "contact.db";
    private static final String SQL_CREATE_CONTACT_TABLE = "create table student (id integer primary key ,name text,number text)";
    private static class MyDbHelperHolder{
        public static MyDbHelper myDbHelper = new MyDbHelper();
    }

    public static MyDbHelper getInstance(){
        return MyDbHelperHolder.myDbHelper;
    }

    public MyDbHelper(){
        this(MyApplication.sApplication,DATABASE_NAME,null,DATABASE_VERSION);
    }

    public MyDbHelper(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    public MyDbHelper(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version, @Nullable DatabaseErrorHandler errorHandler) {
        super(context, name, factory, version, errorHandler);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(SQL_CREATE_CONTACT_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }


}
