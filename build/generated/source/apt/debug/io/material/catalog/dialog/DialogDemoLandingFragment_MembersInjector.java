// Generated by Dagger (https://dagger.dev).
package io.material.catalog.dialog;

import dagger.MembersInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.support.DaggerFragment_MembersInjector;
import javax.inject.Provider;

public final class DialogDemoLandingFragment_MembersInjector implements MembersInjector<DialogDemoLandingFragment> {
  private final Provider<DispatchingAndroidInjector<Object>> androidInjectorProvider;

  public DialogDemoLandingFragment_MembersInjector(
      Provider<DispatchingAndroidInjector<Object>> androidInjectorProvider) {
    this.androidInjectorProvider = androidInjectorProvider;
  }

  public static MembersInjector<DialogDemoLandingFragment> create(
      Provider<DispatchingAndroidInjector<Object>> androidInjectorProvider) {
    return new DialogDemoLandingFragment_MembersInjector(androidInjectorProvider);}

  @Override
  public void injectMembers(DialogDemoLandingFragment instance) {
    DaggerFragment_MembersInjector.injectAndroidInjector(instance, androidInjectorProvider.get());
  }
}