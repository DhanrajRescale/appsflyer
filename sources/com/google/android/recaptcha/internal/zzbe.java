package com.google.android.recaptcha.internal;

import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vt.i0;

/* loaded from: classes2.dex */
public final class zzbe extends zzbd implements zzbi {

    @NotNull
    private final Function2 zza;

    @NotNull
    private final String zzb;

    public zzbe(@NotNull Function2 function2, @NotNull String str, Object obj) {
        super(obj);
        this.zza = function2;
        this.zzb = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [vt.i0] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v3, types: [com.google.android.recaptcha.internal.zzmk, com.google.android.recaptcha.internal.zzgi] */
    @Override // com.google.android.recaptcha.internal.zzbd
    public final boolean zza(@NotNull Object obj, @NotNull Method method, Object[] objArr) {
        ?? r02;
        if (!Intrinsics.a(method.getName(), this.zzb)) {
            return false;
        }
        ?? zzf = zzmn.zzf();
        if (objArr != null) {
            r02 = new ArrayList(objArr.length);
            for (Object obj2 : objArr) {
                zzml zzf2 = zzmm.zzf();
                zzf2.zzv(obj2.toString());
                r02.add((zzmm) zzf2.zzj());
            }
        } else {
            r02 = i0.f38321a;
        }
        zzf.zzd(r02);
        zzmn zzmnVar = (zzmn) zzf.zzj();
        Function2 function2 = this.zza;
        byte[] zzd = zzmnVar.zzd();
        function2.invoke(objArr, zzeb.zzh().zzi(zzd, 0, zzd.length));
        return true;
    }
}
