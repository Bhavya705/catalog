package io.material.catalog.transformation;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import io.material.catalog.application.scope.FragmentScope;

@Module(
  subcomponents =
      TransformationFragment_Module_ContributeInjector.TransformationFragmentSubcomponent.class
)
public abstract class TransformationFragment_Module_ContributeInjector {
  private TransformationFragment_Module_ContributeInjector() {}

  @Binds
  @IntoMap
  @ClassKey(TransformationFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      TransformationFragmentSubcomponent.Factory builder);

  @Subcomponent
  @FragmentScope
  public interface TransformationFragmentSubcomponent
      extends AndroidInjector<TransformationFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<TransformationFragment> {}
  }
}
