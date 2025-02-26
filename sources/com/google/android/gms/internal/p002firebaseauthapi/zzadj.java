package com.google.android.gms.internal.p002firebaseauthapi;

import android.net.Uri;
import android.text.TextUtils;

/* loaded from: classes2.dex */
public final class zzadj {
    private String zza;
    private String zzb;
    private String zzc;
    private String zzd;
    private String zze;
    private String zzf;
    private String zzg;

    public zzadj() {
    }

    public zzadj(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = str4;
        this.zze = null;
        this.zzf = str6;
        this.zzg = str7;
    }

    public final Uri zza() {
        if (!TextUtils.isEmpty(this.zzc)) {
            return Uri.parse(this.zzc);
        }
        return null;
    }

    public final String zzb() {
        return this.zzb;
    }

    public final String zzc() {
        return this.zzg;
    }

    public final String zzd() {
        return this.zza;
    }

    public final String zze() {
        return this.zzf;
    }

    public final String zzf() {
        return this.zzd;
    }

    public final String zzg() {
        return this.zze;
    }

    public final void zzh(String str) {
        this.zze = str;
    }
}
