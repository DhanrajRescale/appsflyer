package com.google.android.gms.internal.p002firebaseauthapi;

import com.airbnb.deeplinkdispatch.UrlTreeKt;
import jr.h;

/* loaded from: classes2.dex */
final class zzacg extends zzadl {
    private final String zza;
    private final String zzb;

    public zzacg(String str, String str2) {
        this.zza = str;
        this.zzb = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzadl) {
            zzadl zzadlVar = (zzadl) obj;
            String str = this.zza;
            if (str != null ? str.equals(zzadlVar.zzb()) : zzadlVar.zzb() == null) {
                String str2 = this.zzb;
                if (str2 != null ? str2.equals(zzadlVar.zza()) : zzadlVar.zza() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        String str = this.zza;
        int i10 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        String str2 = this.zzb;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return ((hashCode ^ 1000003) * 1000003) ^ i10;
    }

    public final String toString() {
        return h.s("RecaptchaEnforcementState{provider=", this.zza, ", enforcementState=", this.zzb, UrlTreeKt.componentParamSuffix);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadl
    public final String zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadl
    public final String zzb() {
        return this.zza;
    }
}
