package com.demo.runningtrackerapp.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0014\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\t0\bH&J\u0014\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\t0\bH&J\u0014\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\t0\bH&J\u0014\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\t0\bH&J\u0014\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\t0\bH&J\u000e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\bH&J\u000e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\bH&J\u000e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\bH&J\u000e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\bH&J\u0019\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0016"}, d2 = {"Lcom/demo/runningtrackerapp/repository/MainRepo;", "", "deleteRun", "", "run", "Lcom/demo/runningtrackerapp/data/db/Run;", "(Lcom/demo/runningtrackerapp/data/db/Run;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllRunsSortedByAvgSpeed", "Landroidx/lifecycle/LiveData;", "", "getAllRunsSortedByCaloriesBurned", "getAllRunsSortedByDate", "getAllRunsSortedByDistance", "getAllRunsSortedByTimeInMillis", "getTotalAvgSpeed", "", "getTotalCaloriesBurned", "", "getTotalDistance", "getTotalTimeInMillis", "", "insertRun", "app_debug"})
public abstract interface MainRepo {
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object insertRun(@org.jetbrains.annotations.NotNull()
    com.demo.runningtrackerapp.data.db.Run run, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object deleteRun(@org.jetbrains.annotations.NotNull()
    com.demo.runningtrackerapp.data.db.Run run, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.lifecycle.LiveData<java.util.List<com.demo.runningtrackerapp.data.db.Run>> getAllRunsSortedByDate();
    
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.lifecycle.LiveData<java.util.List<com.demo.runningtrackerapp.data.db.Run>> getAllRunsSortedByDistance();
    
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.lifecycle.LiveData<java.util.List<com.demo.runningtrackerapp.data.db.Run>> getAllRunsSortedByTimeInMillis();
    
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.lifecycle.LiveData<java.util.List<com.demo.runningtrackerapp.data.db.Run>> getAllRunsSortedByAvgSpeed();
    
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.lifecycle.LiveData<java.util.List<com.demo.runningtrackerapp.data.db.Run>> getAllRunsSortedByCaloriesBurned();
    
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.lifecycle.LiveData<java.lang.Float> getTotalAvgSpeed();
    
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.lifecycle.LiveData<java.lang.Integer> getTotalDistance();
    
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.lifecycle.LiveData<java.lang.Integer> getTotalCaloriesBurned();
    
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.lifecycle.LiveData<java.lang.Long> getTotalTimeInMillis();
}