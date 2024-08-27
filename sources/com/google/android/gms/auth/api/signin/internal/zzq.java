package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.util.VisibleForTesting;

/* loaded from: classes2.dex */
public final class zzq {
    private static zzq zzcq;

    @VisibleForTesting
    private Storage zzcr;

    @VisibleForTesting
    private GoogleSignInAccount zzcs;

    @VisibleForTesting
    private GoogleSignInOptions zzct;

    private zzq(Context context) {
        Storage storage = Storage.getInstance(context);
        this.zzcr = storage;
        this.zzcs = storage.getSavedDefaultGoogleSignInAccount();
        this.zzct = this.zzcr.getSavedDefaultGoogleSignInOptions();
    }

    public static synchronized zzq zzd(@NonNull Context context) {
        zzq zze;
        synchronized (zzq.class) {
            zze = zze(context.getApplicationContext());
        }
        return zze;
    }

    private static synchronized zzq zze(Context context) {
        synchronized (zzq.class) {
            zzq zzqVar = zzcq;
            if (zzqVar != null) {
                return zzqVar;
            }
            zzq zzqVar2 = new zzq(context);
            zzcq = zzqVar2;
            return zzqVar2;
        }
    }

    public final synchronized void clear() {
        this.zzcr.clear();
        this.zzcs = null;
        this.zzct = null;
    }

    public final synchronized void zzc(GoogleSignInOptions googleSignInOptions, GoogleSignInAccount googleSignInAccount) {
        this.zzcr.saveDefaultGoogleSignInAccount(googleSignInAccount, googleSignInOptions);
        this.zzcs = googleSignInAccount;
        this.zzct = googleSignInOptions;
    }

    public final synchronized GoogleSignInAccount zzr() {
        return this.zzcs;
    }

    public final synchronized GoogleSignInOptions zzs() {
        return this.zzct;
    }
}
