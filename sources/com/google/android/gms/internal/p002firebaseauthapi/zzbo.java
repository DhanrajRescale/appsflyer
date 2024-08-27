package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
class zzbo implements zzbm {
    private final zzkj zza;
    private final Class zzb;

    public zzbo(zzkj zzkjVar, Class cls) {
        if (!zzkjVar.zzm().contains(cls) && !Void.class.equals(cls)) {
            throw new IllegalArgumentException(String.format("Given internalKeyMananger %s does not support primitive class %s", zzkjVar.toString(), cls.getName()));
        }
        this.zza = zzkjVar;
        this.zzb = cls;
    }

    private final zzbn zzf() {
        return new zzbn(this.zza.zza());
    }

    private final Object zzg(zzahp zzahpVar) throws GeneralSecurityException {
        if (!Void.class.equals(this.zzb)) {
            this.zza.zze(zzahpVar);
            return this.zza.zzl(zzahpVar, this.zzb);
        }
        throw new GeneralSecurityException("Cannot create a primitive for Void");
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbm
    public final zzsp zza(zzaff zzaffVar) throws GeneralSecurityException {
        try {
            zzahp zza = zzf().zza(zzaffVar);
            zzsm zza2 = zzsp.zza();
            zza2.zzb(this.zza.zzd());
            zza2.zzc(zza.zzo());
            zza2.zza(this.zza.zzb());
            return (zzsp) zza2.zzi();
        } catch (zzags e10) {
            throw new GeneralSecurityException("Unexpected proto", e10);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbm
    public final zzahp zzb(zzaff zzaffVar) throws GeneralSecurityException {
        try {
            return zzf().zza(zzaffVar);
        } catch (zzags e10) {
            throw new GeneralSecurityException("Failures parsing proto of type ".concat(this.zza.zza().zzg().getName()), e10);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbm
    public final Object zzc(zzaff zzaffVar) throws GeneralSecurityException {
        try {
            return zzg(this.zza.zzc(zzaffVar));
        } catch (zzags e10) {
            throw new GeneralSecurityException("Failures parsing proto of type ".concat(this.zza.zzk().getName()), e10);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbm
    public final Object zzd(zzahp zzahpVar) throws GeneralSecurityException {
        String name = this.zza.zzk().getName();
        if (this.zza.zzk().isInstance(zzahpVar)) {
            return zzg(zzahpVar);
        }
        throw new GeneralSecurityException("Expected proto of type ".concat(name));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbm
    public final String zze() {
        return this.zza.zzd();
    }
}
