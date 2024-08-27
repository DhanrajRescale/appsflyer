package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Map;

/* loaded from: classes2.dex */
public final class zznz {
    public static final zznz zza = new zznx().zza();
    private final Map zzb;

    public final boolean equals(Object obj) {
        if (!(obj instanceof zznz)) {
            return false;
        }
        return this.zzb.equals(((zznz) obj).zzb);
    }

    public final int hashCode() {
        return this.zzb.hashCode();
    }

    public final String toString() {
        return this.zzb.toString();
    }

    public final Map zza() {
        return this.zzb;
    }
}
