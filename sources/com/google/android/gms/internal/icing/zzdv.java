package com.google.android.gms.internal.icing;

/* loaded from: classes2.dex */
final class zzdv implements zzec {
    private final zzec[] zza;

    public zzdv(zzec... zzecVarArr) {
        this.zza = zzecVarArr;
    }

    @Override // com.google.android.gms.internal.icing.zzec
    public final boolean zzb(Class<?> cls) {
        zzec[] zzecVarArr = this.zza;
        for (int i10 = 0; i10 < 2; i10++) {
            if (zzecVarArr[i10].zzb(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.icing.zzec
    public final zzeb zzc(Class<?> cls) {
        String str;
        zzec[] zzecVarArr = this.zza;
        for (int i10 = 0; i10 < 2; i10++) {
            zzec zzecVar = zzecVarArr[i10];
            if (zzecVar.zzb(cls)) {
                return zzecVar.zzc(cls);
            }
        }
        String name = cls.getName();
        if (name.length() != 0) {
            str = "No factory is available for message type: ".concat(name);
        } else {
            str = new String("No factory is available for message type: ");
        }
        throw new UnsupportedOperationException(str);
    }
}
