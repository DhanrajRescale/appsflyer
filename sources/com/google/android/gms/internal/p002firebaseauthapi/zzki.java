package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes2.dex */
public abstract class zzki {
    private final Class zza;

    public zzki(Class cls) {
        this.zza = cls;
    }

    public abstract zzahp zza(zzahp zzahpVar) throws GeneralSecurityException;

    public abstract zzahp zzb(zzaff zzaffVar) throws zzags;

    public Map zzc() throws GeneralSecurityException {
        return Collections.emptyMap();
    }

    public abstract void zzd(zzahp zzahpVar) throws GeneralSecurityException;

    public final Class zzg() {
        return this.zza;
    }
}
