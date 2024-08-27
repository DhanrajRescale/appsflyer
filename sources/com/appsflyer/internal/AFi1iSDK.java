package com.appsflyer.internal;

import android.content.ContentProviderClient;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.net.Uri;
import com.appsflyer.AFLogger;

/* loaded from: classes.dex */
public final class AFi1iSDK extends AFi1hSDK {
    final ProviderInfo AFInAppEventType;
    private final AFd1kSDK valueOf;

    public AFi1iSDK(ProviderInfo providerInfo, Runnable runnable, AFd1kSDK aFd1kSDK) {
        super("af_referrer", providerInfo.authority, runnable);
        this.valueOf = aFd1kSDK;
        this.AFInAppEventType = providerInfo;
    }

    public static ContentProviderClient AFInAppEventParameterName(Context context, Uri uri) {
        try {
            return context.getContentResolver().acquireUnstableContentProviderClient(uri);
        } catch (SecurityException e10) {
            AFLogger.INSTANCE.e(AFg1aSDK.PREINSTALL, "Failed to acquire unstable content providerClient due to SecurityException", e10, false);
            return null;
        } catch (Throwable th2) {
            AFLogger.INSTANCE.e(AFg1aSDK.PREINSTALL, "Failed to acquire unstable content providerClient due to unexpected throwable", th2, false);
            return null;
        }
    }

    @Override // com.appsflyer.internal.AFi1hSDK
    public final void values(final Context context) {
        this.valueOf.values().execute(new Runnable() { // from class: com.appsflyer.internal.AFi1iSDK.1
            /* JADX WARN: Removed duplicated region for block: B:23:0x00d3  */
            /* JADX WARN: Removed duplicated region for block: B:9:0x008c  */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void run() {
                /*
                    Method dump skipped, instructions count: 277
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFi1iSDK.AnonymousClass1.run():void");
            }
        });
    }
}
