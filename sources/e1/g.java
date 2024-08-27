package e1;

import kotlin.jvm.functions.Function1;
import t0.i3;

/* loaded from: classes.dex */
public final class g extends i {

    /* renamed from: f, reason: collision with root package name */
    public final Function1 f14875f;

    /* renamed from: g, reason: collision with root package name */
    public int f14876g;

    public g(int i10, n nVar, Function1 function1) {
        super(i10, nVar);
        this.f14875f = function1;
        this.f14876g = 1;
    }

    @Override // e1.i
    public final void c() {
        if (!this.f14882c) {
            l();
            super.c();
        }
    }

    @Override // e1.i
    public final Function1 f() {
        return this.f14875f;
    }

    @Override // e1.i
    public final boolean g() {
        return true;
    }

    @Override // e1.i
    public final Function1 i() {
        return null;
    }

    @Override // e1.i
    public final void k() {
        this.f14876g++;
    }

    @Override // e1.i
    public final void l() {
        int i10 = this.f14876g - 1;
        this.f14876g = i10;
        if (i10 == 0) {
            a();
        }
    }

    @Override // e1.i
    public final void m() {
    }

    @Override // e1.i
    public final void n(y yVar) {
        i3 i3Var = p.f14904a;
        throw new IllegalStateException("Cannot modify a state object in a read-only snapshot".toString());
    }

    @Override // e1.i
    public final i t(Function1 function1) {
        p.c(this);
        return new e(this.f14881b, this.f14880a, function1, this);
    }
}
