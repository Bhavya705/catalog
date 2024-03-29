// Generated by Dagger (https://dagger.dev).
package io.material.catalog.fab;

import dagger.MembersInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.support.DaggerFragment_MembersInjector;
import javax.inject.Provider;

public final class FabFragment_MembersInjector implements MembersInjector<FabFragment> {
  private final Provider<DispatchingAndroidInjector<Object>> androidInjectorProvider;

  public FabFragment_MembersInjector(
      Provider<DispatchingAndroidInjector<Object>> androidInjectorProvider) {
    this.androidInjectorProvider = androidInjectorProvider;
  }

  public static MembersInjector<FabFragment> create(
      Provider<DispatchingAndroidInjector<Object>> androidInjectorProvider) {
    return new FabFragment_MembersInjector(androidInjectorProvider);}

  @Override
  public void injectMembers(FabFragment instance) {
    DaggerFragment_MembersInjector.injectAndroidInjector(instance, androidInjectorProvider.get());
  }
}
