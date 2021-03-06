// Generated by Dagger (https://dagger.dev).
package com.demo.runningtrackerapp.app;

import android.content.Context;
import android.content.SharedPreferences;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AppModule_ProvideSharedPreferenceFactory implements Factory<SharedPreferences> {
  private final Provider<Context> contextProvider;

  public AppModule_ProvideSharedPreferenceFactory(Provider<Context> contextProvider) {
    this.contextProvider = contextProvider;
  }

  @Override
  public SharedPreferences get() {
    return provideSharedPreference(contextProvider.get());
  }

  public static AppModule_ProvideSharedPreferenceFactory create(Provider<Context> contextProvider) {
    return new AppModule_ProvideSharedPreferenceFactory(contextProvider);
  }

  public static SharedPreferences provideSharedPreference(Context context) {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideSharedPreference(context));
  }
}
