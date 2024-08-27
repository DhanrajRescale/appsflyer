package vt;

import java.util.AbstractList;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class l extends AbstractList implements List, ju.c {
    public abstract int b();

    public abstract Object e(int i10);

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ Object remove(int i10) {
        return e(i10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return b();
    }
}
