// Generated by Dagger (https://google.github.io/dagger).
package com.planbcambodia.projectkickstart.di.module;

import android.content.Context;
import com.planbcambodia.projectkickstart.app.App;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

public final class AppModule_ProvidesContextFactory implements Factory<Context> {
  private final AppModule module;

  private final Provider<App> applicationProvider;

  public AppModule_ProvidesContextFactory(AppModule module, Provider<App> applicationProvider) {
    this.module = module;
    this.applicationProvider = applicationProvider;
  }

  @Override
  public Context get() {
    return proxyProvidesContext(module, applicationProvider.get());
  }

  public static AppModule_ProvidesContextFactory create(
      AppModule module, Provider<App> applicationProvider) {
    return new AppModule_ProvidesContextFactory(module, applicationProvider);
  }

  public static Context proxyProvidesContext(AppModule instance, App application) {
    return Preconditions.checkNotNull(
        instance.providesContext(application),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}