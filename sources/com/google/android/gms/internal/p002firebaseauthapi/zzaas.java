package com.google.android.gms.internal.p002firebaseauthapi;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.auth.api.credentials.CredentialsApi;
import com.google.android.gms.common.internal.LibraryVersion;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzaas {
    private final int zza;

    /* JADX WARN: Multi-variable type inference failed */
    public zzaas(String str) {
        int i10 = -1;
        try {
            List zzd = zzab.zzc("[.-]").zzd(str);
            if (zzd.size() == 1) {
                i10 = Integer.parseInt(str);
                str = str;
            } else {
                str = str;
                if (zzd.size() >= 3) {
                    int parseInt = (Integer.parseInt((String) zzd.get(1)) * CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT) + (Integer.parseInt((String) zzd.get(0)) * 1000000);
                    int parseInt2 = Integer.parseInt((String) zzd.get(2));
                    i10 = parseInt + parseInt2;
                    str = parseInt2;
                }
            }
        } catch (IllegalArgumentException e10) {
            if (Log.isLoggable("LibraryVersionContainer", 3)) {
                Log.d("LibraryVersionContainer", String.format("Version code parsing failed for: %s with exception %s.", str, e10));
            }
        }
        this.zza = i10;
    }

    public static zzaas zza() {
        String version = LibraryVersion.getInstance().getVersion("firebase-auth");
        if (TextUtils.isEmpty(version) || version.equals("UNKNOWN")) {
            version = "-1";
        }
        return new zzaas(version);
    }

    public final String zzb() {
        return String.format("X%s", Integer.toString(this.zza));
    }
}
