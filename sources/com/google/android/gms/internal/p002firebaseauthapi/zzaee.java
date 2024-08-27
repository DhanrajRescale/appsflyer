package com.google.android.gms.internal.p002firebaseauthapi;

import android.text.TextUtils;
import com.google.android.gms.common.Scopes;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Strings;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import zp.d0;

/* loaded from: classes2.dex */
public final class zzaee implements zzaar {
    private static final String zza = "zzaee";
    private boolean zzb;
    private String zzc;
    private String zzd;
    private long zze;
    private String zzf;
    private String zzg;
    private String zzh;
    private String zzi;
    private String zzj;
    private String zzk;
    private boolean zzl;
    private String zzm;
    private String zzn;
    private String zzo;
    private String zzp;
    private String zzq;
    private String zzr;
    private List zzs;
    private String zzt;

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaar
    public final /* bridge */ /* synthetic */ zzaar zza(String str) throws zzyi {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.zzb = jSONObject.optBoolean("needConfirmation", false);
            jSONObject.optBoolean("needEmail", false);
            this.zzc = Strings.emptyToNull(jSONObject.optString("idToken", null));
            this.zzd = Strings.emptyToNull(jSONObject.optString("refreshToken", null));
            this.zze = jSONObject.optLong("expiresIn", 0L);
            this.zzf = Strings.emptyToNull(jSONObject.optString("localId", null));
            this.zzg = Strings.emptyToNull(jSONObject.optString(Scopes.EMAIL, null));
            this.zzh = Strings.emptyToNull(jSONObject.optString("displayName", null));
            this.zzi = Strings.emptyToNull(jSONObject.optString("photoUrl", null));
            this.zzj = Strings.emptyToNull(jSONObject.optString("providerId", null));
            this.zzk = Strings.emptyToNull(jSONObject.optString("rawUserInfo", null));
            this.zzl = jSONObject.optBoolean("isNewUser", false);
            this.zzm = jSONObject.optString("oauthAccessToken", null);
            this.zzn = jSONObject.optString("oauthIdToken", null);
            this.zzp = Strings.emptyToNull(jSONObject.optString("errorMessage", null));
            this.zzq = Strings.emptyToNull(jSONObject.optString("pendingToken", null));
            this.zzr = Strings.emptyToNull(jSONObject.optString("tenantId", null));
            this.zzs = zzadi.zzg(jSONObject.optJSONArray("mfaInfo"));
            this.zzt = Strings.emptyToNull(jSONObject.optString("mfaPendingCredential", null));
            this.zzo = Strings.emptyToNull(jSONObject.optString("oauthTokenSecret", null));
            return this;
        } catch (NullPointerException | JSONException e10) {
            throw zzaen.zza(e10, zza, str);
        }
    }

    public final long zzb() {
        return this.zze;
    }

    public final d0 zzc() {
        if (TextUtils.isEmpty(this.zzm) && TextUtils.isEmpty(this.zzn)) {
            return null;
        }
        String str = this.zzj;
        String str2 = this.zzn;
        String str3 = this.zzm;
        String str4 = this.zzq;
        String str5 = this.zzo;
        Preconditions.checkNotEmpty(str, "Must specify a non-empty providerId");
        if (TextUtils.isEmpty(str2) && TextUtils.isEmpty(str3)) {
            throw new IllegalArgumentException("Must specify an idToken or an accessToken.");
        }
        return new d0(str, str2, str3, null, str4, str5, null);
    }

    public final String zzd() {
        return this.zzg;
    }

    public final String zze() {
        return this.zzp;
    }

    public final String zzf() {
        return this.zzc;
    }

    public final String zzg() {
        return this.zzt;
    }

    public final String zzh() {
        return this.zzj;
    }

    public final String zzi() {
        return this.zzk;
    }

    public final String zzj() {
        return this.zzd;
    }

    public final String zzk() {
        return this.zzr;
    }

    public final List zzl() {
        return this.zzs;
    }

    public final boolean zzm() {
        if (!TextUtils.isEmpty(this.zzt)) {
            return true;
        }
        return false;
    }

    public final boolean zzn() {
        return this.zzb;
    }

    public final boolean zzo() {
        return this.zzl;
    }

    public final boolean zzp() {
        if (!this.zzb && TextUtils.isEmpty(this.zzp)) {
            return false;
        }
        return true;
    }
}
