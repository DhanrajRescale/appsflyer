package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import t.q;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzfs extends q {
    final /* synthetic */ zzfv zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfs(zzfv zzfvVar, int i10) {
        super(20);
        this.zza = zzfvVar;
    }

    @Override // t.q
    public final /* bridge */ /* synthetic */ Object create(Object obj) {
        String str = (String) obj;
        Preconditions.checkNotEmpty(str);
        return zzfv.zzd(this.zza, str);
    }
}
