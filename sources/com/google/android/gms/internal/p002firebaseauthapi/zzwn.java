package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;
import kp.j;
import zp.d0;

/* loaded from: classes2.dex */
public final class zzwn {

    @SafeParcelable.Field(getter = "getMfaPendingCredential", id = 1)
    final String zza;

    @SafeParcelable.Field(getter = "getMfaInfoList", id = 2)
    final List zzb;

    @SafeParcelable.Field(getter = "getDefaultOAuthCredential", id = 3)
    final d0 zzc;

    @SafeParcelable.Constructor
    public zzwn(String str, List list, d0 d0Var) {
        this.zza = str;
        this.zzb = list;
        this.zzc = d0Var;
    }

    public final d0 zza() {
        return this.zzc;
    }

    public final String zzb() {
        return this.zza;
    }

    public final List zzc() {
        return j.i0(this.zzb);
    }
}
