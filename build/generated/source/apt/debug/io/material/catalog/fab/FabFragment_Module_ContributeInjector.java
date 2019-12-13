package io.material.catalog.fab;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import io.material.catalog.application.scope.FragmentScope;

@Module(subcomponents = FabFragment_Module_ContributeInjector.FabFragmentSubcomponent.class)
public abstract class FabFragment_Module_ContributeInjector {
  private FabFragment_Module_ContributeInjector() {}

  @Binds
  @IntoMap
  @ClassKey(FabFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      FabFragmentSubcomponent.Factory builder);

  @Subcomponent
  @FragmentScope
  public interface FabFragmentSubcomponent extends AndroidInjector<FabFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<FabFragment> {}
  }
}
