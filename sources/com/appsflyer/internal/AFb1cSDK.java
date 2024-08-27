package com.appsflyer.internal;

import android.os.Build;
import com.appsflyer.AFKeystoreWrapper;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import java.security.KeyStoreException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\n\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0011\u0010\f\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0004\b\f\u0010\u000b"}, d2 = {"Lcom/appsflyer/internal/AFb1cSDK;", HttpUrl.FRAGMENT_ENCODE_SET, "Lcom/appsflyer/internal/AFd1lSDK;", "p0", "Lcom/appsflyer/internal/AFd1qSDK;", "p1", HttpUrl.FRAGMENT_ENCODE_SET, "valueOf", "(Lcom/appsflyer/internal/AFd1lSDK;Lcom/appsflyer/internal/AFd1qSDK;)V", HttpUrl.FRAGMENT_ENCODE_SET, "AFInAppEventType", "()Ljava/lang/String;", "AFKeystoreWrapper", "<init>", "()V"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AFb1cSDK {

    @NotNull
    public static final AFb1cSDK INSTANCE = new AFb1cSDK();

    private AFb1cSDK() {
    }

    public static String AFInAppEventType() {
        return AppsFlyerProperties.getInstance().getString("KSAppsFlyerId");
    }

    public static String AFKeystoreWrapper() {
        return AppsFlyerProperties.getInstance().getString("KSAppsFlyerRICounter");
    }

    public static final void valueOf(@NotNull AFd1lSDK p02, @NotNull AFd1qSDK p12) {
        int i10;
        Intrinsics.checkNotNullParameter(p02, "");
        Intrinsics.checkNotNullParameter(p12, "");
        AppsFlyerProperties appsFlyerProperties = AppsFlyerProperties.getInstance();
        if (AFb1uSDK.AFInAppEventParameterName()) {
            AFLogger.afRDLog("OPPO device found");
            i10 = 23;
        } else {
            i10 = 18;
        }
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= i10 && !appsFlyerProperties.getBoolean(AppsFlyerProperties.DISABLE_KEYSTORE, true)) {
            StringBuilder sb2 = new StringBuilder("OS SDK is=");
            sb2.append(i11);
            sb2.append("; use KeyStore");
            AFLogger.afRDLog(sb2.toString());
            AFKeystoreWrapper aFKeystoreWrapper = new AFKeystoreWrapper(p02.AFKeystoreWrapper);
            if (!aFKeystoreWrapper.AFInAppEventParameterName()) {
                aFKeystoreWrapper.AFKeystoreWrapper = AFb1kSDK.valueOf(p02, p12);
                aFKeystoreWrapper.AFInAppEventType = 0;
                aFKeystoreWrapper.AFInAppEventParameterName(aFKeystoreWrapper.AFKeystoreWrapper());
            } else {
                String AFKeystoreWrapper = aFKeystoreWrapper.AFKeystoreWrapper();
                synchronized (aFKeystoreWrapper.valueOf) {
                    aFKeystoreWrapper.AFInAppEventType++;
                    AFLogger.afInfoLog("Deleting key with alias: ".concat(String.valueOf(AFKeystoreWrapper)));
                    try {
                        synchronized (aFKeystoreWrapper.valueOf) {
                            aFKeystoreWrapper.AFInAppEventParameterName.deleteEntry(AFKeystoreWrapper);
                        }
                    } catch (KeyStoreException e10) {
                        StringBuilder sb3 = new StringBuilder("Exception ");
                        sb3.append(e10.getMessage());
                        sb3.append(" occurred");
                        AFLogger.afErrorLog(sb3.toString(), e10);
                    }
                }
                aFKeystoreWrapper.AFInAppEventParameterName(aFKeystoreWrapper.AFKeystoreWrapper());
            }
            appsFlyerProperties.set("KSAppsFlyerId", aFKeystoreWrapper.AFInAppEventType());
            appsFlyerProperties.set("KSAppsFlyerRICounter", String.valueOf(aFKeystoreWrapper.values()));
            return;
        }
        StringBuilder sb4 = new StringBuilder("OS SDK is=");
        sb4.append(i11);
        sb4.append("; no KeyStore usage");
        AFLogger.afRDLog(sb4.toString());
    }
}
