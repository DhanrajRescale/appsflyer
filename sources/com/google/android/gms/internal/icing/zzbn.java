package com.google.android.gms.internal.icing;

import v.e;

/* loaded from: classes2.dex */
final class zzbn<T> implements zzbm<T> {
    volatile zzbm<T> zza;

    public zzbn(zzbm<T> zzbmVar) {
        this.zza = zzbmVar;
    }

    public final String toString() {
        Object obj = this.zza;
        if (obj == null) {
            StringBuilder sb2 = new StringBuilder("null".length() + 25);
            sb2.append("<supplier that returned null>");
            obj = sb2.toString();
        }
        String valueOf = String.valueOf(obj);
        return e.j(new StringBuilder(valueOf.length() + 19), "Suppliers.memoize(", valueOf, ")");
    }
}
