package com.google.android.gms.internal.p002firebaseauthapi;

import a3.a;
import java.util.Arrays;

/* loaded from: classes2.dex */
final class zzlu {
    private final Class zza;
    private final Class zzb;

    public /* synthetic */ zzlu(Class cls, Class cls2, zzlt zzltVar) {
        this.zza = cls;
        this.zzb = cls2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzlu)) {
            return false;
        }
        zzlu zzluVar = (zzlu) obj;
        if (!zzluVar.zza.equals(this.zza) || !zzluVar.zzb.equals(this.zzb)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, this.zzb});
    }

    public final String toString() {
        return a.g(this.zza.getSimpleName(), " with serialization type: ", this.zzb.getSimpleName());
    }
}
