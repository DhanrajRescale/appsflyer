package com.google.android.gms.internal.measurement;

import okhttp3.internal.http2.Settings;

/* loaded from: classes2.dex */
final class zzkm {
    private final Object zza;
    private final int zzb;

    public zzkm(Object obj, int i10) {
        this.zza = obj;
        this.zzb = i10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzkm)) {
            return false;
        }
        zzkm zzkmVar = (zzkm) obj;
        if (this.zza != zzkmVar.zza || this.zzb != zzkmVar.zzb) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.zza) * Settings.DEFAULT_INITIAL_WINDOW_SIZE) + this.zzb;
    }
}
