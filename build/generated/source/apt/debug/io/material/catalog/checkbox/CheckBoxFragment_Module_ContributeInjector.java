package io.material.catalog.checkbox;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import io.material.catalog.application.scope.FragmentScope;

@Module(
  subcomponents = CheckBoxFragment_Module_ContributeInjector.CheckBoxFragmentSubcomponent.class
)
public abstract class CheckBoxFragment_Module_ContributeInjector {
  private CheckBoxFragment_Module_ContributeInjector() {}

  @Binds
  @IntoMap
  @ClassKey(CheckBoxFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      CheckBoxFragmentSubcomponent.Factory builder);

  @Subcomponent
  @FragmentScope
  public interface CheckBoxFragmentSubcomponent extends AndroidInjector<CheckBoxFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<CheckBoxFragment> {}
  }
}
