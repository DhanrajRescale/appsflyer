package com.google.android.gms.common;

import android.annotation.TargetApi;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.UserManager;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.HideFirstParty;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.zzag;
import com.google.android.gms.common.util.ClientLibraryUtils;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.util.UidVerifier;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import in.juspay.hyper.constants.LogSubCategory;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

@ShowFirstParty
@KeepForSdk
/* loaded from: classes2.dex */
public class GooglePlayServicesUtilLight {

    @KeepForSdk
    static final int GMS_AVAILABILITY_NOTIFICATION_ID = 10436;

    @KeepForSdk
    static final int GMS_GENERAL_ERROR_NOTIFICATION_ID = 39789;

    @NonNull
    @KeepForSdk
    public static final String GOOGLE_PLAY_GAMES_PACKAGE = "com.google.android.play.games";

    @NonNull
    @KeepForSdk
    @Deprecated
    public static final String GOOGLE_PLAY_SERVICES_PACKAGE = "com.google.android.gms";

    @KeepForSdk
    @Deprecated
    public static final int GOOGLE_PLAY_SERVICES_VERSION_CODE = 12451000;

    @NonNull
    @KeepForSdk
    public static final String GOOGLE_PLAY_STORE_PACKAGE = "com.android.vending";

    @VisibleForTesting
    static boolean zza = false;
    private static boolean zzb = false;

    @VisibleForTesting
    @KeepForSdk
    static final AtomicBoolean sCanceledAvailabilityNotification = new AtomicBoolean();
    private static final AtomicBoolean zzc = new AtomicBoolean();

    @KeepForSdk
    public GooglePlayServicesUtilLight() {
    }

    @KeepForSdk
    @Deprecated
    public static void cancelAvailabilityErrorNotifications(@NonNull Context context) {
        if (sCanceledAvailabilityNotification.getAndSet(true)) {
            return;
        }
        try {
            NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
            if (notificationManager != null) {
                notificationManager.cancel(GMS_AVAILABILITY_NOTIFICATION_ID);
            }
        } catch (SecurityException unused) {
        }
    }

    @ShowFirstParty
    @KeepForSdk
    public static void enableUsingApkIndependentContext() {
        zzc.set(true);
    }

    @KeepForSdk
    @Deprecated
    public static void ensurePlayServicesAvailable(@NonNull Context context, int i10) throws GooglePlayServicesRepairableException, GooglePlayServicesNotAvailableException {
        int isGooglePlayServicesAvailable = GoogleApiAvailabilityLight.getInstance().isGooglePlayServicesAvailable(context, i10);
        if (isGooglePlayServicesAvailable != 0) {
            Intent errorResolutionIntent = GoogleApiAvailabilityLight.getInstance().getErrorResolutionIntent(context, isGooglePlayServicesAvailable, "e");
            Log.e("GooglePlayServicesUtil", "GooglePlayServices not available due to error " + isGooglePlayServicesAvailable);
            if (errorResolutionIntent == null) {
                throw new GooglePlayServicesNotAvailableException(isGooglePlayServicesAvailable);
            }
            throw new GooglePlayServicesRepairableException(isGooglePlayServicesAvailable, "Google Play Services not available", errorResolutionIntent);
        }
    }

    @ShowFirstParty
    @KeepForSdk
    @Deprecated
    public static int getApkVersion(@NonNull Context context) {
        try {
            return context.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            Log.w("GooglePlayServicesUtil", "Google Play services is missing.");
            return 0;
        }
    }

    @ShowFirstParty
    @KeepForSdk
    @Deprecated
    public static int getClientVersion(@NonNull Context context) {
        Preconditions.checkState(true);
        return ClientLibraryUtils.getClientVersion(context, context.getPackageName());
    }

    @KeepForSdk
    @Deprecated
    public static PendingIntent getErrorPendingIntent(int i10, @NonNull Context context, int i11) {
        return GoogleApiAvailabilityLight.getInstance().getErrorResolutionPendingIntent(context, i10, i11);
    }

    @NonNull
    @VisibleForTesting
    @Deprecated
    @KeepForSdk
    public static String getErrorString(int i10) {
        return ConnectionResult.zza(i10);
    }

    @ShowFirstParty
    @KeepForSdk
    @Deprecated
    public static Intent getGooglePlayServicesAvailabilityRecoveryIntent(int i10) {
        return GoogleApiAvailabilityLight.getInstance().getErrorResolutionIntent(null, i10, null);
    }

    @KeepForSdk
    public static Context getRemoteContext(@NonNull Context context) {
        try {
            return context.createPackageContext("com.google.android.gms", 3);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    @KeepForSdk
    public static Resources getRemoteResource(@NonNull Context context) {
        try {
            return context.getPackageManager().getResourcesForApplication("com.google.android.gms");
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    @ShowFirstParty
    @KeepForSdk
    public static boolean honorsDebugCertificates(@NonNull Context context) {
        try {
            if (!zza) {
                try {
                    PackageInfo packageInfo = Wrappers.packageManager(context).getPackageInfo("com.google.android.gms", 64);
                    GoogleSignatureVerifier.getInstance(context);
                    if (packageInfo != null && !GoogleSignatureVerifier.zzb(packageInfo, false) && GoogleSignatureVerifier.zzb(packageInfo, true)) {
                        zzb = true;
                    } else {
                        zzb = false;
                    }
                    zza = true;
                } catch (PackageManager.NameNotFoundException e10) {
                    Log.w("GooglePlayServicesUtil", "Cannot find Google Play services package name.", e10);
                    zza = true;
                }
            }
            if (!zzb && DeviceProperties.isUserBuild()) {
                return false;
            }
            return true;
        } catch (Throwable th2) {
            zza = true;
            throw th2;
        }
    }

    @HideFirstParty
    @KeepForSdk
    @Deprecated
    public static int isGooglePlayServicesAvailable(@NonNull Context context) {
        return isGooglePlayServicesAvailable(context, GOOGLE_PLAY_SERVICES_VERSION_CODE);
    }

    @KeepForSdk
    @Deprecated
    public static boolean isGooglePlayServicesUid(@NonNull Context context, int i10) {
        return UidVerifier.isGooglePlayServicesUid(context, i10);
    }

    @ShowFirstParty
    @KeepForSdk
    @Deprecated
    public static boolean isPlayServicesPossiblyUpdating(@NonNull Context context, int i10) {
        if (i10 == 18) {
            return true;
        }
        if (i10 == 1) {
            return zza(context, "com.google.android.gms");
        }
        return false;
    }

    @ShowFirstParty
    @KeepForSdk
    @Deprecated
    public static boolean isPlayStorePossiblyUpdating(@NonNull Context context, int i10) {
        if (i10 == 9) {
            return zza(context, "com.android.vending");
        }
        return false;
    }

    @KeepForSdk
    @TargetApi(18)
    public static boolean isRestrictedUserProfile(@NonNull Context context) {
        if (PlatformVersion.isAtLeastJellyBeanMR2()) {
            Object systemService = context.getSystemService(LogSubCategory.Action.USER);
            Preconditions.checkNotNull(systemService);
            Bundle applicationRestrictions = ((UserManager) systemService).getApplicationRestrictions(context.getPackageName());
            if (applicationRestrictions != null && "true".equals(applicationRestrictions.getString("restricted_profile"))) {
                return true;
            }
            return false;
        }
        return false;
    }

    @VisibleForTesting
    @Deprecated
    @ShowFirstParty
    @KeepForSdk
    public static boolean isSidewinderDevice(@NonNull Context context) {
        return DeviceProperties.isSidewinder(context);
    }

    @KeepForSdk
    @Deprecated
    public static boolean isUserRecoverableError(int i10) {
        return i10 == 1 || i10 == 2 || i10 == 3 || i10 == 9;
    }

    @KeepForSdk
    @TargetApi(19)
    @Deprecated
    public static boolean uidHasPackageName(@NonNull Context context, int i10, @NonNull String str) {
        return UidVerifier.uidHasPackageName(context, i10, str);
    }

    @TargetApi(21)
    public static boolean zza(Context context, String str) {
        ApplicationInfo applicationInfo;
        boolean equals = str.equals("com.google.android.gms");
        if (PlatformVersion.isAtLeastLollipop()) {
            try {
                Iterator<PackageInstaller.SessionInfo> it = context.getPackageManager().getPackageInstaller().getAllSessions().iterator();
                while (it.hasNext()) {
                    if (str.equals(it.next().getAppPackageName())) {
                        return true;
                    }
                }
            } catch (Exception unused) {
                return false;
            }
        }
        try {
            applicationInfo = context.getPackageManager().getApplicationInfo(str, UserMetadata.MAX_INTERNAL_KEY_SIZE);
        } catch (PackageManager.NameNotFoundException unused2) {
        }
        if (equals) {
            return applicationInfo.enabled;
        }
        if (applicationInfo.enabled && !isRestrictedUserProfile(context)) {
            return true;
        }
        return false;
    }

    @KeepForSdk
    @Deprecated
    public static int isGooglePlayServicesAvailable(@NonNull Context context, int i10) {
        PackageInfo packageInfo;
        try {
            context.getResources().getString(R.string.common_google_play_services_unknown_issue);
        } catch (Throwable unused) {
            Log.e("GooglePlayServicesUtil", "The Google Play services resources were not found. Check your project configuration to ensure that the resources are included.");
        }
        if (!"com.google.android.gms".equals(context.getPackageName()) && !zzc.get()) {
            int zza2 = zzag.zza(context);
            if (zza2 == 0) {
                throw new GooglePlayServicesMissingManifestValueException();
            }
            if (zza2 != GOOGLE_PLAY_SERVICES_VERSION_CODE) {
                throw new GooglePlayServicesIncorrectManifestValueException(zza2);
            }
        }
        boolean z10 = (DeviceProperties.isWearableWithoutPlayStore(context) || DeviceProperties.zzb(context)) ? false : true;
        Preconditions.checkArgument(i10 >= 0);
        String packageName = context.getPackageName();
        PackageManager packageManager = context.getPackageManager();
        if (z10) {
            try {
                packageInfo = packageManager.getPackageInfo("com.android.vending", 8256);
            } catch (PackageManager.NameNotFoundException unused2) {
                Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires the Google Play Store, but it is missing."));
            }
        } else {
            packageInfo = null;
        }
        try {
            PackageInfo packageInfo2 = packageManager.getPackageInfo("com.google.android.gms", 64);
            GoogleSignatureVerifier.getInstance(context);
            if (!GoogleSignatureVerifier.zzb(packageInfo2, true)) {
                Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play services, but their signature is invalid."));
            } else {
                if (z10) {
                    Preconditions.checkNotNull(packageInfo);
                    if (!GoogleSignatureVerifier.zzb(packageInfo, true)) {
                        Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play Store, but its signature is invalid."));
                    }
                }
                if (z10 && packageInfo != null && !packageInfo.signatures[0].equals(packageInfo2.signatures[0])) {
                    Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play Store, but its signature doesn't match that of Google Play services."));
                } else {
                    if (com.google.android.gms.common.util.zza.zza(packageInfo2.versionCode) < com.google.android.gms.common.util.zza.zza(i10)) {
                        Log.w("GooglePlayServicesUtil", "Google Play services out of date for " + packageName + ".  Requires " + i10 + " but found " + packageInfo2.versionCode);
                        return 2;
                    }
                    ApplicationInfo applicationInfo = packageInfo2.applicationInfo;
                    if (applicationInfo == null) {
                        try {
                            applicationInfo = packageManager.getApplicationInfo("com.google.android.gms", 0);
                        } catch (PackageManager.NameNotFoundException e10) {
                            Log.wtf("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play services, but they're missing when getting application info."), e10);
                            return 1;
                        }
                    }
                    return !applicationInfo.enabled ? 3 : 0;
                }
            }
            return 9;
        } catch (PackageManager.NameNotFoundException unused3) {
            Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play services, but they are missing."));
            return 1;
        }
    }
}
