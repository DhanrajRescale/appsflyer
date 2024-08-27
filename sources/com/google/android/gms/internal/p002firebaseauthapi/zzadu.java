package com.google.android.gms.internal.p002firebaseauthapi;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class zzadu implements zzaar {
    private static final String zza = "zzadu";

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaar
    /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public zzadu zza(String str) throws zzyi {
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.optJSONObject("phoneSessionInfo") != null) {
                zzady zzadyVar = new zzady();
                zzadyVar.zzd(str);
                return zzadyVar;
            }
            if (jSONObject.optJSONObject("totpSessionInfo") != null) {
                throw new IllegalArgumentException("Not Implemented.");
            }
            throw new IllegalArgumentException("Missing phoneSessionInfo or totpSessionInfo.");
        } catch (NullPointerException e10) {
            e = e10;
            throw zzaen.zza(e, zza, str);
        } catch (JSONException e11) {
            e = e11;
            throw zzaen.zza(e, zza, str);
        }
    }

    public String zzc() {
        return null;
    }
}
