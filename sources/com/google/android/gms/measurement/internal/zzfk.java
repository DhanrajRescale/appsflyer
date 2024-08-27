package com.google.android.gms.measurement.internal;

import android.content.ServiceConnection;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.internal.measurement.zzqx;
import com.google.android.gms.internal.p002firebaseauthapi.a;

/* loaded from: classes2.dex */
final class zzfk implements Runnable {
    final /* synthetic */ com.google.android.gms.internal.measurement.zzbr zza;
    final /* synthetic */ ServiceConnection zzb;
    final /* synthetic */ zzfl zzc;

    public zzfk(zzfl zzflVar, com.google.android.gms.internal.measurement.zzbr zzbrVar, ServiceConnection serviceConnection) {
        this.zzc = zzflVar;
        this.zza = zzbrVar;
        this.zzb = serviceConnection;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        Bundle bundle;
        zzfl zzflVar = this.zzc;
        zzfm zzfmVar = zzflVar.zza;
        str = zzflVar.zzb;
        com.google.android.gms.internal.measurement.zzbr zzbrVar = this.zza;
        ServiceConnection serviceConnection = this.zzb;
        zzfmVar.zza.zzaB().zzg();
        Bundle bundle2 = new Bundle();
        bundle2.putString("package_name", str);
        try {
            bundle = zzbrVar.zzd(bundle2);
        } catch (Exception e10) {
            zzfmVar.zza.zzaA().zzd().zzb("Exception occurred while retrieving the Install Referrer", e10.getMessage());
        }
        if (bundle == null) {
            zzfmVar.zza.zzaA().zzd().zza("Install Referrer Service returned a null response");
            bundle = null;
        }
        zzfmVar.zza.zzaB().zzg();
        zzge.zzO();
        if (bundle != null) {
            long j10 = bundle.getLong("install_begin_timestamp_seconds", 0L) * 1000;
            if (j10 == 0) {
                a.v(zzfmVar.zza, "Service response is missing Install Referrer install timestamp");
            } else {
                String string = bundle.getString("install_referrer");
                if (string != null && !string.isEmpty()) {
                    zzfmVar.zza.zzaA().zzj().zzb("InstallReferrer API result", string);
                    zzlo zzv = zzfmVar.zza.zzv();
                    Uri parse = Uri.parse("?".concat(string));
                    zzqx.zzc();
                    Bundle zzs = zzv.zzs(parse, zzfmVar.zza.zzf().zzs(null, zzeh.zzaw));
                    if (zzs == null) {
                        a.r(zzfmVar.zza, "No campaign params defined in Install Referrer result");
                    } else {
                        String string2 = zzs.getString("medium");
                        if (string2 != null && !"(not set)".equalsIgnoreCase(string2) && !"organic".equalsIgnoreCase(string2)) {
                            long j11 = bundle.getLong("referrer_click_timestamp_seconds", 0L) * 1000;
                            if (j11 == 0) {
                                a.r(zzfmVar.zza, "Install Referrer is missing click timestamp for ad campaign");
                            } else {
                                zzs.putLong("click_timestamp", j11);
                            }
                        }
                        if (j10 == zzfmVar.zza.zzm().zzd.zza()) {
                            a.y(zzfmVar.zza, "Logging Install Referrer campaign from module while it may have already been logged.");
                        }
                        if (zzfmVar.zza.zzJ()) {
                            zzfmVar.zza.zzm().zzd.zzb(j10);
                            zzfmVar.zza.zzaA().zzj().zzb("Logging Install Referrer campaign from gmscore with ", "referrer API v2");
                            zzs.putString("_cis", "referrer API v2");
                            zzfmVar.zza.zzq().zzF("auto", "_cmp", zzs, str);
                        }
                    }
                } else {
                    a.r(zzfmVar.zza, "No referrer defined in Install Referrer response");
                }
            }
        }
        ConnectionTracker.getInstance().unbindService(zzfmVar.zza.zzaw(), serviceConnection);
    }
}
