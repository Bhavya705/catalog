// Generated by Dagger (https://dagger.dev).
package io.material.catalog.shapetheming;

import dagger.MembersInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.support.DaggerFragment_MembersInjector;
import javax.inject.Provider;

public final class ShapeThemingFragment_MembersInjector implements MembersInjector<ShapeThemingFragment> {
  private final Provider<DispatchingAndroidInjector<Object>> androidInjectorProvider;

  public ShapeThemingFragment_MembersInjector(
      Provider<DispatchingAndroidInjector<Object>> androidInjectorProvider) {
    this.androidInjectorProvider = androidInjectorProvider;
  }

  public static MembersInjector<ShapeThemingFragment> create(
      Provider<DispatchingAndroidInjector<Object>> androidInjectorProvider) {
    return new ShapeThemingFragment_MembersInjector(androidInjectorProvider);}

  @Override
  public void injectMembers(ShapeThemingFragment instance) {
    DaggerFragment_MembersInjector.injectAndroidInjector(instance, androidInjectorProvider.get());
  }
}
