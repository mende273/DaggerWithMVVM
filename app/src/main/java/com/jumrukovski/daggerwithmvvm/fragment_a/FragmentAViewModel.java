package com.jumrukovski.daggerwithmvvm.fragment_a;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.ViewModel;

import com.jumrukovski.daggerwithmvvm.data.repository.DataBaseRepository;
import com.jumrukovski.daggerwithmvvm.database.TableRow;

import java.util.List;

import javax.inject.Inject;

public class FragmentAViewModel extends ViewModel {

    private final DataBaseRepository repository;
    private LiveData<List<TableRow>> allTableRows;

    @Inject
    FragmentAViewModel(DataBaseRepository repository) {
        this.repository = repository;
        this.allTableRows = repository.getAllTableRows();
    }

    LiveData<List<TableRow>> getAllTableRows() {
        return allTableRows;
    }

    public void insert(TableRow word) {
        repository.insert(word);
    }
}
