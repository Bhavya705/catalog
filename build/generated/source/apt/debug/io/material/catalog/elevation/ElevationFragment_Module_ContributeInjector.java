package io.material.catalog.elevation;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import io.material.catalog.application.scope.FragmentScope;

@Module(
  subcomponents = ElevationFragment_Module_ContributeInjector.ElevationFragmentSubcomponent.class
)
public abstract class ElevationFragment_Module_ContributeInjector {
  private ElevationFragment_Module_ContributeInjector() {}

  @Binds
  @IntoMap
  @ClassKey(ElevationFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      ElevationFragmentSubcomponent.Factory builder);

  @Subcomponent
  @FragmentScope
  public interface ElevationFragmentSubcomponent extends AndroidInjector<ElevationFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<ElevationFragment> {}
  }
}
