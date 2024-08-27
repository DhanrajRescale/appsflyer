package com.google.android.gms.internal.p002firebaseauthapi;

import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes2.dex */
public final class zzrl extends zzagk implements zzahq {
    private static final zzrl zzb;
    private zzaff zzd = zzaff.zzb;
    private zzth zze;

    static {
        zzrl zzrlVar = new zzrl();
        zzb = zzrlVar;
        zzagk.zzH(zzrl.class, zzrlVar);
    }

    private zzrl() {
    }

    public static zzrk zza() {
        return (zzrk) zzb.zzt();
    }

    public static zzrl zzc(InputStream inputStream, zzafx zzafxVar) throws IOException {
        return (zzrl) zzagk.zzy(zzb, inputStream, zzafxVar);
    }

    public static /* synthetic */ void zzf(zzrl zzrlVar, zzth zzthVar) {
        zzthVar.getClass();
        zzrlVar.zze = zzthVar;
    }

    public final zzaff zzd() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzagk
    public final Object zzj(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 != 2) {
                if (i11 != 3) {
                    zzrj zzrjVar = null;
                    if (i11 != 4) {
                        if (i11 != 5) {
                            return null;
                        }
                        return zzb;
                    }
                    return new zzrk(zzrjVar);
                }
                return new zzrl();
            }
            return zzagk.zzE(zzb, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\n\u0003\t", new Object[]{"zzd", "zze"});
        }
        return (byte) 1;
    }
}
