package r5;

import b5.j1;
import java.util.List;

/* loaded from: classes.dex */
public final class c0 implements u5.s {

    /* renamed from: a, reason: collision with root package name */
    public final u5.s f33100a;

    /* renamed from: b, reason: collision with root package name */
    public final j1 f33101b;

    public c0(u5.s sVar, j1 j1Var) {
        this.f33100a = sVar;
        this.f33101b = j1Var;
    }

    @Override // u5.s
    public final boolean a(int i10, long j10) {
        return this.f33100a.a(i10, j10);
    }

    @Override // u5.s
    public final boolean b(long j10, s5.e eVar, List list) {
        return this.f33100a.b(j10, eVar, list);
    }

    @Override // u5.s
    public final j1 c() {
        return this.f33101b;
    }

    @Override // u5.s
    public final int d() {
        return this.f33100a.d();
    }

    @Override // u5.s
    public final int e(b5.v vVar) {
        return this.f33100a.e(vVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        if (this.f33100a.equals(c0Var.f33100a) && this.f33101b.equals(c0Var.f33101b)) {
            return true;
        }
        return false;
    }

    @Override // u5.s
    public final void f(boolean z10) {
        this.f33100a.f(z10);
    }

    @Override // u5.s
    public final b5.v g(int i10) {
        return this.f33100a.g(i10);
    }

    @Override // u5.s
    public final void h() {
        this.f33100a.h();
    }

    public final int hashCode() {
        return this.f33100a.hashCode() + ((this.f33101b.hashCode() + 527) * 31);
    }

    @Override // u5.s
    public final int i(int i10) {
        return this.f33100a.i(i10);
    }

    @Override // u5.s
    public final int j(long j10, List list) {
        return this.f33100a.j(j10, list);
    }

    @Override // u5.s
    public final void k() {
        this.f33100a.k();
    }

    @Override // u5.s
    public final b5.v l() {
        return this.f33100a.l();
    }

    @Override // u5.s
    public final int length() {
        return this.f33100a.length();
    }

    @Override // u5.s
    public final int m() {
        return this.f33100a.m();
    }

    @Override // u5.s
    public final boolean n(int i10, long j10) {
        return this.f33100a.n(i10, j10);
    }

    @Override // u5.s
    public final void o(float f10) {
        this.f33100a.o(f10);
    }

    @Override // u5.s
    public final Object p() {
        return this.f33100a.p();
    }

    @Override // u5.s
    public final void q() {
        this.f33100a.q();
    }

    @Override // u5.s
    public final void r(long j10, long j11, long j12, List list, s5.m[] mVarArr) {
        this.f33100a.r(j10, j11, j12, list, mVarArr);
    }

    @Override // u5.s
    public final void s() {
        this.f33100a.s();
    }

    @Override // u5.s
    public final int t(int i10) {
        return this.f33100a.t(i10);
    }
}
