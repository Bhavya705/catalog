package io.material.catalog.card;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import io.material.catalog.application.scope.FragmentScope;

@Module(subcomponents = CardFragment_Module_ContributeInjector.CardFragmentSubcomponent.class)
public abstract class CardFragment_Module_ContributeInjector {
  private CardFragment_Module_ContributeInjector() {}

  @Binds
  @IntoMap
  @ClassKey(CardFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      CardFragmentSubcomponent.Factory builder);

  @Subcomponent
  @FragmentScope
  public interface CardFragmentSubcomponent extends AndroidInjector<CardFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<CardFragment> {}
  }
}
