package androidx.navigation;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class e0 implements Iterator, ju.a {

    /* renamed from: a, reason: collision with root package name */
    public int f2187a = -1;

    /* renamed from: b, reason: collision with root package name */
    public boolean f2188b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f0 f2189c;

    public e0(f0 f0Var) {
        this.f2189c = f0Var;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f2187a + 1 < this.f2189c.f2191k.h()) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            this.f2188b = true;
            t.k0 k0Var = this.f2189c.f2191k;
            int i10 = this.f2187a + 1;
            this.f2187a = i10;
            Object i11 = k0Var.i(i10);
            Intrinsics.checkNotNullExpressionValue(i11, "nodes.valueAt(++index)");
            return (c0) i11;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (this.f2188b) {
            t.k0 k0Var = this.f2189c.f2191k;
            ((c0) k0Var.i(this.f2187a)).f2175b = null;
            int i10 = this.f2187a;
            Object[] objArr = k0Var.f34877c;
            Object obj = objArr[i10];
            Object obj2 = t.l0.f34880a;
            if (obj != obj2) {
                objArr[i10] = obj2;
                k0Var.f34875a = true;
            }
            this.f2187a = i10 - 1;
            this.f2188b = false;
            return;
        }
        throw new IllegalStateException("You must call next() before you can remove an element".toString());
    }
}
