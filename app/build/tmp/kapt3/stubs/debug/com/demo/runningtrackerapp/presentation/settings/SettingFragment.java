package com.demo.runningtrackerapp.presentation.settings;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u000b\u001a\u00020\fH\u0002J\b\u0010\r\u001a\u00020\fH\u0002J$\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\u001a\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u000f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\u0018\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\u0010\u0010\u001d\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\u0010\u0010\u001e\u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\u001aH\u0002J\b\u0010 \u001a\u00020!H\u0002J\u001a\u0010\"\u001a\u00020\f2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006#"}, d2 = {"Lcom/demo/runningtrackerapp/presentation/settings/SettingFragment;", "Landroidx/fragment/app/Fragment;", "()V", "sharedPref", "Landroid/content/SharedPreferences;", "getSharedPref", "()Landroid/content/SharedPreferences;", "setSharedPref", "(Landroid/content/SharedPreferences;)V", "viewBinding", "Lcom/demo/runningtrackerapp/databinding/FragmentSettingsBinding;", "getDataFromSharedPref", "", "initListener", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "saveToSharedPre", "name", "", "weight", "", "setUpToolBarView", "showMessage", "message", "updateDataOnSharedPref", "", "updateView", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class SettingFragment extends androidx.fragment.app.Fragment {
    private com.demo.runningtrackerapp.databinding.FragmentSettingsBinding viewBinding;
    @javax.inject.Inject()
    public android.content.SharedPreferences sharedPref;
    private java.util.HashMap _$_findViewCache;
    
    public SettingFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.SharedPreferences getSharedPref() {
        return null;
    }
    
    public final void setSharedPref(@org.jetbrains.annotations.NotNull()
    android.content.SharedPreferences p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void initListener() {
    }
    
    private final void getDataFromSharedPref() {
    }
    
    private final void updateView(java.lang.String name, float weight) {
    }
    
    private final boolean updateDataOnSharedPref() {
        return false;
    }
    
    private final void saveToSharedPre(java.lang.String name, float weight) {
    }
    
    private final void setUpToolBarView(java.lang.String name) {
    }
    
    private final void showMessage(java.lang.String message) {
    }
}