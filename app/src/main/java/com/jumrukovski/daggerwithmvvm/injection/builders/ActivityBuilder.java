package com.jumrukovski.daggerwithmvvm.injection.builders;

import com.jumrukovski.daggerwithmvvm.main.MainActivity;
import com.jumrukovski.daggerwithmvvm.main.MainActivityModule;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class ActivityBuilder {

    @ContributesAndroidInjector(modules = MainActivityModule.class)
    abstract MainActivity bindMainActivity();
}
