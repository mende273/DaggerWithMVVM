package com.jumrukovski.daggerwithmvvm.injection.component;

import android.app.Application;

import com.jumrukovski.daggerwithmvvm.App;
import com.jumrukovski.daggerwithmvvm.injection.builders.ActivityBuilder;
import com.jumrukovski.daggerwithmvvm.injection.builders.FragmentBuilder;
import com.jumrukovski.daggerwithmvvm.injection.builders.ViewModelBuilder;
import com.jumrukovski.daggerwithmvvm.injection.module.AppModule;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjectionModule;

@Singleton
@Component(modules = {
        AndroidInjectionModule.class,
        AppModule.class,
        ActivityBuilder.class,
        FragmentBuilder.class,
        ViewModelBuilder.class})
public interface AppComponent {

    @Component.Builder
    interface Builder {
        @BindsInstance
        Builder application(Application application);

        AppComponent build();
    }

    void inject(App app);
}
