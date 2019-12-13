// Generated by Dagger (https://dagger.dev).
package io.material.catalog.button;

import dagger.MembersInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.support.DaggerFragment_MembersInjector;
import javax.inject.Provider;

public final class ButtonsFragment_MembersInjector implements MembersInjector<ButtonsFragment> {
  private final Provider<DispatchingAndroidInjector<Object>> androidInjectorProvider;

  public ButtonsFragment_MembersInjector(
      Provider<DispatchingAndroidInjector<Object>> androidInjectorProvider) {
    this.androidInjectorProvider = androidInjectorProvider;
  }

  public static MembersInjector<ButtonsFragment> create(
      Provider<DispatchingAndroidInjector<Object>> androidInjectorProvider) {
    return new ButtonsFragment_MembersInjector(androidInjectorProvider);}

  @Override
  public void injectMembers(ButtonsFragment instance) {
    DaggerFragment_MembersInjector.injectAndroidInjector(instance, androidInjectorProvider.get());
  }
}