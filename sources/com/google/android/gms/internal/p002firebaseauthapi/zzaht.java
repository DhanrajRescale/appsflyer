package com.google.android.gms.internal.p002firebaseauthapi;

import java.io.IOException;

/* loaded from: classes2.dex */
final class zzaht implements zzaib {
    private final zzahp zza;
    private final zzaiv zzb;
    private final boolean zzc;
    private final zzafy zzd;

    private zzaht(zzaiv zzaivVar, zzafy zzafyVar, zzahp zzahpVar) {
        this.zzb = zzaivVar;
        this.zzc = zzafyVar.zzh(zzahpVar);
        this.zzd = zzafyVar;
        this.zza = zzahpVar;
    }

    public static zzaht zzc(zzaiv zzaivVar, zzafy zzafyVar, zzahp zzahpVar) {
        return new zzaht(zzaivVar, zzafyVar, zzahpVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaib
    public final int zza(Object obj) {
        zzaiv zzaivVar = this.zzb;
        int zzb = zzaivVar.zzb(zzaivVar.zzd(obj));
        if (!this.zzc) {
            return zzb;
        }
        this.zzd.zza(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaib
    public final int zzb(Object obj) {
        int hashCode = this.zzb.zzd(obj).hashCode();
        if (!this.zzc) {
            return hashCode;
        }
        this.zzd.zza(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaib
    public final Object zze() {
        zzahp zzahpVar = this.zza;
        if (zzahpVar instanceof zzagk) {
            return ((zzagk) zzahpVar).zzw();
        }
        return zzahpVar.zzC().zzk();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaib
    public final void zzf(Object obj) {
        this.zzb.zzm(obj);
        this.zzd.zze(obj);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaib
    public final void zzg(Object obj, Object obj2) {
        zzaid.zzC(this.zzb, obj, obj2);
        if (!this.zzc) {
            return;
        }
        this.zzd.zza(obj2);
        throw null;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaib
    public final void zzh(Object obj, zzaia zzaiaVar, zzafx zzafxVar) throws IOException {
        boolean zzO;
        zzaiv zzaivVar = this.zzb;
        zzafy zzafyVar = this.zzd;
        Object zzc = zzaivVar.zzc(obj);
        zzagc zzb = zzafyVar.zzb(obj);
        while (zzaiaVar.zzc() != Integer.MAX_VALUE) {
            try {
                int zzd = zzaiaVar.zzd();
                if (zzd != 11) {
                    if ((zzd & 7) == 2) {
                        Object zzc2 = zzafyVar.zzc(zzafxVar, this.zza, zzd >>> 3);
                        if (zzc2 != null) {
                            zzafyVar.zzf(zzaiaVar, zzc2, zzafxVar, zzb);
                        } else {
                            zzO = zzaivVar.zzp(zzc, zzaiaVar);
                        }
                    } else {
                        zzO = zzaiaVar.zzO();
                    }
                    if (!zzO) {
                        zzaivVar.zzn(obj, zzc);
                        return;
                    }
                } else {
                    Object obj2 = null;
                    int i10 = 0;
                    zzaff zzaffVar = null;
                    while (zzaiaVar.zzc() != Integer.MAX_VALUE) {
                        int zzd2 = zzaiaVar.zzd();
                        if (zzd2 == 16) {
                            i10 = zzaiaVar.zzj();
                            obj2 = zzafyVar.zzc(zzafxVar, this.zza, i10);
                        } else if (zzd2 == 26) {
                            if (obj2 != null) {
                                zzafyVar.zzf(zzaiaVar, obj2, zzafxVar, zzb);
                            } else {
                                zzaffVar = zzaiaVar.zzp();
                            }
                        } else if (!zzaiaVar.zzO()) {
                            break;
                        }
                    }
                    if (zzaiaVar.zzd() == 12) {
                        if (zzaffVar != null) {
                            if (obj2 != null) {
                                zzafyVar.zzg(zzaffVar, obj2, zzafxVar, zzb);
                            } else {
                                zzaivVar.zzk(zzc, i10, zzaffVar);
                            }
                        }
                    } else {
                        throw zzags.zzb();
                    }
                }
            } catch (Throwable th2) {
                zzaivVar.zzn(obj, zzc);
                throw th2;
            }
        }
        zzaivVar.zzn(obj, zzc);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaib
    public final void zzi(Object obj, byte[] bArr, int i10, int i11, zzaes zzaesVar) throws IOException {
        zzagk zzagkVar = (zzagk) obj;
        if (zzagkVar.zzc == zzaiw.zzc()) {
            zzagkVar.zzc = zzaiw.zzf();
        }
        throw null;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaib
    public final boolean zzj(Object obj, Object obj2) {
        if (!this.zzb.zzd(obj).equals(this.zzb.zzd(obj2))) {
            return false;
        }
        if (!this.zzc) {
            return true;
        }
        this.zzd.zza(obj);
        this.zzd.zza(obj2);
        throw null;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaib
    public final boolean zzk(Object obj) {
        this.zzd.zza(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaib
    public final void zzm(Object obj, zzaft zzaftVar) throws IOException {
        this.zzd.zza(obj);
        throw null;
    }
}
