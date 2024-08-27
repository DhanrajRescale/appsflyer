package com.google.protobuf;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes2.dex */
public final class m1 extends AbstractList implements c0, RandomAccess {

    /* renamed from: a, reason: collision with root package name */
    public final c0 f11947a;

    public m1(c0 c0Var) {
        this.f11947a = c0Var;
    }

    @Override // com.google.protobuf.c0
    public final void d(h hVar) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        return (String) this.f11947a.get(i10);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new l1(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i10) {
        return new k1(this, i10);
    }

    @Override // com.google.protobuf.c0
    public final List n() {
        return this.f11947a.n();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f11947a.size();
    }

    @Override // com.google.protobuf.c0
    public final c0 x() {
        return this;
    }

    @Override // com.google.protobuf.c0
    public final Object z(int i10) {
        return this.f11947a.z(i10);
    }
}
