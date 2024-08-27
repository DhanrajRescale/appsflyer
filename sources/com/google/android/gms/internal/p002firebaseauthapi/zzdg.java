package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public final class zzdg extends zzkj {
    public zzdg() {
        super(zzot.class, new zzde(zzbd.class));
    }

    public static /* bridge */ /* synthetic */ zzkh zzg(int i10, int i11, int i12, int i13, int i14, int i15) {
        zzpb zzb = zzpc.zzb();
        zzpe zzb2 = zzpf.zzb();
        zzb2.zza(16);
        zzb.zzb((zzpf) zzb2.zzi());
        zzb.zza(i10);
        zzpc zzpcVar = (zzpc) zzb.zzi();
        zzrs zzb3 = zzrt.zzb();
        zzrv zzb4 = zzrw.zzb();
        zzb4.zzb(5);
        zzb4.zza(i13);
        zzb3.zzb((zzrw) zzb4.zzi());
        zzb3.zza(32);
        zzrt zzrtVar = (zzrt) zzb3.zzi();
        zzov zza = zzow.zza();
        zza.zza(zzpcVar);
        zza.zzb(zzrtVar);
        return new zzkh((zzow) zza.zzi(), i15);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzkj
    public final zzki zza() {
        return new zzdf(this, zzow.class);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzkj
    public final zzso zzb() {
        return zzso.SYMMETRIC;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzkj
    public final /* synthetic */ zzahp zzc(zzaff zzaffVar) throws zzags {
        return zzot.zzd(zzaffVar, zzafx.zza());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzkj
    public final String zzd() {
        return "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzkj
    public final /* bridge */ /* synthetic */ void zze(zzahp zzahpVar) throws GeneralSecurityException {
        zzot zzotVar = (zzot) zzahpVar;
        zzvu.zzc(zzotVar.zza(), 0);
        new zzdu();
        zzdu.zzh(zzotVar.zze());
        new zznc();
        zznc.zzi(zzotVar.zzf());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzkj
    public final int zzf() {
        return 2;
    }
}
