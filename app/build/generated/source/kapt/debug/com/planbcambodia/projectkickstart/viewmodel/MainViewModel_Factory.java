// Generated by Dagger (https://google.github.io/dagger).
package com.planbcambodia.projectkickstart.viewmodel;

import com.planbcambodia.projectkickstart.data.repository.Repository;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class MainViewModel_Factory implements Factory<MainViewModel> {
  private final Provider<Repository> repositoryProvider;

  public MainViewModel_Factory(Provider<Repository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public MainViewModel get() {
    return new MainViewModel(repositoryProvider.get());
  }

  public static MainViewModel_Factory create(Provider<Repository> repositoryProvider) {
    return new MainViewModel_Factory(repositoryProvider);
  }

  public static MainViewModel newMainViewModel(Repository repository) {
    return new MainViewModel(repository);
  }
}
