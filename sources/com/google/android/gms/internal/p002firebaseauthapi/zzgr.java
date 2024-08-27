package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Arrays;
import nn.d;

/* loaded from: classes2.dex */
public final class zzgr extends zzcw {
    private final zzgq zza;

    private zzgr(zzgq zzgqVar) {
        this.zza = zzgqVar;
    }

    public static zzgr zzb(zzgq zzgqVar) {
        return new zzgr(zzgqVar);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgr) || ((zzgr) obj).zza != this.zza) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{zzgr.class, this.zza});
    }

    public final String toString() {
        return d.k("XChaCha20Poly1305 Parameters (variant: ", this.zza.toString(), ")");
    }

    public final zzgq zza() {
        return this.zza;
    }
}
