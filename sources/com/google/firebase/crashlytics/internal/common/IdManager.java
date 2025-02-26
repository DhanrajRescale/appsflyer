package com.google.firebase.crashlytics.internal.common;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import androidx.annotation.NonNull;
import com.google.firebase.crashlytics.internal.Logger;
import java.util.Locale;
import java.util.UUID;
import java.util.regex.Pattern;
import okhttp3.HttpUrl;

/* loaded from: classes2.dex */
public class IdManager implements InstallIdProvider {
    public static final String DEFAULT_VERSION_NAME = "0.0";
    static final String PREFKEY_ADVERTISING_ID = "crashlytics.advertising.id";
    static final String PREFKEY_FIREBASE_IID = "firebase.installation.id";
    static final String PREFKEY_INSTALLATION_UUID = "crashlytics.installation.id";
    static final String PREFKEY_LEGACY_INSTALLATION_UUID = "crashlytics.installation.id";
    private static final String SYNTHETIC_FID_PREFIX = "SYN_";
    private final Context appContext;
    private final String appIdentifier;
    private String crashlyticsInstallId;
    private final DataCollectionArbiter dataCollectionArbiter;
    private final nq.d firebaseInstallationsApi;
    private final InstallerPackageNameProvider installerPackageNameProvider;
    private static final Pattern ID_PATTERN = Pattern.compile("[^\\p{Alnum}]");
    private static final String FORWARD_SLASH_REGEX = Pattern.quote("/");

    public IdManager(Context context, String str, nq.d dVar, DataCollectionArbiter dataCollectionArbiter) {
        if (context != null) {
            if (str != null) {
                this.appContext = context;
                this.appIdentifier = str;
                this.firebaseInstallationsApi = dVar;
                this.dataCollectionArbiter = dataCollectionArbiter;
                this.installerPackageNameProvider = new InstallerPackageNameProvider();
                return;
            }
            throw new IllegalArgumentException("appIdentifier must not be null");
        }
        throw new IllegalArgumentException("appContext must not be null");
    }

    @NonNull
    private synchronized String createAndCacheCrashlyticsInstallId(String str, SharedPreferences sharedPreferences) {
        String formatId;
        formatId = formatId(UUID.randomUUID().toString());
        Logger.getLogger().v("Created new Crashlytics installation ID: " + formatId + " for FID: " + str);
        sharedPreferences.edit().putString("crashlytics.installation.id", formatId).putString(PREFKEY_FIREBASE_IID, str).apply();
        return formatId;
    }

    public static String createSyntheticFid() {
        return SYNTHETIC_FID_PREFIX + UUID.randomUUID().toString();
    }

    private String fetchTrueFid() {
        try {
            return (String) Utils.awaitEvenIfOnMainThread(((nq.c) this.firebaseInstallationsApi).c());
        } catch (Exception e10) {
            Logger.getLogger().w("Failed to retrieve Firebase Installations ID.", e10);
            return null;
        }
    }

    private static String formatId(String str) {
        if (str == null) {
            return null;
        }
        return ID_PATTERN.matcher(str).replaceAll(HttpUrl.FRAGMENT_ENCODE_SET).toLowerCase(Locale.US);
    }

    public static boolean isSyntheticFid(String str) {
        if (str != null && str.startsWith(SYNTHETIC_FID_PREFIX)) {
            return true;
        }
        return false;
    }

    private String readCachedCrashlyticsInstallId(SharedPreferences sharedPreferences) {
        return sharedPreferences.getString("crashlytics.installation.id", null);
    }

    private String removeForwardSlashesIn(String str) {
        return str.replaceAll(FORWARD_SLASH_REGEX, HttpUrl.FRAGMENT_ENCODE_SET);
    }

    public String getAppIdentifier() {
        return this.appIdentifier;
    }

    @Override // com.google.firebase.crashlytics.internal.common.InstallIdProvider
    @NonNull
    public synchronized String getCrashlyticsInstallId() {
        try {
            String str = this.crashlyticsInstallId;
            if (str != null) {
                return str;
            }
            Logger.getLogger().v("Determining Crashlytics installation ID...");
            SharedPreferences sharedPrefs = CommonUtils.getSharedPrefs(this.appContext);
            String string = sharedPrefs.getString(PREFKEY_FIREBASE_IID, null);
            Logger.getLogger().v("Cached Firebase Installation ID: " + string);
            if (this.dataCollectionArbiter.isAutomaticDataCollectionEnabled()) {
                String fetchTrueFid = fetchTrueFid();
                Logger.getLogger().v("Fetched Firebase Installation ID: " + fetchTrueFid);
                if (fetchTrueFid == null) {
                    if (string == null) {
                        fetchTrueFid = createSyntheticFid();
                    } else {
                        fetchTrueFid = string;
                    }
                }
                if (fetchTrueFid.equals(string)) {
                    this.crashlyticsInstallId = readCachedCrashlyticsInstallId(sharedPrefs);
                } else {
                    this.crashlyticsInstallId = createAndCacheCrashlyticsInstallId(fetchTrueFid, sharedPrefs);
                }
            } else if (isSyntheticFid(string)) {
                this.crashlyticsInstallId = readCachedCrashlyticsInstallId(sharedPrefs);
            } else {
                this.crashlyticsInstallId = createAndCacheCrashlyticsInstallId(createSyntheticFid(), sharedPrefs);
            }
            if (this.crashlyticsInstallId == null) {
                Logger.getLogger().w("Unable to determine Crashlytics Install Id, creating a new one.");
                this.crashlyticsInstallId = createAndCacheCrashlyticsInstallId(createSyntheticFid(), sharedPrefs);
            }
            Logger.getLogger().v("Crashlytics installation ID: " + this.crashlyticsInstallId);
            return this.crashlyticsInstallId;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public String getInstallerPackageName() {
        return this.installerPackageNameProvider.getInstallerPackageName(this.appContext);
    }

    public String getModelName() {
        return String.format(Locale.US, "%s/%s", removeForwardSlashesIn(Build.MANUFACTURER), removeForwardSlashesIn(Build.MODEL));
    }

    public String getOsBuildVersionString() {
        return removeForwardSlashesIn(Build.VERSION.INCREMENTAL);
    }

    public String getOsDisplayVersionString() {
        return removeForwardSlashesIn(Build.VERSION.RELEASE);
    }
}
