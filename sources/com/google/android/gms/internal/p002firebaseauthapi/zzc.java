package com.google.android.gms.internal.p002firebaseauthapi;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes2.dex */
public final class zzc extends Handler {
    private final Looper zza;

    public zzc() {
        this.zza = Looper.getMainLooper();
    }

    public zzc(Looper looper) {
        super(looper);
        this.zza = Looper.getMainLooper();
    }
}
