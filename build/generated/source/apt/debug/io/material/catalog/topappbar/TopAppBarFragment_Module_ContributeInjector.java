package io.material.catalog.topappbar;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import io.material.catalog.application.scope.FragmentScope;

@Module(
  subcomponents = TopAppBarFragment_Module_ContributeInjector.TopAppBarFragmentSubcomponent.class
)
public abstract class TopAppBarFragment_Module_ContributeInjector {
  private TopAppBarFragment_Module_ContributeInjector() {}

  @Binds
  @IntoMap
  @ClassKey(TopAppBarFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      TopAppBarFragmentSubcomponent.Factory builder);

  @Subcomponent
  @FragmentScope
  public interface TopAppBarFragmentSubcomponent extends AndroidInjector<TopAppBarFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<TopAppBarFragment> {}
  }
}
