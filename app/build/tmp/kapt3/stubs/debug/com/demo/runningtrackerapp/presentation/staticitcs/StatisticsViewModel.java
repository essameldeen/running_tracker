package com.demo.runningtrackerapp.presentation.staticitcs;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\nR\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\nR\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\n\u00a8\u0006\u0016"}, d2 = {"Lcom/demo/runningtrackerapp/presentation/staticitcs/StatisticsViewModel;", "Landroidx/lifecycle/ViewModel;", "mainRepo", "Lcom/demo/runningtrackerapp/repository/MainRepo;", "(Lcom/demo/runningtrackerapp/repository/MainRepo;)V", "runSortedByDate", "Landroidx/lifecycle/LiveData;", "", "Lcom/demo/runningtrackerapp/data/db/Run;", "getRunSortedByDate", "()Landroidx/lifecycle/LiveData;", "totalAvgSpeed", "", "getTotalAvgSpeed", "totalCaloriesBurned", "", "getTotalCaloriesBurned", "totalDistance", "getTotalDistance", "totalTimeRun", "", "getTotalTimeRun", "app_debug"})
public final class StatisticsViewModel extends androidx.lifecycle.ViewModel {
    private final com.demo.runningtrackerapp.repository.MainRepo mainRepo = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.Long> totalTimeRun = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.Integer> totalDistance = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.Integer> totalCaloriesBurned = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.Float> totalAvgSpeed = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<com.demo.runningtrackerapp.data.db.Run>> runSortedByDate = null;
    
    @javax.inject.Inject()
    public StatisticsViewModel(@org.jetbrains.annotations.NotNull()
    com.demo.runningtrackerapp.repository.MainRepo mainRepo) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Long> getTotalTimeRun() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Integer> getTotalDistance() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Integer> getTotalCaloriesBurned() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Float> getTotalAvgSpeed() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.demo.runningtrackerapp.data.db.Run>> getRunSortedByDate() {
        return null;
    }
}