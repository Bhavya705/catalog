package io.material.catalog.button;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import io.material.catalog.application.scope.FragmentScope;

@Module(subcomponents = ButtonsFragment_Module_ContributeInjector.ButtonsFragmentSubcomponent.class)
public abstract class ButtonsFragment_Module_ContributeInjector {
  private ButtonsFragment_Module_ContributeInjector() {}

  @Binds
  @IntoMap
  @ClassKey(ButtonsFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      ButtonsFragmentSubcomponent.Factory builder);

  @Subcomponent
  @FragmentScope
  public interface ButtonsFragmentSubcomponent extends AndroidInjector<ButtonsFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<ButtonsFragment> {}
  }
}
