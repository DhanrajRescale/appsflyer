package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import zp.d0;

/* loaded from: classes2.dex */
public final class zzwm {
    private final Status zza;
    private final d0 zzb;
    private final String zzc;
    private final String zzd;

    @SafeParcelable.Constructor
    public zzwm(Status status, d0 d0Var, String str, String str2) {
        this.zza = status;
        this.zzb = d0Var;
        this.zzc = str;
        this.zzd = str2;
    }

    public final Status zza() {
        return this.zza;
    }

    public final d0 zzb() {
        return this.zzb;
    }

    public final String zzc() {
        return this.zzc;
    }

    public final String zzd() {
        return this.zzd;
    }
}
