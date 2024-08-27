package com.google.android.gms.internal.icing;

/* loaded from: classes2.dex */
public final class zzao extends zzcx<zzap, zzao> implements zzef {
    private zzao() {
        super(zzap.zzb());
    }

    public final zzao zza(String str) {
        if (this.zzb) {
            zzg();
            this.zzb = false;
        }
        zzap.zzc((zzap) this.zza, str);
        return this;
    }

    public final zzao zzb(String str) {
        if (this.zzb) {
            zzg();
            this.zzb = false;
        }
        zzap.zzd((zzap) this.zza, str);
        return this;
    }

    public final zzao zzc(int i10) {
        if (this.zzb) {
            zzg();
            this.zzb = false;
        }
        zzap.zze((zzap) this.zza, i10);
        return this;
    }

    public /* synthetic */ zzao(zzam zzamVar) {
        super(zzap.zzb());
    }
}
