package com.google.android.recaptcha.internal;

import java.lang.reflect.Method;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vt.i0;
import vt.t;

/* loaded from: classes2.dex */
public final class zzbg extends zzbd {

    @NotNull
    private final zzbf zza;

    @NotNull
    private final String zzb;

    public zzbg(@NotNull zzbf zzbfVar, @NotNull String str, Object obj) {
        super(obj);
        this.zza = zzbfVar;
        this.zzb = str;
    }

    @Override // com.google.android.recaptcha.internal.zzbd
    public final boolean zza(@NotNull Object obj, @NotNull Method method, Object[] objArr) {
        List list;
        if (Intrinsics.a(method.getName(), this.zzb)) {
            zzbf zzbfVar = this.zza;
            if (objArr == null || (list = t.b(objArr)) == null) {
                list = i0.f38321a;
            }
            zzbfVar.zzb(list);
            return true;
        }
        return false;
    }
}
