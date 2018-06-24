package com.jumrukovski.daggerwithmvvm.main;

import android.app.Activity;

import com.jumrukovski.daggerwithmvvm.injection.scope.PerActivity;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class MainActivityModule {

    @Binds
    @PerActivity
    abstract Activity activity(MainActivity mainActivity);
}
