package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes2.dex */
public final class zzagw extends zzaeq implements RandomAccess, zzagx {

    @Deprecated
    public static final zzagx zza;
    private static final zzagw zzb;
    private final List zzc;

    static {
        zzagw zzagwVar = new zzagw(false);
        zzb = zzagwVar;
        zza = zzagwVar;
    }

    public zzagw() {
        this(10);
    }

    private static String zzj(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof zzaff) {
            return ((zzaff) obj).zzo(zzagq.zzb);
        }
        return zzagq.zzd((byte[]) obj);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaeq, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i10, Object obj) {
        zza();
        this.zzc.add(i10, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaeq, java.util.AbstractList, java.util.List
    public final boolean addAll(int i10, Collection collection) {
        zza();
        if (collection instanceof zzagx) {
            collection = ((zzagx) collection).zzh();
        }
        boolean addAll = this.zzc.addAll(i10, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaeq, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        zza();
        this.zzc.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaeq, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        zza();
        Object remove = this.zzc.remove(i10);
        ((AbstractList) this).modCount++;
        return zzj(remove);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaeq, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        zza();
        return zzj(this.zzc.set(i10, (String) obj));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc.size();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzagp
    public final /* bridge */ /* synthetic */ zzagp zzd(int i10) {
        if (i10 >= size()) {
            ArrayList arrayList = new ArrayList(i10);
            arrayList.addAll(this.zzc);
            return new zzagw(arrayList);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzagx
    public final zzagx zze() {
        if (zzc()) {
            return new zzaja(this);
        }
        return this;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzagx
    public final Object zzf(int i10) {
        return this.zzc.get(i10);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: zzg, reason: merged with bridge method [inline-methods] */
    public final String get(int i10) {
        Object obj = this.zzc.get(i10);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof zzaff) {
            zzaff zzaffVar = (zzaff) obj;
            String zzo = zzaffVar.zzo(zzagq.zzb);
            if (zzaffVar.zzk()) {
                this.zzc.set(i10, zzo);
            }
            return zzo;
        }
        byte[] bArr = (byte[]) obj;
        String zzd = zzagq.zzd(bArr);
        if (zzajk.zze(bArr)) {
            this.zzc.set(i10, zzd);
        }
        return zzd;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzagx
    public final List zzh() {
        return Collections.unmodifiableList(this.zzc);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzagx
    public final void zzi(zzaff zzaffVar) {
        zza();
        this.zzc.add(zzaffVar);
        ((AbstractList) this).modCount++;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzagw(int i10) {
        super(true);
        ArrayList arrayList = new ArrayList(i10);
        this.zzc = arrayList;
    }

    private zzagw(ArrayList arrayList) {
        super(true);
        this.zzc = arrayList;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaeq, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }

    private zzagw(boolean z10) {
        super(false);
        this.zzc = Collections.emptyList();
    }
}
