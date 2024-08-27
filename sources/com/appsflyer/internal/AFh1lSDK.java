package com.appsflyer.internal;

import com.appsflyer.AFInAppEventType;

/* loaded from: classes.dex */
public final class AFh1lSDK extends AFh1kSDK {
    public AFh1lSDK() {
        super(AFInAppEventType.PURCHASE, Boolean.TRUE);
    }

    @Override // com.appsflyer.internal.AFa1qSDK
    public final AFa1qSDK valueOf(String str) {
        return super.valueOf(AFa1qSDK.AFInAppEventType(str));
    }

    @Override // com.appsflyer.internal.AFa1qSDK
    public final AFf1zSDK values() {
        return AFf1zSDK.PURCHASE_VALIDATE;
    }
}
