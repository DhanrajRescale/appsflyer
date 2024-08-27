package com.google.android.gms.internal.p002firebaseauthapi;

import a3.a;
import java.util.Arrays;

/* loaded from: classes2.dex */
final class zzlj {
    private final Class zza;
    private final Class zzb;

    public /* synthetic */ zzlj(Class cls, Class cls2, zzli zzliVar) {
        this.zza = cls;
        this.zzb = cls2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzlj)) {
            return false;
        }
        zzlj zzljVar = (zzlj) obj;
        if (!zzljVar.zza.equals(this.zza) || !zzljVar.zzb.equals(this.zzb)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, this.zzb});
    }

    public final String toString() {
        return a.g(this.zza.getSimpleName(), " with primitive type: ", this.zzb.getSimpleName());
    }
}
