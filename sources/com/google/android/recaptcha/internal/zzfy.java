package com.google.android.recaptcha.internal;

import okhttp3.internal.http2.Settings;

/* loaded from: classes2.dex */
final class zzfy {
    private final Object zza;
    private final int zzb;

    public zzfy(Object obj, int i10) {
        this.zza = obj;
        this.zzb = i10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzfy)) {
            return false;
        }
        zzfy zzfyVar = (zzfy) obj;
        if (this.zza != zzfyVar.zza || this.zzb != zzfyVar.zzb) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.zza) * Settings.DEFAULT_INITIAL_WINDOW_SIZE) + this.zzb;
    }
}
