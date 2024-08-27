package com.google.protobuf;

import java.util.Iterator;

/* loaded from: classes2.dex */
public final class l1 implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public final Iterator f11944a;

    public l1(m1 m1Var) {
        this.f11944a = m1Var.f11947a.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f11944a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return (String) this.f11944a.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
