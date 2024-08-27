package com.appsflyer.internal;

import android.content.SharedPreferences;
import com.appsflyer.AFLogger;

/* loaded from: classes.dex */
public final class AFd1tSDK implements AFd1qSDK {
    private final SharedPreferences AFKeystoreWrapper;

    public AFd1tSDK(SharedPreferences sharedPreferences) {
        this.AFKeystoreWrapper = sharedPreferences;
    }

    @Override // com.appsflyer.internal.AFd1qSDK
    public final void AFInAppEventParameterName(String str, String str2) {
        this.AFKeystoreWrapper.edit().putString(str, str2).apply();
    }

    @Override // com.appsflyer.internal.AFd1qSDK
    public final boolean AFInAppEventType(String str) {
        try {
            return this.AFKeystoreWrapper.getBoolean(str, false);
        } catch (ClassCastException e10) {
            AFLogger.afErrorLog("Unexpected data type found for key ".concat(String.valueOf(str)), e10);
            return false;
        }
    }

    @Override // com.appsflyer.internal.AFd1qSDK
    public final String AFKeystoreWrapper(String str, String str2) {
        try {
            return this.AFKeystoreWrapper.getString(str, str2);
        } catch (ClassCastException e10) {
            AFLogger.afErrorLog("Unexpected data type found for key ".concat(String.valueOf(str)), e10);
            return str2;
        }
    }

    @Override // com.appsflyer.internal.AFd1qSDK
    public final void valueOf(String str, boolean z10) {
        this.AFKeystoreWrapper.edit().putBoolean(str, z10).apply();
    }

    @Override // com.appsflyer.internal.AFd1qSDK
    public final long values(String str, long j10) {
        try {
            return this.AFKeystoreWrapper.getLong(str, j10);
        } catch (ClassCastException e10) {
            AFLogger.afErrorLog("Unexpected data type found for key ".concat(String.valueOf(str)), e10);
            return j10;
        }
    }

    @Override // com.appsflyer.internal.AFd1qSDK
    public final void AFInAppEventParameterName(String str, int i10) {
        this.AFKeystoreWrapper.edit().putInt(str, i10).apply();
    }

    @Override // com.appsflyer.internal.AFd1qSDK
    public final int valueOf(String str, int i10) {
        try {
            return this.AFKeystoreWrapper.getInt(str, i10);
        } catch (ClassCastException e10) {
            AFLogger.afErrorLog("Unexpected data type found for key ".concat(String.valueOf(str)), e10);
            return i10;
        }
    }

    @Override // com.appsflyer.internal.AFd1qSDK
    public final void AFKeystoreWrapper(String str, long j10) {
        this.AFKeystoreWrapper.edit().putLong(str, j10).apply();
    }

    @Override // com.appsflyer.internal.AFd1qSDK
    public final boolean values(String str) {
        return this.AFKeystoreWrapper.contains(str);
    }

    @Override // com.appsflyer.internal.AFd1qSDK
    public final void AFKeystoreWrapper(String str) {
        this.AFKeystoreWrapper.edit().remove(str).apply();
    }
}
