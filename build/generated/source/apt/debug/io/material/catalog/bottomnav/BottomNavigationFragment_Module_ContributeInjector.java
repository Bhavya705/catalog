package io.material.catalog.bottomnav;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import io.material.catalog.application.scope.FragmentScope;

@Module(
  subcomponents =
      BottomNavigationFragment_Module_ContributeInjector.BottomNavigationFragmentSubcomponent.class
)
public abstract class BottomNavigationFragment_Module_ContributeInjector {
  private BottomNavigationFragment_Module_ContributeInjector() {}

  @Binds
  @IntoMap
  @ClassKey(BottomNavigationFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      BottomNavigationFragmentSubcomponent.Factory builder);

  @Subcomponent
  @FragmentScope
  public interface BottomNavigationFragmentSubcomponent
      extends AndroidInjector<BottomNavigationFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<BottomNavigationFragment> {}
  }
}
