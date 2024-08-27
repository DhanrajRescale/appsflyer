package lp;

import java.util.Iterator;
import java.util.ListIterator;

/* loaded from: classes2.dex */
public final class n0 extends o0 {

    /* renamed from: c, reason: collision with root package name */
    public final transient int f25014c;

    /* renamed from: d, reason: collision with root package name */
    public final transient int f25015d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ o0 f25016e;

    public n0(o0 o0Var, int i10, int i11) {
        this.f25016e = o0Var;
        this.f25014c = i10;
        this.f25015d = i11;
    }

    @Override // lp.i0
    public final Object[] g() {
        return this.f25016e.g();
    }

    @Override // java.util.List
    public final Object get(int i10) {
        dp.b.S0(i10, this.f25015d);
        return this.f25016e.get(i10 + this.f25014c);
    }

    @Override // lp.i0
    public final int h() {
        return this.f25016e.i() + this.f25014c + this.f25015d;
    }

    @Override // lp.i0
    public final int i() {
        return this.f25016e.i() + this.f25014c;
    }

    @Override // lp.o0, lp.i0, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // lp.i0
    public final boolean k() {
        return true;
    }

    @Override // lp.o0, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f25015d;
    }

    @Override // lp.o0, java.util.List
    /* renamed from: w */
    public final o0 subList(int i10, int i11) {
        dp.b.U0(i10, i11, this.f25015d);
        int i12 = this.f25014c;
        return this.f25016e.subList(i10 + i12, i11 + i12);
    }

    @Override // lp.o0, java.util.List
    public final /* bridge */ /* synthetic */ ListIterator listIterator(int i10) {
        return listIterator(i10);
    }
}
