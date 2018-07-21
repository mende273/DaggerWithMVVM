package com.jumrukovski.daggerwithmvvm.injection.module;

import android.app.Application;
import android.arch.persistence.room.Room;
import android.content.Context;

import com.jumrukovski.daggerwithmvvm.database.DataBase;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class AppModule {

    @Provides
    @Singleton
    Context provideContext(Application application) {
        return application;
    }

    @Provides
    @Singleton
    DataBase provideDatabase(Context context) {
        return Room.databaseBuilder(context, DataBase.class, "Database").build();
    }
}
