package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.Scopes;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.logging.Logger;
import org.json.JSONException;
import org.json.JSONObject;
import zp.c;
import zp.f;

/* loaded from: classes2.dex */
public final class zzacl implements zzaaq {
    private static final String zza = "zzacl";
    private static final Logger zzb = new Logger(zza, new String[0]);
    private final String zzc;
    private final String zzd;
    private final String zze;
    private final String zzf;

    public zzacl(f fVar, String str, String str2) {
        this.zzc = Preconditions.checkNotEmpty(fVar.f42740a);
        this.zzd = Preconditions.checkNotEmpty(fVar.f42742c);
        this.zze = str;
        this.zzf = str2;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaaq
    public final String zza() throws JSONException {
        c cVar;
        String str;
        String str2 = this.zzd;
        zzap zzapVar = c.f42722d;
        Preconditions.checkNotEmpty(str2);
        String str3 = null;
        try {
            cVar = new c(str2);
        } catch (IllegalArgumentException unused) {
            cVar = null;
        }
        if (cVar != null) {
            str = cVar.f42723a;
        } else {
            str = null;
        }
        if (cVar != null) {
            str3 = cVar.f42725c;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(Scopes.EMAIL, this.zzc);
        if (str != null) {
            jSONObject.put("oobCode", str);
        }
        if (str3 != null) {
            jSONObject.put("tenantId", str3);
        }
        String str4 = this.zze;
        if (str4 != null) {
            jSONObject.put("idToken", str4);
        }
        String str5 = this.zzf;
        if (str5 != null) {
            zzaen.zzd(jSONObject, "captchaResp", str5);
        } else {
            zzaen.zzc(jSONObject);
        }
        return jSONObject.toString();
    }
}
