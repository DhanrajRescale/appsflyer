package com.google.android.gms.internal.p002firebaseauthapi;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class zzju implements zzca {
    private final SharedPreferences.Editor zza;
    private final String zzb;

    public zzju(Context context, String str, String str2) {
        if (str != null) {
            this.zzb = str;
            Context applicationContext = context.getApplicationContext();
            if (str2 == null) {
                this.zza = PreferenceManager.getDefaultSharedPreferences(applicationContext).edit();
                return;
            } else {
                this.zza = applicationContext.getSharedPreferences(str2, 0).edit();
                return;
            }
        }
        throw new IllegalArgumentException("keysetName cannot be null");
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzca
    public final void zzb(zzrl zzrlVar) throws IOException {
        if (this.zza.putString(this.zzb, zzvl.zza(zzrlVar.zzq())).commit()) {
        } else {
            throw new IOException("Failed to write to SharedPreferences");
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzca
    public final void zzc(zztc zztcVar) throws IOException {
        if (this.zza.putString(this.zzb, zzvl.zza(zztcVar.zzq())).commit()) {
        } else {
            throw new IOException("Failed to write to SharedPreferences");
        }
    }
}
