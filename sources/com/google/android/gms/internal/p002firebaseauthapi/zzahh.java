package com.google.android.gms.internal.p002firebaseauthapi;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzahh implements zzaic {
    private static final zzahn zza = new zzahf();
    private final zzahn zzb;

    public zzahh() {
        zzahn zzahnVar;
        zzahn[] zzahnVarArr = new zzahn[2];
        zzahnVarArr[0] = zzagf.zza();
        try {
            zzahnVar = (zzahn) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            zzahnVar = zza;
        }
        zzahnVarArr[1] = zzahnVar;
        zzahg zzahgVar = new zzahg(zzahnVarArr);
        byte[] bArr = zzagq.zzd;
        this.zzb = zzahgVar;
    }

    private static boolean zzb(zzahm zzahmVar) {
        if (zzahmVar.zzc() == 1) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaic
    public final zzaib zza(Class cls) {
        zzaid.zzD(cls);
        zzahm zzb = this.zzb.zzb(cls);
        if (zzb.zzb()) {
            if (zzagk.class.isAssignableFrom(cls)) {
                return zzaht.zzc(zzaid.zzz(), zzaga.zzb(), zzb.zza());
            }
            return zzaht.zzc(zzaid.zzy(), zzaga.zza(), zzb.zza());
        }
        if (zzagk.class.isAssignableFrom(cls)) {
            if (zzb(zzb)) {
                return zzahs.zzl(cls, zzb, zzahv.zzb(), zzahd.zze(), zzaid.zzz(), zzaga.zzb(), zzahl.zzb());
            }
            return zzahs.zzl(cls, zzb, zzahv.zzb(), zzahd.zze(), zzaid.zzz(), null, zzahl.zzb());
        }
        if (zzb(zzb)) {
            return zzahs.zzl(cls, zzb, zzahv.zza(), zzahd.zzd(), zzaid.zzy(), zzaga.zza(), zzahl.zza());
        }
        return zzahs.zzl(cls, zzb, zzahv.zza(), zzahd.zzd(), zzaid.zzy(), null, zzahl.zza());
    }
}
