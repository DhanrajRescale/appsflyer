package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.Scopes;
import com.google.android.gms.common.internal.Preconditions;
import org.json.JSONException;
import org.json.JSONObject;
import zp.b;

/* loaded from: classes2.dex */
public final class zzacx implements zzaaq {
    private final String zza;
    private String zzb;
    private String zzc;
    private String zzd;
    private b zze;
    private String zzf;
    private String zzg;

    public zzacx(int i10) {
        this.zza = i10 != 1 ? i10 != 4 ? i10 != 6 ? i10 != 7 ? "REQUEST_TYPE_UNSET_ENUM_VALUE" : "VERIFY_AND_CHANGE_EMAIL" : "EMAIL_SIGNIN" : "VERIFY_EMAIL" : "PASSWORD_RESET";
    }

    public static zzacx zzc(b bVar, String str, String str2) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        Preconditions.checkNotNull(bVar);
        return new zzacx(7, bVar, null, str2, str, null, null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaaq
    public final String zza() throws JSONException {
        char c10;
        JSONObject jSONObject = new JSONObject();
        String str = this.zza;
        int i10 = 0;
        switch (str.hashCode()) {
            case -1452371317:
                if (str.equals("PASSWORD_RESET")) {
                    c10 = 0;
                    break;
                }
                c10 = 65535;
                break;
            case -1341836234:
                if (str.equals("VERIFY_EMAIL")) {
                    c10 = 1;
                    break;
                }
                c10 = 65535;
                break;
            case -1099157829:
                if (str.equals("VERIFY_AND_CHANGE_EMAIL")) {
                    c10 = 3;
                    break;
                }
                c10 = 65535;
                break;
            case 870738373:
                if (str.equals("EMAIL_SIGNIN")) {
                    c10 = 2;
                    break;
                }
                c10 = 65535;
                break;
            default:
                c10 = 65535;
                break;
        }
        if (c10 != 0) {
            if (c10 != 1) {
                if (c10 != 2) {
                    if (c10 == 3) {
                        i10 = 7;
                    }
                } else {
                    i10 = 6;
                }
            } else {
                i10 = 4;
            }
        } else {
            i10 = 1;
        }
        jSONObject.put("requestType", i10);
        String str2 = this.zzb;
        if (str2 != null) {
            jSONObject.put(Scopes.EMAIL, str2);
        }
        String str3 = this.zzc;
        if (str3 != null) {
            jSONObject.put("newEmail", str3);
        }
        String str4 = this.zzd;
        if (str4 != null) {
            jSONObject.put("idToken", str4);
        }
        b bVar = this.zze;
        if (bVar != null) {
            jSONObject.put("androidInstallApp", bVar.f42716e);
            jSONObject.put("canHandleCodeInApp", this.zze.f42718g);
            String str5 = this.zze.f42712a;
            if (str5 != null) {
                jSONObject.put("continueUrl", str5);
            }
            String str6 = this.zze.f42713b;
            if (str6 != null) {
                jSONObject.put("iosBundleId", str6);
            }
            String str7 = this.zze.f42714c;
            if (str7 != null) {
                jSONObject.put("iosAppStoreId", str7);
            }
            String str8 = this.zze.f42715d;
            if (str8 != null) {
                jSONObject.put("androidPackageName", str8);
            }
            String str9 = this.zze.f42717f;
            if (str9 != null) {
                jSONObject.put("androidMinimumVersion", str9);
            }
            String str10 = this.zze.f42721j;
            if (str10 != null) {
                jSONObject.put("dynamicLinkDomain", str10);
            }
        }
        String str11 = this.zzf;
        if (str11 != null) {
            jSONObject.put("tenantId", str11);
        }
        String str12 = this.zzg;
        if (str12 != null) {
            zzaen.zzd(jSONObject, "captchaResp", str12);
        } else {
            zzaen.zzc(jSONObject);
        }
        return jSONObject.toString();
    }

    public final b zzb() {
        return this.zze;
    }

    public final zzacx zzd(b bVar) {
        this.zze = (b) Preconditions.checkNotNull(bVar);
        return this;
    }

    public final zzacx zze(String str) {
        this.zzg = str;
        return this;
    }

    public final zzacx zzf(String str) {
        this.zzb = Preconditions.checkNotEmpty(str);
        return this;
    }

    public final zzacx zzg(String str) {
        this.zzf = str;
        return this;
    }

    public final zzacx zzh(String str) {
        this.zzd = Preconditions.checkNotEmpty(str);
        return this;
    }

    private zzacx(int i10, b bVar, String str, String str2, String str3, String str4, String str5) {
        this.zza = "VERIFY_AND_CHANGE_EMAIL";
        this.zze = (b) Preconditions.checkNotNull(bVar);
        this.zzb = null;
        this.zzc = str2;
        this.zzd = str3;
        this.zzf = null;
        this.zzg = null;
    }
}
