// Generated by Dagger (https://dagger.dev).
package io.material.catalog.checkbox;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import io.material.catalog.feature.FeatureDemo;

public final class CheckBoxFragment_Module_ProvideFeatureDemoFactory implements Factory<FeatureDemo> {
  private static final CheckBoxFragment_Module_ProvideFeatureDemoFactory INSTANCE = new CheckBoxFragment_Module_ProvideFeatureDemoFactory();

  @Override
  public FeatureDemo get() {
    return provideFeatureDemo();
  }

  public static CheckBoxFragment_Module_ProvideFeatureDemoFactory create() {
    return INSTANCE;
  }

  public static FeatureDemo provideFeatureDemo() {
    return Preconditions.checkNotNull(CheckBoxFragment.Module.provideFeatureDemo(), "Cannot return null from a non-@Nullable @Provides method");
  }
}
