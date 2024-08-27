package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzacj implements zzaar {
    private static final String zza = "zzacj";
    private String zzb;
    private String zzc;
    private zzadz zzd = new zzadz(null);
    private List zze;

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaar
    public final /* bridge */ /* synthetic */ zzaar zza(String str) throws zzyi {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.zzb = jSONObject.optString("authUri", null);
            jSONObject.optBoolean("registered", false);
            this.zzc = jSONObject.optString("providerId", null);
            jSONObject.optBoolean("forExistingProvider", false);
            if (jSONObject.has("allProviders")) {
                this.zzd = new zzadz(1, zzaen.zzb(jSONObject.optJSONArray("allProviders")));
            } else {
                this.zzd = new zzadz(null);
            }
            this.zze = zzaen.zzb(jSONObject.optJSONArray("signinMethods"));
            return this;
        } catch (NullPointerException e10) {
            e = e10;
            throw zzaen.zza(e, zza, str);
        } catch (JSONException e11) {
            e = e11;
            throw zzaen.zza(e, zza, str);
        }
    }

    public final List zzb() {
        return this.zze;
    }
}
