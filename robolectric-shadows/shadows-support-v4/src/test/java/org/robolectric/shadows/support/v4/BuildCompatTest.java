package org.robolectric.shadows.support.v4;

import android.os.Build;
import android.support.v4.os.BuildCompat;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.annotation.Config;
import org.robolectric.util.TestRunnerWithManifest;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(TestRunnerWithManifest.class)
public class BuildCompatTest {

  @Test
  @Config(maxSdk = Build.VERSION_CODES.M)
  public void isAtLeastN_preN() {
    assertThat(BuildCompat.isAtLeastN()).isFalse();
  }

  @Test
  @Config(minSdk = Build.VERSION_CODES.N)
  public void isAtLeastN() {
    assertThat(BuildCompat.isAtLeastN()).isTrue();
  }

  @Test
  @Config(minSdk = Build.VERSION_CODES.N_MR1)
  public void isAtLeastNMR1() {
    assertThat(BuildCompat.isAtLeastNMR1()).isTrue();
  }

  @Test
  @Config(minSdk = Build.VERSION_CODES.O)
  public void isAtLeastO() {
    assertThat(BuildCompat.isAtLeastO()).isTrue();
  }
}
