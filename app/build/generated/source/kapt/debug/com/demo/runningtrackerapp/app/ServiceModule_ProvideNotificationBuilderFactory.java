// Generated by Dagger (https://dagger.dev).
package com.demo.runningtrackerapp.app;

import android.app.PendingIntent;
import android.content.Context;
import androidx.core.app.NotificationCompat;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ServiceModule_ProvideNotificationBuilderFactory implements Factory<NotificationCompat.Builder> {
  private final Provider<Context> contextProvider;

  private final Provider<PendingIntent> pendingIntentProvider;

  public ServiceModule_ProvideNotificationBuilderFactory(Provider<Context> contextProvider,
      Provider<PendingIntent> pendingIntentProvider) {
    this.contextProvider = contextProvider;
    this.pendingIntentProvider = pendingIntentProvider;
  }

  @Override
  public NotificationCompat.Builder get() {
    return provideNotificationBuilder(contextProvider.get(), pendingIntentProvider.get());
  }

  public static ServiceModule_ProvideNotificationBuilderFactory create(
      Provider<Context> contextProvider, Provider<PendingIntent> pendingIntentProvider) {
    return new ServiceModule_ProvideNotificationBuilderFactory(contextProvider, pendingIntentProvider);
  }

  public static NotificationCompat.Builder provideNotificationBuilder(Context context,
      PendingIntent pendingIntent) {
    return Preconditions.checkNotNullFromProvides(ServiceModule.INSTANCE.provideNotificationBuilder(context, pendingIntent));
  }
}