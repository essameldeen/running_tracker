package com.demo.runningtrackerapp.app;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0012\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020\tH\u0007J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0004H\u0007\u00a8\u0006\r"}, d2 = {"Lcom/demo/runningtrackerapp/app/AppModule;", "", "()V", "provideDao", "Lcom/demo/runningtrackerapp/data/db/RunDao;", "db", "Lcom/demo/runningtrackerapp/data/db/RunDataBase;", "provideDataBaseInstance", "app", "Landroid/content/Context;", "provideRunRepo", "Lcom/demo/runningtrackerapp/repository/MainRepo;", "dao", "app_debug"})
@dagger.Module()
public final class AppModule {
    @org.jetbrains.annotations.NotNull()
    public static final com.demo.runningtrackerapp.app.AppModule INSTANCE = null;
    
    private AppModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.demo.runningtrackerapp.data.db.RunDao provideDao(@org.jetbrains.annotations.NotNull()
    com.demo.runningtrackerapp.data.db.RunDataBase db) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.demo.runningtrackerapp.data.db.RunDataBase provideDataBaseInstance(@org.jetbrains.annotations.NotNull()
    @dagger.hilt.android.qualifiers.ApplicationContext()
    android.content.Context app) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.demo.runningtrackerapp.repository.MainRepo provideRunRepo(@org.jetbrains.annotations.NotNull()
    com.demo.runningtrackerapp.data.db.RunDao dao) {
        return null;
    }
}