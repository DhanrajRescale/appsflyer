package com.google.android.gms.internal.p002firebaseauthapi;

import okhttp3.internal.http2.Settings;

/* loaded from: classes2.dex */
final class zzafw {
    private final Object zza;
    private final int zzb;

    public zzafw(Object obj, int i10) {
        this.zza = obj;
        this.zzb = i10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzafw)) {
            return false;
        }
        zzafw zzafwVar = (zzafw) obj;
        if (this.zza != zzafwVar.zza || this.zzb != zzafwVar.zzb) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.zza) * Settings.DEFAULT_INITIAL_WINDOW_SIZE) + this.zzb;
    }
}
