package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
final class zzfw extends zzki {
    final /* synthetic */ zzfx zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfw(zzfx zzfxVar, Class cls) {
        super(cls);
        this.zza = zzfxVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzki
    public final /* bridge */ /* synthetic */ zzahp zza(zzahp zzahpVar) throws GeneralSecurityException {
        zzqi zzb = zzqj.zzb();
        zzb.zzb(0);
        byte[] zza = zzvs.zza(32);
        zzb.zza(zzaff.zzn(zza, 0, zza.length));
        return (zzqj) zzb.zzi();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzki
    public final /* synthetic */ zzahp zzb(zzaff zzaffVar) throws zzags {
        return zzqm.zzc(zzaffVar, zzafx.zza());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzki
    public final Map zzc() throws GeneralSecurityException {
        HashMap hashMap = new HashMap();
        hashMap.put("CHACHA20_POLY1305", new zzkh(zzqm.zzb(), 1));
        hashMap.put("CHACHA20_POLY1305_RAW", new zzkh(zzqm.zzb(), 3));
        return Collections.unmodifiableMap(hashMap);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzki
    public final /* bridge */ /* synthetic */ void zzd(zzahp zzahpVar) throws GeneralSecurityException {
    }
}
