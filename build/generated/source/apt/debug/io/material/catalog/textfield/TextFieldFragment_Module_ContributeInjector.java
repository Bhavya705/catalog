package io.material.catalog.textfield;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import io.material.catalog.application.scope.FragmentScope;

@Module(
  subcomponents = TextFieldFragment_Module_ContributeInjector.TextFieldFragmentSubcomponent.class
)
public abstract class TextFieldFragment_Module_ContributeInjector {
  private TextFieldFragment_Module_ContributeInjector() {}

  @Binds
  @IntoMap
  @ClassKey(TextFieldFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      TextFieldFragmentSubcomponent.Factory builder);

  @Subcomponent
  @FragmentScope
  public interface TextFieldFragmentSubcomponent extends AndroidInjector<TextFieldFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<TextFieldFragment> {}
  }
}
