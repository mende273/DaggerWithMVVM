package com.jumrukovski.daggerwithmvvm.data.repository;

import android.arch.lifecycle.LiveData;
import android.os.AsyncTask;

import com.jumrukovski.daggerwithmvvm.database.DataBase;
import com.jumrukovski.daggerwithmvvm.database.TableDao;
import com.jumrukovski.daggerwithmvvm.database.TableRow;

import java.util.List;

import javax.inject.Inject;

public class DataBaseRepository {
    private TableDao tableDao;
    private LiveData<List<TableRow>> allTableRows;

    @Inject
    DataBaseRepository(DataBase db) {
        tableDao = db.tableDao();
        allTableRows = tableDao.getAllTableRows();
    }

    public LiveData<List<TableRow>> getAllTableRows() {
        return allTableRows;
    }


    public void insert(TableRow row) {
        new insertAsyncTask(tableDao).execute(row);
    }

    private static class insertAsyncTask extends AsyncTask<TableRow, Void, Void> {

        private TableDao mAsyncTaskDao;

        insertAsyncTask(TableDao dao) {
            mAsyncTaskDao = dao;
        }

        @Override
        protected Void doInBackground(final TableRow... params) {
            mAsyncTaskDao.insert(params[0]);
            return null;
        }
    }
}
