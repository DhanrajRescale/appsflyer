package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import nn.d;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzjg extends zzjb {
    final transient Object zza;

    public zzjg(Object obj) {
        obj.getClass();
        this.zza = obj;
    }

    @Override // com.google.android.gms.internal.measurement.zziw, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.zza.equals(obj);
    }

    @Override // com.google.android.gms.internal.measurement.zzjb, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.zza.hashCode();
    }

    @Override // com.google.android.gms.internal.measurement.zzjb, com.google.android.gms.internal.measurement.zziw, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new zzjc(this.zza);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return d.k("[", this.zza.toString(), "]");
    }

    @Override // com.google.android.gms.internal.measurement.zziw
    public final int zza(Object[] objArr, int i10) {
        objArr[0] = this.zza;
        return 1;
    }

    @Override // com.google.android.gms.internal.measurement.zzjb, com.google.android.gms.internal.measurement.zziw
    /* renamed from: zzd */
    public final zzjh iterator() {
        return new zzjc(this.zza);
    }
}
