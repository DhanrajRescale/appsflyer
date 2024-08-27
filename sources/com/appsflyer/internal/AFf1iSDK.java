package com.appsflyer.internal;

import android.util.Base64;
import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import java.net.MalformedURLException;
import java.net.URL;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public final class AFf1iSDK extends AFf1nSDK<String> {
    private final AFh1qSDK unregisterClient;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public AFf1iSDK(@androidx.annotation.NonNull com.appsflyer.internal.AFh1qSDK r8, @androidx.annotation.NonNull com.appsflyer.internal.AFd1kSDK r9) {
        /*
            r7 = this;
            com.appsflyer.internal.AFf1zSDK r0 = r8.f8499v
            if (r0 == 0) goto L6
        L4:
            r2 = r0
            goto L9
        L6:
            com.appsflyer.internal.AFf1zSDK r0 = com.appsflyer.internal.AFf1zSDK.CACHED_EVENT
            goto L4
        L9:
            com.appsflyer.internal.AFf1zSDK r0 = com.appsflyer.internal.AFf1zSDK.RC_CDN
            com.appsflyer.internal.AFf1zSDK[] r3 = new com.appsflyer.internal.AFf1zSDK[]{r0}
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r8.AFKeystoreWrapper
            r0.append(r1)
            java.lang.String r1 = "-"
            r0.append(r1)
            java.lang.String r1 = AFInAppEventType(r8)
            r0.append(r1)
            java.lang.String r5 = r0.toString()
            java.lang.String r6 = r8.AFKeystoreWrapper
            r1 = r7
            r4 = r9
            r1.<init>(r2, r3, r4, r5, r6)
            r7.unregisterClient = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFf1iSDK.<init>(com.appsflyer.internal.AFh1qSDK, com.appsflyer.internal.AFd1kSDK):void");
    }

    private static String AFInAppEventType(AFh1qSDK aFh1qSDK) {
        try {
            return new URL(aFh1qSDK.registerClient).getHost();
        } catch (MalformedURLException unused) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
    }

    @Override // com.appsflyer.internal.AFf1nSDK
    public final AFe1sSDK<String> AFKeystoreWrapper(@NonNull String str) {
        String encodeToString = Base64.encodeToString(this.unregisterClient.AFKeystoreWrapper(), 2);
        AFLogger.afInfoLog("cached data: ".concat(String.valueOf(encodeToString)));
        ((AFf1nSDK) this).f8460e.valueOf(this.unregisterClient.registerClient, encodeToString);
        return ((AFf1nSDK) this).AFLogger.AFInAppEventType(this.unregisterClient);
    }

    @Override // com.appsflyer.internal.AFf1nSDK
    public final AppsFlyerRequestListener e() {
        return this.unregisterClient.values;
    }

    @Override // com.appsflyer.internal.AFf1nSDK
    public final boolean i() {
        return false;
    }

    @Override // com.appsflyer.internal.AFf1nSDK, com.appsflyer.internal.AFe1dSDK
    public final boolean valueOf() {
        ResponseNetwork responseNetwork;
        AFf1zSDK aFf1zSDK = this.unregisterClient.f8499v;
        if (aFf1zSDK == null) {
            aFf1zSDK = AFf1zSDK.CACHED_EVENT;
        }
        if ((aFf1zSDK == AFf1zSDK.ARS_VALIDATE && (responseNetwork = ((AFf1nSDK) this).registerClient) != null && responseNetwork.getStatusCode() == 424) || super.valueOf()) {
            return true;
        }
        return false;
    }
}
