package io.material.catalog.radiobutton;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import io.material.catalog.application.scope.FragmentScope;

@Module(
  subcomponents =
      RadioButtonFragment_Module_ContributeInjector.RadioButtonFragmentSubcomponent.class
)
public abstract class RadioButtonFragment_Module_ContributeInjector {
  private RadioButtonFragment_Module_ContributeInjector() {}

  @Binds
  @IntoMap
  @ClassKey(RadioButtonFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      RadioButtonFragmentSubcomponent.Factory builder);

  @Subcomponent
  @FragmentScope
  public interface RadioButtonFragmentSubcomponent extends AndroidInjector<RadioButtonFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<RadioButtonFragment> {}
  }
}
