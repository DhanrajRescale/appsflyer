package lp;

import java.util.AbstractMap;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class k1 extends o0 {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l1 f25002c;

    public k1(l1 l1Var) {
        this.f25002c = l1Var;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        l1 l1Var = this.f25002c;
        dp.b.S0(i10, l1Var.f25007g);
        int i11 = i10 * 2;
        int i12 = l1Var.f25006f;
        Object[] objArr = l1Var.f25005e;
        Object obj = objArr[i11 + i12];
        Objects.requireNonNull(obj);
        Object obj2 = objArr[i11 + (i12 ^ 1)];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // lp.i0
    public final boolean k() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f25002c.f25007g;
    }
}
