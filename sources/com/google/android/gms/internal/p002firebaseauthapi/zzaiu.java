package com.google.android.gms.internal.p002firebaseauthapi;

/* loaded from: classes2.dex */
public final class zzaiu extends RuntimeException {
    public zzaiu(zzahp zzahpVar) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public final zzags zza() {
        return new zzags(getMessage());
    }
}
