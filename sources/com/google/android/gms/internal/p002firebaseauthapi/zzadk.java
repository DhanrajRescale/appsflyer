package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.Scopes;
import com.google.android.gms.common.util.Strings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzadk {
    private final List zza;

    public zzadk() {
        this.zza = new ArrayList();
    }

    public static zzadk zza(JSONArray jSONArray) throws JSONException {
        zzadj zzadjVar;
        if (jSONArray != null && jSONArray.length() != 0) {
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i10);
                if (jSONObject == null) {
                    zzadjVar = new zzadj();
                } else {
                    zzadjVar = new zzadj(Strings.emptyToNull(jSONObject.optString("federatedId", null)), Strings.emptyToNull(jSONObject.optString("displayName", null)), Strings.emptyToNull(jSONObject.optString("photoUrl", null)), Strings.emptyToNull(jSONObject.optString("providerId", null)), null, Strings.emptyToNull(jSONObject.optString("phoneNumber", null)), Strings.emptyToNull(jSONObject.optString(Scopes.EMAIL, null)));
                }
                arrayList.add(zzadjVar);
            }
            return new zzadk(arrayList);
        }
        return new zzadk(new ArrayList());
    }

    public static zzadk zzb(zzadk zzadkVar) {
        List list = zzadkVar.zza;
        zzadk zzadkVar2 = new zzadk();
        if (list != null) {
            zzadkVar2.zza.addAll(list);
        }
        return zzadkVar2;
    }

    public final List zzc() {
        return this.zza;
    }

    public zzadk(List list) {
        if (!list.isEmpty()) {
            this.zza = Collections.unmodifiableList(list);
        } else {
            this.zza = Collections.emptyList();
        }
    }
}
