package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class zzch {
    private final Object zza;
    private final Object zzb;
    private final byte[] zzc;
    private final zztv zzd;
    private final int zze;
    private final String zzf;
    private final zzbl zzg;
    private final int zzh;

    public zzch(Object obj, Object obj2, byte[] bArr, int i10, zztv zztvVar, int i11, String str, zzbl zzblVar) {
        this.zza = obj;
        this.zzb = obj2;
        this.zzc = Arrays.copyOf(bArr, bArr.length);
        this.zzh = i10;
        this.zzd = zztvVar;
        this.zze = i11;
        this.zzf = str;
        this.zzg = zzblVar;
    }

    public final int zza() {
        return this.zze;
    }

    public final zzbl zzb() {
        return this.zzg;
    }

    public final zztv zzc() {
        return this.zzd;
    }

    public final Object zzd() {
        return this.zza;
    }

    public final Object zze() {
        return this.zzb;
    }

    public final String zzf() {
        return this.zzf;
    }

    public final byte[] zzg() {
        byte[] bArr = this.zzc;
        if (bArr == null) {
            return null;
        }
        return Arrays.copyOf(bArr, bArr.length);
    }

    public final int zzh() {
        return this.zzh;
    }
}
