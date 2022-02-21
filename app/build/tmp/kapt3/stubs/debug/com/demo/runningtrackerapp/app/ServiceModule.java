package com.demo.runningtrackerapp.app;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.android.components.ServiceComponent.class})
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u0007J\u001a\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\u0005\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\nH\u0007J\u001a\u0010\u000b\u001a\n \f*\u0004\u0018\u00010\n0\n2\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u0007\u00a8\u0006\r"}, d2 = {"Lcom/demo/runningtrackerapp/app/ServiceModule;", "", "()V", "provideFusedLocationProvider", "Lcom/google/android/gms/location/FusedLocationProviderClient;", "context", "Landroid/content/Context;", "provideNotificationBuilder", "Landroidx/core/app/NotificationCompat$Builder;", "pendingIntent", "Landroid/app/PendingIntent;", "providePendingIntent", "kotlin.jvm.PlatformType", "app_debug"})
@dagger.Module()
public final class ServiceModule {
    @org.jetbrains.annotations.NotNull()
    public static final com.demo.runningtrackerapp.app.ServiceModule INSTANCE = null;
    
    private ServiceModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.hilt.android.scopes.ServiceScoped()
    @dagger.Provides()
    public final com.google.android.gms.location.FusedLocationProviderClient provideFusedLocationProvider(@org.jetbrains.annotations.NotNull()
    @dagger.hilt.android.qualifiers.ApplicationContext()
    android.content.Context context) {
        return null;
    }
    
    @dagger.hilt.android.scopes.ServiceScoped()
    @dagger.Provides()
    public final android.app.PendingIntent providePendingIntent(@org.jetbrains.annotations.NotNull()
    @dagger.hilt.android.qualifiers.ApplicationContext()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.hilt.android.scopes.ServiceScoped()
    @dagger.Provides()
    public final androidx.core.app.NotificationCompat.Builder provideNotificationBuilder(@org.jetbrains.annotations.NotNull()
    @dagger.hilt.android.qualifiers.ApplicationContext()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.app.PendingIntent pendingIntent) {
        return null;
    }
}