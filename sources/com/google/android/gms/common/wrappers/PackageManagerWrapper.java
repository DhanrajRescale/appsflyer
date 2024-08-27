package com.google.android.gms.common.wrappers;

import android.annotation.TargetApi;
import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Binder;
import android.os.Process;
import androidx.annotation.NonNull;
import c4.d;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.util.PlatformVersion;

@KeepForSdk
/* loaded from: classes2.dex */
public class PackageManagerWrapper {

    @NonNull
    protected final Context zza;

    public PackageManagerWrapper(@NonNull Context context) {
        this.zza = context;
    }

    @KeepForSdk
    public int checkCallingOrSelfPermission(@NonNull String str) {
        return this.zza.checkCallingOrSelfPermission(str);
    }

    @KeepForSdk
    public int checkPermission(@NonNull String str, @NonNull String str2) {
        return this.zza.getPackageManager().checkPermission(str, str2);
    }

    @NonNull
    @KeepForSdk
    public ApplicationInfo getApplicationInfo(@NonNull String str, int i10) throws PackageManager.NameNotFoundException {
        return this.zza.getPackageManager().getApplicationInfo(str, i10);
    }

    @NonNull
    @KeepForSdk
    public CharSequence getApplicationLabel(@NonNull String str) throws PackageManager.NameNotFoundException {
        return this.zza.getPackageManager().getApplicationLabel(this.zza.getPackageManager().getApplicationInfo(str, 0));
    }

    @NonNull
    @KeepForSdk
    public d getApplicationLabelAndIcon(@NonNull String str) throws PackageManager.NameNotFoundException {
        ApplicationInfo applicationInfo = this.zza.getPackageManager().getApplicationInfo(str, 0);
        return new d(this.zza.getPackageManager().getApplicationLabel(applicationInfo), this.zza.getPackageManager().getApplicationIcon(applicationInfo));
    }

    @NonNull
    @KeepForSdk
    public PackageInfo getPackageInfo(@NonNull String str, int i10) throws PackageManager.NameNotFoundException {
        return this.zza.getPackageManager().getPackageInfo(str, i10);
    }

    @KeepForSdk
    public boolean isCallerInstantApp() {
        String nameForUid;
        boolean isInstantApp;
        if (Binder.getCallingUid() == Process.myUid()) {
            return InstantApps.isInstantApp(this.zza);
        }
        if (PlatformVersion.isAtLeastO() && (nameForUid = this.zza.getPackageManager().getNameForUid(Binder.getCallingUid())) != null) {
            isInstantApp = this.zza.getPackageManager().isInstantApp(nameForUid);
            return isInstantApp;
        }
        return false;
    }

    @TargetApi(19)
    public final boolean zza(int i10, @NonNull String str) {
        if (PlatformVersion.isAtLeastKitKat()) {
            try {
                AppOpsManager appOpsManager = (AppOpsManager) this.zza.getSystemService("appops");
                if (appOpsManager != null) {
                    appOpsManager.checkPackage(i10, str);
                    return true;
                }
                throw new NullPointerException("context.getSystemService(Context.APP_OPS_SERVICE) is null");
            } catch (SecurityException unused) {
                return false;
            }
        }
        String[] packagesForUid = this.zza.getPackageManager().getPackagesForUid(i10);
        if (str != null && packagesForUid != null) {
            for (String str2 : packagesForUid) {
                if (str.equals(str2)) {
                    return true;
                }
            }
        }
        return false;
    }
}
