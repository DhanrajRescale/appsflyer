package com.google.android.recaptcha.internal;

import java.util.TimerTask;
import qu.f0;
import yk.g;

/* loaded from: classes2.dex */
public final class zzal extends TimerTask {
    final /* synthetic */ zzao zza;

    public zzal(zzao zzaoVar) {
        this.zza = zzaoVar;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        f0 f0Var;
        f0Var = this.zza.zzd;
        g.H(f0Var, null, null, new zzam(this.zza, null), 3);
    }
}
