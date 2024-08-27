package vt;

import java.util.AbstractSet;
import java.util.Set;

/* loaded from: classes2.dex */
public abstract class n extends AbstractSet implements Set, ju.e {
    public abstract int b();

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ int size() {
        return b();
    }
}
