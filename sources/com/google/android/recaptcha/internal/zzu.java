package com.google.android.recaptcha.internal;

import android.content.Context;
import android.os.Build;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes2.dex */
public final class zzu {

    @NotNull
    public static final zzu zza = new zzu();

    @NotNull
    private static final String zzb = String.valueOf(Build.VERSION.SDK_INT);

    @NotNull
    private static final GoogleApiAvailabilityLight zzc = GoogleApiAvailabilityLight.getInstance();

    private zzu() {
    }

    @NotNull
    public static final String zza(@NotNull Context context) {
        int isGooglePlayServicesAvailable = zzc.isGooglePlayServicesAvailable(context);
        if (isGooglePlayServicesAvailable != 1 && isGooglePlayServicesAvailable != 3 && isGooglePlayServicesAvailable != 9) {
            return "ANDROID_ONPLAY";
        }
        return "ANDROID_OFFPLAY";
    }

    @NotNull
    public static final String zzb() {
        return zzb;
    }
}
