package com.appsflyer.internal;

import androidx.annotation.NonNull;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class AFe1nSDK {
    public boolean AFInAppEventParameterName;

    @NonNull
    final String AFInAppEventType;
    public boolean AFKeystoreWrapper;
    private final boolean AFLogger;

    /* renamed from: d, reason: collision with root package name */
    private boolean f8431d;

    /* renamed from: e, reason: collision with root package name */
    private final byte[] f8432e;
    public int registerClient;
    private final boolean unregisterClient;

    @NonNull
    final Map<String, String> valueOf;

    @NonNull
    public final String values;

    public AFe1nSDK(@NonNull String str, byte[] bArr, @NonNull String str2, @NonNull Map<String, String> map, boolean z10) {
        this(str, bArr, str2, map, z10, (byte) 0);
    }

    public final byte[] AFInAppEventParameterName() {
        return this.f8432e;
    }

    public final boolean AFInAppEventType() {
        return this.unregisterClient;
    }

    public final boolean AFKeystoreWrapper() {
        return this.AFInAppEventParameterName;
    }

    public final boolean unregisterClient() {
        return this.AFKeystoreWrapper;
    }

    public final boolean valueOf() {
        return this.f8431d;
    }

    public final boolean values() {
        return this.AFLogger;
    }

    private AFe1nSDK(@NonNull String str, byte[] bArr, @NonNull String str2, @NonNull Map<String, String> map, boolean z10, byte b10) {
        this.f8431d = true;
        this.AFInAppEventParameterName = false;
        this.AFKeystoreWrapper = true;
        this.registerClient = -1;
        this.values = str;
        this.f8432e = bArr;
        this.AFInAppEventType = str2;
        this.valueOf = map;
        this.AFLogger = z10;
        this.unregisterClient = true;
    }

    public AFe1nSDK(@NonNull String str, @NonNull String str2) {
        this(str, null, str2, new HashMap(), false);
    }
}
