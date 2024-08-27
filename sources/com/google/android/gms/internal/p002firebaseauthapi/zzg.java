package com.google.android.gms.internal.p002firebaseauthapi;

import nn.d;

/* loaded from: classes2.dex */
final class zzg extends zzf {
    private final char zza;

    public zzg(char c10) {
        this.zza = c10;
    }

    public final String toString() {
        int i10 = this.zza;
        char[] cArr = {'\\', 'u', 0, 0, 0, 0};
        for (int i11 = 0; i11 < 4; i11++) {
            cArr[5 - i11] = "0123456789ABCDEF".charAt(i10 & 15);
            i10 >>= 4;
        }
        return d.k("CharMatcher.is('", String.copyValueOf(cArr), "')");
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzj
    public final boolean zza(char c10) {
        return c10 == this.zza;
    }
}
