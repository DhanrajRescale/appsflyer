package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.internal.p002firebaseauthapi.a;

/* loaded from: classes2.dex */
public final class zzfl implements ServiceConnection {
    final /* synthetic */ zzfm zza;
    private final String zzb;

    public zzfl(zzfm zzfmVar, String str) {
        this.zza = zzfmVar;
        this.zzb = str;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (iBinder != null) {
            try {
                com.google.android.gms.internal.measurement.zzbr zzb = com.google.android.gms.internal.measurement.zzbq.zzb(iBinder);
                if (zzb == null) {
                    this.zza.zza.zzaA().zzk().zza("Install Referrer Service implementation was not found");
                    return;
                } else {
                    this.zza.zza.zzaA().zzj().zza("Install Referrer Service connected");
                    this.zza.zza.zzaB().zzp(new zzfk(this, zzb, this));
                    return;
                }
            } catch (RuntimeException e10) {
                this.zza.zza.zzaA().zzk().zzb("Exception occurred while calling Install Referrer API", e10);
                return;
            }
        }
        a.v(this.zza.zza, "Install Referrer connection returned with null binder");
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        a.y(this.zza.zza, "Install Referrer Service disconnected");
    }
}
