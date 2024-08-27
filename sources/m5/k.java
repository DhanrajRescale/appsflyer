package m5;

import b5.v;
import java.util.ArrayList;
import java.util.List;
import lp.o0;

/* loaded from: classes.dex */
public final class k extends m implements l5.i {

    /* renamed from: h, reason: collision with root package name */
    public final n f27560h;

    public k(long j10, v vVar, o0 o0Var, n nVar, ArrayList arrayList, List list, List list2) {
        super(vVar, o0Var, nVar, arrayList, list, list2);
        this.f27560h = nVar;
    }

    @Override // l5.i
    public final boolean E() {
        return this.f27560h.i();
    }

    @Override // l5.i
    public final long F() {
        return this.f27560h.f27571d;
    }

    @Override // l5.i
    public final long H(long j10) {
        return this.f27560h.d(j10);
    }

    @Override // l5.i
    public final long I(long j10, long j11) {
        return this.f27560h.b(j10, j11);
    }

    @Override // m5.m
    public final String a() {
        return null;
    }

    @Override // l5.i
    public final long b(long j10) {
        return this.f27560h.g(j10);
    }

    @Override // m5.m
    public final l5.i c() {
        return this;
    }

    @Override // m5.m
    public final j d() {
        return null;
    }

    @Override // l5.i
    public final long e(long j10, long j11) {
        return this.f27560h.e(j10, j11);
    }

    @Override // l5.i
    public final long h(long j10, long j11) {
        return this.f27560h.c(j10, j11);
    }

    @Override // l5.i
    public final long j(long j10, long j11) {
        n nVar = this.f27560h;
        if (nVar.f27573f != null) {
            return -9223372036854775807L;
        }
        long b10 = nVar.b(j10, j11) + nVar.c(j10, j11);
        return (nVar.e(b10, j10) + nVar.g(b10)) - nVar.f27576i;
    }

    @Override // l5.i
    public final j k(long j10) {
        return this.f27560h.h(j10, this);
    }

    @Override // l5.i
    public final long t(long j10, long j11) {
        return this.f27560h.f(j10, j11);
    }
}
