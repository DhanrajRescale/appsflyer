package com.google.protobuf;

import java.util.ListIterator;

/* loaded from: classes2.dex */
public final class k1 implements ListIterator {

    /* renamed from: a, reason: collision with root package name */
    public final ListIterator f11941a;

    public k1(m1 m1Var, int i10) {
        this.f11941a = m1Var.f11947a.listIterator(i10);
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f11941a.hasNext();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f11941a.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        return (String) this.f11941a.next();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f11941a.nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return (String) this.f11941a.previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f11941a.previousIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
