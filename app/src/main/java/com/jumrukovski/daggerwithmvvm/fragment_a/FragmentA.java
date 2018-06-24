package com.jumrukovski.daggerwithmvvm.fragment_a;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.jumrukovski.daggerwithmvvm.R;
import com.jumrukovski.daggerwithmvvm.base.BaseFragment;
import com.jumrukovski.daggerwithmvvm.databinding.FragmentABinding;

public class FragmentA extends BaseFragment<FragmentAViewModel, FragmentABinding> {

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

        return binding.getRoot();
    }
}
