package com.demo.runningtrackerapp.presentation.main;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\bR\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/demo/runningtrackerapp/presentation/main/MainViewModel;", "Landroidx/lifecycle/ViewModel;", "mainRepository", "Lcom/demo/runningtrackerapp/repository/MainRepo;", "(Lcom/demo/runningtrackerapp/repository/MainRepo;)V", "getRunSortedByDate", "Landroidx/lifecycle/LiveData;", "", "Lcom/demo/runningtrackerapp/data/db/Run;", "getGetRunSortedByDate", "()Landroidx/lifecycle/LiveData;", "insertRun", "Lkotlinx/coroutines/Job;", "run", "app_debug"})
public final class MainViewModel extends androidx.lifecycle.ViewModel {
    private final com.demo.runningtrackerapp.repository.MainRepo mainRepository = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<com.demo.runningtrackerapp.data.db.Run>> getRunSortedByDate = null;
    
    @javax.inject.Inject()
    public MainViewModel(@org.jetbrains.annotations.NotNull()
    com.demo.runningtrackerapp.repository.MainRepo mainRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job insertRun(@org.jetbrains.annotations.NotNull()
    com.demo.runningtrackerapp.data.db.Run run) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.demo.runningtrackerapp.data.db.Run>> getGetRunSortedByDate() {
        return null;
    }
}