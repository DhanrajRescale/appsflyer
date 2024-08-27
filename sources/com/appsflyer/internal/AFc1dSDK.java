package com.appsflyer.internal;

import android.content.Context;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import com.appsflyer.AFLogger;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.util.Arrays;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public abstract class AFc1dSDK<T> {
    public final FutureTask<T> AFInAppEventParameterName = new FutureTask<>(new Callable<T>() { // from class: com.appsflyer.internal.AFc1dSDK.1
        @Override // java.util.concurrent.Callable
        public final T call() {
            if (AFc1dSDK.this.AFInAppEventParameterName()) {
                return (T) AFc1dSDK.this.AFKeystoreWrapper();
            }
            return null;
        }
    });
    public final AFd1kSDK AFInAppEventType;
    public final String AFKeystoreWrapper;
    public final Context valueOf;
    private final String[] values;

    public AFc1dSDK(Context context, AFd1kSDK aFd1kSDK, String str, String... strArr) {
        this.valueOf = context;
        this.AFKeystoreWrapper = str;
        this.values = strArr;
        this.AFInAppEventType = aFd1kSDK;
    }

    public final boolean AFInAppEventParameterName() {
        try {
            ProviderInfo resolveContentProvider = this.valueOf.getPackageManager().resolveContentProvider(this.AFKeystoreWrapper, 128);
            if (resolveContentProvider != null) {
                if (Arrays.asList(this.values).contains(AFb1uSDK.AFInAppEventParameterName(this.valueOf.getPackageManager(), ((PackageItemInfo) resolveContentProvider).packageName))) {
                    return true;
                }
            }
            return false;
        } catch (PackageManager.NameNotFoundException | NoSuchAlgorithmException | CertificateException e10) {
            AFLogger.afErrorLog(e10.getMessage(), e10, false, true);
            return false;
        }
    }

    public abstract T AFKeystoreWrapper();

    public T valueOf() {
        try {
            return this.AFInAppEventParameterName.get(500L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e10) {
            e = e10;
            AFLogger.afErrorLog(e.getMessage(), e, false, true);
            return null;
        } catch (ExecutionException e11) {
            e = e11;
            AFLogger.afErrorLog(e.getMessage(), e, false, true);
            return null;
        } catch (TimeoutException e12) {
            AFLogger.afErrorLog(e12.getMessage(), e12, false, false);
            return null;
        }
    }
}
