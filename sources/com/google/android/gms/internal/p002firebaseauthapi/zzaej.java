package com.google.android.gms.internal.p002firebaseauthapi;

import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzaej implements zzaaq {
    private String zza;
    private String zzb;
    private String zzc;
    private String zzd;
    private String zze;
    private boolean zzf;

    private zzaej() {
    }

    public static zzaej zzb(String str, String str2, boolean z10) {
        zzaej zzaejVar = new zzaej();
        zzaejVar.zzb = Preconditions.checkNotEmpty(str);
        zzaejVar.zzc = Preconditions.checkNotEmpty(str2);
        zzaejVar.zzf = z10;
        return zzaejVar;
    }

    public static zzaej zzc(String str, String str2, boolean z10) {
        zzaej zzaejVar = new zzaej();
        zzaejVar.zza = Preconditions.checkNotEmpty(str);
        zzaejVar.zzd = Preconditions.checkNotEmpty(str2);
        zzaejVar.zzf = z10;
        return zzaejVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaaq
    public final String zza() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        if (!TextUtils.isEmpty(this.zzd)) {
            jSONObject.put("phoneNumber", this.zza);
            jSONObject.put("temporaryProof", this.zzd);
        } else {
            jSONObject.put("sessionInfo", this.zzb);
            jSONObject.put("code", this.zzc);
        }
        String str = this.zze;
        if (str != null) {
            jSONObject.put("idToken", str);
        }
        if (!this.zzf) {
            jSONObject.put("operation", 2);
        }
        return jSONObject.toString();
    }

    public final void zzd(String str) {
        this.zze = str;
    }
}
