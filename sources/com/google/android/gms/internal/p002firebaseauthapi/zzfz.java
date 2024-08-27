package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Arrays;
import nn.d;

/* loaded from: classes2.dex */
public final class zzfz extends zzcw {
    private final zzfy zza;

    private zzfz(zzfy zzfyVar) {
        this.zza = zzfyVar;
    }

    public static zzfz zzb(zzfy zzfyVar) {
        return new zzfz(zzfyVar);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzfz) || ((zzfz) obj).zza != this.zza) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{zzfz.class, this.zza});
    }

    public final String toString() {
        return d.k("ChaCha20Poly1305 Parameters (variant: ", this.zza.toString(), ")");
    }

    public final zzfy zza() {
        return this.zza;
    }
}
