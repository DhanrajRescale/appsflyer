package com.google.android.gms.internal.icing;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class zzfe {
    private static final zzfe zza = new zzfe(0, new int[0], new Object[0], false);
    private int zzb;
    private int[] zzc;
    private Object[] zzd;
    private int zze;

    private zzfe(int i10, int[] iArr, Object[] objArr, boolean z10) {
        this.zze = -1;
        this.zzb = 0;
        this.zzc = iArr;
        this.zzd = objArr;
    }

    public static zzfe zza() {
        return zza;
    }

    public static zzfe zzb(zzfe zzfeVar, zzfe zzfeVar2) {
        int i10 = zzfeVar.zzb;
        int i11 = zzfeVar2.zzb;
        int[] copyOf = Arrays.copyOf(zzfeVar.zzc, 0);
        System.arraycopy(zzfeVar2.zzc, 0, copyOf, 0, 0);
        Object[] copyOf2 = Arrays.copyOf(zzfeVar.zzd, 0);
        System.arraycopy(zzfeVar2.zzd, 0, copyOf2, 0, 0);
        return new zzfe(0, copyOf, copyOf2, true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof zzfe)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return 506991;
    }

    public final int zzc() {
        int i10 = this.zze;
        if (i10 != -1) {
            return i10;
        }
        this.zze = 0;
        return 0;
    }

    public final int zzd() {
        int i10 = this.zze;
        if (i10 != -1) {
            return i10;
        }
        this.zze = 0;
        return 0;
    }

    public final void zze(StringBuilder sb2, int i10) {
    }

    private zzfe() {
        this(0, new int[8], new Object[8], true);
    }
}
