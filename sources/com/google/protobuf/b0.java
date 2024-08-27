package com.google.protobuf;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;
import okhttp3.HttpUrl;

/* loaded from: classes2.dex */
public final class b0 extends c implements c0, RandomAccess {

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f11889b;

    static {
        new b0(10).f11897a = false;
    }

    public b0(int i10) {
        this(new ArrayList(i10));
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        b();
        this.f11889b.add(i10, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(this.f11889b.size(), collection);
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        b();
        this.f11889b.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.c0
    public final void d(h hVar) {
        b();
        this.f11889b.add(hVar);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.y
    public final y f(int i10) {
        ArrayList arrayList = this.f11889b;
        if (i10 >= arrayList.size()) {
            ArrayList arrayList2 = new ArrayList(i10);
            arrayList2.addAll(arrayList);
            return new b0(arrayList2);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        String str;
        ArrayList arrayList = this.f11889b;
        Object obj = arrayList.get(i10);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            hVar.getClass();
            Charset charset = z.f12003a;
            if (hVar.size() == 0) {
                str = HttpUrl.FRAGMENT_ENCODE_SET;
            } else {
                i iVar = (i) hVar;
                str = new String(iVar.f11920c, iVar.k(), iVar.size(), charset);
            }
            i iVar2 = (i) hVar;
            int k10 = iVar2.k();
            if (u1.f11992a.c(iVar2.f11920c, k10, iVar2.size() + k10) == 0) {
                arrayList.set(i10, str);
            }
        } else {
            byte[] bArr = (byte[]) obj;
            str = new String(bArr, z.f12003a);
            if (u1.f11992a.c(bArr, 0, bArr.length) == 0) {
                arrayList.set(i10, str);
            }
        }
        return str;
    }

    @Override // com.google.protobuf.c0
    public final List n() {
        return Collections.unmodifiableList(this.f11889b);
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.List
    public final Object remove(int i10) {
        b();
        Object remove = this.f11889b.remove(i10);
        ((AbstractList) this).modCount++;
        if (remove instanceof String) {
            return (String) remove;
        }
        if (remove instanceof h) {
            h hVar = (h) remove;
            hVar.getClass();
            Charset charset = z.f12003a;
            if (hVar.size() == 0) {
                return HttpUrl.FRAGMENT_ENCODE_SET;
            }
            i iVar = (i) hVar;
            return new String(iVar.f11920c, iVar.k(), iVar.size(), charset);
        }
        return new String((byte[]) remove, z.f12003a);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        b();
        Object obj2 = this.f11889b.set(i10, (String) obj);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        if (obj2 instanceof h) {
            h hVar = (h) obj2;
            hVar.getClass();
            Charset charset = z.f12003a;
            if (hVar.size() == 0) {
                return HttpUrl.FRAGMENT_ENCODE_SET;
            }
            i iVar = (i) hVar;
            return new String(iVar.f11920c, iVar.k(), iVar.size(), charset);
        }
        return new String((byte[]) obj2, z.f12003a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f11889b.size();
    }

    @Override // com.google.protobuf.c0
    public final c0 x() {
        if (this.f11897a) {
            return new m1(this);
        }
        return this;
    }

    @Override // com.google.protobuf.c0
    public final Object z(int i10) {
        return this.f11889b.get(i10);
    }

    public b0(ArrayList arrayList) {
        this.f11889b = arrayList;
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.List
    public final boolean addAll(int i10, Collection collection) {
        b();
        if (collection instanceof c0) {
            collection = ((c0) collection).n();
        }
        boolean addAll = this.f11889b.addAll(i10, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }
}
