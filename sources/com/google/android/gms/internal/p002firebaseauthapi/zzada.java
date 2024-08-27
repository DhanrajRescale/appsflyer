package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.util.Strings;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzada implements zzaar {
    private static final String zza = "zzada";
    private String zzb;

    public zzada() {
    }

    public zzada(String str) {
        this.zzb = str;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaar
    public final /* bridge */ /* synthetic */ zzaar zza(String str) throws zzyi {
        try {
            this.zzb = Strings.emptyToNull(new JSONObject(str).optString("producerProjectNumber"));
            return this;
        } catch (NullPointerException | JSONException e10) {
            throw zzaen.zza(e10, zza, str);
        }
    }

    public final String zzb() {
        return this.zzb;
    }
}
