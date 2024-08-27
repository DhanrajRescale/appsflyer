package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.Scopes;
import com.google.android.gms.common.util.Strings;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzacu implements zzaar {
    private static final String zza = "zzacu";
    private zzacw zzb;

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaar
    public final /* bridge */ /* synthetic */ zzaar zza(String str) throws zzyi {
        zzacw zzacwVar;
        int i10;
        zzacv zzacvVar;
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (!jSONObject.has("users")) {
                this.zzb = new zzacw();
            } else {
                JSONArray optJSONArray = jSONObject.optJSONArray("users");
                if (optJSONArray != null && optJSONArray.length() != 0) {
                    ArrayList arrayList = new ArrayList(optJSONArray.length());
                    boolean z10 = false;
                    int i11 = 0;
                    while (i11 < optJSONArray.length()) {
                        JSONObject jSONObject2 = optJSONArray.getJSONObject(i11);
                        if (jSONObject2 == null) {
                            zzacvVar = new zzacv();
                            i10 = i11;
                        } else {
                            i10 = i11;
                            zzacvVar = new zzacv(Strings.emptyToNull(jSONObject2.optString("localId", null)), Strings.emptyToNull(jSONObject2.optString(Scopes.EMAIL, null)), jSONObject2.optBoolean("emailVerified", z10), Strings.emptyToNull(jSONObject2.optString("displayName", null)), Strings.emptyToNull(jSONObject2.optString("photoUrl", null)), zzadk.zza(jSONObject2.optJSONArray("providerUserInfo")), Strings.emptyToNull(jSONObject2.optString("rawPassword", null)), Strings.emptyToNull(jSONObject2.optString("phoneNumber", null)), jSONObject2.optLong("createdAt", 0L), jSONObject2.optLong("lastLoginAt", 0L), false, null, zzadi.zzg(jSONObject2.optJSONArray("mfaInfo")));
                        }
                        arrayList.add(zzacvVar);
                        i11 = i10 + 1;
                        z10 = false;
                    }
                    zzacwVar = new zzacw(arrayList);
                    this.zzb = zzacwVar;
                }
                zzacwVar = new zzacw(new ArrayList());
                this.zzb = zzacwVar;
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

    public final List zzb() {
        return this.zzb.zza();
    }
}
