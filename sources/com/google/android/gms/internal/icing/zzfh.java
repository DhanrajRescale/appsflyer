package com.google.android.gms.internal.icing;

import java.util.Iterator;

/* loaded from: classes2.dex */
final class zzfh implements Iterator<String> {
    final Iterator<String> zza;
    final /* synthetic */ zzfi zzb;

    public zzfh(zzfi zzfiVar) {
        zzdo zzdoVar;
        this.zzb = zzfiVar;
        zzdoVar = zzfiVar.zza;
        this.zza = zzdoVar.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zza.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ String next() {
        return this.zza.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
