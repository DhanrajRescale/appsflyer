package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.api.Api;

/* loaded from: classes2.dex */
abstract class zzz extends zzd {
    final CharSequence zzb;
    final zzj zzc;
    int zzd = 0;
    int zze;

    public zzz(zzab zzabVar, CharSequence charSequence) {
        zzj zzjVar;
        zzjVar = zzabVar.zza;
        this.zzc = zzjVar;
        this.zze = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.zzb = charSequence;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzd
    public final /* bridge */ /* synthetic */ Object zza() {
        int zzc;
        int i10 = this.zzd;
        while (true) {
            int i11 = this.zzd;
            if (i11 != -1) {
                int zzd = zzd(i11);
                if (zzd == -1) {
                    zzd = this.zzb.length();
                    this.zzd = -1;
                    zzc = -1;
                } else {
                    zzc = zzc(zzd);
                    this.zzd = zzc;
                }
                if (zzc == i10) {
                    int i12 = zzc + 1;
                    this.zzd = i12;
                    if (i12 > this.zzb.length()) {
                        this.zzd = -1;
                    }
                } else {
                    if (i10 < zzd) {
                        this.zzb.charAt(i10);
                    }
                    if (i10 < zzd) {
                        this.zzb.charAt(zzd - 1);
                    }
                    int i13 = this.zze;
                    if (i13 == 1) {
                        zzd = this.zzb.length();
                        this.zzd = -1;
                        if (zzd > i10) {
                            this.zzb.charAt(zzd - 1);
                        }
                    } else {
                        this.zze = i13 - 1;
                    }
                    return this.zzb.subSequence(i10, zzd).toString();
                }
            } else {
                zzb();
                return null;
            }
        }
    }

    public abstract int zzc(int i10);

    public abstract int zzd(int i10);
}
