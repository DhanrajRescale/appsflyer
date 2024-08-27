package com.google.android.gms.internal.icing;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;
import v.e;

/* loaded from: classes2.dex */
final class zzen<E> extends zzbt<E> implements RandomAccess {
    private static final zzen<Object> zza;
    private E[] zzb;
    private int zzc;

    static {
        zzen<Object> zzenVar = new zzen<>(new Object[0], 0);
        zza = zzenVar;
        zzenVar.zzb();
    }

    public zzen() {
        this(new Object[10], 0);
    }

    public static <E> zzen<E> zzd() {
        return (zzen<E>) zza;
    }

    private final void zzf(int i10) {
        if (i10 >= 0 && i10 < this.zzc) {
        } else {
            throw new IndexOutOfBoundsException(zzg(i10));
        }
    }

    private final String zzg(int i10) {
        int i11 = this.zzc;
        StringBuilder sb2 = new StringBuilder(35);
        sb2.append("Index:");
        sb2.append(i10);
        sb2.append(", Size:");
        sb2.append(i11);
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.icing.zzbt, java.util.AbstractList, java.util.List
    public final void add(int i10, E e10) {
        int i11;
        zzc();
        if (i10 >= 0 && i10 <= (i11 = this.zzc)) {
            E[] eArr = this.zzb;
            if (i11 < eArr.length) {
                System.arraycopy(eArr, i10, eArr, i10 + 1, i11 - i10);
            } else {
                E[] eArr2 = (E[]) new Object[e.b(i11, 3, 2, 1)];
                System.arraycopy(eArr, 0, eArr2, 0, i10);
                System.arraycopy(this.zzb, i10, eArr2, i10 + 1, this.zzc - i10);
                this.zzb = eArr2;
            }
            this.zzb[i10] = e10;
            this.zzc++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(zzg(i10));
    }

    @Override // java.util.AbstractList, java.util.List
    public final E get(int i10) {
        zzf(i10);
        return this.zzb[i10];
    }

    @Override // com.google.android.gms.internal.icing.zzbt, java.util.AbstractList, java.util.List
    public final E remove(int i10) {
        zzc();
        zzf(i10);
        E[] eArr = this.zzb;
        E e10 = eArr[i10];
        if (i10 < this.zzc - 1) {
            System.arraycopy(eArr, i10 + 1, eArr, i10, (r2 - i10) - 1);
        }
        this.zzc--;
        ((AbstractList) this).modCount++;
        return e10;
    }

    @Override // com.google.android.gms.internal.icing.zzbt, java.util.AbstractList, java.util.List
    public final E set(int i10, E e10) {
        zzc();
        zzf(i10);
        E[] eArr = this.zzb;
        E e11 = eArr[i10];
        eArr[i10] = e10;
        ((AbstractList) this).modCount++;
        return e11;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.icing.zzdg
    public final /* bridge */ /* synthetic */ zzdg zze(int i10) {
        if (i10 >= this.zzc) {
            return new zzen(Arrays.copyOf(this.zzb, i10), this.zzc);
        }
        throw new IllegalArgumentException();
    }

    private zzen(E[] eArr, int i10) {
        this.zzb = eArr;
        this.zzc = i10;
    }

    @Override // com.google.android.gms.internal.icing.zzbt, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(E e10) {
        zzc();
        int i10 = this.zzc;
        E[] eArr = this.zzb;
        if (i10 == eArr.length) {
            this.zzb = (E[]) Arrays.copyOf(eArr, ((i10 * 3) / 2) + 1);
        }
        E[] eArr2 = this.zzb;
        int i11 = this.zzc;
        this.zzc = i11 + 1;
        eArr2[i11] = e10;
        ((AbstractList) this).modCount++;
        return true;
    }
}
