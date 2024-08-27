package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public abstract class zzlm extends zzkj {
    private final Class zza;

    @SafeVarargs
    public zzlm(Class cls, Class cls2, zzlg... zzlgVarArr) {
        super(cls, zzlgVarArr);
        this.zza = cls2;
    }

    public abstract zzahp zzg(zzahp zzahpVar) throws GeneralSecurityException;
}
