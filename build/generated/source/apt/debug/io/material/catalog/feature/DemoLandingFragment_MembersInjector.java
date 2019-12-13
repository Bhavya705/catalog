// Generated by Dagger (https://dagger.dev).
package io.material.catalog.feature;

import dagger.MembersInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.support.DaggerFragment_MembersInjector;
import javax.inject.Provider;

public final class DemoLandingFragment_MembersInjector implements MembersInjector<DemoLandingFragment> {
  private final Provider<DispatchingAndroidInjector<Object>> androidInjectorProvider;

  public DemoLandingFragment_MembersInjector(
      Provider<DispatchingAndroidInjector<Object>> androidInjectorProvider) {
    this.androidInjectorProvider = androidInjectorProvider;
  }

  public static MembersInjector<DemoLandingFragment> create(
      Provider<DispatchingAndroidInjector<Object>> androidInjectorProvider) {
    return new DemoLandingFragment_MembersInjector(androidInjectorProvider);}

  @Override
  public void injectMembers(DemoLandingFragment instance) {
    DaggerFragment_MembersInjector.injectAndroidInjector(instance, androidInjectorProvider.get());
  }
}