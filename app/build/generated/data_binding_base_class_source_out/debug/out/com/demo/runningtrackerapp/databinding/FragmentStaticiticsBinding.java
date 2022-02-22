// Generated by view binder compiler. Do not edit!
package com.demo.runningtrackerapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.demo.runningtrackerapp.R;
import com.github.mikephil.charting.charts.BarChart;
import com.google.android.material.textview.MaterialTextView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentStaticiticsBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final BarChart barChart;

  @NonNull
  public final Guideline guideline;

  @NonNull
  public final Guideline guideline2;

  @NonNull
  public final MaterialTextView tvAverageSpeed;

  @NonNull
  public final MaterialTextView tvAverageSpeedInfo;

  @NonNull
  public final MaterialTextView tvTotalCalories;

  @NonNull
  public final MaterialTextView tvTotalCaloriesInfo;

  @NonNull
  public final MaterialTextView tvTotalDistance;

  @NonNull
  public final MaterialTextView tvTotalDistanceInfo;

  @NonNull
  public final MaterialTextView tvTotalTime;

  @NonNull
  public final MaterialTextView tvTotalTimeInfo;

  private FragmentStaticiticsBinding(@NonNull ConstraintLayout rootView, @NonNull BarChart barChart,
      @NonNull Guideline guideline, @NonNull Guideline guideline2,
      @NonNull MaterialTextView tvAverageSpeed, @NonNull MaterialTextView tvAverageSpeedInfo,
      @NonNull MaterialTextView tvTotalCalories, @NonNull MaterialTextView tvTotalCaloriesInfo,
      @NonNull MaterialTextView tvTotalDistance, @NonNull MaterialTextView tvTotalDistanceInfo,
      @NonNull MaterialTextView tvTotalTime, @NonNull MaterialTextView tvTotalTimeInfo) {
    this.rootView = rootView;
    this.barChart = barChart;
    this.guideline = guideline;
    this.guideline2 = guideline2;
    this.tvAverageSpeed = tvAverageSpeed;
    this.tvAverageSpeedInfo = tvAverageSpeedInfo;
    this.tvTotalCalories = tvTotalCalories;
    this.tvTotalCaloriesInfo = tvTotalCaloriesInfo;
    this.tvTotalDistance = tvTotalDistance;
    this.tvTotalDistanceInfo = tvTotalDistanceInfo;
    this.tvTotalTime = tvTotalTime;
    this.tvTotalTimeInfo = tvTotalTimeInfo;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentStaticiticsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentStaticiticsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_staticitics, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentStaticiticsBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.barChart;
      BarChart barChart = ViewBindings.findChildViewById(rootView, id);
      if (barChart == null) {
        break missingId;
      }

      id = R.id.guideline;
      Guideline guideline = ViewBindings.findChildViewById(rootView, id);
      if (guideline == null) {
        break missingId;
      }

      id = R.id.guideline2;
      Guideline guideline2 = ViewBindings.findChildViewById(rootView, id);
      if (guideline2 == null) {
        break missingId;
      }

      id = R.id.tvAverageSpeed;
      MaterialTextView tvAverageSpeed = ViewBindings.findChildViewById(rootView, id);
      if (tvAverageSpeed == null) {
        break missingId;
      }

      id = R.id.tvAverageSpeedInfo;
      MaterialTextView tvAverageSpeedInfo = ViewBindings.findChildViewById(rootView, id);
      if (tvAverageSpeedInfo == null) {
        break missingId;
      }

      id = R.id.tvTotalCalories;
      MaterialTextView tvTotalCalories = ViewBindings.findChildViewById(rootView, id);
      if (tvTotalCalories == null) {
        break missingId;
      }

      id = R.id.tvTotalCaloriesInfo;
      MaterialTextView tvTotalCaloriesInfo = ViewBindings.findChildViewById(rootView, id);
      if (tvTotalCaloriesInfo == null) {
        break missingId;
      }

      id = R.id.tvTotalDistance;
      MaterialTextView tvTotalDistance = ViewBindings.findChildViewById(rootView, id);
      if (tvTotalDistance == null) {
        break missingId;
      }

      id = R.id.tvTotalDistanceInfo;
      MaterialTextView tvTotalDistanceInfo = ViewBindings.findChildViewById(rootView, id);
      if (tvTotalDistanceInfo == null) {
        break missingId;
      }

      id = R.id.tvTotalTime;
      MaterialTextView tvTotalTime = ViewBindings.findChildViewById(rootView, id);
      if (tvTotalTime == null) {
        break missingId;
      }

      id = R.id.tvTotalTimeInfo;
      MaterialTextView tvTotalTimeInfo = ViewBindings.findChildViewById(rootView, id);
      if (tvTotalTimeInfo == null) {
        break missingId;
      }

      return new FragmentStaticiticsBinding((ConstraintLayout) rootView, barChart, guideline,
          guideline2, tvAverageSpeed, tvAverageSpeedInfo, tvTotalCalories, tvTotalCaloriesInfo,
          tvTotalDistance, tvTotalDistanceInfo, tvTotalTime, tvTotalTimeInfo);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
