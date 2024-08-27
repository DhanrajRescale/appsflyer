package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import nn.d;

/* loaded from: classes2.dex */
public final class zzat implements Iterable, zzap {
    private final String zza;

    public zzat(String str) {
        if (str != null) {
            this.zza = str;
            return;
        }
        throw new IllegalArgumentException("StringValue cannot be null.");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzat)) {
            return false;
        }
        return this.zza.equals(((zzat) obj).zza);
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new zzas(this);
    }

    public final String toString() {
        return d.k("\"", this.zza, "\"");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:44:0x0181. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:114:0x03c8  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0414  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0496  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x04e8  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0548  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x059e  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x05e6  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0621  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0336  */
    @Override // com.google.android.gms.internal.measurement.zzap
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.internal.measurement.zzap zzbU(java.lang.String r21, com.google.android.gms.internal.measurement.zzg r22, java.util.List r23) {
        /*
            Method dump skipped, instructions count: 1748
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzat.zzbU(java.lang.String, com.google.android.gms.internal.measurement.zzg, java.util.List):com.google.android.gms.internal.measurement.zzap");
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final zzap zzd() {
        return new zzat(this.zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final Boolean zzg() {
        return Boolean.valueOf(!this.zza.isEmpty());
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final Double zzh() {
        if (this.zza.isEmpty()) {
            return Double.valueOf(0.0d);
        }
        try {
            return Double.valueOf(this.zza);
        } catch (NumberFormatException unused) {
            return Double.valueOf(Double.NaN);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final String zzi() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final Iterator zzl() {
        return new zzar(this);
    }
}
