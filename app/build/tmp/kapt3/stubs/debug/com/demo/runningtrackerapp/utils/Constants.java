package com.demo.runningtrackerapp.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\tX\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0011X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0011X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u000fX\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0011X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\tX\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Lcom/demo/runningtrackerapp/utils/Constants;", "", "()V", "ACTION_PAUSE_SERVICE", "", "ACTION_SHOW_TRACKING_FRAGMENT", "ACTION_START_OR_RESUME_SERVICE", "ACTION_STOP_SERVICE", "FASTEST_LOCATION_INTERVAL", "", "KEY_FIRST_TIME_TOGGLE", "KEY_NAME", "KEY_WEIGHT", "LOCATION_UPDATE_INTERVAL", "MAP_ZOOM", "", "MARKER_VIEW", "", "NOTIFICATION_CHANNEL_ID", "NOTIFICATION_CHANNEL_NAME", "NOTIFICATION_ID", "NOTIFICATION_TITLE", "POLYLINE_COLOR", "POLYLINE_WIDTH", "REQUEST_CODE_LOCATION_PERMISSION", "SHARED_PREFERENCE_NAME", "TIMER_UPDATE_INTERVAL", "app_debug"})
public final class Constants {
    @org.jetbrains.annotations.NotNull()
    public static final com.demo.runningtrackerapp.utils.Constants INSTANCE = null;
    public static final int REQUEST_CODE_LOCATION_PERMISSION = 0;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ACTION_START_OR_RESUME_SERVICE = "ACTION_START_OR_RESUME_SERVICE";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ACTION_PAUSE_SERVICE = "ACTION_PAUSE_SERVICE";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ACTION_STOP_SERVICE = "ACTION_STOP_SERVICE";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ACTION_SHOW_TRACKING_FRAGMENT = "ACTION_SHOW_TRACKING_FRAGMENT";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String NOTIFICATION_CHANNEL_ID = "tracking_channel";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String NOTIFICATION_CHANNEL_NAME = "tracking";
    public static final int NOTIFICATION_ID = 1;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String NOTIFICATION_TITLE = "Running App";
    public static final int POLYLINE_COLOR = android.graphics.Color.RED;
    public static final float POLYLINE_WIDTH = 8.0F;
    public static final float MAP_ZOOM = 15.0F;
    public static final long LOCATION_UPDATE_INTERVAL = 5000L;
    public static final long FASTEST_LOCATION_INTERVAL = 2000L;
    public static final long TIMER_UPDATE_INTERVAL = 50L;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SHARED_PREFERENCE_NAME = "sharedPref";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String KEY_FIRST_TIME_TOGGLE = "KEY_FIRST_TIME_TOGGLE";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String KEY_NAME = "KEY_NAME";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String KEY_WEIGHT = "KEY_WEIGHT";
    public static final int MARKER_VIEW = com.demo.runningtrackerapp.R.layout.marker_view;
    
    private Constants() {
        super();
    }
}