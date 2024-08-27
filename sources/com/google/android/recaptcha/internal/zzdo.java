package com.google.android.recaptcha.internal;

import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Queue;

/* loaded from: classes2.dex */
public final class zzdo extends zzds implements Serializable {
    final int zza;
    private final Queue zzb;

    private zzdo(int i10) {
        if (i10 >= 0) {
            this.zzb = new ArrayDeque(i10);
            this.zza = i10;
            return;
        }
        throw new IllegalArgumentException(zzdl.zza("maxSize (%s) must >= 0", Integer.valueOf(i10)));
    }

    public static zzdo zza(int i10) {
        return new zzdo(i10);
    }

    @Override // com.google.android.recaptcha.internal.zzdq, java.util.Collection, java.util.Queue
    public final boolean add(Object obj) {
        obj.getClass();
        if (this.zza == 0) {
            return true;
        }
        if (size() == this.zza) {
            this.zzb.remove();
        }
        this.zzb.add(obj);
        return true;
    }

    @Override // com.google.android.recaptcha.internal.zzdq, java.util.Collection
    public final boolean addAll(Collection collection) {
        boolean z10;
        int size = collection.size();
        if (size >= this.zza) {
            clear();
            int i10 = size - this.zza;
            if (i10 >= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            zzdi.zzb(z10, "number to skip cannot be negative");
            return zzdv.zza(this, new zzdu(collection, i10).iterator());
        }
        return zzdv.zza(this, collection.iterator());
    }

    @Override // com.google.android.recaptcha.internal.zzds, java.util.Queue
    public final boolean offer(Object obj) {
        add(obj);
        return true;
    }

    @Override // com.google.android.recaptcha.internal.zzdq, com.google.android.recaptcha.internal.zzdr
    public final /* synthetic */ Object zzb() {
        return this.zzb;
    }

    @Override // com.google.android.recaptcha.internal.zzds, com.google.android.recaptcha.internal.zzdq
    public final /* synthetic */ Collection zzc() {
        return this.zzb;
    }

    @Override // com.google.android.recaptcha.internal.zzds
    public final Queue zzd() {
        return this.zzb;
    }
}
