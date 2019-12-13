package io.material.catalog.menu;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import io.material.catalog.application.scope.FragmentScope;

@Module(subcomponents = MenuFragment_Module_ContributeInjector.MenuFragmentSubcomponent.class)
public abstract class MenuFragment_Module_ContributeInjector {
  private MenuFragment_Module_ContributeInjector() {}

  @Binds
  @IntoMap
  @ClassKey(MenuFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      MenuFragmentSubcomponent.Factory builder);

  @Subcomponent
  @FragmentScope
  public interface MenuFragmentSubcomponent extends AndroidInjector<MenuFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<MenuFragment> {}
  }
}
