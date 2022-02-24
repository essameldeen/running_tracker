package com.demo.runningtrackerapp.data.db;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0014\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\t0\bH\'J\u0014\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\t0\bH\'J\u0014\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\t0\bH\'J\u0014\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\t0\bH\'J\u0014\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\t0\bH\'J\u000e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\bH\'J\u000e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\bH\'J\u000e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\bH\'J\u000e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\bH\'J\u0019\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0016"}, d2 = {"Lcom/demo/runningtrackerapp/data/db/RunDao;", "", "delete", "", "run", "Lcom/demo/runningtrackerapp/data/model/Run;", "(Lcom/demo/runningtrackerapp/data/model/Run;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllRunSortedByAvgSpeed", "Landroidx/lifecycle/LiveData;", "", "getAllRunSortedByCaloriesBurned", "getAllRunSortedByDate", "getAllRunSortedByDistance", "getAllRunSortedByTimeInMillis", "getTotalAverageSpeed", "", "getTotalInCaloriesBurned", "", "getTotalInDistanceInMeter", "getTotalInMillis", "", "insert", "app_debug"})
public abstract interface RunDao {
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract java.lang.Object insert(@org.jetbrains.annotations.NotNull()
    com.demo.runningtrackerapp.data.model.Run run, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Delete()
    public abstract java.lang.Object delete(@org.jetbrains.annotations.NotNull()
    com.demo.runningtrackerapp.data.model.Run run, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM running_table ORDER BY timeStamp DESC")
    public abstract androidx.lifecycle.LiveData<java.util.List<com.demo.runningtrackerapp.data.model.Run>> getAllRunSortedByDate();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM running_table ORDER BY timeMillis DESC")
    public abstract androidx.lifecycle.LiveData<java.util.List<com.demo.runningtrackerapp.data.model.Run>> getAllRunSortedByTimeInMillis();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM running_table ORDER BY caloriesBurned DESC")
    public abstract androidx.lifecycle.LiveData<java.util.List<com.demo.runningtrackerapp.data.model.Run>> getAllRunSortedByCaloriesBurned();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM running_table ORDER BY distanceInMeter DESC")
    public abstract androidx.lifecycle.LiveData<java.util.List<com.demo.runningtrackerapp.data.model.Run>> getAllRunSortedByDistance();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM running_table ORDER BY avgSpeedInKMH DESC")
    public abstract androidx.lifecycle.LiveData<java.util.List<com.demo.runningtrackerapp.data.model.Run>> getAllRunSortedByAvgSpeed();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT sum(timeMillis) FROM running_table")
    public abstract androidx.lifecycle.LiveData<java.lang.Long> getTotalInMillis();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT sum(caloriesBurned) FROM running_table")
    public abstract androidx.lifecycle.LiveData<java.lang.Integer> getTotalInCaloriesBurned();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT sum(distanceInMeter) FROM running_table")
    public abstract androidx.lifecycle.LiveData<java.lang.Integer> getTotalInDistanceInMeter();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT AVG(avgSpeedInKMH) FROM running_table")
    public abstract androidx.lifecycle.LiveData<java.lang.Float> getTotalAverageSpeed();
}