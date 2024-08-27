package com.appsflyer.internal;

/* loaded from: classes.dex */
public abstract class AFh1pSDK extends AFa1qSDK {
    private final boolean afInfoLog;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f8498i;

    public AFh1pSDK() {
        this(null, null, null);
    }

    public AFh1pSDK(String str, Boolean bool, Boolean bool2) {
        super(str, null, Boolean.valueOf(bool2 != null ? bool2.booleanValue() : false));
        this.afInfoLog = bool != null ? bool.booleanValue() : true;
        this.f8498i = true;
    }
}
