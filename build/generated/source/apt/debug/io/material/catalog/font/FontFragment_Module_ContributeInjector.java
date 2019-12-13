package io.material.catalog.font;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import io.material.catalog.application.scope.FragmentScope;

@Module(subcomponents = FontFragment_Module_ContributeInjector.FontFragmentSubcomponent.class)
public abstract class FontFragment_Module_ContributeInjector {
  private FontFragment_Module_ContributeInjector() {}

  @Binds
  @IntoMap
  @ClassKey(FontFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      FontFragmentSubcomponent.Factory builder);

  @Subcomponent
  @FragmentScope
  public interface FontFragmentSubcomponent extends AndroidInjector<FontFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<FontFragment> {}
  }
}
