package com.google.android.gms.internal.p002firebaseauthapi;

import android.util.Log;
import java.io.UnsupportedEncodingException;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzadh {
    private String zza;
    private String zzb;
    private String zzc;
    private Long zzd;
    private Long zze;

    public static zzadh zza(String str) throws UnsupportedEncodingException {
        try {
            zzadh zzadhVar = new zzadh();
            JSONObject jSONObject = new JSONObject(str);
            zzadhVar.zza = jSONObject.optString("iss");
            zzadhVar.zzb = jSONObject.optString("aud");
            zzadhVar.zzc = jSONObject.optString("sub");
            zzadhVar.zzd = Long.valueOf(jSONObject.optLong("iat"));
            zzadhVar.zze = Long.valueOf(jSONObject.optLong("exp"));
            jSONObject.optBoolean("is_anonymous");
            return zzadhVar;
        } catch (JSONException e10) {
            if (Log.isLoggable("JwtToken", 3)) {
                Log.d("JwtToken", "Failed to read JwtToken from JSONObject. ".concat(e10.toString()));
            }
            throw new UnsupportedEncodingException("Failed to read JwtToken from JSONObject. ".concat(e10.toString()));
        }
    }

    public final Long zzb() {
        return this.zze;
    }

    public final Long zzc() {
        return this.zzd;
    }
}
