package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Iterator;

/* loaded from: classes2.dex */
final class zzaiz implements Iterator {
    final Iterator zza;
    final /* synthetic */ zzaja zzb;

    public zzaiz(zzaja zzajaVar) {
        zzagx zzagxVar;
        this.zzb = zzajaVar;
        zzagxVar = zzajaVar.zza;
        this.zza = zzagxVar.iterator();
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
