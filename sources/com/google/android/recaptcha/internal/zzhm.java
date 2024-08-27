package com.google.android.recaptcha.internal;

import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public abstract class zzhm {
    private static final zzhm zza = new zzhi(null);
    private static final zzhm zzb = new zzhk(0 == true ? 1 : 0);

    public /* synthetic */ zzhm(zzhl zzhlVar) {
    }

    public static zzhm zzd() {
        return zza;
    }

    public static zzhm zze() {
        return zzb;
    }

    public abstract List zza(Object obj, long j10);

    public abstract void zzb(Object obj, long j10);

    public abstract void zzc(Object obj, Object obj2, long j10);
}
