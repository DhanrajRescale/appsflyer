package com.google.android.gms.internal.p002firebaseauthapi;

import java.io.IOException;

/* loaded from: classes2.dex */
final class zzaix extends zzaiv {
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaiv
    public final /* synthetic */ int zza(Object obj) {
        return ((zzaiw) obj).zza();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaiv
    public final /* synthetic */ int zzb(Object obj) {
        return ((zzaiw) obj).zzb();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaiv
    public final /* bridge */ /* synthetic */ Object zzc(Object obj) {
        zzagk zzagkVar = (zzagk) obj;
        zzaiw zzaiwVar = zzagkVar.zzc;
        if (zzaiwVar == zzaiw.zzc()) {
            zzaiw zzf = zzaiw.zzf();
            zzagkVar.zzc = zzf;
            return zzf;
        }
        return zzaiwVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaiv
    public final /* synthetic */ Object zzd(Object obj) {
        return ((zzagk) obj).zzc;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaiv
    public final /* bridge */ /* synthetic */ Object zze(Object obj, Object obj2) {
        if (!zzaiw.zzc().equals(obj2)) {
            if (zzaiw.zzc().equals(obj)) {
                return zzaiw.zze((zzaiw) obj, (zzaiw) obj2);
            }
            ((zzaiw) obj).zzd((zzaiw) obj2);
            return obj;
        }
        return obj;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaiv
    public final /* synthetic */ Object zzf() {
        return zzaiw.zzf();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaiv
    public final /* synthetic */ Object zzg(Object obj) {
        ((zzaiw) obj).zzh();
        return obj;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaiv
    public final /* bridge */ /* synthetic */ void zzh(Object obj, int i10, int i11) {
        ((zzaiw) obj).zzj((i10 << 3) | 5, Integer.valueOf(i11));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaiv
    public final /* bridge */ /* synthetic */ void zzi(Object obj, int i10, long j10) {
        ((zzaiw) obj).zzj((i10 << 3) | 1, Long.valueOf(j10));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaiv
    public final /* bridge */ /* synthetic */ void zzj(Object obj, int i10, Object obj2) {
        ((zzaiw) obj).zzj((i10 << 3) | 3, obj2);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaiv
    public final /* bridge */ /* synthetic */ void zzk(Object obj, int i10, zzaff zzaffVar) {
        ((zzaiw) obj).zzj((i10 << 3) | 2, zzaffVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaiv
    public final /* bridge */ /* synthetic */ void zzl(Object obj, int i10, long j10) {
        ((zzaiw) obj).zzj(i10 << 3, Long.valueOf(j10));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaiv
    public final void zzm(Object obj) {
        ((zzagk) obj).zzc.zzh();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaiv
    public final /* synthetic */ void zzn(Object obj, Object obj2) {
        ((zzagk) obj).zzc = (zzaiw) obj2;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaiv
    public final /* synthetic */ void zzo(Object obj, Object obj2) {
        ((zzagk) obj).zzc = (zzaiw) obj2;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaiv
    public final boolean zzq(zzaia zzaiaVar) {
        return false;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaiv
    public final /* synthetic */ void zzr(Object obj, zzaft zzaftVar) throws IOException {
        ((zzaiw) obj).zzk(zzaftVar);
    }
}
