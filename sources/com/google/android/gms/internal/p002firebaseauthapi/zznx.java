package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Collections;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class zznx {
    private HashMap zza = new HashMap();

    public final zznz zza() {
        if (this.zza != null) {
            zznz zznzVar = new zznz(Collections.unmodifiableMap(this.zza), null);
            this.zza = null;
            return zznzVar;
        }
        throw new IllegalStateException("cannot call build() twice");
    }
}
