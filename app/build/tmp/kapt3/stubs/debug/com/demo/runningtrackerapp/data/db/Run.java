package com.demo.runningtrackerapp.data.db;

import java.lang.System;

@androidx.room.Entity(tableName = "running_table")
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u001e\b\u0007\u0018\u00002\u00020\u0001BC\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u00a2\u0006\u0002\u0010\fR\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u000b\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0012\"\u0004\b\u0016\u0010\u0014R\"\u0010\u0017\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u001c\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001a\u0010\n\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\"\"\u0004\b&\u0010$\u00a8\u0006\'"}, d2 = {"Lcom/demo/runningtrackerapp/data/db/Run;", "", "image", "Landroid/graphics/Bitmap;", "timeStamp", "", "avgSpeedInKMH", "", "distanceInMeter", "", "timeMillis", "caloriesBurned", "(Landroid/graphics/Bitmap;JFIJI)V", "getAvgSpeedInKMH", "()F", "setAvgSpeedInKMH", "(F)V", "getCaloriesBurned", "()I", "setCaloriesBurned", "(I)V", "getDistanceInMeter", "setDistanceInMeter", "id", "getId", "()Ljava/lang/Integer;", "setId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getImage", "()Landroid/graphics/Bitmap;", "setImage", "(Landroid/graphics/Bitmap;)V", "getTimeMillis", "()J", "setTimeMillis", "(J)V", "getTimeStamp", "setTimeStamp", "app_debug"})
public final class Run {
    @org.jetbrains.annotations.Nullable()
    private android.graphics.Bitmap image;
    private long timeStamp;
    private float avgSpeedInKMH;
    private int distanceInMeter;
    private long timeMillis;
    private int caloriesBurned;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.PrimaryKey(autoGenerate = true)
    private java.lang.Integer id;
    
    public Run() {
        super();
    }
    
    public Run(@org.jetbrains.annotations.Nullable()
    android.graphics.Bitmap image, long timeStamp, float avgSpeedInKMH, int distanceInMeter, long timeMillis, int caloriesBurned) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.graphics.Bitmap getImage() {
        return null;
    }
    
    public final void setImage(@org.jetbrains.annotations.Nullable()
    android.graphics.Bitmap p0) {
    }
    
    public final long getTimeStamp() {
        return 0L;
    }
    
    public final void setTimeStamp(long p0) {
    }
    
    public final float getAvgSpeedInKMH() {
        return 0.0F;
    }
    
    public final void setAvgSpeedInKMH(float p0) {
    }
    
    public final int getDistanceInMeter() {
        return 0;
    }
    
    public final void setDistanceInMeter(int p0) {
    }
    
    public final long getTimeMillis() {
        return 0L;
    }
    
    public final void setTimeMillis(long p0) {
    }
    
    public final int getCaloriesBurned() {
        return 0;
    }
    
    public final void setCaloriesBurned(int p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getId() {
        return null;
    }
    
    public final void setId(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
}