package com.google.android.gms.internal.p002firebaseauthapi;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzady extends zzadu {
    private static final String zza = "zzady";
    private String zzb;

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadu, com.google.android.gms.internal.p002firebaseauthapi.zzaar
    public final /* bridge */ /* synthetic */ zzaar zza(String str) throws zzyi {
        zzd(str);
        return this;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadu
    /* renamed from: zzb */
    public final /* bridge */ /* synthetic */ zzadu zza(String str) throws zzyi {
        zzd(str);
        return this;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadu
    public final String zzc() {
        return this.zzb;
    }

    public final zzady zzd(String str) throws zzyi {
        try {
            JSONObject optJSONObject = new JSONObject(str).optJSONObject("phoneSessionInfo");
            if (optJSONObject != null) {
                this.zzb = zzac.zza(optJSONObject.optString("sessionInfo"));
            }
            return this;
        } catch (NullPointerException | JSONException e10) {
            throw zzaen.zza(e10, zza, str);
        }
    }
}
