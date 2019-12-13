package io.material.catalog.bottomsheet;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import io.material.catalog.application.scope.FragmentScope;

@Module(
  subcomponents =
      BottomSheetFragment_Module_ContributeInjector.BottomSheetFragmentSubcomponent.class
)
public abstract class BottomSheetFragment_Module_ContributeInjector {
  private BottomSheetFragment_Module_ContributeInjector() {}

  @Binds
  @IntoMap
  @ClassKey(BottomSheetFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      BottomSheetFragmentSubcomponent.Factory builder);

  @Subcomponent
  @FragmentScope
  public interface BottomSheetFragmentSubcomponent extends AndroidInjector<BottomSheetFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<BottomSheetFragment> {}
  }
}
