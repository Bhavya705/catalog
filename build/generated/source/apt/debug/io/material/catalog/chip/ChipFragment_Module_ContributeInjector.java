package io.material.catalog.chip;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import io.material.catalog.application.scope.FragmentScope;

@Module(subcomponents = ChipFragment_Module_ContributeInjector.ChipFragmentSubcomponent.class)
public abstract class ChipFragment_Module_ContributeInjector {
  private ChipFragment_Module_ContributeInjector() {}

  @Binds
  @IntoMap
  @ClassKey(ChipFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      ChipFragmentSubcomponent.Factory builder);

  @Subcomponent
  @FragmentScope
  public interface ChipFragmentSubcomponent extends AndroidInjector<ChipFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<ChipFragment> {}
  }
}
