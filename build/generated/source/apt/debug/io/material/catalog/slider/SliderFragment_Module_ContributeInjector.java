package io.material.catalog.slider;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import io.material.catalog.application.scope.FragmentScope;

@Module(subcomponents = SliderFragment_Module_ContributeInjector.SliderFragmentSubcomponent.class)
public abstract class SliderFragment_Module_ContributeInjector {
  private SliderFragment_Module_ContributeInjector() {}

  @Binds
  @IntoMap
  @ClassKey(SliderFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      SliderFragmentSubcomponent.Factory builder);

  @Subcomponent
  @FragmentScope
  public interface SliderFragmentSubcomponent extends AndroidInjector<SliderFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<SliderFragment> {}
  }
}
