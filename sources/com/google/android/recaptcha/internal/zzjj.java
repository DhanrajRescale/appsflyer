package com.google.android.recaptcha.internal;

import java.util.Iterator;

/* loaded from: classes2.dex */
final class zzjj implements Iterator {
    final Iterator zza;
    final /* synthetic */ zzjk zzb;

    public zzjj(zzjk zzjkVar) {
        zzhg zzhgVar;
        this.zzb = zzjkVar;
        zzhgVar = zzjkVar.zza;
        this.zza = zzhgVar.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zza.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return (String) this.zza.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
