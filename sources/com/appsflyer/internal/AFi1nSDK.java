package com.appsflyer.internal;

import android.content.Context;
import com.appsflyer.AFLogger;

/* loaded from: classes.dex */
public final class AFi1nSDK extends AFi1rSDK {
    private final AFd1kSDK AFInAppEventType;
    private final AFi1mSDK valueOf;

    public AFi1nSDK(Runnable runnable, AFd1kSDK aFd1kSDK, AFi1mSDK aFi1mSDK) {
        super("store", "huawei", aFd1kSDK.AFInAppEventType(), runnable);
        this.AFInAppEventType = aFd1kSDK;
        this.valueOf = aFi1mSDK;
    }

    private boolean AFInAppEventType(Context context) {
        if (!valueOf()) {
            AFLogger.INSTANCE.d(AFg1aSDK.REFERRER, "Huawei referrer collection disallowed by counter.");
            return false;
        }
        if (!this.valueOf.AFInAppEventParameterName(context)) {
            AFLogger.INSTANCE.d(AFg1aSDK.REFERRER, "Huawei referrer collection disallowed by missing content provider.");
            return false;
        }
        if (!this.valueOf.valueOf(context)) {
            AFLogger.INSTANCE.d(AFg1aSDK.REFERRER, "Huawei referrer collection disallowed by invalid content provider.");
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0105, code lost:
    
        values();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0108, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0102, code lost:
    
        if (0 == 0) goto L66;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ void valueOf(android.content.Context r12) {
        /*
            Method dump skipped, instructions count: 271
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFi1nSDK.valueOf(android.content.Context):void");
    }

    @Override // com.appsflyer.internal.AFi1hSDK
    public final void values(Context context) {
        if (!AFInAppEventType(context)) {
            return;
        }
        this.AFInAppEventType.values().execute(new h(3, this, context));
    }
}
