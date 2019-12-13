package io.material.catalog.switchmaterial;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import io.material.catalog.application.scope.FragmentScope;

@Module(subcomponents = SwitchFragment_Module_ContributeInjector.SwitchFragmentSubcomponent.class)
public abstract class SwitchFragment_Module_ContributeInjector {
  private SwitchFragment_Module_ContributeInjector() {}

  @Binds
  @IntoMap
  @ClassKey(SwitchFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      SwitchFragmentSubcomponent.Factory builder);

  @Subcomponent
  @FragmentScope
  public interface SwitchFragmentSubcomponent extends AndroidInjector<SwitchFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<SwitchFragment> {}
  }
}
