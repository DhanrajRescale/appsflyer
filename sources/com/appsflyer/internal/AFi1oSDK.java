package com.appsflyer.internal;

import android.content.Context;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.os.Build;
import com.appsflyer.AFLogger;
import com.huawei.appgallery.serviceverifykit.api.ServiceVerifyKit;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class AFi1oSDK implements AFi1mSDK {
    private static ProviderInfo AFInAppEventType(Context context) {
        ProviderInfo resolveContentProvider;
        PackageManager.ComponentInfoFlags of2;
        try {
            if (Build.VERSION.SDK_INT >= 33) {
                PackageManager packageManager = context.getPackageManager();
                of2 = PackageManager.ComponentInfoFlags.of(0L);
                resolveContentProvider = packageManager.resolveContentProvider("com.huawei.appmarket.commondata", of2);
            } else {
                resolveContentProvider = context.getPackageManager().resolveContentProvider("com.huawei.appmarket.commondata", 0);
            }
            return resolveContentProvider;
        } catch (Throwable th2) {
            AFLogger aFLogger = AFLogger.INSTANCE;
            AFg1aSDK aFg1aSDK = AFg1aSDK.REFERRER;
            String message = th2.getMessage();
            if (message == null) {
                message = HttpUrl.FRAGMENT_ENCODE_SET;
            }
            AFg1fSDK.e$default(aFLogger, aFg1aSDK, message, th2, false, false, false, false, 96, null);
            return null;
        }
    }

    @Override // com.appsflyer.internal.AFi1mSDK
    public final boolean AFInAppEventParameterName(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        if (AFInAppEventType(context) != null) {
            return true;
        }
        return false;
    }

    @Override // com.appsflyer.internal.AFi1mSDK
    public final boolean valueOf(@NotNull Context context) {
        String str;
        Intrinsics.checkNotNullParameter(context, "");
        ProviderInfo AFInAppEventType = AFInAppEventType(context);
        if (AFInAppEventType == null) {
            return false;
        }
        try {
            return new ServiceVerifyKit.PkgVerifyBuilder(context).setPackageName(((PackageItemInfo) AFInAppEventType).packageName).setCertChainKey("com.huawei.appgallery.sign_certchain").setCertSignerKey("com.huawei.appgallery.fingerprint_signature").addLegacyInfo("com.huawei.appmarket", "FFE391E0EA186D0734ED601E4E70E3224B7309D48E2075BAC46D8C667EAE7212").addLegacyInfo("com.huawei.appmarket", "3BAF59A2E5331C30675FAB35FF5FFF0D116142D3D4664F1C3CB804068B40614F").isValidPkg();
        } catch (Throwable th2) {
            AFLogger aFLogger = AFLogger.INSTANCE;
            AFg1aSDK aFg1aSDK = AFg1aSDK.REFERRER;
            String message = th2.getMessage();
            if (message == null) {
                str = HttpUrl.FRAGMENT_ENCODE_SET;
            } else {
                str = message;
            }
            AFg1fSDK.e$default(aFLogger, aFg1aSDK, str, th2, false, false, false, false, 96, null);
            return false;
        }
    }
}
