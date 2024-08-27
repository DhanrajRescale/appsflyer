package com.google.android.gms.internal.p002firebaseauthapi;

import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import java.util.List;
import zp.d0;

/* loaded from: classes2.dex */
public final class zzacv {
    private String zza;
    private String zzb;
    private boolean zzc;
    private String zzd;
    private String zze;
    private zzadk zzf;
    private String zzg;
    private String zzh;
    private long zzi;
    private long zzj;
    private boolean zzk;
    private d0 zzl;
    private List zzm;

    public zzacv() {
        this.zzf = new zzadk();
    }

    public final long zza() {
        return this.zzi;
    }

    public final long zzb() {
        return this.zzj;
    }

    public final Uri zzc() {
        if (!TextUtils.isEmpty(this.zze)) {
            return Uri.parse(this.zze);
        }
        return null;
    }

    public final d0 zzd() {
        return this.zzl;
    }

    @NonNull
    public final zzacv zze(d0 d0Var) {
        this.zzl = d0Var;
        return this;
    }

    @NonNull
    public final zzacv zzf(String str) {
        this.zzd = str;
        return this;
    }

    @NonNull
    public final zzacv zzg(String str) {
        this.zzb = str;
        return this;
    }

    public final zzacv zzh(boolean z10) {
        this.zzk = z10;
        return this;
    }

    @NonNull
    public final zzacv zzi(String str) {
        Preconditions.checkNotEmpty(str);
        this.zzg = str;
        return this;
    }

    @NonNull
    public final zzacv zzj(String str) {
        this.zze = str;
        return this;
    }

    @NonNull
    public final zzacv zzk(List list) {
        Preconditions.checkNotNull(list);
        zzadk zzadkVar = new zzadk();
        this.zzf = zzadkVar;
        zzadkVar.zzc().addAll(list);
        return this;
    }

    public final zzadk zzl() {
        return this.zzf;
    }

    public final String zzm() {
        return this.zzd;
    }

    public final String zzn() {
        return this.zzb;
    }

    @NonNull
    public final String zzo() {
        return this.zza;
    }

    public final String zzp() {
        return this.zzh;
    }

    @NonNull
    public final List zzq() {
        return this.zzm;
    }

    @NonNull
    public final List zzr() {
        return this.zzf.zzc();
    }

    public final boolean zzs() {
        return this.zzc;
    }

    public final boolean zzt() {
        return this.zzk;
    }

    public zzacv(String str, String str2, boolean z10, String str3, String str4, zzadk zzadkVar, String str5, String str6, long j10, long j11, boolean z11, d0 d0Var, List list) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = z10;
        this.zzd = str3;
        this.zze = str4;
        this.zzf = zzadk.zzb(zzadkVar);
        this.zzg = str5;
        this.zzh = str6;
        this.zzi = j10;
        this.zzj = j11;
        this.zzk = false;
        this.zzl = null;
        this.zzm = list;
    }
}
