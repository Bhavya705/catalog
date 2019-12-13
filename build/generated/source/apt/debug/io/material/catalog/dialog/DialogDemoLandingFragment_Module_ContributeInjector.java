package io.material.catalog.dialog;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import io.material.catalog.application.scope.FragmentScope;

@Module(
  subcomponents =
      DialogDemoLandingFragment_Module_ContributeInjector.DialogDemoLandingFragmentSubcomponent
          .class
)
public abstract class DialogDemoLandingFragment_Module_ContributeInjector {
  private DialogDemoLandingFragment_Module_ContributeInjector() {}

  @Binds
  @IntoMap
  @ClassKey(DialogDemoLandingFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      DialogDemoLandingFragmentSubcomponent.Factory builder);

  @Subcomponent
  @FragmentScope
  public interface DialogDemoLandingFragmentSubcomponent
      extends AndroidInjector<DialogDemoLandingFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<DialogDemoLandingFragment> {}
  }
}
