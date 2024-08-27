package com.google.android.gms.internal.p002firebaseauthapi;

import androidx.annotation.NonNull;
import com.assetgro.stockgro.data.local.preference.UserPreferences;
import com.google.android.gms.common.Scopes;
import com.google.android.gms.common.internal.Preconditions;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzadq implements zzaaq {
    private String zza;
    private String zzb;
    private String zzc;
    private String zzd;
    private String zze;
    private String zzf;
    private final zzadz zzg = new zzadz(null);
    private final zzadz zzh = new zzadz(null);
    private String zzi;

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaaq
    public final String zza() throws JSONException {
        char c10;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("returnSecureToken", true);
        if (!this.zzh.zza().isEmpty()) {
            List zza = this.zzh.zza();
            JSONArray jSONArray = new JSONArray();
            for (int i10 = 0; i10 < zza.size(); i10++) {
                jSONArray.put(zza.get(i10));
            }
            jSONObject.put("deleteProvider", jSONArray);
        }
        List zza2 = this.zzg.zza();
        int size = zza2.size();
        int[] iArr = new int[size];
        for (int i11 = 0; i11 < zza2.size(); i11++) {
            String str = (String) zza2.get(i11);
            int i12 = 2;
            switch (str.hashCode()) {
                case -333046776:
                    if (str.equals(UserPreferences.KEY_USER_DISPLAY_NAME)) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 66081660:
                    if (str.equals("EMAIL")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case 1939891618:
                    if (str.equals("PHOTO_URL")) {
                        c10 = 3;
                        break;
                    }
                    break;
                case 1999612571:
                    if (str.equals("PASSWORD")) {
                        c10 = 2;
                        break;
                    }
                    break;
            }
            c10 = 65535;
            if (c10 != 0) {
                if (c10 != 1) {
                    if (c10 != 2) {
                        if (c10 != 3) {
                            i12 = 0;
                        } else {
                            i12 = 4;
                        }
                    } else {
                        i12 = 5;
                    }
                }
            } else {
                i12 = 1;
            }
            iArr[i11] = i12;
        }
        if (size > 0) {
            JSONArray jSONArray2 = new JSONArray();
            for (int i13 = 0; i13 < size; i13++) {
                jSONArray2.put(iArr[i13]);
            }
            jSONObject.put("deleteAttribute", jSONArray2);
        }
        String str2 = this.zza;
        if (str2 != null) {
            jSONObject.put("idToken", str2);
        }
        String str3 = this.zzc;
        if (str3 != null) {
            jSONObject.put(Scopes.EMAIL, str3);
        }
        String str4 = this.zzd;
        if (str4 != null) {
            jSONObject.put("password", str4);
        }
        String str5 = this.zzb;
        if (str5 != null) {
            jSONObject.put("displayName", str5);
        }
        String str6 = this.zzf;
        if (str6 != null) {
            jSONObject.put("photoUrl", str6);
        }
        String str7 = this.zze;
        if (str7 != null) {
            jSONObject.put("oobCode", str7);
        }
        String str8 = this.zzi;
        if (str8 != null) {
            jSONObject.put("tenantId", str8);
        }
        return jSONObject.toString();
    }

    @NonNull
    public final zzadq zzb(String str) {
        Preconditions.checkNotEmpty(str);
        this.zzh.zza().add(str);
        return this;
    }

    @NonNull
    public final zzadq zzc(String str) {
        if (str == null) {
            this.zzg.zza().add(UserPreferences.KEY_USER_DISPLAY_NAME);
        } else {
            this.zzb = str;
        }
        return this;
    }

    @NonNull
    public final zzadq zzd(String str) {
        if (str == null) {
            this.zzg.zza().add("EMAIL");
        } else {
            this.zzc = str;
        }
        return this;
    }

    @NonNull
    public final zzadq zze(String str) {
        this.zza = Preconditions.checkNotEmpty(str);
        return this;
    }

    @NonNull
    public final zzadq zzf(String str) {
        this.zze = Preconditions.checkNotEmpty(str);
        return this;
    }

    @NonNull
    public final zzadq zzg(String str) {
        if (str == null) {
            this.zzg.zza().add("PASSWORD");
        } else {
            this.zzd = str;
        }
        return this;
    }

    @NonNull
    public final zzadq zzh(String str) {
        if (str == null) {
            this.zzg.zza().add("PHOTO_URL");
        } else {
            this.zzf = str;
        }
        return this;
    }

    @NonNull
    public final zzadq zzi(String str) {
        this.zzi = str;
        return this;
    }

    public final String zzj() {
        return this.zzb;
    }

    public final String zzk() {
        return this.zzc;
    }

    public final String zzl() {
        return this.zzd;
    }

    public final String zzm() {
        return this.zzf;
    }

    public final boolean zzn(String str) {
        Preconditions.checkNotEmpty(str);
        return this.zzg.zza().contains(str);
    }
}
