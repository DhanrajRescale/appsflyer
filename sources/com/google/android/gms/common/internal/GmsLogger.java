package com.google.android.gms.common.internal;

import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;

@KeepForSdk
/* loaded from: classes2.dex */
public final class GmsLogger {
    private final String zza;
    private final String zzb;

    @KeepForSdk
    public GmsLogger(@NonNull String str) {
        this(str, null);
    }

    private final String zza(String str) {
        String str2 = this.zzb;
        if (str2 == null) {
            return str;
        }
        return str2.concat(str);
    }

    private final String zzb(String str, Object... objArr) {
        String format = String.format(str, objArr);
        String str2 = this.zzb;
        if (str2 == null) {
            return format;
        }
        return str2.concat(format);
    }

    @KeepForSdk
    public boolean canLog(int i10) {
        return Log.isLoggable(this.zza, i10);
    }

    @KeepForSdk
    public boolean canLogPii() {
        return false;
    }

    @KeepForSdk
    public void d(@NonNull String str, @NonNull String str2) {
        if (canLog(3)) {
            Log.d(str, zza(str2));
        }
    }

    @KeepForSdk
    public void e(@NonNull String str, @NonNull String str2) {
        if (canLog(6)) {
            Log.e(str, zza(str2));
        }
    }

    @KeepForSdk
    public void efmt(@NonNull String str, @NonNull String str2, @NonNull Object... objArr) {
        if (canLog(6)) {
            Log.e(str, zzb(str2, objArr));
        }
    }

    @KeepForSdk
    public void i(@NonNull String str, @NonNull String str2) {
        if (canLog(4)) {
            Log.i(str, zza(str2));
        }
    }

    @KeepForSdk
    public void pii(@NonNull String str, @NonNull String str2) {
    }

    @KeepForSdk
    public void v(@NonNull String str, @NonNull String str2) {
        if (canLog(2)) {
            Log.v(str, zza(str2));
        }
    }

    @KeepForSdk
    public void w(@NonNull String str, @NonNull String str2) {
        if (canLog(5)) {
            Log.w(str, zza(str2));
        }
    }

    @KeepForSdk
    public void wfmt(@NonNull String str, @NonNull String str2, @NonNull Object... objArr) {
        if (canLog(5)) {
            Log.w(this.zza, zzb(str2, objArr));
        }
    }

    @KeepForSdk
    public void wtf(@NonNull String str, @NonNull String str2, @NonNull Throwable th2) {
        if (canLog(7)) {
            Log.e(str, zza(str2), th2);
            Log.wtf(str, zza(str2), th2);
        }
    }

    @KeepForSdk
    public GmsLogger(@NonNull String str, String str2) {
        Preconditions.checkNotNull(str, "log tag cannot be null");
        Preconditions.checkArgument(str.length() <= 23, "tag \"%s\" is longer than the %d character maximum", str, 23);
        this.zza = str;
        if (str2 == null || str2.length() <= 0) {
            this.zzb = null;
        } else {
            this.zzb = str2;
        }
    }

    @KeepForSdk
    public void pii(@NonNull String str, @NonNull String str2, @NonNull Throwable th2) {
    }

    @KeepForSdk
    public void d(@NonNull String str, @NonNull String str2, @NonNull Throwable th2) {
        if (canLog(3)) {
            Log.d(str, zza(str2), th2);
        }
    }

    @KeepForSdk
    public void e(@NonNull String str, @NonNull String str2, @NonNull Throwable th2) {
        if (canLog(6)) {
            Log.e(str, zza(str2), th2);
        }
    }

    @KeepForSdk
    public void i(@NonNull String str, @NonNull String str2, @NonNull Throwable th2) {
        if (canLog(4)) {
            Log.i(str, zza(str2), th2);
        }
    }

    @KeepForSdk
    public void v(@NonNull String str, @NonNull String str2, @NonNull Throwable th2) {
        if (canLog(2)) {
            Log.v(str, zza(str2), th2);
        }
    }

    @KeepForSdk
    public void w(@NonNull String str, @NonNull String str2, @NonNull Throwable th2) {
        if (canLog(5)) {
            Log.w(str, zza(str2), th2);
        }
    }
}
