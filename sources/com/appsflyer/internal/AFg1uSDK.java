package com.appsflyer.internal;

import android.content.Context;
import androidx.annotation.NonNull;
import com.appsflyer.lvl.AppsFlyerLVL;

/* loaded from: classes.dex */
public final class AFg1uSDK {

    /* loaded from: classes.dex */
    public interface AFa1zSDK {
        void AFInAppEventType(String str, Exception exc);

        void AFInAppEventType(@NonNull String str, @NonNull String str2);
    }

    public final boolean AFKeystoreWrapper(long j10, @NonNull Context context, @NonNull final AFa1zSDK aFa1zSDK) {
        try {
            AppsFlyerLVL.checkLicense(j10, context, new AppsFlyerLVL.resultListener() { // from class: com.appsflyer.internal.AFg1uSDK.2
                @Override // com.appsflyer.lvl.AppsFlyerLVL.resultListener
                public final void onLvlFailure(Exception exc) {
                    aFa1zSDK.AFInAppEventType("onLvlFailure with exception", exc);
                }

                @Override // com.appsflyer.lvl.AppsFlyerLVL.resultListener
                public final void onLvlResult(String str, String str2) {
                    if (str != null && str2 != null) {
                        aFa1zSDK.AFInAppEventType(str, str2);
                    } else if (str2 == null) {
                        aFa1zSDK.AFInAppEventType("onLvlResult with error", new Exception("AFLVL Invalid signature"));
                    } else {
                        aFa1zSDK.AFInAppEventType("onLvlResult with error", new Exception("AFLVL Invalid signedData"));
                    }
                }
            });
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }
}
