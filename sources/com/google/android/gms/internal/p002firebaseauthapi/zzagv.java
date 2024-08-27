package com.google.android.gms.internal.p002firebaseauthapi;

/* loaded from: classes2.dex */
public class zzagv {
    private static final zzafx zzb = zzafx.zza;
    protected volatile zzahp zza;
    private volatile zzaff zzc;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzagv)) {
            return false;
        }
        zzagv zzagvVar = (zzagv) obj;
        zzahp zzahpVar = this.zza;
        zzahp zzahpVar2 = zzagvVar.zza;
        if (zzahpVar == null && zzahpVar2 == null) {
            return zzb().equals(zzagvVar.zzb());
        }
        if (zzahpVar != null && zzahpVar2 != null) {
            return zzahpVar.equals(zzahpVar2);
        }
        if (zzahpVar != null) {
            zzagvVar.zzc(zzahpVar.zzM());
            return zzahpVar.equals(zzagvVar.zza);
        }
        zzc(zzahpVar2.zzM());
        return this.zza.equals(zzahpVar2);
    }

    public int hashCode() {
        return 1;
    }

    public final int zza() {
        if (this.zzc != null) {
            return ((zzafc) this.zzc).zza.length;
        }
        if (this.zza != null) {
            return this.zza.zzs();
        }
        return 0;
    }

    public final zzaff zzb() {
        if (this.zzc != null) {
            return this.zzc;
        }
        synchronized (this) {
            try {
                if (this.zzc != null) {
                    return this.zzc;
                }
                if (this.zza == null) {
                    this.zzc = zzaff.zzb;
                } else {
                    this.zzc = this.zza.zzo();
                }
                return this.zzc;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void zzc(zzahp zzahpVar) {
        if (this.zza != null) {
            return;
        }
        synchronized (this) {
            if (this.zza == null) {
                try {
                    this.zza = zzahpVar;
                    this.zzc = zzaff.zzb;
                } catch (zzags unused) {
                    this.zza = zzahpVar;
                    this.zzc = zzaff.zzb;
                }
            }
        }
    }
}
