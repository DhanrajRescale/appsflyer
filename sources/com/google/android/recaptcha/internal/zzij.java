package com.google.android.recaptcha.internal;

/* loaded from: classes2.dex */
final class zzij implements zzhv {
    private final zzhy zza;
    private final String zzb;
    private final Object[] zzc;
    private final int zzd;

    public zzij(zzhy zzhyVar, String str, Object[] objArr) {
        this.zza = zzhyVar;
        this.zzb = str;
        this.zzc = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.zzd = charAt;
            return;
        }
        int i10 = charAt & 8191;
        int i11 = 1;
        int i12 = 13;
        while (true) {
            int i13 = i11 + 1;
            char charAt2 = str.charAt(i11);
            if (charAt2 >= 55296) {
                i10 |= (charAt2 & 8191) << i12;
                i12 += 13;
                i11 = i13;
            } else {
                this.zzd = i10 | (charAt2 << i12);
                return;
            }
        }
    }

    @Override // com.google.android.recaptcha.internal.zzhv
    public final zzhy zza() {
        return this.zza;
    }

    @Override // com.google.android.recaptcha.internal.zzhv
    public final boolean zzb() {
        return (this.zzd & 2) == 2;
    }

    @Override // com.google.android.recaptcha.internal.zzhv
    public final int zzc() {
        return (this.zzd & 1) == 1 ? 1 : 2;
    }

    public final String zzd() {
        return this.zzb;
    }

    public final Object[] zze() {
        return this.zzc;
    }
}
