package com.google.android.gms.measurement.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzfc extends BroadcastReceiver {

    @VisibleForTesting
    static final String zza = "com.google.android.gms.measurement.internal.zzfc";
    private final zzlg zzb;
    private boolean zzc;
    private boolean zzd;

    public zzfc(zzlg zzlgVar) {
        Preconditions.checkNotNull(zzlgVar);
        this.zzb = zzlgVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.zzb.zzB();
        String action = intent.getAction();
        this.zzb.zzaA().zzj().zzb("NetworkBroadcastReceiver received action", action);
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            boolean zza2 = this.zzb.zzl().zza();
            if (this.zzd != zza2) {
                this.zzd = zza2;
                this.zzb.zzaB().zzp(new zzfb(this, zza2));
                return;
            }
            return;
        }
        this.zzb.zzaA().zzk().zzb("NetworkBroadcastReceiver received unknown action", action);
    }

    public final void zzb() {
        this.zzb.zzB();
        this.zzb.zzaB().zzg();
        if (this.zzc) {
            return;
        }
        this.zzb.zzaw().registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        this.zzd = this.zzb.zzl().zza();
        this.zzb.zzaA().zzj().zzb("Registering connectivity change receiver. Network connected", Boolean.valueOf(this.zzd));
        this.zzc = true;
    }

    public final void zzc() {
        this.zzb.zzB();
        this.zzb.zzaB().zzg();
        this.zzb.zzaB().zzg();
        if (this.zzc) {
            this.zzb.zzaA().zzj().zza("Unregistering connectivity change receiver");
            this.zzc = false;
            this.zzd = false;
            try {
                this.zzb.zzaw().unregisterReceiver(this);
            } catch (IllegalArgumentException e10) {
                this.zzb.zzaA().zzd().zzb("Failed to unregister the network broadcast receiver", e10);
            }
        }
    }
}
