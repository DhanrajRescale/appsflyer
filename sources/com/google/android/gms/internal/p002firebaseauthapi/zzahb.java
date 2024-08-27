package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.List;

/* loaded from: classes2.dex */
final class zzahb extends zzahd {
    public /* synthetic */ zzahb(zzaha zzahaVar) {
        super(null);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzahd
    public final List zza(Object obj, long j10) {
        int i10;
        zzagp zzagpVar = (zzagp) zzajf.zzf(obj, j10);
        if (!zzagpVar.zzc()) {
            int size = zzagpVar.size();
            if (size == 0) {
                i10 = 10;
            } else {
                i10 = size + size;
            }
            zzagp zzd = zzagpVar.zzd(i10);
            zzajf.zzs(obj, j10, zzd);
            return zzd;
        }
        return zzagpVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzahd
    public final void zzb(Object obj, long j10) {
        ((zzagp) zzajf.zzf(obj, j10)).zzb();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzahd
    public final void zzc(Object obj, Object obj2, long j10) {
        zzagp zzagpVar = (zzagp) zzajf.zzf(obj, j10);
        zzagp zzagpVar2 = (zzagp) zzajf.zzf(obj2, j10);
        int size = zzagpVar.size();
        int size2 = zzagpVar2.size();
        if (size > 0 && size2 > 0) {
            if (!zzagpVar.zzc()) {
                zzagpVar = zzagpVar.zzd(size2 + size);
            }
            zzagpVar.addAll(zzagpVar2);
        }
        if (size > 0) {
            zzagpVar2 = zzagpVar;
        }
        zzajf.zzs(obj, j10, zzagpVar2);
    }

    private zzahb() {
        super(null);
    }
}
