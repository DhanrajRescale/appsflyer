package com.google.android.gms.internal.p002firebaseauthapi;

/* loaded from: classes2.dex */
final class zzahg implements zzahn {
    private final zzahn[] zza;

    public zzahg(zzahn... zzahnVarArr) {
        this.zza = zzahnVarArr;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzahn
    public final zzahm zzb(Class cls) {
        zzahn[] zzahnVarArr = this.zza;
        for (int i10 = 0; i10 < 2; i10++) {
            zzahn zzahnVar = zzahnVarArr[i10];
            if (zzahnVar.zzc(cls)) {
                return zzahnVar.zzb(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzahn
    public final boolean zzc(Class cls) {
        zzahn[] zzahnVarArr = this.zza;
        for (int i10 = 0; i10 < 2; i10++) {
            if (zzahnVarArr[i10].zzc(cls)) {
                return true;
            }
        }
        return false;
    }
}
