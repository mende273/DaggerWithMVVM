package com.jumrukovski.daggerwithmvvm.injection.builders;

import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProvider;

import com.jumrukovski.daggerwithmvvm.base.ViewModelFactory;
import com.jumrukovski.daggerwithmvvm.fragment_a.FragmentAViewModel;
import com.jumrukovski.daggerwithmvvm.injection.qualifiers.ViewModelKey;
import com.jumrukovski.daggerwithmvvm.main.MainViewModel;

import dagger.Binds;
import dagger.Module;
import dagger.multibindings.IntoMap;

@Module
public abstract class ViewModelBuilder {

    @Binds
    abstract ViewModelProvider.Factory bindViewModelFactory(ViewModelFactory projectViewModelFactory);

    @Binds
    @IntoMap
    @ViewModelKey(MainViewModel.class)
    abstract ViewModel bindMainViewModel(MainViewModel viewModel);

    @Binds
    @IntoMap
    @ViewModelKey(FragmentAViewModel.class)
    abstract ViewModel bindFragmentAViewModel(FragmentAViewModel viewModel);
}
