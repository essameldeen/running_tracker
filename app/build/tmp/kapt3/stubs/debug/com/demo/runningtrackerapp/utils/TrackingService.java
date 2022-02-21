package com.demo.runningtrackerapp.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u0000 92\u00020\u0001:\u00019B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010!\u001a\u00020\"H\u0002J\u0012\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010&H\u0002J\u0010\u0010\'\u001a\u00020$2\u0006\u0010(\u001a\u00020)H\u0003J\b\u0010*\u001a\u00020$H\u0016J\"\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010.2\u0006\u0010/\u001a\u00020,2\u0006\u00100\u001a\u00020,H\u0016J\b\u00101\u001a\u00020$H\u0002J\b\u00102\u001a\u00020$H\u0002J\b\u00103\u001a\u00020$H\u0002J\b\u00104\u001a\u00020$H\u0002J\b\u00105\u001a\u00020$H\u0002J\u0010\u00106\u001a\u00020$2\u0006\u00107\u001a\u00020\fH\u0002J\u0010\u00108\u001a\u00020$2\u0006\u00107\u001a\u00020\fH\u0003R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\r\"\u0004\b\u0011\u0010\u000fR\u000e\u0010\u0012\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0018\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00140\u001eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006:"}, d2 = {"Lcom/demo/runningtrackerapp/utils/TrackingService;", "Landroidx/lifecycle/LifecycleService;", "()V", "currentNotification", "Landroidx/core/app/NotificationCompat$Builder;", "fusedLocationProviderClient", "Lcom/google/android/gms/location/FusedLocationProviderClient;", "getFusedLocationProviderClient", "()Lcom/google/android/gms/location/FusedLocationProviderClient;", "setFusedLocationProviderClient", "(Lcom/google/android/gms/location/FusedLocationProviderClient;)V", "isFirstRun", "", "()Z", "setFirstRun", "(Z)V", "isServiceKilled", "setServiceKilled", "isTimerEnable", "lapTime", "", "lastSecondTimeStamp", "locationCallback", "Lcom/google/android/gms/location/LocationCallback;", "notificationBuilder", "getNotificationBuilder", "()Landroidx/core/app/NotificationCompat$Builder;", "setNotificationBuilder", "(Landroidx/core/app/NotificationCompat$Builder;)V", "timeInSeconds", "Landroidx/lifecycle/MutableLiveData;", "timeStarted", "totalTimeRun", "addEmptyPolyline", "", "addPathPoint", "", "location", "Landroid/location/Location;", "createNotificationChannel", "notificationManager", "Landroid/app/NotificationManager;", "onCreate", "onStartCommand", "", "intent", "Landroid/content/Intent;", "flags", "startId", "pauseService", "setInitialValues", "startForegroundService", "startTimer", "stopService", "updateNotificationTrackingService", "isTracking", "updatingTrackingLocation", "Companion", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class TrackingService extends androidx.lifecycle.LifecycleService {
    private boolean isFirstRun = true;
    private boolean isServiceKilled = false;
    private boolean isTimerEnable = false;
    private long lapTime = 0L;
    private long totalTimeRun = 0L;
    private long timeStarted = 0L;
    private long lastSecondTimeStamp = 0L;
    @javax.inject.Inject()
    public com.google.android.gms.location.FusedLocationProviderClient fusedLocationProviderClient;
    @javax.inject.Inject()
    public androidx.core.app.NotificationCompat.Builder notificationBuilder;
    private androidx.core.app.NotificationCompat.Builder currentNotification;
    private androidx.lifecycle.MutableLiveData<java.lang.Long> timeInSeconds;
    @org.jetbrains.annotations.NotNull()
    public static final com.demo.runningtrackerapp.utils.TrackingService.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    private static final androidx.lifecycle.MutableLiveData<java.lang.Long> timeInMillSeconds = null;
    @org.jetbrains.annotations.NotNull()
    private static final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isTracking = null;
    @org.jetbrains.annotations.NotNull()
    private static final androidx.lifecycle.MutableLiveData<java.util.List<java.util.List<com.google.android.gms.maps.model.LatLng>>> pathPoints = null;
    private final com.google.android.gms.location.LocationCallback locationCallback = null;
    
    public TrackingService() {
        super();
    }
    
    public final boolean isFirstRun() {
        return false;
    }
    
    public final void setFirstRun(boolean p0) {
    }
    
    public final boolean isServiceKilled() {
        return false;
    }
    
    public final void setServiceKilled(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.android.gms.location.FusedLocationProviderClient getFusedLocationProviderClient() {
        return null;
    }
    
    public final void setFusedLocationProviderClient(@org.jetbrains.annotations.NotNull()
    com.google.android.gms.location.FusedLocationProviderClient p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.core.app.NotificationCompat.Builder getNotificationBuilder() {
        return null;
    }
    
    public final void setNotificationBuilder(@org.jetbrains.annotations.NotNull()
    androidx.core.app.NotificationCompat.Builder p0) {
    }
    
    @java.lang.Override()
    public void onCreate() {
    }
    
    private final void setInitialValues() {
    }
    
    @java.lang.Override()
    public int onStartCommand(@org.jetbrains.annotations.Nullable()
    android.content.Intent intent, int flags, int startId) {
        return 0;
    }
    
    private final void startForegroundService() {
    }
    
    private final void pauseService() {
    }
    
    private final void stopService() {
    }
    
    private final void startTimer() {
    }
    
    private final java.lang.Object addEmptyPolyline() {
        return null;
    }
    
    private final void addPathPoint(android.location.Location location) {
    }
    
    private final void updateNotificationTrackingService(boolean isTracking) {
    }
    
    @android.annotation.SuppressLint(value = {"MissingPermission"})
    private final void updatingTrackingLocation(boolean isTracking) {
    }
    
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.O)
    private final void createNotificationChannel(android.app.NotificationManager notificationManager) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0006R#\u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\b0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0006\u00a8\u0006\u000e"}, d2 = {"Lcom/demo/runningtrackerapp/utils/TrackingService$Companion;", "", "()V", "isTracking", "Landroidx/lifecycle/MutableLiveData;", "", "()Landroidx/lifecycle/MutableLiveData;", "pathPoints", "", "Lcom/google/android/gms/maps/model/LatLng;", "getPathPoints", "timeInMillSeconds", "", "getTimeInMillSeconds", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.lifecycle.MutableLiveData<java.lang.Long> getTimeInMillSeconds() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isTracking() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.lifecycle.MutableLiveData<java.util.List<java.util.List<com.google.android.gms.maps.model.LatLng>>> getPathPoints() {
            return null;
        }
    }
}