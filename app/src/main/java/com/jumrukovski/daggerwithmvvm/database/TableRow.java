package com.jumrukovski.daggerwithmvvm.database;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

@Entity(tableName = "table_name")
public class TableRow {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    private long idColumn;

    @ColumnInfo(name = "name")
    private String nameColumn;

    public TableRow(String nameColumn) {
        this.idColumn = idColumn;
        this.nameColumn = nameColumn;
    }
    
    public long getIdColumn() {
        return idColumn;
    }

    public String getNameColumn() {
        return nameColumn;
    }

    public void setNameColumn(String nameColumn) {
        this.nameColumn = nameColumn;
    }

    public void setIdColumn(long idColumn) {
        this.idColumn = idColumn;
    }
}
