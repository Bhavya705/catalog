// Generated by Dagger (https://dagger.dev).
package io.material.catalog.tableofcontents;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import io.material.catalog.themeswitcher.ThemeSwitcherResourceProvider;

public final class TocModule_ProvideThemeSwitcherResourceProviderFactory implements Factory<ThemeSwitcherResourceProvider> {
  private static final TocModule_ProvideThemeSwitcherResourceProviderFactory INSTANCE = new TocModule_ProvideThemeSwitcherResourceProviderFactory();

  @Override
  public ThemeSwitcherResourceProvider get() {
    return provideThemeSwitcherResourceProvider();
  }

  public static TocModule_ProvideThemeSwitcherResourceProviderFactory create() {
    return INSTANCE;
  }

  public static ThemeSwitcherResourceProvider provideThemeSwitcherResourceProvider() {
    return Preconditions.checkNotNull(TocModule.provideThemeSwitcherResourceProvider(), "Cannot return null from a non-@Nullable @Provides method");
  }
}
