package io.material.catalog.datepicker;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import io.material.catalog.application.scope.FragmentScope;

@Module(
  subcomponents =
      DatePickerDemoLandingFragment_Module_ContributeInjector
          .DatePickerDemoLandingFragmentSubcomponent.class
)
public abstract class DatePickerDemoLandingFragment_Module_ContributeInjector {
  private DatePickerDemoLandingFragment_Module_ContributeInjector() {}

  @Binds
  @IntoMap
  @ClassKey(DatePickerDemoLandingFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      DatePickerDemoLandingFragmentSubcomponent.Factory builder);

  @Subcomponent
  @FragmentScope
  public interface DatePickerDemoLandingFragmentSubcomponent
      extends AndroidInjector<DatePickerDemoLandingFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<DatePickerDemoLandingFragment> {}
  }
}
