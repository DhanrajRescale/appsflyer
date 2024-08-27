package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import java.util.Map;

/* loaded from: classes2.dex */
final class zzey implements Runnable {
    private final zzew zza;
    private final int zzb;
    private final Throwable zzc;
    private final byte[] zzd;
    private final String zze;
    private final Map zzf;

    public /* synthetic */ zzey(String str, zzew zzewVar, int i10, Throwable th2, byte[] bArr, Map map, zzex zzexVar) {
        Preconditions.checkNotNull(zzewVar);
        this.zza = zzewVar;
        this.zzb = i10;
        this.zzc = th2;
        this.zzd = bArr;
        this.zze = str;
        this.zzf = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zza(this.zze, this.zzb, this.zzc, this.zzd, this.zzf);
    }
}
