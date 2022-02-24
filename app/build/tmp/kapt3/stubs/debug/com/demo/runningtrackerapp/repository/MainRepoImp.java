package com.demo.runningtrackerapp.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u0014\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\f0\u000bH\u0016J\u0014\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\f0\u000bH\u0016J\u0014\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\f0\u000bH\u0016J\u0014\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\f0\u000bH\u0016J\u0014\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\f0\u000bH\u0016J\u000e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u000bH\u0016J\u000e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u000bH\u0016J\u000e\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u000bH\u0016J\u000e\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u000bH\u0016J\u0019\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0019"}, d2 = {"Lcom/demo/runningtrackerapp/repository/MainRepoImp;", "Lcom/demo/runningtrackerapp/repository/MainRepo;", "dao", "Lcom/demo/runningtrackerapp/data/db/RunDao;", "(Lcom/demo/runningtrackerapp/data/db/RunDao;)V", "deleteRun", "", "run", "Lcom/demo/runningtrackerapp/data/model/Run;", "(Lcom/demo/runningtrackerapp/data/model/Run;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllRunsSortedByAvgSpeed", "Landroidx/lifecycle/LiveData;", "", "getAllRunsSortedByCaloriesBurned", "getAllRunsSortedByDate", "getAllRunsSortedByDistance", "getAllRunsSortedByTimeInMillis", "getTotalAvgSpeed", "", "getTotalCaloriesBurned", "", "getTotalDistance", "getTotalTimeInMillis", "", "insertRun", "app_debug"})
public final class MainRepoImp implements com.demo.runningtrackerapp.repository.MainRepo {
    private final com.demo.runningtrackerapp.data.db.RunDao dao = null;
    
    @javax.inject.Inject()
    public MainRepoImp(@org.jetbrains.annotations.NotNull()
    com.demo.runningtrackerapp.data.db.RunDao dao) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object insertRun(@org.jetbrains.annotations.NotNull()
    com.demo.runningtrackerapp.data.model.Run run, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object deleteRun(@org.jetbrains.annotations.NotNull()
    com.demo.runningtrackerapp.data.model.Run run, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.LiveData<java.util.List<com.demo.runningtrackerapp.data.model.Run>> getAllRunsSortedByDate() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.LiveData<java.util.List<com.demo.runningtrackerapp.data.model.Run>> getAllRunsSortedByDistance() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.LiveData<java.util.List<com.demo.runningtrackerapp.data.model.Run>> getAllRunsSortedByTimeInMillis() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.LiveData<java.util.List<com.demo.runningtrackerapp.data.model.Run>> getAllRunsSortedByAvgSpeed() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.LiveData<java.util.List<com.demo.runningtrackerapp.data.model.Run>> getAllRunsSortedByCaloriesBurned() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.LiveData<java.lang.Float> getTotalAvgSpeed() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.LiveData<java.lang.Integer> getTotalDistance() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.LiveData<java.lang.Integer> getTotalCaloriesBurned() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.LiveData<java.lang.Long> getTotalTimeInMillis() {
        return null;
    }
}