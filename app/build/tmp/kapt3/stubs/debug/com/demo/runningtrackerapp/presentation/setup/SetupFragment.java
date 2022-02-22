package com.demo.runningtrackerapp.presentation.setup;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0011\u001a\u00020\u0004H\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0002J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\b\u0010\u0019\u001a\u00020\u0013H\u0002J$\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\u001a\u0010 \u001a\u00020\u00132\u0006\u0010!\u001a\u00020\u001b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\u0018\u0010\"\u001a\u00020\u00132\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&H\u0002J\u0010\u0010\'\u001a\u00020\u00132\u0006\u0010#\u001a\u00020$H\u0002J\b\u0010(\u001a\u00020\u0013H\u0002R$\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004@GX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006)"}, d2 = {"Lcom/demo/runningtrackerapp/presentation/setup/SetupFragment;", "Landroidx/fragment/app/Fragment;", "()V", "<set-?>", "", "isFirstAppOpen", "()Z", "setFirstAppOpen", "(Z)V", "sharedPref", "Landroid/content/SharedPreferences;", "getSharedPref", "()Landroid/content/SharedPreferences;", "setSharedPref", "(Landroid/content/SharedPreferences;)V", "viewBinding", "Lcom/demo/runningtrackerapp/databinding/FragmentSetupsBinding;", "getPersonalData", "goToMainFragmentFirst", "", "goToMainFragmentSecond", "savedInstanceState", "Landroid/os/Bundle;", "navOptions", "Landroidx/navigation/NavOptions;", "initListener", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onViewCreated", "view", "saveToSharedPre", "name", "", "weight", "", "setUpToolBarView", "showErrorMessage", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class SetupFragment extends androidx.fragment.app.Fragment {
    private com.demo.runningtrackerapp.databinding.FragmentSetupsBinding viewBinding;
    @javax.inject.Inject()
    public android.content.SharedPreferences sharedPref;
    private boolean isFirstAppOpen = true;
    private java.util.HashMap _$_findViewCache;
    
    public SetupFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.SharedPreferences getSharedPref() {
        return null;
    }
    
    public final void setSharedPref(@org.jetbrains.annotations.NotNull()
    android.content.SharedPreferences p0) {
    }
    
    public final boolean isFirstAppOpen() {
        return false;
    }
    
    @javax.inject.Inject()
    public final void setFirstAppOpen(boolean p0) {
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
    
    private final void goToMainFragmentSecond(android.os.Bundle savedInstanceState, androidx.navigation.NavOptions navOptions) {
    }
    
    private final void initListener() {
    }
    
    private final boolean getPersonalData() {
        return false;
    }
    
    private final void saveToSharedPre(java.lang.String name, float weight) {
    }
    
    private final void setUpToolBarView(java.lang.String name) {
    }
    
    private final void showErrorMessage() {
    }
    
    private final void goToMainFragmentFirst() {
    }
}