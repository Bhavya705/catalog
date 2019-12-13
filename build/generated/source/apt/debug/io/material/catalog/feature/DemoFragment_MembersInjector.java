// Generated by Dagger (https://dagger.dev).
package io.material.catalog.feature;

import dagger.MembersInjector;
import dagger.android.DispatchingAndroidInjector;
import javax.inject.Provider;

public final class DemoFragment_MembersInjector implements MembersInjector<DemoFragment> {
  private final Provider<DispatchingAndroidInjector<Object>> childFragmentInjectorProvider;

  public DemoFragment_MembersInjector(
      Provider<DispatchingAndroidInjector<Object>> childFragmentInjectorProvider) {
    this.childFragmentInjectorProvider = childFragmentInjectorProvider;
  }

  public static MembersInjector<DemoFragment> create(
      Provider<DispatchingAndroidInjector<Object>> childFragmentInjectorProvider) {
    return new DemoFragment_MembersInjector(childFragmentInjectorProvider);}

  @Override
  public void injectMembers(DemoFragment instance) {
    injectChildFragmentInjector(instance, childFragmentInjectorProvider.get());
  }

  public static void injectChildFragmentInjector(DemoFragment instance,
      DispatchingAndroidInjector<Object> childFragmentInjector) {
    instance.childFragmentInjector = childFragmentInjector;
  }
}