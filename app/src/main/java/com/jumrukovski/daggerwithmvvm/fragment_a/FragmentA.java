package com.jumrukovski.daggerwithmvvm.fragment_a;

import android.arch.lifecycle.Observer;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.jumrukovski.daggerwithmvvm.R;
import com.jumrukovski.daggerwithmvvm.base.BaseFragment;
import com.jumrukovski.daggerwithmvvm.database.TableRow;
import com.jumrukovski.daggerwithmvvm.databinding.FragmentABinding;

import java.util.List;

public class FragmentA extends BaseFragment<FragmentAViewModel, FragmentABinding> implements View.OnClickListener {

    public static FragmentA newInstance() {
        return new FragmentA();
    }

    @Override
    public int getLayoutRes() {
        return R.layout.fragment_a;
    }

    @Override
    public Class<FragmentAViewModel> getViewModel() {
        return FragmentAViewModel.class;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);

        binding.insert.setOnClickListener(this);

        viewModel.getAllTableRows().observe(this, new Observer<List<TableRow>>() {
            @Override
            public void onChanged(@Nullable List<TableRow> tableRows) {
                for (int i = 0; i < tableRows.size(); i++) {
                    binding.values.setText(binding.values.getText().toString() + tableRows.get(i).getNameColumn());
                }
            }
        });

        return binding.getRoot();
    }

    @Override
    public void onClick(View view) {
        String enteredText = binding.entered.getText().toString();
        if (!enteredText.isEmpty()) {
            TableRow row = new TableRow(enteredText);
            viewModel.insert(row);
        }
    }
}
