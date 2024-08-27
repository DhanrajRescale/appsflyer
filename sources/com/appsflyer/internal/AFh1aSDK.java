package com.appsflyer.internal;

import androidx.annotation.NonNull;

/* loaded from: classes.dex */
public final class AFh1aSDK {
    public final int AFInAppEventParameterName;
    public final String AFInAppEventType;
    public final long AFKeystoreWrapper;

    /* renamed from: e, reason: collision with root package name */
    public final AFh1bSDK f8497e;
    public final String registerClient;
    public final Throwable unregisterClient;

    @NonNull
    public final String valueOf;
    public final long values;

    public AFh1aSDK(String str, @NonNull String str2, long j10, long j11, int i10, AFh1bSDK aFh1bSDK, String str3, Throwable th2) {
        this.AFInAppEventType = str;
        this.valueOf = str2;
        this.values = j10;
        this.AFKeystoreWrapper = j11;
        this.AFInAppEventParameterName = i10;
        this.f8497e = aFh1bSDK;
        this.registerClient = str3;
        this.unregisterClient = th2;
    }
}
