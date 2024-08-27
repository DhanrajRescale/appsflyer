package com.google.android.recaptcha.internal;

import java.util.HashMap;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.c;
import lu.d;
import org.jetbrains.annotations.NotNull;
import yk.g;

/* loaded from: classes2.dex */
public final class zzbn {

    @NotNull
    private final zzbm zza;
    private byte zzb;

    @NotNull
    private final HashMap zzc;

    /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.ranges.c, java.lang.Object, kotlin.ranges.IntRange] */
    public zzbn() {
        zzbm zzbmVar = new zzbm();
        this.zza = zzbmVar;
        ?? cVar = new c(1, 127, 1);
        d.Companion random = d.INSTANCE;
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        try {
            this.zzb = (byte) g.L(random, cVar);
            HashMap hashMap = new HashMap();
            this.zzc = hashMap;
            zzbmVar.zze(173, hashMap);
        } catch (IllegalArgumentException e10) {
            throw new NoSuchElementException(e10.getMessage());
        }
    }

    public final byte zza() {
        return this.zzb;
    }

    @NotNull
    public final zzbm zzb() {
        return this.zza;
    }

    public final void zzc() {
        this.zza.zzd();
        this.zza.zze(173, this.zzc);
    }

    public final void zzd(byte b10) {
        this.zzb = b10;
    }

    public final void zze(@NotNull int i10, @NotNull Object obj) {
        this.zzc.put(1, obj);
    }
}
