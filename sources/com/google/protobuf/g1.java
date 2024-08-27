package com.google.protobuf;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
public final class g1 implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public int f11913a = -1;

    /* renamed from: b, reason: collision with root package name */
    public boolean f11914b;

    /* renamed from: c, reason: collision with root package name */
    public Iterator f11915c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b1 f11916d;

    public g1(b1 b1Var) {
        this.f11916d = b1Var;
    }

    public final Iterator a() {
        if (this.f11915c == null) {
            this.f11915c = this.f11916d.f11893c.entrySet().iterator();
        }
        return this.f11915c;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i10 = this.f11913a + 1;
        b1 b1Var = this.f11916d;
        if (i10 < b1Var.f11892b.size()) {
            return true;
        }
        if (!b1Var.f11893c.isEmpty() && a().hasNext()) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        this.f11914b = true;
        int i10 = this.f11913a + 1;
        this.f11913a = i10;
        b1 b1Var = this.f11916d;
        if (i10 < b1Var.f11892b.size()) {
            return (Map.Entry) b1Var.f11892b.get(this.f11913a);
        }
        return (Map.Entry) a().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (this.f11914b) {
            this.f11914b = false;
            int i10 = b1.f11890g;
            b1 b1Var = this.f11916d;
            b1Var.b();
            if (this.f11913a < b1Var.f11892b.size()) {
                int i11 = this.f11913a;
                this.f11913a = i11 - 1;
                b1Var.n(i11);
                return;
            }
            a().remove();
            return;
        }
        throw new IllegalStateException("remove() was called before next()");
    }
}
