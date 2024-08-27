package com.appsflyer.internal;

import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import defpackage.C$r8$backportedMethods$utility$String$2$corelib$joinArray;
import java.util.Arrays;
import okhttp3.HttpUrl;

/* loaded from: C:\Users\Admin\appsflyer\classes14.dex */
public final class AFc1gSDK$10209 {

    @NonNull
    private AFc1vSDK AFInAppEventType;

    @NonNull
    private final Uri values;

    public AFc1gSDK$10209(@NonNull Uri uri, @NonNull AFc1vSDK aFc1vSDK) {
        this.values = uri;
        this.AFInAppEventType = aFc1vSDK;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [com.appsflyer.internal.AFc1gSDK$10209$AFa1tSDK$30346] */
    public final AFc1gSDK$10209$AFa1tSDK$30346 AFInAppEventType() {
        final boolean valueOf = valueOf();
        final boolean z10 = AFInAppEventParameterName() || valueOf;
        return new Object(z10, valueOf) { // from class: com.appsflyer.internal.AFc1gSDK$10209$AFa1tSDK$30346
            private final boolean AFKeystoreWrapper;
            private final boolean valueOf;

            {
                this.AFKeystoreWrapper = z10;
                this.valueOf = valueOf;
            }

            public boolean AFInAppEventParameterName() {
                return this.AFKeystoreWrapper;
            }

            public boolean values() {
                return this.valueOf;
            }
        };
    }

    private boolean AFInAppEventParameterName() {
        String host = this.values.getHost();
        if (host.contains("onelink.me")) {
            return true;
        }
        String[] split = host.split("\\.");
        for (int length = split.length - 1; length >= 0; length--) {
            String AFKeystoreWrapper = AFb1lSDK.AFKeystoreWrapper(TextUtils.join("\u2063", new String[]{C$r8$backportedMethods$utility$String$2$corelib$joinArray.join(".", (CharSequence[]) Arrays.copyOfRange(split, length, split.length)), HttpUrl.FRAGMENT_ENCODE_SET}), "kUanvXCW2Jr02cj4hNT0");
            if ("f93c290dba450d7b55726d43f8d282f6094f0a5febfb0ce93cc911ff5efcb27e".equals(AFKeystoreWrapper) || "d2a26d98db908d6b3e7c164d4557d111a2b1e4ac2c36fc3ae19e91812e83c246".equals(AFKeystoreWrapper)) {
                return true;
            }
        }
        return false;
    }

    private boolean valueOf() {
        String[] strArr = this.AFInAppEventType.unregisterClient;
        if (strArr != null) {
            StringBuilder sb2 = new StringBuilder("Validate if link ");
            sb2.append(this.values);
            sb2.append(" belongs to custom domains: ");
            sb2.append(Arrays.asList(strArr));
            AFLogger.afRDLog(sb2.toString());
            for (String str : strArr) {
                if (this.values.getHost().contains(str) && !AFc1tSDK.values(str)) {
                    AFLogger.afDebugLog("Link matches custom domain: ".concat(String.valueOf(str)));
                    return true;
                }
            }
        }
        return false;
    }
}
