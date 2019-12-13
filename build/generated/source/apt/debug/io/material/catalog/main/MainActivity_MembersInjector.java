// Generated by Dagger (https://dagger.dev).
package io.material.catalog.main;

import com.google.common.base.Optional;
import dagger.MembersInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.support.DaggerAppCompatActivity_MembersInjector;
import io.material.catalog.internal.InternalOptionsMenuPresenter;
import javax.inject.Provider;

public final class MainActivity_MembersInjector implements MembersInjector<MainActivity> {
  private final Provider<DispatchingAndroidInjector<Object>> androidInjectorProvider;

  private final Provider<Optional<InternalOptionsMenuPresenter>> internalOptionsMenuProvider;

  public MainActivity_MembersInjector(
      Provider<DispatchingAndroidInjector<Object>> androidInjectorProvider,
      Provider<Optional<InternalOptionsMenuPresenter>> internalOptionsMenuProvider) {
    this.androidInjectorProvider = androidInjectorProvider;
    this.internalOptionsMenuProvider = internalOptionsMenuProvider;
  }

  public static MembersInjector<MainActivity> create(
      Provider<DispatchingAndroidInjector<Object>> androidInjectorProvider,
      Provider<Optional<InternalOptionsMenuPresenter>> internalOptionsMenuProvider) {
    return new MainActivity_MembersInjector(androidInjectorProvider, internalOptionsMenuProvider);}

  @Override
  public void injectMembers(MainActivity instance) {
    DaggerAppCompatActivity_MembersInjector.injectAndroidInjector(instance, androidInjectorProvider.get());
    injectInternalOptionsMenu(instance, internalOptionsMenuProvider.get());
  }

  public static void injectInternalOptionsMenu(MainActivity instance,
      Optional<InternalOptionsMenuPresenter> internalOptionsMenu) {
    instance.internalOptionsMenu = internalOptionsMenu;
  }
}
