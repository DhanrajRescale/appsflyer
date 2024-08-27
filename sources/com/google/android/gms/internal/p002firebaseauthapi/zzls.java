package com.google.android.gms.internal.p002firebaseauthapi;

import a3.a;
import java.util.Arrays;

/* loaded from: classes2.dex */
final class zzls {
    private final Class zza;
    private final zzvx zzb;

    public /* synthetic */ zzls(Class cls, zzvx zzvxVar, zzlr zzlrVar) {
        this.zza = cls;
        this.zzb = zzvxVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzls)) {
            return false;
        }
        zzls zzlsVar = (zzls) obj;
        if (!zzlsVar.zza.equals(this.zza) || !zzlsVar.zzb.equals(this.zzb)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, this.zzb});
    }

    public final String toString() {
        return a.g(this.zza.getSimpleName(), ", object identifier: ", String.valueOf(this.zzb));
    }
}
