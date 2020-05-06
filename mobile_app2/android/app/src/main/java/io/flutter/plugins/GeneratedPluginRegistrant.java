package io.flutter.plugins;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.embedding.engine.plugins.shim.ShimPluginRegistry;

/**
 * Generated file. Do not edit.
 * This file is generated by the Flutter tool based on the
 * plugins that support the Android platform.
 */
@Keep
public final class GeneratedPluginRegistrant {
  public static void registerWith(@NonNull FlutterEngine flutterEngine) {
    ShimPluginRegistry shimPluginRegistry = new ShimPluginRegistry(flutterEngine);
      io.flutter.plugins.googlemaps.GoogleMapsPlugin.registerWith(shimPluginRegistry.registrarFor("io.flutter.plugins.googlemaps.GoogleMapsPlugin"));
      com.lyokone.location.LocationPlugin.registerWith(shimPluginRegistry.registrarFor("com.lyokone.location.LocationPlugin"));
      io.flutter.plugins.urllauncher.UrlLauncherPlugin.registerWith(shimPluginRegistry.registrarFor("io.flutter.plugins.urllauncher.UrlLauncherPlugin"));
  }
}
