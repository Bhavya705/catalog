package io.material.catalog.tableofcontents;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import io.material.catalog.application.scope.FragmentScope;

@Module(subcomponents = TocModule_ContributeTocFragment.TocFragmentSubcomponent.class)
public abstract class TocModule_ContributeTocFragment {
  private TocModule_ContributeTocFragment() {}

  @Binds
  @IntoMap
  @ClassKey(TocFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      TocFragmentSubcomponent.Factory builder);

  @Subcomponent
  @FragmentScope
  public interface TocFragmentSubcomponent extends AndroidInjector<TocFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<TocFragment> {}
  }
}
