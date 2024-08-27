package com.google.android.gms.internal.p002firebaseauthapi;

import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import nn.d;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzach implements zzaar {
    private static final String zza = "com.google.android.gms.internal.firebase-auth-api.zzach";
    private String zzb;

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaar
    public final /* bridge */ /* synthetic */ zzaar zza(@NonNull String str) throws zzyi {
        zzb(str);
        return this;
    }

    public final zzach zzb(@NonNull String str) throws zzyi {
        try {
            JSONObject jSONObject = new JSONObject(new JSONObject(str).getString("error"));
            jSONObject.getInt("code");
            this.zzb = jSONObject.getString("message");
            return this;
        } catch (NullPointerException | JSONException e10) {
            Log.e(zza, "Failed to parse error for string [" + str + "] with exception: " + e10.getMessage());
            throw new zzyi(d.k("Failed to parse error for string [", str, "]"), e10);
        }
    }

    public final String zzc() {
        return this.zzb;
    }

    public final boolean zzd() {
        if (!TextUtils.isEmpty(this.zzb)) {
            return true;
        }
        return false;
    }
}
