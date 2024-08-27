package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.util.Strings;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzadd implements zzaar {
    private static final String zza = "zzadd";
    private String zzb;
    private zzam zzc;
    private boolean zzd = false;

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaar
    public final /* bridge */ /* synthetic */ zzaar zza(String str) throws zzyi {
        zzam zzh;
        String zza2;
        zzacg zzacgVar;
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.zzb = Strings.emptyToNull(jSONObject.optString("recaptchaKey"));
            if (jSONObject.has("recaptchaEnforcementState")) {
                JSONArray optJSONArray = jSONObject.optJSONArray("recaptchaEnforcementState");
                boolean z10 = false;
                if (optJSONArray != null && optJSONArray.length() != 0) {
                    zzaj zzajVar = new zzaj();
                    for (int i10 = 0; i10 < optJSONArray.length(); i10++) {
                        JSONObject jSONObject2 = optJSONArray.getJSONObject(i10);
                        if (jSONObject2 == null) {
                            zzacgVar = new zzacg(null, null);
                        } else {
                            zzacgVar = new zzacg(Strings.emptyToNull(jSONObject2.optString("provider")), Strings.emptyToNull(jSONObject2.optString("enforcementState")));
                        }
                        zzajVar.zzb(zzacgVar);
                    }
                    zzh = zzajVar.zzc();
                    this.zzc = zzh;
                    if (zzh != null && !zzh.isEmpty()) {
                        zza2 = ((zzadl) zzh.get(0)).zza();
                        String zzb = ((zzadl) zzh.get(0)).zzb();
                        if (zza2 != null && zzb != null && ((zza2.equals("ENFORCE") || zza2.equals("AUDIT")) && zzb.equals("EMAIL_PASSWORD_PROVIDER"))) {
                            z10 = true;
                        }
                    }
                    this.zzd = z10;
                }
                zzh = zzam.zzh(new ArrayList());
                this.zzc = zzh;
                if (zzh != null) {
                    zza2 = ((zzadl) zzh.get(0)).zza();
                    String zzb2 = ((zzadl) zzh.get(0)).zzb();
                    if (zza2 != null) {
                        z10 = true;
                    }
                }
                this.zzd = z10;
            }
            return this;
        } catch (NullPointerException e10) {
            e = e10;
            throw zzaen.zza(e, zza, str);
        } catch (JSONException e11) {
            e = e11;
            throw zzaen.zza(e, zza, str);
        }
    }

    public final String zzb() {
        return this.zzb;
    }

    public final boolean zzc() {
        return this.zzd;
    }
}
