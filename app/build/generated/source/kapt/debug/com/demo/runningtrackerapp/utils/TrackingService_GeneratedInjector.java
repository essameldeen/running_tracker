package com.demo.runningtrackerapp.utils;

import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ServiceComponent;
import dagger.hilt.codegen.OriginatingElement;
import dagger.hilt.internal.GeneratedEntryPoint;

@OriginatingElement(
    topLevelClass = TrackingService.class
)
@GeneratedEntryPoint
@InstallIn(ServiceComponent.class)
public interface TrackingService_GeneratedInjector {
  void injectTrackingService(TrackingService trackingService);
}
