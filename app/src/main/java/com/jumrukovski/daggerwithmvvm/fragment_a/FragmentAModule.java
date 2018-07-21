package com.jumrukovski.daggerwithmvvm.fragment_a;


import com.jumrukovski.daggerwithmvvm.injection.scope.PerFragment;

import dagger.Module;
import dagger.Provides;

@Module
public class FragmentAModule {

    @PerFragment
    @Provides
    FragmentA provideFragmentA(FragmentA fragment) {
        return fragment;
    }
}
