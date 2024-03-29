// Generated by Dagger (https://dagger.dev).
package io.material.catalog.bottomappbar;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import io.material.catalog.feature.FeatureDemo;

public final class BottomAppBarFragment_Module_ProvideFeatureDemoFactory implements Factory<FeatureDemo> {
  private static final BottomAppBarFragment_Module_ProvideFeatureDemoFactory INSTANCE = new BottomAppBarFragment_Module_ProvideFeatureDemoFactory();

  @Override
  public FeatureDemo get() {
    return provideFeatureDemo();
  }

  public static BottomAppBarFragment_Module_ProvideFeatureDemoFactory create() {
    return INSTANCE;
  }

  public static FeatureDemo provideFeatureDemo() {
    return Preconditions.checkNotNull(BottomAppBarFragment.Module.provideFeatureDemo(), "Cannot return null from a non-@Nullable @Provides method");
  }
}
