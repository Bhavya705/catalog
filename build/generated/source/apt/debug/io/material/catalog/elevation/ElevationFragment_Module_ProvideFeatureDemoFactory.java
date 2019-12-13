// Generated by Dagger (https://dagger.dev).
package io.material.catalog.elevation;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import io.material.catalog.feature.FeatureDemo;

public final class ElevationFragment_Module_ProvideFeatureDemoFactory implements Factory<FeatureDemo> {
  private static final ElevationFragment_Module_ProvideFeatureDemoFactory INSTANCE = new ElevationFragment_Module_ProvideFeatureDemoFactory();

  @Override
  public FeatureDemo get() {
    return provideFeatureDemo();
  }

  public static ElevationFragment_Module_ProvideFeatureDemoFactory create() {
    return INSTANCE;
  }

  public static FeatureDemo provideFeatureDemo() {
    return Preconditions.checkNotNull(ElevationFragment.Module.provideFeatureDemo(), "Cannot return null from a non-@Nullable @Provides method");
  }
}