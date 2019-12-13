// Generated by Dagger (https://dagger.dev).
package io.material.catalog.datepicker;

import dagger.MembersInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.support.DaggerFragment_MembersInjector;
import javax.inject.Provider;

public final class DatePickerDemoLandingFragment_MembersInjector implements MembersInjector<DatePickerDemoLandingFragment> {
  private final Provider<DispatchingAndroidInjector<Object>> androidInjectorProvider;

  public DatePickerDemoLandingFragment_MembersInjector(
      Provider<DispatchingAndroidInjector<Object>> androidInjectorProvider) {
    this.androidInjectorProvider = androidInjectorProvider;
  }

  public static MembersInjector<DatePickerDemoLandingFragment> create(
      Provider<DispatchingAndroidInjector<Object>> androidInjectorProvider) {
    return new DatePickerDemoLandingFragment_MembersInjector(androidInjectorProvider);}

  @Override
  public void injectMembers(DatePickerDemoLandingFragment instance) {
    DaggerFragment_MembersInjector.injectAndroidInjector(instance, androidInjectorProvider.get());
  }
}
