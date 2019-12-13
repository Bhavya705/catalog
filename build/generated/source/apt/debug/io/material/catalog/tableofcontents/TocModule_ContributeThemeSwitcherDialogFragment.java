package io.material.catalog.tableofcontents;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import io.material.catalog.application.scope.FragmentScope;
import io.material.catalog.themeswitcher.ThemeSwitcherDialogFragment;

@Module(
  subcomponents =
      TocModule_ContributeThemeSwitcherDialogFragment.ThemeSwitcherDialogFragmentSubcomponent.class
)
public abstract class TocModule_ContributeThemeSwitcherDialogFragment {
  private TocModule_ContributeThemeSwitcherDialogFragment() {}

  @Binds
  @IntoMap
  @ClassKey(ThemeSwitcherDialogFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      ThemeSwitcherDialogFragmentSubcomponent.Factory builder);

  @Subcomponent
  @FragmentScope
  public interface ThemeSwitcherDialogFragmentSubcomponent
      extends AndroidInjector<ThemeSwitcherDialogFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<ThemeSwitcherDialogFragment> {}
  }
}
