package com.google.protobuf;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public abstract class f implements Iterator {
    @Override // java.util.Iterator
    public final Object next() {
        e eVar = (e) this;
        int i10 = eVar.f11901a;
        if (i10 < eVar.f11902b) {
            eVar.f11901a = i10 + 1;
            return Byte.valueOf(eVar.f11903c.h(i10));
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
