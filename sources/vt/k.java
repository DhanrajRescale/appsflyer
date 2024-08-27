package vt;

import java.util.AbstractCollection;
import java.util.Collection;

/* loaded from: classes2.dex */
public abstract class k extends AbstractCollection implements Collection, ju.b {
    public abstract int b();

    @Override // java.util.AbstractCollection, java.util.Collection
    public final /* bridge */ int size() {
        return b();
    }
}
