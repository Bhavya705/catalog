package io.material.catalog.shapetheming;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import io.material.catalog.application.scope.FragmentScope;

@Module(
  subcomponents =
      ShapeThemingFragment_Module_ContributeInjector.ShapeThemingFragmentSubcomponent.class
)
public abstract class ShapeThemingFragment_Module_ContributeInjector {
  private ShapeThemingFragment_Module_ContributeInjector() {}

  @Binds
  @IntoMap
  @ClassKey(ShapeThemingFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      ShapeThemingFragmentSubcomponent.Factory builder);

  @Subcomponent
  @FragmentScope
  public interface ShapeThemingFragmentSubcomponent extends AndroidInjector<ShapeThemingFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<ShapeThemingFragment> {}
  }
}
