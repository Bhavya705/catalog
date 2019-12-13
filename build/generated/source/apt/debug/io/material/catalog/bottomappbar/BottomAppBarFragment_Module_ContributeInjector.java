package io.material.catalog.bottomappbar;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import io.material.catalog.application.scope.FragmentScope;

@Module(
  subcomponents =
      BottomAppBarFragment_Module_ContributeInjector.BottomAppBarFragmentSubcomponent.class
)
public abstract class BottomAppBarFragment_Module_ContributeInjector {
  private BottomAppBarFragment_Module_ContributeInjector() {}

  @Binds
  @IntoMap
  @ClassKey(BottomAppBarFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      BottomAppBarFragmentSubcomponent.Factory builder);

  @Subcomponent
  @FragmentScope
  public interface BottomAppBarFragmentSubcomponent extends AndroidInjector<BottomAppBarFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<BottomAppBarFragment> {}
  }
}
