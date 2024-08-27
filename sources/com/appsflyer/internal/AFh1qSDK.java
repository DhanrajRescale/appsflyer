package com.appsflyer.internal;

/* loaded from: classes.dex */
public final class AFh1qSDK extends AFa1qSDK {

    /* renamed from: v, reason: collision with root package name */
    public final AFf1zSDK f8499v;

    @Deprecated
    public AFh1qSDK() {
        this.f8499v = null;
    }

    @Override // com.appsflyer.internal.AFa1qSDK
    public final AFf1zSDK values() {
        AFf1zSDK aFf1zSDK = this.f8499v;
        if (aFf1zSDK != null) {
            return aFf1zSDK;
        }
        return AFf1zSDK.CACHED_EVENT;
    }

    public AFh1qSDK(String str, byte[] bArr, String str2, AFf1zSDK aFf1zSDK) {
        super(null, str, Boolean.FALSE);
        this.AFKeystoreWrapper = str2;
        AFInAppEventType(bArr);
        this.f8499v = aFf1zSDK;
    }
}
