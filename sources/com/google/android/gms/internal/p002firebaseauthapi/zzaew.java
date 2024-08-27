package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
final class zzaew extends zzaey {
    final /* synthetic */ zzaff zza;
    private int zzb = 0;
    private final int zzc;

    public zzaew(zzaff zzaffVar) {
        this.zza = zzaffVar;
        this.zzc = zzaffVar.zzd();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb < this.zzc;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafa
    public final byte zza() {
        int i10 = this.zzb;
        if (i10 < this.zzc) {
            this.zzb = i10 + 1;
            return this.zza.zzb(i10);
        }
        throw new NoSuchElementException();
    }
}
