package com.google.android.gms.measurement.internal;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.zzra;
import com.google.android.gms.internal.p002firebaseauthapi.a;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class zzkv extends zzks {
    public zzkv(zzlg zzlgVar) {
        super(zzlgVar);
    }

    private final String zzd(String str) {
        String zzi = this.zzf.zzo().zzi(str);
        if (!TextUtils.isEmpty(zzi)) {
            Uri parse = Uri.parse((String) zzeh.zzq.zza(null));
            Uri.Builder buildUpon = parse.buildUpon();
            buildUpon.authority(zzi + "." + parse.getAuthority());
            return buildUpon.build().toString();
        }
        return (String) zzeh.zzq.zza(null);
    }

    public final zzku zza(String str) {
        String str2;
        zzra.zzc();
        zzku zzkuVar = null;
        if (this.zzt.zzf().zzs(null, zzeh.zzaq)) {
            a.y(this.zzt, "sgtm feature flag enabled.");
            zzh zzj = this.zzf.zzi().zzj(str);
            if (zzj == null) {
                return new zzku(zzd(str));
            }
            if (zzj.zzan()) {
                a.y(this.zzt, "sgtm upload enabled in manifest.");
                com.google.android.gms.internal.measurement.zzff zze = this.zzf.zzo().zze(zzj.zzu());
                if (zze != null) {
                    String zzj2 = zze.zzj();
                    if (!TextUtils.isEmpty(zzj2)) {
                        String zzi = zze.zzi();
                        zzes zzj3 = this.zzt.zzaA().zzj();
                        if (true != TextUtils.isEmpty(zzi)) {
                            str2 = "N";
                        } else {
                            str2 = "Y";
                        }
                        zzj3.zzc("sgtm configured with upload_url, server_info", zzj2, str2);
                        if (TextUtils.isEmpty(zzi)) {
                            this.zzt.zzay();
                            zzkuVar = new zzku(zzj2);
                        } else {
                            HashMap hashMap = new HashMap();
                            hashMap.put("x-google-sgtm-server-info", zzi);
                            zzkuVar = new zzku(zzj2, hashMap);
                        }
                    }
                }
            }
            if (zzkuVar != null) {
                return zzkuVar;
            }
        }
        return new zzku(zzd(str));
    }
}
