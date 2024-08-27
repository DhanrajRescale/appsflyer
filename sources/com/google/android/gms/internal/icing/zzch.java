package com.google.android.gms.internal.icing;

import com.google.android.gms.common.api.Api;

/* loaded from: classes2.dex */
final class zzch extends zzci {
    private final byte[] zza;
    private int zzb;
    private int zzc;
    private int zzd;

    public /* synthetic */ zzch(byte[] bArr, int i10, int i11, boolean z10, zzcg zzcgVar) {
        super(null);
        this.zzd = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.zza = bArr;
        this.zzb = 0;
    }

    public final int zza(int i10) throws zzdj {
        int i11 = this.zzd;
        this.zzd = 0;
        int i12 = this.zzb + this.zzc;
        this.zzb = i12;
        if (i12 > 0) {
            this.zzc = i12;
            this.zzb = 0;
        } else {
            this.zzc = 0;
        }
        return i11;
    }
}
