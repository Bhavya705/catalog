package io.material.catalog.tabs;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import io.material.catalog.application.scope.FragmentScope;

@Module(subcomponents = TabsFragment_Module_ContributeInjector.TabsFragmentSubcomponent.class)
public abstract class TabsFragment_Module_ContributeInjector {
  private TabsFragment_Module_ContributeInjector() {}

  @Binds
  @IntoMap
  @ClassKey(TabsFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      TabsFragmentSubcomponent.Factory builder);

  @Subcomponent
  @FragmentScope
  public interface TabsFragmentSubcomponent extends AndroidInjector<TabsFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<TabsFragment> {}
  }
}
