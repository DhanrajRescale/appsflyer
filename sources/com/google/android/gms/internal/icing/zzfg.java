package com.google.android.gms.internal.icing;

import java.util.ListIterator;

/* loaded from: classes2.dex */
final class zzfg implements ListIterator<String> {
    final ListIterator<String> zza;
    final /* synthetic */ int zzb;
    final /* synthetic */ zzfi zzc;

    public zzfg(zzfi zzfiVar, int i10) {
        zzdo zzdoVar;
        this.zzc = zzfiVar;
        this.zzb = i10;
        zzdoVar = zzfiVar.zza;
        this.zza = zzdoVar.listIterator(i10);
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void add(String str) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.zza.hasNext();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.zza.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return this.zza.next();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.zza.nextIndex();
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ String previous() {
        return this.zza.previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.zza.previousIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void set(String str) {
        throw new UnsupportedOperationException();
    }
}
