package com.google.android.gms.internal.p002firebaseauthapi;

import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import okhttp3.HttpUrl;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzadi {
    private final String zza;

    @NonNull
    private final String zzb;
    private final String zzc;
    private final long zzd;
    private final zzaea zze;
    private String zzf;

    public zzadi(String str, String str2, String str3, long j10, zzaea zzaeaVar) {
        if (!TextUtils.isEmpty(str) && zzaeaVar != null) {
            Log.e("MfaInfo", "Cannot have both MFA phone_info and totp_info");
            throw new IllegalArgumentException("Cannot have both MFA phone_info and totp_info");
        }
        this.zza = str;
        this.zzb = Preconditions.checkNotEmpty(str2);
        this.zzc = str3;
        this.zzd = j10;
        this.zze = zzaeaVar;
    }

    public static zzadi zzb(@NonNull JSONObject jSONObject) {
        zzaea zzaeaVar;
        String optString = jSONObject.optString("phoneInfo", null);
        String optString2 = jSONObject.optString("mfaEnrollmentId", null);
        String optString3 = jSONObject.optString("displayName", null);
        long zzh = zzh(jSONObject.optString("enrolledAt", HttpUrl.FRAGMENT_ENCODE_SET));
        if (jSONObject.opt("totpInfo") != null) {
            zzaeaVar = new zzaea();
        } else {
            zzaeaVar = null;
        }
        zzadi zzadiVar = new zzadi(optString, optString2, optString3, zzh, zzaeaVar);
        zzadiVar.zzf = jSONObject.optString("unobfuscatedPhoneInfo");
        return zzadiVar;
    }

    public static List zzg(JSONArray jSONArray) throws JSONException {
        if (jSONArray != null && jSONArray.length() != 0) {
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                arrayList.add(zzb(jSONArray.getJSONObject(i10)));
            }
            return arrayList;
        }
        return new ArrayList();
    }

    private static long zzh(String str) {
        try {
            zzait zzb = zzajo.zzb(str);
            zzajo.zza(zzb);
            return zzb.zzb();
        } catch (ParseException e10) {
            Log.w("MfaInfo", "Could not parse timestamp as ISOString. Invalid ISOString \"" + str + "\"", e10);
            return 0L;
        }
    }

    public final long zza() {
        return this.zzd;
    }

    public final zzaea zzc() {
        return this.zze;
    }

    public final String zzd() {
        return this.zzc;
    }

    public final String zze() {
        return this.zzb;
    }

    public final String zzf() {
        return this.zza;
    }
}
