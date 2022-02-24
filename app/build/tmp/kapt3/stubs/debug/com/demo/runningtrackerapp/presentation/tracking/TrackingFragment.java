package com.demo.runningtrackerapp.presentation.tracking;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u001d\u001a\u00020\u001eH\u0002J\b\u0010\u001f\u001a\u00020\u001eH\u0002J\u0010\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#H\u0002J\b\u0010$\u001a\u00020\u001eH\u0002J\b\u0010%\u001a\u00020\u001eH\u0002J\b\u0010&\u001a\u00020\u001eH\u0002J\b\u0010\'\u001a\u00020\u001eH\u0002J\b\u0010(\u001a\u00020\u001eH\u0002J\u0018\u0010)\u001a\u00020\u001e2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010*\u001a\u00020+H\u0016J$\u0010,\u001a\u00020-2\u0006\u0010*\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u0001002\b\u00101\u001a\u0004\u0018\u000102H\u0016J\b\u00103\u001a\u00020\u001eH\u0016J\b\u00104\u001a\u00020\u001eH\u0016J\u0010\u00105\u001a\u00020\b2\u0006\u00106\u001a\u000207H\u0016J\b\u00108\u001a\u00020\u001eH\u0016J\u0010\u00109\u001a\u00020\u001e2\u0006\u0010\t\u001a\u00020\nH\u0016J\b\u0010:\u001a\u00020\u001eH\u0016J\u0010\u0010;\u001a\u00020\u001e2\u0006\u0010<\u001a\u000202H\u0016J\b\u0010=\u001a\u00020\u001eH\u0016J\u001a\u0010>\u001a\u00020\u001e2\u0006\u0010?\u001a\u00020-2\b\u00101\u001a\u0004\u0018\u000102H\u0016J\u0010\u0010@\u001a\u00020A2\u0006\u0010B\u001a\u00020CH\u0002J\u0012\u0010D\u001a\u00020\u001e2\b\u00101\u001a\u0004\u0018\u000102H\u0002J\b\u0010E\u001a\u00020\u001eH\u0002J\b\u0010F\u001a\u00020\u001eH\u0002J\b\u0010G\u001a\u00020\u001eH\u0002J\b\u0010H\u001a\u00020\u001eH\u0002J\u0010\u0010I\u001a\u00020\u001e2\u0006\u0010\u0007\u001a\u00020\bH\u0002J\b\u0010J\u001a\u00020\u001eH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013R$\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0017@GX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c\u00a8\u0006K"}, d2 = {"Lcom/demo/runningtrackerapp/presentation/tracking/TrackingFragment;", "Landroidx/fragment/app/Fragment;", "()V", "currentTimeInMills", "", "googleMap", "Lcom/google/android/gms/maps/GoogleMap;", "isTracking", "", "menu", "Landroid/view/Menu;", "pathPoints", "", "Lcom/google/android/gms/maps/model/LatLng;", "viewBinding", "Lcom/demo/runningtrackerapp/databinding/FragmentTrackingBinding;", "viewModel", "Lcom/demo/runningtrackerapp/presentation/main/MainViewModel;", "getViewModel", "()Lcom/demo/runningtrackerapp/presentation/main/MainViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "<set-?>", "", "weight", "getWeight", "()F", "setWeight", "(F)V", "addAllPolylines", "", "addLatestPoint", "createRunModel", "Lcom/demo/runningtrackerapp/data/model/Run;", "bitmap", "Landroid/graphics/Bitmap;", "endRunAndSaveInDB", "initObservers", "intiListener", "makeMenuVisible", "moveTheCameraToPoint", "onCreateOptionsMenu", "inflater", "Landroid/view/MenuInflater;", "onCreateView", "Landroid/view/View;", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onLowMemory", "onOptionsItemSelected", "item", "Landroid/view/MenuItem;", "onPause", "onPrepareOptionsMenu", "onResume", "onSaveInstanceState", "outState", "onStop", "onViewCreated", "view", "sendCommandToService", "Landroid/content/Intent;", "action", "", "setDialogListener", "showCancelDialog", "showSnackBar", "stopRun", "toggleRun", "updateTracking", "zoomOutToSeeAllTrackingPath", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class TrackingFragment extends androidx.fragment.app.Fragment {
    private com.demo.runningtrackerapp.databinding.FragmentTrackingBinding viewBinding;
    private com.google.android.gms.maps.GoogleMap googleMap;
    private final kotlin.Lazy viewModel$delegate = null;
    private boolean isTracking = false;
    private java.util.List<java.util.List<com.google.android.gms.maps.model.LatLng>> pathPoints;
    private long currentTimeInMills = 0L;
    private android.view.Menu menu;
    private float weight = 80.0F;
    private java.util.HashMap _$_findViewCache;
    
    public TrackingFragment() {
        super();
    }
    
    private final com.demo.runningtrackerapp.presentation.main.MainViewModel getViewModel() {
        return null;
    }
    
    public final float getWeight() {
        return 0.0F;
    }
    
    @javax.inject.Inject()
    public final void setWeight(float p0) {
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
    
    private final void setDialogListener(android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onCreateOptionsMenu(@org.jetbrains.annotations.NotNull()
    android.view.Menu menu, @org.jetbrains.annotations.NotNull()
    android.view.MenuInflater inflater) {
    }
    
    @java.lang.Override()
    public void onPrepareOptionsMenu(@org.jetbrains.annotations.NotNull()
    android.view.Menu menu) {
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    private final void intiListener() {
    }
    
    private final void initObservers() {
    }
    
    private final android.content.Intent sendCommandToService(java.lang.String action) {
        return null;
    }
    
    private final void zoomOutToSeeAllTrackingPath() {
    }
    
    private final void endRunAndSaveInDB() {
    }
    
    private final com.demo.runningtrackerapp.data.model.Run createRunModel(android.graphics.Bitmap bitmap) {
        return null;
    }
    
    private final void showSnackBar() {
    }
    
    private final void addAllPolylines() {
    }
    
    private final void addLatestPoint() {
    }
    
    private final void moveTheCameraToPoint() {
    }
    
    private final void updateTracking(boolean isTracking) {
    }
    
    private final void toggleRun() {
    }
    
    private final void showCancelDialog() {
    }
    
    private final void makeMenuVisible() {
    }
    
    private final void stopRun() {
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    @java.lang.Override()
    public void onPause() {
    }
    
    @java.lang.Override()
    public void onStop() {
    }
    
    @java.lang.Override()
    public void onLowMemory() {
    }
    
    @java.lang.Override()
    public void onSaveInstanceState(@org.jetbrains.annotations.NotNull()
    android.os.Bundle outState) {
    }
    
    @java.lang.Override()
    public void onDestroy() {
    }
}