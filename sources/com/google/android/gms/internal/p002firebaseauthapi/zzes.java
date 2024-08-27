package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public final class zzes extends zzkj {
    public zzes() {
        super(zzpr.class, new zzeq(zzbd.class));
    }

    public static /* bridge */ /* synthetic */ zzkh zzg(int i10, int i11) {
        zzpt zzb = zzpu.zzb();
        zzb.zza(i10);
        return new zzkh((zzpu) zzb.zzi(), i11);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzkj
    public final zzki zza() {
        return new zzer(this, zzpu.class);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzkj
    public final zzso zzb() {
        return zzso.SYMMETRIC;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzkj
    public final /* synthetic */ zzahp zzc(zzaff zzaffVar) throws zzags {
        return zzpr.zzd(zzaffVar, zzafx.zza());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzkj
    public final String zzd() {
        return "type.googleapis.com/google.crypto.tink.AesGcmKey";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzkj
    public final /* bridge */ /* synthetic */ void zze(zzahp zzahpVar) throws GeneralSecurityException {
        zzpr zzprVar = (zzpr) zzahpVar;
        zzvu.zzc(zzprVar.zza(), 0);
        zzvu.zzb(zzprVar.zze().zzd());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzkj
    public final int zzf() {
        return 2;
    }
}
