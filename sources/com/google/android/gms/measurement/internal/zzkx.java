package com.google.android.gms.measurement.internal;

import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzkx implements zzew {
    final /* synthetic */ String zza;
    final /* synthetic */ zzlg zzb;

    public zzkx(zzlg zzlgVar, String str) {
        this.zzb = zzlgVar;
        this.zza = str;
    }

    @Override // com.google.android.gms.measurement.internal.zzew
    public final void zza(String str, int i10, Throwable th2, byte[] bArr, Map map) {
        this.zzb.zzK(i10, th2, bArr, this.zza);
    }
}
