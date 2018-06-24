package com.jumrukovski.daggerwithmvvm.injection.builders;

import com.jumrukovski.daggerwithmvvm.fragment_a.FragmentA;
import com.jumrukovski.daggerwithmvvm.fragment_a.FragmentAModule;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class FragmentBuilder {

    @ContributesAndroidInjector(modules = FragmentAModule.class)
    abstract FragmentA provideFragmentA();
}
