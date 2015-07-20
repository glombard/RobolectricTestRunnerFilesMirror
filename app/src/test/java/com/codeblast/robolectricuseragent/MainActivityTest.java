package com.codeblast.robolectricuseragent;

import android.webkit.WebSettings;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.RuntimeEnvironment;
import org.robolectric.annotation.Config;

import static org.junit.Assert.assertTrue;

@RunWith(RobolectricTestRunner.class)
@Config(sdk = 17)
public class MainActivityTest {
  @Test
  public void testGetDefaultUserAgent() {
    final String defaultUserAgent = WebSettings.getDefaultUserAgent(RuntimeEnvironment.application);
    assertTrue(true);
  }
}