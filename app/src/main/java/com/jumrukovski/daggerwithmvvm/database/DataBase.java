package com.jumrukovski.daggerwithmvvm.database;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

@Database(entities = {TableRow.class}, version = 1)
public abstract class DataBase extends RoomDatabase {
    public abstract TableDao tableDao();
}
