package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Arrays;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzog {
    private final zznz zza;
    private final List zzb;
    private final Integer zzc;

    public /* synthetic */ zzog(zznz zznzVar, List list, Integer num, zzof zzofVar) {
        this.zza = zznzVar;
        this.zzb = list;
        this.zzc = num;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzog)) {
            return false;
        }
        zzog zzogVar = (zzog) obj;
        if (this.zza.equals(zzogVar.zza) && this.zzb.equals(zzogVar.zzb)) {
            Integer num = this.zzc;
            Integer num2 = zzogVar.zzc;
            if (num != num2) {
                if (num != null && num.equals(num2)) {
                    return true;
                }
            } else {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, this.zzb});
    }

    public final String toString() {
        return String.format("(annotations=%s, entries=%s, primaryKeyId=%s)", this.zza, this.zzb, this.zzc);
    }
}
