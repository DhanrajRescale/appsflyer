package com.webengage.sdk.android;

import android.content.Context;

/* loaded from: classes2.dex */
public class t {

    /* renamed from: a, reason: collision with root package name */
    static s f12671a;

    /* renamed from: b, reason: collision with root package name */
    static s f12672b;

    private static s a() {
        if (f12672b == null) {
            f12672b = new v();
        }
        return f12672b;
    }

    public static s a(Context context) {
        if (!com.webengage.sdk.android.utils.i.g() || !com.webengage.sdk.android.utils.i.c()) {
            Logger.w("WebEngage", "Unable to initialize location module");
            return a();
        }
        if (!com.webengage.sdk.android.utils.f.a("android.permission.ACCESS_FINE_LOCATION", context.getApplicationContext())) {
            Logger.w("WebEngage", "Location Tracking is enabled but location permission is not granted to application");
            return a();
        }
        if (f12671a == null) {
            f12671a = new u(context.getApplicationContext());
        }
        return f12671a;
    }
}
