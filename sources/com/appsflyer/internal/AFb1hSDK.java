package com.appsflyer.internal;

import com.appsflyer.AFLogger;

@Deprecated
/* loaded from: classes.dex */
public final class AFb1hSDK {
    private final AFa1ySDK AFKeystoreWrapper = new AFa1ySDK() { // from class: com.appsflyer.internal.AFb1hSDK.5
        @Override // com.appsflyer.internal.AFb1hSDK.AFa1ySDK
        public final Class<?> valueOf(String str) throws ClassNotFoundException {
            return Class.forName(str);
        }
    };

    /* loaded from: classes.dex */
    public enum AFa1uSDK {
        ADOBE_AIR("android_adobe_air", "com.appsflyer.adobeair.AppsFlyerExtension"),
        ADOBE_MOBILE_SDK("android_adobe_mobile", "com.appsflyer.adobeextension.AppsFlyerAdobeExtension"),
        COCOS2DX("android_cocos2dx", "org.cocos2dx.lib.Cocos2dxActivity"),
        CORDOVA("android_cordova", "com.appsflyer.cordova.plugin.AppsFlyerPlugin"),
        DEFAULT("android_native", "android_native"),
        FLUTTER("android_flutter", "com.appsflyer.appsflyersdk.AppsflyerSdkPlugin"),
        M_PARTICLE("android_mparticle", "com.mparticle.kits.AppsFlyerKit"),
        NATIVE_SCRIPT("android_native_script", "com.tns.NativeScriptActivity"),
        EXPO("android_expo", "expo.modules.devmenu.react.DevMenuAwareReactActivity"),
        REACT_NATIVE("android_reactNative", "com.appsflyer.reactnative.RNAppsFlyerModule"),
        UNITY("android_unity", "com.appsflyer.unity.AppsFlyerAndroidWrapper"),
        UNREAL_ENGINE("android_unreal", "com.epicgames.ue4.GameActivity"),
        XAMARIN("android_xamarin", "mono.android.Runtime"),
        CAPACITOR("android_capacitor", "capacitor.plugin.appsflyer.sdk.AppsFlyerPlugin");

        private final String afErrorLog;
        private final String force;

        AFa1uSDK(String str, String str2) {
            this.force = str;
            this.afErrorLog = str2;
        }
    }

    /* loaded from: classes.dex */
    public interface AFa1ySDK {
        Class<?> valueOf(String str) throws ClassNotFoundException;
    }

    public final String valueOf() {
        for (AFa1uSDK aFa1uSDK : AFa1uSDK.values()) {
            if (valueOf(aFa1uSDK.afErrorLog)) {
                return aFa1uSDK.force;
            }
        }
        return AFa1uSDK.DEFAULT.force;
    }

    private boolean valueOf(String str) {
        try {
            this.AFKeystoreWrapper.valueOf(str);
            StringBuilder sb2 = new StringBuilder("Class: ");
            sb2.append(str);
            sb2.append(" is found.");
            AFLogger.afRDLog(sb2.toString());
            return true;
        } catch (ClassNotFoundException e10) {
            StringBuilder sb3 = new StringBuilder("Class: ");
            sb3.append(str);
            sb3.append(" is  not found. (Platform extension)");
            AFLogger.afErrorLogForExcManagerOnly(sb3.toString(), e10, true);
            return false;
        } catch (Throwable th2) {
            AFLogger.afErrorLog(th2.getMessage(), th2);
            return false;
        }
    }
}
