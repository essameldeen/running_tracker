package com.demo.runningtrackerapp.app;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0012\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020\tH\u0007J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0007J\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\f\u001a\u00020\rH\u0007J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0004H\u0007J\u001a\u0010\u0013\u001a\n \u0014*\u0004\u0018\u00010\r0\r2\b\b\u0001\u0010\u0015\u001a\u00020\tH\u0007J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\f\u001a\u00020\rH\u0007\u00a8\u0006\u0018"}, d2 = {"Lcom/demo/runningtrackerapp/app/AppModule;", "", "()V", "provideDao", "Lcom/demo/runningtrackerapp/data/db/RunDao;", "db", "Lcom/demo/runningtrackerapp/data/db/RunDataBase;", "provideDataBaseInstance", "app", "Landroid/content/Context;", "provideFirstToggle", "", "pref", "Landroid/content/SharedPreferences;", "provideName", "", "provideRunRepo", "Lcom/demo/runningtrackerapp/repository/MainRepo;", "dao", "provideSharedPreference", "kotlin.jvm.PlatformType", "context", "provideWeight", "", "app_debug"})
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
    
    @dagger.Provides()
    @javax.inject.Singleton()
    public final android.content.SharedPreferences provideSharedPreference(@org.jetbrains.annotations.NotNull()
    @dagger.hilt.android.qualifiers.ApplicationContext()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final java.lang.String provideName(@org.jetbrains.annotations.NotNull()
    android.content.SharedPreferences pref) {
        return null;
    }
    
    @dagger.Provides()
    @javax.inject.Singleton()
    public final float provideWeight(@org.jetbrains.annotations.NotNull()
    android.content.SharedPreferences pref) {
        return 0.0F;
    }
    
    @dagger.Provides()
    @javax.inject.Singleton()
    public final boolean provideFirstToggle(@org.jetbrains.annotations.NotNull()
    android.content.SharedPreferences pref) {
        return false;
    }
}