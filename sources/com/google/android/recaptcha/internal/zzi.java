package com.google.android.recaptcha.internal;

import kotlin.text.w;
import org.jetbrains.annotations.NotNull;
import v.e;
import xt.a;

/* loaded from: classes2.dex */
public final class zzi implements Comparable {
    private int zza;
    private long zzb;
    private long zzc;

    @NotNull
    public final String toString() {
        return e.j(e.l("avgExecutionTime: ", w.G(String.valueOf(this.zzb / this.zza), 10), " us| maxExecutionTime: ", w.G(String.valueOf(this.zzc), 10), " us| totalTime: "), w.G(String.valueOf(this.zzb), 10), " us| #Usages: ", w.G(String.valueOf(this.zza), 5));
    }

    @Override // java.lang.Comparable
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final int compareTo(@NotNull zzi zziVar) {
        return a.a(Long.valueOf(this.zzb), Long.valueOf(zziVar.zzb));
    }

    public final int zzb() {
        return this.zza;
    }

    public final long zzc() {
        return this.zzc;
    }

    public final long zzd() {
        return this.zzb;
    }

    public final void zze(long j10) {
        this.zzc = j10;
    }

    public final void zzf(long j10) {
        this.zzb = j10;
    }

    public final void zzg(int i10) {
        this.zza = i10;
    }
}
