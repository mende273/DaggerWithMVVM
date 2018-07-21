package com.jumrukovski.daggerwithmvvm.database;

import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import java.util.List;

@Dao
public interface TableDao {

    @Insert
    void insert(TableRow row);

    @Query("DELETE FROM table_name")
    void deleteAll();

    @Query("SELECT * from table_name")
    LiveData<List<TableRow>> getAllTableRows();
}
